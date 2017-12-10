package com.epam.vol2.oop.ex5.students;

import java.util.Random;

public class Kogan implements Student {
    String asses = "";
    String name = "Kogan";
    static int count = 0;

    /**
     * uses to set new assessment & calculate count.
     */
    @Override
    public void setAssessment() {
        Random random = new Random();
        int n = random.nextInt(10);
        asses = String.valueOf(n / 2 + 1);
        count += n;
    }

    /**
     * uses to set new String assessment & calculate count.
     */
    @Override
    public void setStringAssessment() {
        Random random = new Random();
        int i = random.nextInt(2) + 1;
        if (i < 1) {
            asses = "bed";
        } else if (i == 1) {
            asses = "normal";
            count += 5;
        } else {
            asses = "good";
            count += 10;
        }
    }

    /**
     * uses to get name of student.
     *
     * @return student`s name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * uses to get assessment.
     *
     * @return student`s assessment.
     */
    @Override
    public String getCurrentAssessment() {
        return asses;
    }

    /**
     * uses to get a count.
     *
     * @return count
     */
    @Override
    public int getCount() {
        return count;
    }
}
