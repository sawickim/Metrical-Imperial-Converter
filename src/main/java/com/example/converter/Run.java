package com.example.converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
    public static void main(String[] args) throws IOException {
        System.out.println("one unit mater to foot");
        System.out.println(MetricToImperialConverter.metersToFoot("1"));
        System.out.println("one unit kilogram to pound");
        System.out.println(MetricToImperialConverter.kilogramsToPounds("1"));
        System.out.println("one unit centymeter to inch");
        System.out.println(MetricToImperialConverter.centymetrsToInch("1"));
        System.out.println("one unit literer to gallon");
        System.out.println(MetricToImperialConverter.litersToGallons("1"));
        System.out.println("one unit Celsius to Faranhaite");
        System.out.println(MetricToImperialConverter.celsiusToFaranhait("1"));

        System.out.println("one unit foot to meter");
        System.out.println(ImperialToMetricalConverter.footToMeters("1"));
        System.out.println("one unit pound to kilogram");
        System.out.println(ImperialToMetricalConverter.poundsToKilograms("1"));
        System.out.println("one unit inch to centymeters");
        System.out.println(ImperialToMetricalConverter.inchToCentymeters("1"));
        System.out.println("one unit gallon liters");
        System.out.println(ImperialToMetricalConverter.gallonsToLiters("1"));
        System.out.println("one unit Faranheite to Celsius");
        System.out.println(ImperialToMetricalConverter.faranhaitToCelsius("1"));
    }
}
