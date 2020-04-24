package edu.ti.caih313.recursionhw;

import java.util.Scanner;

public class ComputePower {
    public static void main(String[] args) {
        System.out.println("Enter a positive number: ");
        Scanner keyboard = new Scanner(System.in);
        long number = keyboard.nextLong();
        System.out.println("With recursion: 10 to the power of " + number + " is " + tenToTheN(number) + ".");
        System.out.println("Without recursion: 10 to the power of " + number + " is " + simpleTenToTheN(number) + ".");
    }

    public static long tenToTheN(long n) {
        long value;
        if (n==0) {
            value = 1;
        }
        else if(n == 1) {
            value = 10;
        }
        else if(n == 2) {
            value = 100;
        }
        else if(n%2 == 0) {
            long valueHalf = tenToTheN(n/2);
            value = valueHalf * valueHalf;
        }
        else {
            long valueHalfIsh = tenToTheN((n-1)/2);
            value = 10 * valueHalfIsh * valueHalfIsh;
        }
        return value;
    }

    public static long simpleTenToTheN(long n) {
        long value = 1;
        for (int i=0; i<n; i++) {
            value = value * 10;
        }
        return value;
    }
}









