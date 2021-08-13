package com.CabInvoiceGenerator;
import java.util.Scanner;

public class FareCalculator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Total Distance covered by the Customer: ");
        int a = s.nextInt();
        System.out.print("Enter Total Waiting time in Minutes: ");
        int b = s.nextInt();
        int x = 0, y = 0, z =0;
        if (a <= 5){
            System.out.println("fare for first 5KM : 50Rs");
            System.out.println("total distance: " + a + " fare:50");
        }
        else if (a > 5 && a <= 1000){
            System.out.println("first 5 km fare : 50 Rs.");
            x = a - 5;
            y = x * 10;
            System.out.println("next " + x + " 10 rs per KM : " + y + " Rs.");
            y = y + 50;
            System.out.println("Total fare will be  : " + y + " Rs.");
            z = y + b;
            System.out.println("Total Fare with Waiting charge will be " + z + " Rs " );
        }
    }
}
