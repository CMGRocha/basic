package com.basic.sorting;

public class QuickSort {

    /* Time -> Worst Case= O(n^2)
            -> Average Case = O(n log n)    */
    public void quickSorting(int[] arr, int low, int high) {
        if (low > high)
            return;
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];
        int x = low;
        int y = high;
        while (x <= y) {
            while (arr[x] < pivot) {
                x++;
            }
            while (arr[y] > pivot) {
                y--;
            }
            if (x <= y) {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                x++;
                y--;
            }
        }
        if (low < y) {
            quickSorting(arr, low, y);
        }
        if (high > x) {
            quickSorting(arr, x, high);
        }
    }
}
