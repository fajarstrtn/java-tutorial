
import java.util.Scanner;

public class WhatSwitch {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("insert a number: ");
            int number = sc.nextInt();

            String day;

            day = switch (number) {
                case 1 ->
                    "monday";
                case 2 ->
                    "tuesday";
                case 3 ->
                    "wednesday";
                case 4 ->
                    "Ttursday";
                case 5 ->
                    "friday";
                case 6 ->
                    "saturday";
                case 7 ->
                    "sunday";
                default ->
                    "Out of day";
            };

            System.out.println(day);
        }
        
    }
}
