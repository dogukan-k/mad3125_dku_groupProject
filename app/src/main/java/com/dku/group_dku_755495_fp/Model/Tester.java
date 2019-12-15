package com.dku.group_dku_755495_fp.Model;

public class Tester extends Employee {

    private double nbBugs ;

    public Tester(){

    }

    public Tester( String name, int birthYear, double monthlySalary, double rate, Vehicle vehicle,double nbBugs, String id) {
        super( name, birthYear, monthlySalary, rate , vehicle , id);
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
        String result ;
        result = "Name:"+getName()+"\nAge:"+getAge()+"\n"+getVehicle().toDisplay()+"\nOccupation Rate: "+getRate() +"%\nAnnual income: $ "+annualIncome()+"\nHe/She corrected "+getNbBugs()+" bugs";

        return result;
    }

    public double annualIncome(){
        double result;

        result = 12+getMonthlySalary();
        result = (result * getRate()) / 100 ;
        result = result + (getNbBugs()*GAIN_FACTOR_ERROR);


        return result;
    }
}
