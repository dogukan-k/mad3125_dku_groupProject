package com.dku.group_dku_755495_fp.Model;

public class Car extends  Vehicle {

    private String type ;


    public Car(){

    }
    public Car(String make, String plate, String color, String category, String type) {
        super(make, plate, color, category);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toDisplay() {
        return super.toDisplay();
    }
}
