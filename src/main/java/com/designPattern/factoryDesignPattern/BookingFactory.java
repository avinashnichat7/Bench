package com.designPattern.factoryDesignPattern;

public class BookingFactory {

    public static Booking createBooing(String input) {

        if (input.equalsIgnoreCase("first")) {
            return new FirstAcTier();
        } else if (input.equalsIgnoreCase("second")) {
            return new SecondAcTier();

        } else if (input.equalsIgnoreCase("third")) {
            return new ThirdAcTier();
        }
        throw new IllegalArgumentException("Invalid input");

    }
}
