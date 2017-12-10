package com.epam.vol2.oop.ex5;

import com.epam.vol2.oop.ex5.students.Ivanov;
import com.epam.vol2.oop.ex5.students.Petrov;
import com.epam.vol2.oop.ex5.students.Vasechkin;
import org.junit.Assert;
import org.junit.Test;

public class LessonTest {
    Lesson lesson = new Lesson(true, "Math",
            new Petrov(), new Ivanov(), new Vasechkin());
    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Math", lesson.getName());
    }

    @Test
    public void getAssessment() throws Exception {
        Assert.assertEquals("does not attend", lesson.getAssessment("Ivanov"));
    }

}