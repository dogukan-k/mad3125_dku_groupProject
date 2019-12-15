package com.dku.group_dku_755495_fp.Model;

public class Motorcycle extends Vehicle {

    boolean hasSidecar ;

    public Motorcycle(){

    }


    public Motorcycle(String make, String plate, String color, String category, boolean hasSidecar) {
        super(make, plate, color, category);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toDisplay() {
        String result;
        String sideCarResult="without a side car";

        if(isHasSidecar()){
            sideCarResult="with a side car";
        }

        result = "Employee has a motorcycle"+"\n-Model:"+getMake()+"\nPlate:"+getPlate()+"\nColor:"+getColor()+"\n"+sideCarResult;
        return result;

    }
}
