package com.epam.vol2.exceptions.ex1;

import java.io.File;
import java.io.IOException;

public class Cmd {
    char s = File.separatorChar;
    String currentPath = "C:" + s + "Users" + s + "Admin" + s + "Desktop" + s + "hw1" + s + "Anyth";
    String currentFileName = "";
    File file;
    String[] show;
    StringBuffer sb;

    /**
     * uses for reading user`s answers from the terminal.
     *
     * @param isForward - move to chosen dir, if true. Else move to parent directory.
     * @param dirName   -chosen dir.
     * @return String data (current path)
     */
    public String cd(boolean isForward, String dirName)
            throws NullPointerException {
        if (isForward) {
            file = new File(currentPath + s + dirName);
            if (file.exists() && file.isDirectory()) {
                currentPath = currentPath + s + dirName;
            }
        } else if (!isForward && dirName == null) {
            file = new File(currentPath);
            currentPath = file.getParent();
        } else {
            throw new NullPointerException("You try go to the nonexistent directory!");
        }
        return "Current path: " + currentPath;
    }

    /**
     * uses for creating a new .txt file.
     *
     * @param fileName - name of the new file.
     * @return info about the status of creating.
     */
    public String makeFile(String fileName)
            throws NullPointerException {
        if (fileName != null && fileName != "") {
            if (!fileName.contains(String.valueOf(s))) {
                if (fileName.endsWith(".txt")) {
                    currentFileName = fileName;
                } else if (!fileName.contains(".")) {
                    currentFileName = fileName + ".txt";
                } else {
                    throw new NullPointerException("Includes '.' in file name or wrong format" +
                            " -> use the letter for the " +
                            "file name");
                }
                file = new File(currentPath + s + currentFileName);
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    throw new NullPointerException("File with name " +
                            fileName + " can`t be created. It exists yet");
                }
            } else throw new NullPointerException("File with name " +
                    fileName + " can`t be created. File name can`t includes symbol " + s);
        } else {
            throw new NullPointerException("File with empty name can`t be created.");
        }
        return "You create file " + currentFileName;
    }

    /**
     * uses for deleting a new .txt file.
     *
     * @param fileName - name of the new file.
     * @return info about the status of deleting.
     */
    public String removeFile(String fileName)
            throws NullPointerException {
        if (fileName != null && fileName != "") {
            if (new File(fileName).exists()) {
                file = new File(fileName);
            } else if (new File(currentPath + s + fileName).exists()) {
                file = new File(currentPath + s + fileName);
            } else {
                throw new NullPointerException("File don`t exists!");
            }
            file.delete();
        } else {
            throw new NullPointerException("File with empty name can`t be removed.");
        }
        return "You delete file " + fileName;
    }

    /**
     * uses for showing a list of the files & directories of the chosen directory.
     *
     * @return list of the files & directories.
     */
    public String showFilesInDirectory()
            throws NullPointerException {
        sb = new StringBuffer();
        file = new File(currentPath);
        show = file.list();
        if (show.length < 1) {
            throw new NullPointerException("No one files in directory!");
        } else if (show == null) {
            throw new NullPointerException("List of files in directory is null!");
        }
        for (String f : show) {
            sb.append(f + "\t");
        }
        return sb.toString();
    }

    /**
     * uses for getting a path of the current  directory.
     *
     * @return path of the current  directory.
     */
    public String getCurrentPath() {
        return currentPath;
    }
}
