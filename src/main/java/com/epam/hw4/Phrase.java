package com.epam.hw4;


public enum Phrase {
    MEETING {
        public String getInfo(Object o) {
            return ("Ohhh... Don`t come back without the money!!!");
        }


        public String getInfo(String s, int i) {
            return null;
        }


        public String getInfo() {
            return ("Hello, my dear friend! Welcome to the our hippodrome!\n " +
                    "Do you wont to spend some money?\n" +
                    "If it is true, type <1> & press <Enter>.\n" +
                    "If you want to leave our casino type another " +
                    "symbol.");
        }
    },
    HORSES {
        public String getInfo(Object o) {
            return ("So, watch out for " + (String) o);
        }

        public String getInfo(String s, int i) {
            return null;
        }

        public String getInfo() {
            return ("We have 5 horses: " +
                    "\n1. Arabian Stallion - perfect double-quick pureblooded arabian horse." +
                    "\n2. Little gray donkey. His last name is Serenity. " +
                    "\n3. Plotva - Witcher try to make some money for his new journey!" +
                    "\n4. Little Rainbow Pony. It will spend all its physical forces & magic boosts \n" +
                    "for running...or not! " +
                    "\n5. Zebra. Just a wild zebra. It don`t know what is the start & stop points, \n" +
                    "but it can run so quickly." +
                    "Enter the number of horse to choose it! \n" +
                    "Or you can type another symbol to come back to the general menu.\n");
        }
    },
    BETS {
        public String getInfo(Object money) {
            return (((Integer) money >= 0) ? ("You win " + (Integer) money) : ("You lost" + ((-1) * ((Integer) money))));
        }

        public String getInfo(String line, int i) {
            return (line + " balance is " + i);
        }

        public String getInfo() {
            return ("Enter your bet: ");
        }
    }
}
