package com.epam.hw4.menu;

import java.io.IOException;

public class Menu {
    MenuLevel menuLevel;
    AnswerReader answerReader;
    public Menu(){
        menuLevel = new EnterMenuLevel();
        answerReader = new AnswerReader();
    }

    public String changeMenuLevel() throws IOException {
        for(;;){
            menuLevel = menuLevel.runner(answerReader);
            if(menuLevel == null){
                break;
            }
        }
        return (answerReader.closeReader());
    }
}
