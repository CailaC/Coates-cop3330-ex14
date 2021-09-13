package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is the order amount?" );
        int amount = input.nextInt();

        System.out.println( "What is the state?" );
        String state = input.next();

        // Tax Calculations
        double tax = 0.055;
        double total = 0;

        if (state.equals("WI")) {
            tax = tax * amount;
            total = tax + amount;
            System.out.printf( "The subtotal is $%d.\n", amount );
            System.out.printf("The tax is $%.2f.\n", tax);
            System.out.printf("The total is $%.2f.", total);

        }
        if(!state.equals("WI")) {
            total = amount;
            System.out.printf("The total is $%.2f.", total);
        }

    }
}
