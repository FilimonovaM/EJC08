package com.epam.hw4.answer.phrases;

import com.epam.hw4.answer.interfaces.PrototypeOfAnswer;

public enum Answer implements PrototypeOfAnswer {
    WELCOME {
        /**
         *
         */
        @Override
        public String toString(int value) {
            String s;
            switch (value) {
                case 1:
                    return "Let`s play! Press 1 to play, press 2 to stop the game.";
                case 2:
                    return "Ohhh... Don`t come back without the money!!!";
                default:
                    return "Hello, my dear friend! Welcome to the hippodrome!";
            }
        }
    }, HORSES {
        @Override
        public String toString(int value) {
            switch (value) {
                case 1:
                    return "\nEnter the number to choose a horse! " +
                            "\nRemember! You can type another symbol to come back to the general menu.\n" +
                            "\nWe have 5 horses:\n " +
                            "\n--- 1 --- ARABIAN STALLION. \nIt is a perfect double-quick pureblooded arabian horse." +
                            "\n--- 2 --- LITTLE GRAY DONKEY. \nHis last name is Serenity. " +
                            "\n--- 3 --- PLOTVA.\n Witcher try to make some money for his new journey!" +
                            "\n--- 4 --- RAINBOW PONY. \nIt will spend all its physical forces & magic boosts \n" +
                            "for running...or not! " +
                            "\n--- 5 --- ZEBRA. Just a wild zebra. \nIt don`t know where is the load & stop points, \n" +
                            "but it can config very quickly.\n" +
                            "Type 0 to back to previous level of the menu";
                default:
                    return "... Good choice!";
            }
        }
    },
    WALLET {
        @Override
        public String toString(int value) {
            switch (value) {
                case 1:
                    return "Your balance is: ";
                case 2:
                    return "\nAaaaaand....It`good time to check your ability to pay !";
                default:
                    return "\nType 1 to check your balance\nType 2 to make a bet" +
                            "\nType 0 to come back to the previous level of menu";
            }
        }
    },
    BET {
        @Override
        public String toString(int value) {
            switch (value) {
                case 1:
                    return "\nLet`s make a bet! Remember - it`s limited by your current balance!\n" +
                            "Type 0 to come back to the previous level";
                case 2:
                    return "Your bet is ";
                default:
                    return "\nYour bet is incorrect. Try again! Your limit is ";
            }
        }
    }, RACE {
        @Override
        public String toString(int value) {
            switch (value) {
                case 1:
                    return "\n Winner is ";
                case 2:
                    return "\nYou are The WINNER!!! \nYour balance is ";
                case 3:
                    return "\nYou WIN!!! \nBut, you can get only a half of the gain, " +
                            "because the Heralt bets on Plotva too! \nYour balance is ";
                case 4:
                    return "\nCASINO WIN - You loose!!! \nYour balance is ";
                case 5:
                    return "You are a bancrott";
                default:
                    return "Player Heralt make a bet too." +
                            "\n\nThe Big races are will begin through ...three...\n" +
                            "...two...\n...one...\n GO!!!!!!!" +
                            "\n\nTigidik - tigidik - tigidik...\n" +
                            "tigidik - tigidik - tigidik...\n" +
                            "tigidik - tigidik -tigidik...\n" +
                            "tigidik - \"Yuehogo!!!!!\"-tigidik...\n" +
                            "tigidik - tigidik - tigidik...\n" +
                            "tigidik - tigidik -tigidik...\n" +
                            "tigidik - \"Yuehogo!!!!!\"-tigidik...\n";
            }
        }
    }
}
