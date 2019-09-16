package com.epam.nettrainingtasks.firsttask;


import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        //можно было бы использовать готовую функцию Arrays.sort(array);
        int[] arrayToSort = {42, 21, -100, 23, 23, 3, -1, 32, 21, -100, 445, 43, 2, 102, -3, 32, 102, -32, -333, 32, 32, 3, 5543, 5, 32, 44, 577, 43, 3, 21};
        Sorter mySorter = new Sorter();
        mySorter.quickSort(arrayToSort, 0, arrayToSort.length - 1);
        System.out.println(Arrays.toString(arrayToSort));
    }
}
