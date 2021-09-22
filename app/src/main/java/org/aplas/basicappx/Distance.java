package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance(){
        meter = 0;
    }

    public void setMeter(double meter){
        this.meter = meter;
    }

    public void setInch(double meter){
        this.meter = convert("Inc", "Mtr", meter);
    }

    public void setMile(double meter){
        this.meter = convert("Mil", "Mtr", meter);
    }

    public void setFoot(double meter){
        this.meter = convert("Ft", "Mtr", meter);
    }

    public double getMeter(){
        return meter;
    }

    public double getInch(){
        return convert("Mtr", "Inc", meter);
    }

    public double getMile(){
        return convert("Mtr", "Mil", meter);
    }

    public double getFoot(){
        return convert("Mtr", "Ft", meter);
    }

    public double convert(String oriUnit, String convUnit, double value){
        double convert = 0;

        switch (oriUnit){
            case "Mtr":
                convert = value;
                break;
            case "Inc":
                convert = value/39.3701;
                break;
            case "Mil":
                convert = value/0.000621371;
                break;
            case "Ft":
                convert = value/3.28084;
                break;
        }

        switch (convUnit){
            case "Mtr":
                convert = convert;
                break;
            case "Inc":
                convert = convert*39.3701;
                break;
            case "Mil":
                convert = convert*0.000621371;
                break;
            case "Ft":
                convert = convert*3.28084;
                break;
        }
        return convert;
    }
}
