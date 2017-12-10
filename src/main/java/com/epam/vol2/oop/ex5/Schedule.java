package com.epam.vol2.oop.ex5;

import com.epam.vol2.oop.ex5.students.*;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List <ClassWork> classWorks = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    Lesson math;
    Lesson chemistry;
    Lesson literature;
    Student bestStudent = new Ivanov();

    /**
     * uses to init the components
     *
     */
    public void init(){
        students.add(new Ivanov());
        students.add(new Petrov());
        students.add(new Vasechkin());
        students.add(new Kogan());
        math = new Lesson(true, "Math",
                new Petrov(), new Ivanov(), new Vasechkin());
        chemistry = new Lesson(true, "Chemistry",
                new Kogan(), new Ivanov(), new Petrov(), new Vasechkin());
        literature = new Lesson(false, "Literature",
                new Kogan(), new Petrov());
        classWorks.add(math);
        classWorks.add(chemistry);
        classWorks.add(literature);
    }

    /**
     * uses to check the assessment & find the best student.
     *
     * @return info about best student
     */
    public String checkGroup(){
        init();
        classWorks.forEach(list-> list.updateNum());
        for(Student student: students){
            System.out.println("Assessments of "+
                    student.getName()+":");
            classWorks.forEach(list -> System.out.println(list.getName()+
                    " - "+list.getAssessment(student.getName())));
            if(bestStudent.getCount()<student.getCount()){
                bestStudent = student;
            }
            System.out.println();

        }

        return "The best student of this session is "+ bestStudent.getName();
    }
}
