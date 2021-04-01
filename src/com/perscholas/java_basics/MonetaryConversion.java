package com.perscholas.java_basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MonetaryConversion {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.#####");

        System.out.println("--------Monetary Equivalent Calculation---------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money(in dollars ex: 5.5 $) : ");
        double amount = input.nextDouble();

        // Calculate Dollars
        int dollars = (int) amount;
        double remainingAmt = Double.parseDouble(df.format(amount - dollars));

        // Calculate Quarters
        int quarters = (int) (remainingAmt / 0.25);
        remainingAmt = Double.parseDouble(df.format(remainingAmt - (0.25 * quarters)));

        // Calculate Dimes
        int dimes = 0;
        if (remainingAmt != 0) {
            dimes = (int) (remainingAmt / 0.1);
            remainingAmt = Double.parseDouble(df.format(remainingAmt - (0.1 * dimes)));
        }

        // Calculate Nickels
        int nickels = 0;
        if (remainingAmt != 0) {
            nickels = (int) (remainingAmt / 0.05);
            remainingAmt = Double.parseDouble(df.format(remainingAmt - (0.05 * nickels)));
        }

        // Calculate Pennies
        int pennies = 0;
        if (remainingAmt != 0) {
            pennies = (int) (remainingAmt / 0.01);
            remainingAmt = Double.parseDouble(df.format(remainingAmt - (0.01 * pennies)));
            if (remainingAmt != 0) {
                pennies += 1;
            }
        }

        System.out.println("Monetary Equivalent in Dollars, Quarters, Dimes, Nickels and Pennies : ");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");

    }
}
