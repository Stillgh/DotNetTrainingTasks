package com.epam.nettrainingtasks.firsttask;


public class Sorter {
    public void quickSort(int[] arrayToSort, int low, int high) {

        if (arrayToSort.length <= 1) {
            return;
        }
        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int pivot = arrayToSort[middle];
        int i = low;
        int j = high;

        while (i <= j) {

            while (arrayToSort[i] < pivot) {
                i++;
            }
            while (arrayToSort[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arrayToSort[j];
                arrayToSort[j] = arrayToSort[i];
                arrayToSort[i] = temp;
                i++;
                j--;
            }

            if (low < j) {
                quickSort(arrayToSort, low, j);
            }
            if (high > i) {
                quickSort(arrayToSort, i, high);
            }
        }
    }
}
