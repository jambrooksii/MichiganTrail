package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank newBank = new Bank();
        Jeep newJeep = new Jeep();
        PlayerArray newPlayerArray = new PlayerArray();
        Marketplace newMarket = new Marketplace();
        newJeep.addScenario();
        Trivia newTriva = new Trivia();


        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Welcome to Michigan Trail! Who Are You, My Brave Soul?: " +
                "\n\nPlease Enter Name: ");
        String playerOneName = stringScanner.nextLine();
        System.out.println("Welcome to the Trail: " + playerOneName + "!");

        System.out.println("\nHow old are you? ");
        int playerOneAge = intScanner.nextInt();

        System.out.println("\nWhat is your temperament: ");
        String playerOneTemp = stringScanner.nextLine();
        System.out.println("");

        Players playerOne = new Players(playerOneName, playerOneAge, playerOneTemp);
        newPlayerArray.playersArray.add(playerOne);
        System.out.println(newPlayerArray.playersArray.get(0).name);

        newMarket.buyCar();

        System.out.println("You are riding the Michigan Trail with 2 of your best friends\n" +
                "Enter Friend 1 Name:");

        String playerTwoName = stringScanner.nextLine();
        System.out.println("Welcome to the Trail " + playerTwoName + "!");

        System.out.println("\n How old are they? ");
        int playerTwoAge = intScanner.nextInt();

        System.out.println("\n What is their temperament?: ");
        String playerTwoTemp = stringScanner.nextLine();

        Players playerTwo = new Players(playerTwoName, playerTwoAge, playerTwoTemp);
        newPlayerArray.playersArray.add(playerTwo);
        System.out.println(newPlayerArray.playersArray.get(1).name);


        System.out.println("\nEnter Friend 2 Name: ");

        String playerThreeName = stringScanner.nextLine();
        System.out.println("Welcome to the Trail: " + playerThreeName + "!");

        System.out.println("\nHow old are they? ");
        int playerThreeAge = intScanner.nextInt();


        System.out.println("\nWhat is their temperament?: ");
        String playerThreeTemp = stringScanner.nextLine();

        Players playerThree = new Players(playerThreeName, playerThreeAge, playerThreeTemp);
        newPlayerArray.playersArray.add(playerThree);
        System.out.println(newPlayerArray.playersArray.get(2).name);


        newMarket.marketplacePrompt();

        System.out.println("Time to hit the trail! Lets go!");
        System.out.println("................");
        System.out.println("Day 1: Moral is high. No problems on the horizon. Everyone gets a good night sleep.");
        newMarket.whichFuel();

        System.out.println("................");

        System.out.println("Press Enter to Continue");
        String trivia = stringScanner.nextLine();

        System.out.println("Day 2: " + newJeep.jeepScenarios.get(1) + "\n");

        newMarket.whichFuel();

        System.out.println("Press Enter to Continue");
        String trivia2 = stringScanner.nextLine();

        System.out.println("Day 3: " + newJeep.jeepScenarios.get(2) + "\n");


        newMarket.whichFuel();

        System.out.println("Press Enter to Continue");
        String trivia3 = stringScanner.nextLine();

        System.out.println("Day 4 ");
        newTriva.triviaGame();
        System.out.println("");



    }



    }

