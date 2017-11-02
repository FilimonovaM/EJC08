package com.epam.hw4;

import com.epam.hw4.phrases.Answer;

public class Menu {
    String startTheMenu(){
        System.out.println(Answer.WELCOME.toString(1));

        return startTneFirstLevel();
    }

    String startTneFirstLevel(){
        for(;;){
            System.out.println(Answer.WELCOME.toString(0));
            break;
        }
        return Answer.WELCOME.toString(2);
    }
}
