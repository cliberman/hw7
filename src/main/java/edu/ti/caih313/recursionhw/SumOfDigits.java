package edu.ti.caih313.recursionhw;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a positive number: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println("With recursion: The sum of the digits in the number entered is " + getSum(number) + ".");
        System.out.println("Without recursion: The sum of the digits in the number entered is " + simpleGetSum(number) + ".");
    }

    public static int getSum(int n) {
        return n == 0 ? 0 : n % 10 + getSum(n/10);
    }

    public static int simpleGetSum(int n) {
        int sum = 0;
        int numDigits = 0;
        int numberToCount = n;
        while(numberToCount != 0) {
            numberToCount /= 10;
            numDigits++;
        }

        for (int i = 0; i < numDigits; i++) {
            int remainder = n % 10;
            sum+=remainder;
            n = n/10;
        }
        return sum;
        }
    }
