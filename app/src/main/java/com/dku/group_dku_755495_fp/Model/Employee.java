package com.dku.group_dku_755495_fp.Model;

import java.util.Calendar;

public class Employee {


    public static double GAIN_FACTOR_CLIENT = 500;
    public static double GAIN_FACTOR_TRAVEL = 100;
    public static double GAIN_FACTOR_ERROR = 10;
    public static double GAIN_FACTOR_PROJECTS = 200;

    int year = Calendar.getInstance().get(Calendar.YEAR);

    private String name;
    private int age;
    private int birthYear;
    private double monthlySalary;
    private double rate;
    private  Vehicle vehicle ;

    public Employee(){

    }

    public Employee( String name, int birthYear, double monthlySalary, double rate , Vehicle vehicle) {

        this.name = name;
        this.age = year - birthYear ;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        this.rate = rate;
        this.vehicle = vehicle ;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public String toDisplay(){
        return "";
    }
}
