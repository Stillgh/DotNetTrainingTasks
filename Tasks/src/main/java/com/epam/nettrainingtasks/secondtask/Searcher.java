package com.epam.nettrainingtasks.secondtask;

public class Searcher {

    public void searchingForNumber(int[] arraysToSearch, int number) {

        int low = 0;
        int high = arraysToSearch.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int quess = arraysToSearch[middle];

            if (quess == number) {
                System.out.println("Number is found! It is " + quess + " and it's index is " + middle);
                return;
            } else if (quess > number) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        System.out.println("Sorry, there is no such number in the array");
    }
}
