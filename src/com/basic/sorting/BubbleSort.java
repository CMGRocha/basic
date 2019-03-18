package com.basic.sorting;

/* Time = O(n^2)*/
/* space = O(1)*/
public class BubbleSort {

    public void bubbleSorting(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 1; y < (arr.length - x); y++) {
                if (arr[y - 1] > arr[y]) {
                    int temp = arr[y - 1];
                    arr[y - 1] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }
}
