package com.dku.group_dku_755495_fp.Model;

public class Tester extends Employee {

    private double nbBugs ;

    public Tester(){

    }

    public Tester( String name, int birthYear, double monthlySalary, double rate, Vehicle vehicle,double nbBugs) {
        super( name, birthYear, monthlySalary, rate , vehicle);
        this.nbBugs = nbBugs;
    }

    public double getNbBugs() {
        return nbBugs;
    }

    public void setNbBugs(double nbBugs) {
        this.nbBugs = nbBugs;
    }

    @Override
    public String toDisplay() {
        return "";
    }
}
