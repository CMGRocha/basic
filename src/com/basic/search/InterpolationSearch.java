package com.basic.search;

public class InterpolationSearch {
    private int tries = 0;

    @SuppressWarnings("Duplicates")
    public int runInterpolationSearch(int[] sortedArray, int key, int low, int high) {
        tries = 0;
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            tries++;
            int mid = low + ((high - low) / (sortedArray[high] - sortedArray[low]) * (key - sortedArray[low]));
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public int getTries() {
        return tries;
    }
}
