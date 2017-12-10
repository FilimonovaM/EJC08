package com.epam.vol2.operators.procedures.e6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteTheNote {
    String answer = "";
    BufferedReader bufferedReader = null;

    /**
     * uses for starting of NoteBook.
     *
     * @return string message about the application closing.
     */
    public String start() {
        System.out.println("Welcome to the ArrayNoteBook!");
        while (!answer.equalsIgnoreCase("Bye")) {
            System.out.println("Press 1 to add message\n" +
                    "Press 2 to delete message\n" +
                    "Press 3 to edit message\n" +
                    "Press 4 to read some message\n" +
                    "Press 5 to read all messages\n" +
                    "Press 6 to close the NoteBook");
            answer = readTheAnswer();
            answer = operationsWithNoteBook(answer);
            if (answer.equals("Bye")) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                        System.out.println("InputStream is closed=>\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            }
            System.out.println(answer);
        }
        return "NoteBook is closed! Bye!";
    }

    /**
     * uses for choosing some function in NoteBook.
     *
     * @param answer - user`s answer.
     * @return NoteBook data or application status
     */
    private String operationsWithNoteBook(String answer) {
        String number = "";
        switch (answer) {
            case "1":
                System.out.println("Write the note:");
                return NoteBook.getInstance().writeTheLetter(readTheAnswer());

            case "2":
                System.out.println("Write the number of the note for deleting:");
                number = readTheAnswer();
                if (isDigit(number)) {
                    int num = Integer.parseInt(number);
                    return NoteBook.getInstance().deleteTheLetter(num);
                } else {
                    return "Typed message is not a number.";
                }

            case "3":
                System.out.println("Write the number of the note for editing:");
                number = readTheAnswer();
                if (isDigit(number)) {
                    int num = Integer.parseInt(number);
                    System.out.println("Write the new message of the note for editing:");
                    return NoteBook.getInstance().editTheLetter(num, readTheAnswer());
                } else {
                    return "Typed message is not a number.";
                }
            case "4":
                System.out.println("Write the number of the note for reading:");
                number = readTheAnswer();
                if (isDigit(number)) {
                    int num = Integer.parseInt(number);
                    return NoteBook.getInstance().readTheLetter(num);
                } else {
                    return "Typed message is not a number.";
                }
            case "5":
                return NoteBook.getInstance().showAll();

            case "6":
                return "Bye";
            default:
                return "";
        }
    }

    /**
     * uses for reading answer`s answer.
     *
     * @return String user`s answer.
     */
    private String readTheAnswer() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * uses for validation of digit data.
     *
     * @param answer - user`s answer for validation.
     * @return true if answer is a digit
     */
    protected boolean isDigit(String answer) {
        for (int i = 0; i < answer.length(); i++) {
            if (!Character.isDigit(answer.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
