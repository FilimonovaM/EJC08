package com.epam.vol2.exceptions.ex1;

import java.io.File;

public class Menu {

    /**
     *uses for running a menu.
     *
     * @return bye-bye message
     */
    public String run() {
        String answer = null;
        Reader reader = new Reader();
        Cmd cmd = new Cmd();
        while (answer != "by") {
            try {
                System.out.println("Current directory: " + cmd.getCurrentPath() +
                        "\nto forvard: -fv dirName \n" +
                        "to gone back: -gb\n" +
                        "to create new file: -mf fileName\n" +
                        "to delete file: -df filename\n" +
                        "to read file: -rf fileName\n" +
                        "to write: -wf filename^message\n" +
                        "to close app: -by\n" +
                        "\nFiles in current directory:\n" + cmd.showFilesInDirectory());
                answer = reader.readAnswer();
                String file = null;
                String message = null;
                if (answer.startsWith("-fv")) {
                    System.out.println(cmd.cd(true, answer.substring(4)));
                } else if (answer.equals("-gb")) {
                    System.out.println(cmd.cd(false, null));
                } else if (answer.startsWith("-mf")) {
                    System.out.println(cmd.makeFile(answer.substring(4)));
                } else if (answer.startsWith("-df")) {
                    System.out.println(cmd.removeFile(answer.substring(4)));
                } else if (answer.startsWith("-rf")) {
                    System.out.println(reader.readFile(file, true, answer.substring(4)));
                } else if (answer.startsWith("-wf")) {
                    for (int i = 4; i < answer.length(); i++) {
                        if (answer.charAt(i) == ' ') {
                            file = answer.substring(4, i);
                            message = answer.substring(i + 1);
                            break;
                        }
                    }
                    System.out.println(reader.readFile(cmd.getCurrentPath() +
                            File.separatorChar + file, false, message));
                } else if (answer.equalsIgnoreCase("-by")) {
                    System.out.println(reader.closeStreams());
                    break;
                } else {
                    throw new NullPointerException("UNKNOWN COMMAND: " + answer);
                }
            } catch (NullPointerException n) {
                System.err.println(n.getMessage());
            }
        }
        return "Bye!";
    }
}
