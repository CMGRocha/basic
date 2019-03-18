package com.basic.sorting;

/* Time = O(n*log(n))*/
/* space = O(n)*/
public class MergeSort {
    int[] array;
    int[] tempArray;

    public void prepareForSort(int[] arr) {
        this.array = arr;
        this.tempArray = new int[arr.length];
        doMergeSort(0, arr.length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            merge(lowerIndex, middle, higherIndex);
        }
    }

    private void merge(int lowerIndex, int middle, int higherIndex) {
        for (int x = lowerIndex; x <= higherIndex; x++) {
            tempArray[x] = array[x];
        }
        int x = lowerIndex;
        int y = middle + 1;
        int k = lowerIndex;
        while (x <= middle && y <= higherIndex) {
            if (tempArray[x] <= tempArray[y]) {
                array[k] = tempArray[x];
                x++;
            } else {
                array[k] = tempArray[y];
                y++;
            }
            k++;
        }
        while (x <= middle) {
            array[k] = tempArray[x];
            k++;
            x++;
        }
    }
}
