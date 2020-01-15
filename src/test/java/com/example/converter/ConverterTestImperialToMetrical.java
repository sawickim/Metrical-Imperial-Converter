package com.example.converter;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ConverterTestImperialToMetrical {

    private boolean compare(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value is out of range");
        }
        return Double.compare(value,0) > 0;
    }

    //feet to meters
    @Test
    public void zeroFeetTestFeetToMeters() {
        Assertions.assertEquals(0, ImperialToMetricalConverter.footToMeters(0));
    }

    @Test
    public void oneFeetTestFeetToMeters() {
        Assertions.assertEquals(0.3048, ImperialToMetricalConverter.footToMeters(1));
    }

    @Test
    public void oneFeetNotEquilsZeroTestFeetToMeters() {
        Assertions.assertNotEquals(0, ImperialToMetricalConverter.footToMeters(1));
    }

    @Test
    public void twoFeetTestFeetToMeters() {
        Assertions.assertEquals(0.6096, ImperialToMetricalConverter.footToMeters(2));
    }

    @Test
    public void twoFeetsNotEquilsCorrectTestFeetToMeters() {
        Assertions.assertNotEquals(6, ImperialToMetricalConverter.footToMeters(2));
    }

    @Test
    public void minusOneFeetsTestFeetToMeters(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                compare(ImperialToMetricalConverter.footToMeters(-1)));
    }

    //inch to centymeters
    @Test
    public void zeroInchTestInchsToCentymeters() {
        Assertions.assertEquals(0, ImperialToMetricalConverter.inchToCentymeters(0));
    }

    @Test
    public void oneInchsTestInchToCentymeters() {
        Assertions.assertEquals(2.54, ImperialToMetricalConverter.inchToCentymeters(1));
    }

    @Test
    public void oneInchsNotEquilsZeroTestInchToCentymeters() {
        Assertions.assertNotEquals(0, ImperialToMetricalConverter.inchToCentymeters(1));
    }

    @Test
    public void twoInchsTestInchToCentymeters() {
        Assertions.assertEquals(5.08, ImperialToMetricalConverter.inchToCentymeters(2));
    }

    @Test
    public void twoInchsNotEquilsCorrectTestInchToCentymeters() {
        Assertions.assertNotEquals(6, ImperialToMetricalConverter.inchToCentymeters(2));
    }

    @Test
    public void minusOneInchsTestInchToCentymeters(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                compare(ImperialToMetricalConverter.inchToCentymeters(-1)));
    }

    //gallons to liters
    @Test
    public void zeroGallonsTestGallonsToLiters() {
        Assertions.assertEquals(0, ImperialToMetricalConverter.gallonsToLiters(0));
    }

    @Test
    public void oneGallonsTestGallonsToLiters() {
        Assertions.assertEquals(3.7854, ImperialToMetricalConverter.gallonsToLiters(1));
    }

    @Test
    public void oneGallonsNotEquilsZeroTestGallonsToLiters() {
        Assertions.assertNotEquals(0, ImperialToMetricalConverter.gallonsToLiters(1));
    }

    @Test
    public void twoGallonsTestGallonsToLiters() {
        Assertions.assertEquals(7.5708,ImperialToMetricalConverter.gallonsToLiters(2));
    }

    @Test
    public void twoGallonsNotEquilsCorrectTestGallonsToLiters() {
        Assertions.assertNotEquals(6, ImperialToMetricalConverter.gallonsToLiters(2));
    }

    @Test
    public void minusOneGallonsTestGallonsToLiters(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                compare(ImperialToMetricalConverter.gallonsToLiters(-1)));
    }

    //pounds to kilograms
    @Test
    public void zeroPoundsTestPoundsToKilograms() {
        Assertions.assertEquals(0, ImperialToMetricalConverter.poundsToKilograms(0));
    }

    @Test
    public void onePoundsTestPoundsToKilograms() {
        Assertions.assertEquals(0.4535, ImperialToMetricalConverter.poundsToKilograms(1));
    }

    @Test
    public void onePoundsNotEquilsZeroTestPoundsToKilograms() {
        Assertions.assertNotEquals(0, ImperialToMetricalConverter.poundsToKilograms(1));
    }

    @Test
    public void twoPoundsTestPoundsToKilograms() {
        Assertions.assertEquals(0.907,ImperialToMetricalConverter.poundsToKilograms(2));
    }

    @Test
    public void twoPoundsNotEquilsCorrectTestPoundsToKilograms() {
        Assertions.assertNotEquals(6, ImperialToMetricalConverter.poundsToKilograms(2));
    }

    @Test
    public void minusOnePoundTestPoundsToKilograms(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                compare(ImperialToMetricalConverter.poundsToKilograms(-1)));
    }

    //Faranhaite to Celius
    @Test
    public void zeroFaranhaitesTestFaranhaitresToCelsiuses() {
        Assertions.assertEquals(-17.77777777777778, ImperialToMetricalConverter.faranhaitToCelsius(0));
    }

    @Test
    public void oneFaranhaitesTestFaranhaitresToCelsiuses() {
        Assertions.assertEquals(-17.22222222222222, ImperialToMetricalConverter.faranhaitToCelsius(1));
    }

    @Test
    public void oneFaranhaitesNotEquilsZeroTestFaranhaitresToCelsiuses() {
        Assertions.assertNotEquals(0, ImperialToMetricalConverter.faranhaitToCelsius(1));
    }

    @Test
    public void twoFaranhaitesTestFaranhaitresToCelsiuses() {
        Assertions.assertEquals(-16.666666666666668,ImperialToMetricalConverter.faranhaitToCelsius(2));
    }

    @Test
    public void twoFaranhaitesNotEquilsCorrectTestFaranhaitresToCelsiuses() {
        Assertions.assertNotEquals(-15, ImperialToMetricalConverter.faranhaitToCelsius(2));
    }
}
