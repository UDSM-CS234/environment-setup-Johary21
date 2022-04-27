package com.company;

public class Main {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.00;
        double fallingTime = 10.0;
        double initialPosition = 0.00;
        double position = 0.5 * gravity* fallingTime*fallingTime + initialVelocity*fallingTime + initialPosition;
        double finalPosition = 0.00;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + position + " m.");
    }
}
