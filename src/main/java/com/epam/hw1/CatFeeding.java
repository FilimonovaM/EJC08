package com.epam.hw1;

import java.io.BufferedReader;
import java.io.IOException;

public class CatFeeding {
    StringBuilder stringBuilder;
    private String name;
    private int numberOfMice;
    private int amount;
    private boolean relayOfLoop;
    Operations operations;

    CatFeeding(BufferedReader reader) {
        relayOfLoop = true;
        stringBuilder = new StringBuilder();
        operations = new Operations(reader);
    }

    /**
     * uses to start cat`s loop
     */
    public void start() throws IOException {
        name = operations.read().toString();
        stringBuilder.setLength(0);
        while (relayOfLoop) {
            System.out.println("\nLet`s feed " + name + "! If you want to give a bowl of special nutrition " +
                    "press any even number. \nPress any odd number to give a mouse. \nPress another key to escape.");
            stringBuilder = stringBuilder.append(operations.read().toString());
            if (!operations.isNumber(stringBuilder) || !relayOfLoop) {
                relayOfLoop = false;
            } else {
                relayOfLoop = eat();
            }
        }
    }

    /**
     * uses to access the method answer() from the mine()
     *
     * @param answer is a number of the phrase that will be written
     */
    public void getAnswer(int answer) {
        answer(answer);
    }

    /**
     * uses for saving of the dialog logic
     *
     * @return boolean answer to start().relay
     */
    private boolean eat() throws IOException {
        int catsChoose = operations.parseToInt(stringBuilder);
        boolean isEat = true;
        stringBuilder.setLength(0);
        if (catsChoose % 2 == 0) {
            answer(0);
        } else {
            answer(1);
            stringBuilder.append(operations.read().toString());
            if (operations.isNumber(stringBuilder) & stringBuilder.length() >= 0 & operations.parseToInt(stringBuilder) >= 0) {
                numberOfMice = operations.parseToInt(stringBuilder);
                amount += numberOfMice;
                if (amount >= 15) {
                    answer(2);
                    isEat = false;
                } else if (amount < 15 && numberOfMice > 1) {
                    answer(3);
                } else if (amount < 15 && numberOfMice == 1) {
                    answer(4);
                } else {
                    answer(5);
                }
            } else {
                answer(6);
            }
        }
        return isEat;
    }

    /**
     * uses to choose a phrase
     *
     * @param answer is a number of the phrase that will be written
     */
    private void answer(int answer) {
        int tell = answer;
        switch (tell) {
            case (0): {
                System.out.println("Cat don`t want to eat this  special cat`s nutrition. It want to hunt! Try to " +
                        "give him a mouse!");
                break;
            }
            case (1): {
                System.out.println("Choose amount of the mouses & press <ENTER>");
                break;
            }
            case (2): {
                System.out.println(name + " caught 15 out of " + numberOfMice + " mice. It is full.");
                break;
            }
            case (3): {
                System.out.println(name + " is happy! It \n" + "caught " + numberOfMice + " mice. \n"
                        + "It needs more mice. \n" + "Total eaten:" + amount + " mice");
                break;
            }
            case (4): {
                System.out.println(name + " is happy! It \n" + "caught 1 mouse. " +
                        "Total eaten:" + amount + " mice.");
                break;
            }
            case (5): {
                System.out.println(name + " is in sorrow. You forgot to give him a mouse.Total eaten: amount mice");
                break;
            }
            case (6): {
                System.out.println("It is not a number or \n" + "a negative number.");
                break;
            }
            case (7): {
                System.out.println("Enter the cat`s name");
                break;
            }
            case (8): {
                System.out.println("\n" + "Cat is grateful. Bye!");
                break;
            }
            default: {
                System.out.println("\n" + "We will never see this text. If we csn see it something broke.");
                break;
            }
        }
    }
}
