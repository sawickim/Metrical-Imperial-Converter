package com.example.converter;

public class MetricToImperialConverter {
    public static double metersToFoot(String meter) {
        double foot = 3.2808 *  Double.parseDouble(meter);
        return foot;
    }

    public static double centymetrsToInch(String centymeters) {
        double inch = 0.3937 *  Double.parseDouble(centymeters);
        return inch;
    }

    public static double litersToGallons(String liters) {
        double gallons = 1.7597 *  Double.parseDouble(liters);
        return gallons;
    }

    public static double kilogramsToPounds(String kilograms) {
        double pounds = 2.2046 *  Double.parseDouble(kilograms);
        return pounds;
    }

    public static double celsiusToFaranhait(String celsius) {
        double faranhait = 1.8 * Double.parseDouble(celsius) + 32;
        return faranhait;
    }
}
