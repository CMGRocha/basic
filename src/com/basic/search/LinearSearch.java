package com.basic.search;

public class LinearSearch {
    private int tries = 0;

    public int search(int[] array, int value) {
        tries = 0;

        for (int x = 0; x < array.length; x++) {
            tries++;
            if (array[x] == value) {
                return x;
            }

        }
        return -1;
    }

    public int getTries() {
        return tries;
    }
}
