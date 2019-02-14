package com.company;

public class Fuel {
    Jeep fuel2 = new Jeep();
    Subaru fuel3 = new Subaru();
    Camery fuel4 = new Camery();


    public void addFuelJeep( int fuel){
        fuel2.jeepFuel = fuel + fuel2.jeepFuel;
    }

    public void addFuelCamry( int fuel){
        fuel4.camryFuel = fuel + fuel4.camryFuel;
    }

    public void addFuelSubaru( int fuel){
        fuel3.subaruFuel = fuel + fuel3.subaruFuel;
    }




    public void subtractFuelJeep(){
        if (fuel2.jeepFuel <= 0) {
            System.out.println("You're out of fuel! Game over!");
        } else fuel2.jeepFuel = fuel2.jeepFuel - 5;
    }

    public void subtractFuelCamery(){
        if (fuel4.camryFuel <= 0) {
            System.out.println("You're out of fuel! Game over!");
        } else fuel4.camryFuel = fuel4.camryFuel - 5;
    }

    public void subtractFuelSubaru(){
        if (fuel3.subaruFuel <= 0) {
            System.out.println("You're out of fuel! Game over!");
        } else fuel3.subaruFuel = fuel3.subaruFuel - 5;
    }







}
