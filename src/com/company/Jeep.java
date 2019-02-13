package com.company;

import java.util.ArrayList;

public class Jeep {

    int jeepFuel = 20;



    public int getJeepFuel() {
        return jeepFuel;
    }

    public void setJeepFuel(int jeepFuel) {
        this.jeepFuel = jeepFuel;
    }

    public ArrayList<String> getJeepScenarios() {
        return jeepScenarios;
    }

    public void setJeepScenarios(ArrayList<String> jeepScenarios) {
        this.jeepScenarios = jeepScenarios;
    }

    ArrayList<String>jeepScenarios = new ArrayList<>();
}
