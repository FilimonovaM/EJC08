package com.epam.vol2.exceptions.ex1;

import java.io.*;

public class Reader {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    RandomAccessFile randomAccessFile;
    StringBuffer sb = new StringBuffer();

    /**
     * uses for reading user`s answers from the terminal
     *
     * @return String answer
     */
    public String readAnswer() throws NullPointerException {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new NullPointerException("StringBuffer crashed!");
        }
    }

    /**
     * uses with chosen file for reading & writing.
     *
     * @param chosenFile - path to chosen file.
     * @param isRead     - if true, we will read from file, else write.
     * @param message    - users message, if it entered.
     * @return String status of reading or writing.
     */
    public String readFile(String chosenFile, boolean isRead, String message)
            throws NullPointerException {
        File file = new File(chosenFile);
        if (file != null && file.exists() && file.isFile()) {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                sb.setLength(0);
                if (isRead) {
                    int i = 0;
                    while (i != -1) {
                        i = randomAccessFile.read();
                        sb.append((char) i);
                    }
                } else if (!isRead && message != null) {
                    randomAccessFile.seek(randomAccessFile.length());
                    randomAccessFile.writeBytes(message);
                    sb.append("File " + file + " was changed!");
                } else {
                    throw new NullPointerException("Something wrong, File " +
                            file.getName() + " cat`t be read/write");
                }
            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } else {
            throw new NullPointerException("Something wrong with File " +
                    file.getName());
        }
        return sb.toString();
    }

    /**
     * uses for closing the streams.
     *
     * @return String status of streams closing.
     */
    public String closeStreams() {
        sb.setLength(0);
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                sb.append("RandomAccessFile closed\n");
            } catch (IOException e) {
                sb.append("RandomAccessFile IS NOT CLOSED!!!\n");
                System.err.println(e.getMessage());
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
                sb.append("BufferedReader closed\n");
            } catch (IOException e) {
                sb.append("BufferedReader IS NOT CLOSED!!!\n");
                System.err.println(e.getMessage());
            }
        }
        return sb.toString();
    }
}
