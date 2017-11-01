package com.epam.hw4;

import com.epam.hw4.game.RaceManager;
import com.epam.hw4.horse.types.*;
import com.epam.hw4.reader.FirstRoundOfTheHell;
import com.epam.hw4.reader.Reader;
import com.epam.hw4.reader.SpecialLocalException;
import com.epam.hw4.wallet.Wallet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConfigurationLoader {
    int bet;
    int choozenHorse = 1;
    Wallet wallet;
    RaceManager raceManager;
    boolean isLoad = false;
    boolean isRun = false;

    public String loader() {
        raceManager = new RaceManager();
        wallet = new Wallet();
        System.out.println("Hello, my dear friend! Welcome to the our hippodrome!\n ");
        System.out.println("Do you wont to spend some money?\n" +
                "If it is true, write 1 & press <Enter>.\n" +
                "If you want to leave our casino type another key");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!isLoad) {
                isLoad = player(bufferedReader);
            }
        } catch (IOException e) {
            System.err.println();
        } catch (NumberFormatException e) {
            System.err.println();
        } catch (SpecialLocalException e) {
            System.err.println();
        }
        return ("Ohhh... Don`t come back without the money!!!");
    }

    public boolean player(BufferedReader bufferedReader) {
        Reader reader = new Reader(bufferedReader);
        FirstRoundOfTheHell firstRoundOfTheHell = new FirstRoundOfTheHell(reader);
//        choozenHorse = firstRoundOfTheHell.goToCasino();

        raceManager.addHorse(new Donkey(), new Plotva(), new ArabianHorse(), new RainbowPony(), new Zebra());
        System.out.println(raceManager.setChoozenHorse(choozenHorse));
        System.out.println(raceManager.race());
        System.out.println((raceManager.isWin()) ? wallet.win() : wallet.loose());
        return !isRun;
    }
}
