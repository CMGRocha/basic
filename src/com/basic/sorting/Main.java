package com.basic.sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();

        /* HEAP SORT */
        int[] arrayHeap = {123, 23, 56, 2, 89, 1, 894, 26, 75, 626, 262, 55, 66, 75, 11, 25};
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arrayHeap));
        System.out.println("Heap Sort  (Time nlogn) (Space 1)");
        heapSort.sort(arrayHeap);
        System.out.println(Arrays.toString(arrayHeap));

        /* MERGE SORT */
        int[] arrayMerge = {123, 23, 56, 2, 89, 1, 894, 26, 75, 626, 262, 55, 66, 75, 11, 25};
        //System.out.println("Original Array");
        //System.out.println(Arrays.toString(arrayMerge));
        mergeSort.prepareForSort(arrayMerge);
        System.out.println("MERGE Sort (Time nlogn) (Space n)");
        System.out.println(Arrays.toString(arrayMerge));

        /* QUICK SORT */
        int[] arrayQuickSort = {123, 23, 56, 2, 89, 1, 894, 26, 75, 626, 262, 55, 66, 75, 11, 25};
        quickSort.quickSorting(arrayQuickSort, 0, arrayQuickSort.length - 1);
        System.out.println("Quick Sort (Worst Time n^2) (Average Time nlogn) (Space n)");
        System.out.println(Arrays.toString(arrayQuickSort));

        /* SELECTION SORT */
        int[] arraySelectionSort = {123, 23, 56, 2, 89, 1, 894, 26, 75, 626, 262, 55, 66, 75, 11, 25};
        selectionSort.selectionSorting(arraySelectionSort);
        System.out.println("Selection Sort (Time n^2) (Space 1)");
        System.out.println(Arrays.toString(arraySelectionSort));

        /* BUBBLE SORT */
        int[] arrayBubbleSort = {123, 23, 56, 2, 89, 1, 894, 26, 75, 626, 262, 55, 66, 75, 11, 25};
        bubbleSort.bubbleSorting(arrayBubbleSort);
        System.out.println("Bubble Sort (Time n^2) (Space 1)");
        System.out.println(Arrays.toString(arrayBubbleSort));

    }
}
