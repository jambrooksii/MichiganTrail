package com.company;

import java.util.Scanner;

public class Marketplace {
    int food;
    String tireKit;
    String blanket;
    String jumperCables;
    String flashLight;
    String roadCones;
    double fuel;
boolean again = false;
    Scanner intScanner = new Scanner(System.in);

    Bank newBank = new Bank();

    public void buyCar(){
        System.out.println("\nYou have $2500 to Start. Choose your vehicle:");
        System.out.println("[1] 1992 Toyota Camry - $1000\n" +
                "[2] Subaru - $1500\n[3] Jeep - $2000");

        int carSelection = intScanner.nextInt();

        if (carSelection == 1) {
            newBank.subtractFund(1000);
            System.out.println("Interesting choice, this car is really old and terrible in the snow.  But it gets great gas mileage. " +
                    "\nYou now have $" + newBank.getFunds() + "\n");
        } else if (carSelection == 2) {
            newBank.subtractFund(1500);
            System.out.println("Solid choice, you played it safe.  This car does a little bit of everything." +
                    "\nYou now have $" + newBank.getFunds() + "\n");
        } else if (carSelection == 3) {
            newBank.subtractFund((2000));
            System.out.println("Big baller! This car is expensive, but does great in the snow. This car is a gas guzzler hope you can " +
                    "afford it. \n You have $" + newBank.getFunds() + "\n");
        }
    }

    public void marketplacePrompt() {
        Supplies suppliesArray = new Supplies();
        Jeep newJeep = new Jeep();
        Fuel newFuel = new Fuel();

        do {
            System.out.println("Welcome to the MarketPlace. \nYou have " + newBank.getFunds() + "\n/nSelect the items you wish to purchase.");
            System.out.println("[1] Tire Kit - $300" +
                    "\n[2] Luxury Blanket - $150" +
                    "\n[3] Jumper Cables - $150" +
                    "\n[4] Flashlight - $50" +
                    "\n[5] Road Cones - $50" +
                    "\n[6] Fuel - 5 Units $5");

            Scanner userScanner = new Scanner(System.in);
            int choice = userScanner.nextInt();

            if (choice == 1) {
                newBank.subtractFund(300);
                suppliesArray.addItem.add("Tire Kit");

            } else if (choice == 2) {
                newBank.subtractFund(150);
                suppliesArray.addItem.add("Luxury Blanket");

            } else if (choice == 3) {
                newBank.subtractFund(150);
                suppliesArray.addItem.add("Jumper Cables");

            } else if (choice == 4) {
                newBank.subtractFund(50);
                suppliesArray.addItem.add("Flashlight");

            } else if (choice == 5) {
                newBank.subtractFund(50);
                suppliesArray.addItem.add("Road Cones");

            } else if (choice == 6) {
                newBank.subtractFund(50);
                suppliesArray.addItem.add("Flashlight");

            } else if (choice == 7) {
                newBank.subtractFund(50);
                newFuel.addFuel(5);
                System.out.println(newJeep.jeepFuel);


            }
            System.out.println(newBank.getFunds());

            System.out.println("Do you want to buy more items \n" +
                    "[1] Yes\n" +
                    "[2] No]\n");
            int numInput = intScanner.nextInt();
            if(numInput == 1){
                again = true;
            }
        }while (again);
    }
}

