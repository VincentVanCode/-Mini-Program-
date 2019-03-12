package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

            int num = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= num ; i++) {

                int lastDigit = i % 10;
                int middleDigit = (i / 10) % 10;
                int firstDigit = middleDigit % 10;
                int sumOfDigits = lastDigit + middleDigit + firstDigit;
                if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11){
                    System.out.printf("%d -> True%n",i);
                } else {
                    System.out.printf("%d -> False%n",i);
                }
            }
        }
    }
