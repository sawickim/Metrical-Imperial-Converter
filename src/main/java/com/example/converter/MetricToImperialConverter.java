package com.example.converter;

public class MetricToImperialConverter {

    public static double metersToFoot(double meter) {
        double foot = 3.2808 *  meter;
        return foot;
    }

    public static double centymetrsToInch(double centymeters) {
        double inch = 0.3937 *  centymeters;
        return inch;
    }

    public static double litersToGallons(double liters) {
        double gallons = 1.7597 *  liters;
        return gallons;
    }

    public static double kilogramsToPounds(double kilograms) {
        double pounds = 2.2046 *  kilograms;
        return pounds;
    }

    public static double celsiusToFaranhait(double celsius) {
        double faranhait = 1.8 * celsius + 32;
        return faranhait;
    }
}
