package com.epam.vol2.operators.procedures.e6;

public class NoteBook {
    private static NoteBook ourInstance = new NoteBook();
    private String[] noteBook = new String[0];

    public static NoteBook getInstance() {
        return ourInstance;
    }

    private NoteBook() {
    }

    /**
     * uses for creating a new notes.
     *
     * @param message - String user message.
     * @return information about status of the new note.
     */
    protected String writeTheLetter(String message) {
        String[] arrTemp = new String[noteBook.length + 1];
        int i = 0;
        while (i < noteBook.length) {
            arrTemp[i] = noteBook[i];
            i++;
        }
        arrTemp[i] = message;
        noteBook = arrTemp;
        if (noteBook[i] != null) {
            return "New note created! Index of note is " + (i + 1);
        } else {
            return "Something wrong";
        }
    }

    /**
     * uses for reading some note.
     *
     * @param index - number of the note.
     * @return information about status of the new note.
     */
    protected String readTheLetter(int index) {
        if (noteBook.length > 0 && index > 0 && index <= noteBook.length) {
            return ("Note with index " + index + ": " + noteBook[index - 1]);
        } else {
            return "Nothing to read!";
        }
    }

    /**
     * uses for deleting some note.
     *
     * @param index - number of the note.
     * @return information about status of the new note.
     */
    protected String deleteTheLetter(int index) {
        if (noteBook.length > 0 && index > 0 && index <= noteBook.length) {
            String arrTemp[] = new String[noteBook.length - 1];
            int count = 0;
            for (int i = 0; i < arrTemp.length; i++) {
                if (i != index - 1) {
                    arrTemp[count] = noteBook[i];
                    count++;
                }
            }
            noteBook = arrTemp;
            return "Note with index " + index + " deleted!";
        } else {
            return "Nothing to delete!";
        }
    }

    /**
     * uses for editing some note.
     *
     * @param index   - number of the note.
     * @param message - new version of the message
     * @return information about status of the new note.
     */
    protected String editTheLetter(int index, String message) {
        if (noteBook.length > 0 && index > 0 && index <= noteBook.length) {
            noteBook[index - 1] = message;
            return "Note with index " + index + " edited!";
        } else {
            return "Nothing to edit!";
        }

    }

    /**
     * uses for showing all of the notes.
     *
     * @return list of the notes.
     */
    protected String showAll() {
        StringBuffer sb = new StringBuffer();
        int i = 1;
        for (int j = 0; j < noteBook.length; j++) {
            sb.append("Note #" + i + ":\n" + noteBook[j] + "\n\n");
            i++;
        }
        return sb.toString();
    }
}
