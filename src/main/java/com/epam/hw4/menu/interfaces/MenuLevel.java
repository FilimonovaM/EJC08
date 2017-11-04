package com.epam.hw4.menu.interfaces;

import com.epam.hw4.menu.config.AnswerReader;

public interface MenuLevel {
    MenuLevel runner(AnswerReader answerReader);
}
