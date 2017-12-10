package com.epam.vol2.oop.ex5;

import com.epam.vol2.oop.ex5.students.Student;

import java.util.ArrayList;
import java.util.List;

public class Lesson implements ClassWork{
    List<Student> studentsList;
    boolean isNumeric;
    String lessonName;
    StringBuffer sb = new StringBuffer();

    public Lesson(boolean isNumeric, String lessonName, Student ... students){
        studentsList = new ArrayList<>();
        this.isNumeric = isNumeric;
        for (Student student: students){
            studentsList.add(student);
        }
        this.lessonName = lessonName;
    }

    /**
     * uses get the name of lesson.
     *
     * @return info about name of lesson.
     */
    @Override
    public String getName(){
        return lessonName;
    }

    /**
     * uses to update assessment info.
     *
     */
    @Override
    public void updateNum(){
        for(Student student: studentsList){
            if(isNumeric){
                student.setAssessment();
            }else{
                student.setStringAssessment();
            }
        }
    }

    /**
     * uses to get the assessments.
     *
     * @return info about student assessments.
     */
    @Override
    public String getAssessment(String studentName){
        sb.setLength(0);
        for (Student student: studentsList){
            if(studentName.equals(student.getName())) {
                sb.append(student.getCurrentAssessment());
            }
        }
        if(sb.length()==0){
            sb.append("does not attend");
        }
        return sb.toString();
    }
}
