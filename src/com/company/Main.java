package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank newBank = new Bank();

        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        System.out.println("Welcome to Michigan Trail! You have $2500 to Start. Choose your vehicle: ");
        System.out.println("[1] 1992 Toyota Camry - $1000\n" +
                "[2] Subaru - $1500\n[3] Jeep - $2000");

        int carSelection = intScanner.nextInt();

        if (carSelection == 1) {
            newBank.subtractFund(1000);
        }
        else if (carSelection == 2) {
            newBank.subtractFund(1500);
        }
        else if (carSelection == 3) {
            newBank.subtractFund((2000));
        }

        System.out.println("Enter ");



    }
}
