package numberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public void help() {
        System.out.println("Hey, this is small number guessing game.");
        System.out.println("=======================================");
        System.out.println("Start with startGame method.");
        System.out.println("=======================================");
        System.out.println("You can change difficulty with argument:");
        System.out.println("-Noob - For 4 tries.");
        System.out.println("-Intermediate - For 3 tries.");
        System.out.println("-Pro - For 2 tries.");
        System.out.println("-God - For 1 tries.");
        System.out.println("=================================================================");


    }

    private int generateNewNumber() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(10) + 1;
        return randomNumber;
    }

    public void startGame(String difficulty) {
        generateNewNumber();
        int tries = 0;

        if (difficulty.equalsIgnoreCase("Noob")) {
            tries = 4;
        }
        if (difficulty.equalsIgnoreCase("Intermediate")) {
            tries = 3;
        }
        if (difficulty.equalsIgnoreCase("Pro")) {
            tries = 2;
        }
        if (difficulty.equalsIgnoreCase("God")) {
            tries = 1;
        }
        if (difficulty.isEmpty()) {
            tries = 3;
        }

        System.out.println("Make your guess.");
        System.out.println("---------------");
        Scanner scan = new Scanner(System.in);
        int randomNumber = generateNewNumber();
        for (int i = tries; i > 1; i++) {
            int userGuess = scan.nextInt();
            if (userGuess > randomNumber) {
                tries = tries - 1;
                i = tries;
                System.out.println("Wrong! Your number is bigger than random.");
                System.out.println("You have " + tries + "left,");
            }

            if (userGuess < randomNumber) {
                tries = tries - 1;
                i = tries;
                System.out.println("Wrong! Your number is smaller than random.");
                System.out.println("You have " + tries + "left,");
            }
            if (userGuess == randomNumber) {
                System.out.println("That's right! You guessed the number.");
                tries = 0;
                i = tries;
                return;
            }
        }
    }
}
