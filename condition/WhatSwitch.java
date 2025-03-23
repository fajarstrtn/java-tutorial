
import java.util.Scanner;

public class WhatSwitch {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Insert a number: ");
            int number = sc.nextInt();

            String day;

            day = switch (number) {
                case 1 ->
                    "Monday";
                case 2 ->
                    "Tuesday";
                case 3 ->
                    "Wednesday";
                case 4 ->
                    "Ttursday";
                case 5 ->
                    "Friday";
                case 6 ->
                    "Saturday";
                case 7 ->
                    "Sunday";
                default ->
                    "Out of day";
            };

            System.out.println(day);
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated.");
        }

    }

}
