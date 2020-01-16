package com.example.converter;

public class ImperialToMetricalConverter {
    public static double footToMeters(double foot) {
        double meters = 0.3048 * foot;
        return meters;
    }

    public static double inchToCentymeters(double inch) {
        double centymeters = 2.54 *  inch;
        return centymeters;
    }

    public static double gallonsToLiters(double gallons) {
        double liters = 3.7854 *  gallons;
        return liters;
    }

    public static double poundsToKilograms(double pounds) {
        double kilograms = 0.4535 *  pounds;
        return kilograms;
    }

    public static double faranhaitToCelsius(double faranhait) {
        double celsius =  (faranhait - 32) / 1.8;
        return celsius;
    }
}
