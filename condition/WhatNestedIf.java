
import java.util.Scanner;

public class WhatNestedIf {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert the number: ");
            int number = sc.nextInt();

            if (number < 0) {
                System.out.println("Negative number!!!");
            }

            if (number == 7) {
                System.out.println("This is Christiano Ronaldo!");
            } else {
                System.out.println("This is another player.");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated.");
        }
    }

}
