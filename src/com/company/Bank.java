package com.company;

public class Bank {
    double funds = 2500;

    public void addFunds(double addedFunds){
        addedFunds += funds;
    }

    public void subtractFund(double subtractedFunds){
        subtractedFunds -= funds;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }




}
