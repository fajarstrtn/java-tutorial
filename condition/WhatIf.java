
public class WhatIf {

    public static void main(String[] args) {
        String carName = "Renault";

        if (carName.equals("Renault")) {
            System.out.println("I am inside of this car right now!");
        }

        if (carName.equalsIgnoreCase("renault")) {
            System.out.println("I am really inside of this car right now!");
        }

        System.out.println("Oops! It is outside of if block.");
    }

}
