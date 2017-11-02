package com.epam.hw4;

import com.epam.hw4.game.InitialTheHorses;
import com.epam.hw4.phrases.Answer;
import com.epam.hw4.wallet.Wallet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    int answer;
    InitialTheHorses initialTheHorses = new InitialTheHorses();
    Wallet wallet = new Wallet();
    Reader reader;
    String write = null;
    BufferedReader bufferedReader;

    String startTheMenu() {
        System.out.println(Answer.WELCOME.toString(1));
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            reader = new Reader(bufferedReader);
            return startTheCasinoBeginnerOfMenu();
        } catch (IOException e) {
            System.err.println("Buffered reader is crashed: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error input data: " + e.getMessage());
        } catch (SpecialMenuException e) {
            System.err.println("Something gone wrong: " + e.getMessage());
        }
        return Answer.WELCOME.toString(2);
    }

    String startTheCasinoBeginnerOfMenu() throws IOException {
        for (; ; ) {
            if (wallet.getPlayerBalance() != 0) {
                System.out.println(Answer.WELCOME.toString(0));
                answer = reader.read();
                if (answer == 0) {
                    break;
                } else if (answer == 1) {
                    System.out.println(startTheHorseChooserOfMenu());
                }
            } else {
                break;
            }
        }
        return Answer.WELCOME.toString(2);
    }

    String startTheHorseChooserOfMenu() throws IOException {
        for (; ; ) {
            if (wallet.getPlayerBalance() != 0) {
                System.out.println(Answer.HORSES.toString(1));
                answer = reader.read();
                if (answer < 1 || answer > 5) {
                    break;
                } else if (answer > 0 && answer < 6) {
                    System.out.println(initialTheHorses.initTheHorses(answer) + Answer.HORSES.toString(2));
                    System.out.println(startTheWalletMenu());
                }
                write = Answer.BET.toString(3);
            } else {
                write = null;
                break;
            }
        }
        return write;
    }

    String startTheWalletMenu() throws IOException {
        boolean bol = true;
        System.out.println(Answer.WALLET.toString(2));
        while (bol) {
            System.out.println(Answer.WALLET.toString(-1));
            answer = reader.read();
            if (wallet.getPlayerBalance() != 0) {
                switch (answer) {
                    case 1:
                        System.out.println(Answer.WALLET.toString(1) + wallet.getPlayerBalance());
                        break;
                    case 2:
                        System.out.println(startThePlayMakeABet());
                        break;
                    case 3:
                        System.out.println(wallet.removeBet());
                        break;
                    case 4:
                        System.out.println(wallet.removeBet());
                        bol = false;
                        break;
                    default:
                        System.err.println("You enter something wrong! Use a digits from 1 to 4");
                }
                write = Answer.WALLET.toString(4);
            } else {
                bol = false;
                write = null;
            }
        }
        return write;
    }

    String startThePlayMakeABet() throws IOException {
        boolean bol = true;
        while (bol) {
            System.out.println(Answer.BET.toString(1));
            answer = reader.read();
            if (wallet.getPlayerBalance() < 1) {
                System.out.println(Answer.WALLET.toString(5));
                break;
            } else {
                if (answer > 0 && answer <= wallet.getPlayerBalance()) {
                    System.out.println(Answer.BET.toString(2) + wallet.setBet(answer));
                    System.out.println(initialTheHorses.runTheRace());
                } else if (answer == 0) {
                    bol = false;
                } else {
                    System.out.println(Answer.BET.toString(-1));
                }
            }
        }
        return Answer.BET.toString(3);
    }
}
