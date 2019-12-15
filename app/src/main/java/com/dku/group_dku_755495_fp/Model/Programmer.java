package com.dku.group_dku_755495_fp.Model;

public class Programmer extends Employee {

    private double nbProjects ;

    public  Programmer(){

    }

    public Programmer( String name, int birthYear, double monthlySalary, double rate,Vehicle vehicle ,double nbProjects,String id) {
        super(name, birthYear, monthlySalary, rate , vehicle , id);
        this.nbProjects = nbProjects;
    }

    public double getNbProjects() {
        return nbProjects;
    }

    public void setNbProjects(double nbProjects) {
        this.nbProjects = nbProjects;
    }

    @Override
    public String toDisplay() {
        String result ;
        result = "Name:"+getName()+"\nAge:"+getAge()+"\n"+getVehicle().toDisplay()+"\nOccupation Rate: "+getRate() +"%\nAnnual income: $ "+annualIncome()+"\nHe/She has completed "+getNbProjects()+" projects";

        return result;
    }

    public double annualIncome(){
        double result;

        result = 12+getMonthlySalary();
        result = (result * getRate()) / 100 ;
        result = result + (getNbProjects()*GAIN_FACTOR_PROJECTS);


        return result;
    }
}
