package edu.ti.caih313.recursionhw;

import java.util.Scanner;

public class CountOddDigits {
        private static int count = 0;

        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = keyboard.nextInt();
            System.out.println("With recursion: The number of odd digits is " + countOdd(n) + ".");
            System.out.println("Without recursion: The number of odd digits is " + simpleCountOdd(n) + ".");
        }

        public static int countOdd(int number) {

            int remainder = number % 10;
            int quotient = (number - remainder) / 10;

            if (!(remainder % 2 == 0)) {
                count++;
            }

            number = quotient;
            if (number < 10) {
                if (!(number % 2 == 0)) {
                    count++;
                }
            } else {
                countOdd(number);
            }
            return count;
        }

        public static int simpleCountOdd(int number) {
            int numDigits = 0;
            int numberToCount = number;
            while(numberToCount != 0) {
                numberToCount /= 10;
                numDigits++;
            }

            int secondCount = 0;

            for (int i = 0; i < numDigits; i++) {
                int remainder = number % 10;
                if (remainder%2 != 0) {
                    secondCount++;
                }
                number = number/10;
            }
            return secondCount;
        }
    }
