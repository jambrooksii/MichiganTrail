package com.company;

import java.util.Scanner;

public class Trivia {

public void triviaGame() {

    Scanner triviaScanner = new Scanner(System.in);

    System.out.println("Welcome to Michigan Trail Trivia! Question One: \n What is the state capital of Michigan?");
    String triviaChoice1 = triviaScanner.nextLine();

    if (triviaChoice1.equalsIgnoreCase("Lansing")) {
        System.out.println("That is correct!");
    } else System.out.println("That is incorrect, sorry!");


    System.out.println("Question Two: \n What is the Michigan state bird?");
    String triviaChoice2 = triviaScanner.nextLine();

    if (triviaChoice2.equalsIgnoreCase("American Robin")) {
        System.out.println("That is correct!");
    } else System.out.println("That is incorrect, sorry!");



}





}


