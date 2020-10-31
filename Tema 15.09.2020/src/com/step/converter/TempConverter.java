package com.step.converter;

public class TempConverter {
    public double convertToFahr(double celsius){
        double fahrenheit=(celsius/5)*9+32;
        return fahrenheit;
    }
    public double convertToCelsius(double fahr){
        double cels=(fahr-32)*5/9;
        return cels;
    }
}
