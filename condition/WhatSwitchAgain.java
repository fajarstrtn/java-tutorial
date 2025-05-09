
import java.util.Scanner;

public class WhatSwitchAgain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the number: ");
        int num = sc.nextInt();

        sc.close();

        switch (num) {
            case 1 ->
                System.out.println("I am the one.");
            case 2 ->
                System.out.println("I am the second.");
            case 3 ->
                System.out.println("I am the third.");
            default ->
                System.out.println("I am the other.");
        }
    }

}
