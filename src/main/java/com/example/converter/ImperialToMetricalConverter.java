package com.example.converter;

public class ImperialToMetricalConverter {
    public static double footToMeters(String foot) {
        double meters = 0.3048 *  Double.parseDouble(foot);
        return meters;
    }

    public static double inchToCentymeters(String inch) {
        double centymeters = 2.54 *  Double.parseDouble(inch);
        return centymeters;
    }

    public static double gallonsToLiters(String gallons) {
        double liters = 3.7854 *  Double.parseDouble(gallons);
        return liters;
    }

    public static double poundsToKilograms(String pounds) {
        double kilograms = 0.4535 *  Double.parseDouble(pounds);
        return kilograms;
    }

    public static double faranhaitToCelsius(String faranhait) {
        double celsius =  (Double.parseDouble(faranhait) - 32) / 1.8;
        return celsius;
    }
}
