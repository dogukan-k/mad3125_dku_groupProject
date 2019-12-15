package com.dku.group_dku_755495_fp.Model;

public class Manager extends Employee {

    private double nbClients;

    public Manager(){

    }


    public Manager( String name, int birthYear, double monthlySalary, double rate,Vehicle vehicle ,double nbClients , String id) {
        super( name, birthYear, monthlySalary, rate , vehicle , id);
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
