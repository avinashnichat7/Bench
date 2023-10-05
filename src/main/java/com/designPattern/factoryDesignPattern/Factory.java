package com.designPattern.factoryDesignPattern;

import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
        String name = scanner.next();
        try {

            Booking booing = BookingFactory.createBooing(name);
            System.out.println(booing.getAcClass());

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
