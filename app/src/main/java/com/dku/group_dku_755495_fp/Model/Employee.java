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

    public Employee(int year, String name, int birthYear, double monthlySalary, double rate) {
        this.year = year;
        this.name = name;
        this.age = year - birthYear ;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        this.rate = rate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public String toDisplay(){
        return "";
    }
}
