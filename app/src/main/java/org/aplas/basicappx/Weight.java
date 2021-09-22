package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight(){
        gram = 0;
    }

    public void setGram(double gram){
        this.gram = gram;
    }

    public void setOunce(double gram){
        this.gram = convert("Onc", "Grm", gram);
    }

    public void setPound(double gram){
        this.gram = convert("Pnd", "Grm", gram);
    }

    public double getGram(){
        return gram;
    }

    public double getOunce(){
        return convert("Grm", "Onc", gram);
    }

    public double getPound(){
        return convert("Grm", "Pnd", gram);
    }

    public double convert(String oriUnit, String convUnit, double value){
        double convert = 0;

        switch (oriUnit){
            case "Grm":
                convert = value;
                break;
            case "Onc":
                convert = value*28.3495231;
                break;
            case "Pnd":
                convert = value*453.59237;
                break;
        }

        switch (convUnit){
            case "Grm":
                convert = convert;
                break;
            case "Onc":
                convert = convert/28.3495231;
                break;
            case "Pnd":
                convert = convert/453.59237;
                break;
        }
        return convert;
    }
}
