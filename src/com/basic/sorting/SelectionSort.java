package com.basic.sorting;

/* Time = O(n^2)*/
/* space = O(1)*/
public class SelectionSort {

    public void selectionSorting(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            int index = x;
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[y] < arr[index]) {
                    index = y;
                }
            }
            if (index != x) {
                int temp = arr[index];
                arr[index] = arr[x];
                arr[x] = temp;
            }
        }
    }
}
