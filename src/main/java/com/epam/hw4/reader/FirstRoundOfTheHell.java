package com.epam.hw4.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstRoundOfTheHell {
    Reader reader;
    int bet = 0;
    int choozenHorse = 0;
    int answer = 0;

    public FirstRoundOfTheHell(Reader reader) {
        this.reader = reader;
    }

    public void runner(int limit){

    }
    public int goToCasino() throws IOException {
        while (true) {
            answer = reader.read(0, 2);
            if (answer == -1) {
                break;
            } else if (answer == 1) {
                System.out.println("We have 5 horses: " +
                        "\n1. Arabian Stallion - perfect double-quick pureblooded arabian horse." +
                        "\n2. Little gray donkey. His last name is Serenity. " +
                        "\n3. Plotva - Witcher try to make some money for his new journey!" +
                        "\n4. Little Rainbow Pony. It will spend all its physical forces & magic boosts \n" +
                        "for running...or not! " +
                        "\n5. Zebra. Just a wild zebra. It don`t know what is the start & stop points, \n" +
                        "but it can run so quickly." +
                        "Enter the number of horse to choose it! \n" +
                        "Or you can type another symbol to come back to the general menu.\n");
                choozenHorse = chooseAHorse();
            } else {
                answer = 0;
            }
        }
        return choozenHorse;
    }

    public int chooseAHorse() throws IOException {
        while (true) {
            choozenHorse = reader.read(0, 6);
            if (choozenHorse == -1) {
                break;
            } else if (choozenHorse > 0 && choozenHorse < 6) {
                break;
            } else {
                choozenHorse = 0;
            }
        }
        return choozenHorse;
    }

    public int makeBet(int maxBet) throws IOException {
        while (true) {
            bet = reader.read(0, maxBet);
            if (bet == -1) {
                break;
            } else if (bet > 0 && bet < maxBet) {
                break;
            } else {
                bet = 0;
            }
        }
        return bet;
    }
}

