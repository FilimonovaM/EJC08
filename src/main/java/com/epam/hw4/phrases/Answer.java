package com.epam.hw4.phrases;

public enum Answer implements PrototypeOfAnswer {
    WELCOME {
        @Override
        public String toString(int value) {
            String s;
            switch (value) {
                case 1: return "Hello, my dear friend! Welcome to the hippodrome!\n ";
                case 2: return "\nOhhh... Don`t come back without the money!!!";
                default:return "Do you wont to spend some money?\nIf you want to make a bet, type <1> & press <Enter>.\n" +
                        "If you want to leave our casino type <0>.";
            }
        }
    },
    BET {
        @Override
        public String toString(int value) {
            switch (value) {
                case 1: return "Your balance is: ";
                case 2: return "Make your ber!";
                case 3: return "Your bet is set to zero";
                default:return "Type 1 to check your balance?\nType 2 to make a bet" +
                        "\nType 3 to set to zero your bet\nType " +
                        "4 to come back to previous level of menu";
            }
        }
    },
    HORSES {
        @Override
        public String toString(int value) {
            switch (value) {
                case 1: return "We have 5 horses: " +
                        "\n1. Arabian Stallion - perfect double-quick pureblooded arabian horse." +
                        "\n2. Little gray donkey. His last name is Serenity. " +
                        "\n3. Plotva - Witcher try to make some money for his new journey!" +
                        "\n4. Little Rainbow Pony. It will spend all its physical forces & magic boosts \n" +
                        "for running...or not! " +
                        "\n5. Zebra. Just a wild zebra. It don`t know what is the start & stop points, \n" +
                        "but it can run so quickly." +
                        "Enter the number of horse to choose it! \n" +
                        "Or you can type another symbol to come back to the general menu.\n" +
                        "Choose your favorite!";
                case 2: return "What is the horse do you prefer?";
                case 3: return "You choose";
                case 4: return  "Player Heralt make his bet too." +
                        "\n\nThe Big races are will begin through ...three...\n" +
                        "...two...\n...one...\n GO!!!!!!!";
                case 5: return " is finished first!!!";
                case 6: return "You are The WINNER!!! Your balance is ";
                case 7: return "You are The WINNER!!! \nBut, you can get only a half of gain, " +
                        "because the Heralt bets on Plotva too! ";
                case 8: return "You are The WINNER!!! Your balance is ";
                case 9: return "Tigidik - tigidik - tigidik...\n" +
                        "tigidik - tigidik - tigidik...\n" +
                        "tigidik - tigidik -tigidik...\n" +
                        "tigidik - \"Yuehogo!!!!!\"-tigidik...\n"+
                        "tigidik - tigidik - tigidik...\n" +
                        "tigidik - tigidik -tigidik...\n" +
                        "tigidik - \"Yuehogo!!!!!\"-tigidik...";
                default:return "Type 1 to see what the horses compete in the next race\n" +
                        "Type 2 to choose a horse\n" +
                        "Type 3 to back to previous level of the menu";
            }
        }
    }
}
