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

        String result ;
        result = "Name:"+getName()+"\nAge:"+getAge()+"\n"+getVehicle().toDisplay()+"\nOccupation Rate: "+getRate() +"%\nAnnual income: $ "+annualIncome()+"\nHe/She has brought "+getNbClients()+" new clients";


        return result;
    }


    public double annualIncome(){
        double result;

        result = 12+getMonthlySalary();
        result = (result * getRate()) / 100 ;
        result = result + (getNbClients()*GAIN_FACTOR_CLIENT);


        return result;
    }


}
