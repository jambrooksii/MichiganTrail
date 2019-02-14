package com.company;

import java.util.Scanner;

public class Marketplace {

    boolean again = false;
    Supplies suppliesArray = new Supplies();
    Jeep newJeep = new Jeep();
    Fuel newFuel = new Fuel();
    Scanner intScanner = new Scanner(System.in);

    Bank newBank = new Bank();
    int carSelection;

    public void buyCar() {

        System.out.println("\nYou have $2500 to Start. Choose your vehicle:");
        System.out.println("[1] 1992 Toyota Camry - $1000\n" +
                "[2] Subaru - $1500\n[3] Jeep - $2000");

        carSelection = intScanner.nextInt();

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


        do {
            System.out.println("\n\nWelcome to the MarketPlace. \nYou have " + newBank.getFunds() + "\n\nSelect the items you wish to purchase.");
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
                newFuel.addFuelJeep(5);
                newFuel.addFuelCamry(5);
                newFuel.addFuelSubaru(5);

                System.out.println(newJeep.jeepFuel);


            }
            System.out.println(newBank.getFunds());

            System.out.println("Do you want to buy more items \n" +
                    "[1] Yes\n" +
                    "[2] No]\n");
            int numInput = intScanner.nextInt();
            if (numInput == 1) {
                again = true;
            } else if (numInput == 2) {
                again = false;
            }
        } while (again == true);

        listOfSupplies();
    }

    public void listOfSupplies() {
        for (int i = 0; i < suppliesArray.addItem.size(); i++) {
            System.out.println(suppliesArray.addItem.get(i));
        }
    }

    public void whichFuel() {
        if (carSelection == 1) {
            newFuel.subtractFuelCamery();
            System.out.println("You have " + newFuel.fuel4.camryFuel + " Units of fuel left");
        } else if (carSelection == 2) {
            newFuel.subtractFuelSubaru();
            System.out.println("You have " + newFuel.fuel3.subaruFuel + " Units of Fuel left");
        } else if (carSelection == 3) {
            newFuel.subtractFuelJeep();
            System.out.println("You have " + newFuel.fuel2.jeepFuel + " Units of Fuel left");
        }
    }
}

