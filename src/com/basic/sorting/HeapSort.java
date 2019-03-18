package com.basic.sorting;

/* Time = O(n*log(n))*/
/* space = O(1)*/
public class HeapSort {
    private int total;

    private void swap(int[] arr, Integer a, Integer b) {
        Integer temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private void heapify(int[] array, int parent) {
        int left = (parent * 2) + 1;
        int right = left + 1;
        int greatest = parent;
        if (left <= total && (array[left] >= array[greatest])) {
            greatest = left;
        }
        if (right <= total && array[right] >= array[greatest]) {
            greatest = right;
        }
        if (greatest != parent) {
            swap(array, parent, greatest);
            heapify(array, greatest);
        }
    }

    public void sort(int[] arr) {
        total = arr.length - 1;
        for (int x = total / 2; x >= 0; x--) {
            heapify(arr, x);
        }
        for (int x = total; x > 0; x--) {
            swap(arr, 0, x);
            total--;
            heapify(arr, 0);
        }
    }
}
