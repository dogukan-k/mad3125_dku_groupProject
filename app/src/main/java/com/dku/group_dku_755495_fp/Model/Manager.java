package com.dku.group_dku_755495_fp.Model;

public class Manager extends Employee {

    private double nbClients;

    public Manager(){

    }


    public Manager(int year, String name, int birthYear, double monthlySalary, double rate, double nbClients) {
        super(year, name, birthYear, monthlySalary, rate);
        this.nbClients = nbClients;
    }

    public double getNbClients() {
        return nbClients;
    }

    public void setNbClients(double nbClients) {
        this.nbClients = nbClients;
    }

    @Override
    public String toDisplay() {
        return "";
    }
}
