package com.example.converter;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class ConverterTestMetricToImperial {

    private boolean compare(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value is out of range");
        }
            return Double.compare(value,0) > 0;
    }

    //meters to feet
    @Test
    public void zeroMetersTestMatersToFoot() {
        Assertions.assertEquals(0, MetricToImperialConverter.metersToFoot(0));
    }

    @Test
    public void oneMetersTestMatersToFoot() {
        Assertions.assertEquals(3.2808, MetricToImperialConverter.metersToFoot(1));
    }

    @Test
    public void oneMetersNotEquilsZeroTestMatersToFoot() {
        Assertions.assertNotEquals(0, MetricToImperialConverter.metersToFoot(1));
    }

    @Test
    public void twoMetersTestMetersToFoot() {
        Assertions.assertEquals(6.5616, MetricToImperialConverter.metersToFoot(2));
    }

    @Test
    public void twoMetersNotEquilsCorrectTestMetersToFoot() {
        Assertions.assertNotEquals(6, MetricToImperialConverter.metersToFoot(2));
    }

    @Test
    public void minusOneMetersTestMetersToFoot(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                compare(MetricToImperialConverter.metersToFoot(-1)));
    }

    //CentymetrsToInch

    @Test
    public void zeroCentymetrsTestCentymetrsToInch() {
        Assertions.assertEquals(0, MetricToImperialConverter.centymetrsToInch(0));
    }

    @Test
    public void oneCentymetrsTestCentymetrsToInch() {
        Assertions.assertEquals(0.3937, MetricToImperialConverter.centymetrsToInch(1));
    }

    @Test
    public void oneCentymetrsNotEquilsZeroTestCentymetrsToInch() {
        Assertions.assertNotEquals(0, MetricToImperialConverter.centymetrsToInch(1));
    }

    @Test
    public void twoCentymetrsTestCentymetrsToInch() {
        Assertions.assertEquals(0.7874, MetricToImperialConverter.centymetrsToInch(2));
    }

    @Test
    public void twoCentymetrsNotEquilsCorrectTestCentymetrsToInch() {
        Assertions.assertNotEquals(6, MetricToImperialConverter.centymetrsToInch(2));
    }

    @Test
    public void minusOneCentymetrTestCentymetrsToInch(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                compare(MetricToImperialConverter.centymetrsToInch(-1)));
    }

    //litersToGallons

    @Test
    public void zeroLitersTestLitersTGallon() {
        Assertions.assertEquals(0, MetricToImperialConverter.litersToGallons(0));
    }

    @Test
    public void oneLitersTestLitersTGallon() {
        Assertions.assertEquals(1.7597, MetricToImperialConverter.litersToGallons(1));
    }

    @Test
    public void oneLitersNotEquilsZeroTestLitersTGallon() {
        Assertions.assertNotEquals(0, MetricToImperialConverter.litersToGallons(1));
    }

    @Test
    public void twoLitersTestLitersTGallon() {
        Assertions.assertEquals(3.5194, MetricToImperialConverter.litersToGallons(2));
    }

    @Test
    public void twoLitersNotEquilsCorrectTestLitersTGallon() {
        Assertions.assertNotEquals(6, MetricToImperialConverter.litersToGallons(2));
    }

    @Test
    public void minusOneLitreTestLitersTGallon(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                compare(MetricToImperialConverter.litersToGallons(-1)));
    }

    //kilograms to pounds
    @Test
    public void zeroKilogramsTestKilogramsToPounds() {
        Assertions.assertEquals(0, MetricToImperialConverter.kilogramsToPounds(0));
    }

    @Test
    public void oneKilogramsTestKilogramsToPounds() {
        Assertions.assertEquals(2.2046, MetricToImperialConverter.kilogramsToPounds(1));
    }

    @Test
    public void oneKilogramsNotEquilsZeroTestKilogramsToPounds() {
        Assertions.assertNotEquals(0, MetricToImperialConverter.kilogramsToPounds(1));
    }

    @Test
    public void twoKilogramsTestKilogramsToPounds() {
        Assertions.assertEquals(4.4092, MetricToImperialConverter.kilogramsToPounds(2));
    }

    @Test
    public void twoKilogramsNotEquilsCorrectTestKilogramsToPounds() {
        Assertions.assertNotEquals(6, MetricToImperialConverter.kilogramsToPounds(2));
    }

    @Test
    public void minusOneKilogramTestKilogramsToPounds(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                compare(MetricToImperialConverter.kilogramsToPounds(-1)));
    }

    //Celius to faranhaite
    @Test
    public void zeroCeliusesTestCeliusesToFaranhaites() {
        Assertions.assertEquals(32, MetricToImperialConverter.celsiusToFaranhait(0));
    }

    @Test
    public void oneCeliuesesTestCelisesToFaranhaites() {
        Assertions.assertEquals(33.8, MetricToImperialConverter.celsiusToFaranhait(1));
    }

    @Test
    public void oneCeliusesNotEquilsZeroTestCelisesToFaranhaites() {
        Assertions.assertNotEquals(0, MetricToImperialConverter.celsiusToFaranhait(1));
    }

    @Test
    public void twoCeliusesTestCelisesToFaranhaites() {
        Assertions.assertEquals(35.6, MetricToImperialConverter.celsiusToFaranhait(2));
    }

    @Test
    public void twoCeliusesNotEquilsCorrectTestCelisesToFaranhaites() {
        Assertions.assertNotEquals(6, MetricToImperialConverter.kilogramsToPounds(2));
    }
}
