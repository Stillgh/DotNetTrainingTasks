package com.epam.nettrainingtasks.secondtask;


import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        //можно было использовать метод Arrays.binarySearch(arr, num);

        Searcher mySearcher = new Searcher();
        int[] array = {1, 2, 3, 5, 6, 7, 8, 10, 21, 23, 34, 55, 67};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to find");
        int enteredNumber = input.nextInt();
        mySearcher.searchingForNumber(array, enteredNumber);
    }
}
