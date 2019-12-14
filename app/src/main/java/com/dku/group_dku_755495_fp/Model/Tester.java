package com.dku.group_dku_755495_fp.Model;

public class Tester extends Employee {

    private String nbBugs ;

    public Tester(){

    }

    public Tester(int year, String name, int birthYear, double monthlySalary, double rate, String nbBugs) {
        super(year, name, birthYear, monthlySalary, rate);
        this.nbBugs = nbBugs;
    }

    public String getNbBugs() {
        return nbBugs;
    }

    public void setNbBugs(String nbBugs) {
        this.nbBugs = nbBugs;
    }

    @Override
    public String toDisplay() {
        return "";
    }
}
