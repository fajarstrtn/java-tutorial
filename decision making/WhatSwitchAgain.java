
import java.util.Scanner;

public class WhatSwitchAgain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("insert a number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1 ->
                System.out.println("i am the one");
            case 2 ->
                System.out.println("i am the second");
            case 3 ->
                System.out.println("i am the third");
            default ->
                System.out.println("i am other");
        }
        
    }
}
