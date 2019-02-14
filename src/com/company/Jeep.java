package com.company;

import java.util.ArrayList;

public class Jeep {
    ArrayList<String>jeepScenarios = new ArrayList<>();

    int jeepFuel = 20;


//
//    public int getJeepFuel() {
//        return jeepFuel;
//    }
//
//    public void setJeepFuel(int jeepFuel) {
//        this.jeepFuel = jeepFuel;
//    }
//
//    public ArrayList<String> getJeepScenarios() {
//        return jeepScenarios;
//    }
//
//    public void setJeepScenarios(ArrayList<String> jeepScenarios) {
//        this.jeepScenarios = jeepScenarios;
//    }


    public void addScenario() {
         jeepScenarios.add("You hit a pothole and got a flat! Dang these Michigan roads!");
         jeepScenarios.add("You're car broke down and it is COLD out! Hopefully you have a blanket!");
         jeepScenarios.add("You're battery is dead! You've managed to flag someone down for a jump but they dont have jumper cables!");
    }



}
