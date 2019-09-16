package com.epam.nettrainingtasks.fourthtask;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        FactorialFinder myFactorialFinder = new FactorialFinder();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to find factorial of");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("You entered negative number");
        } else {
            System.out.println("Factorial of number " + num + " is " + myFactorialFinder.findFactorial(num));
        }
    }
}
