package com.basic.search;

public class Main {

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        BinarySearch bs = new BinarySearch();
        InterpolationSearch is = new InterpolationSearch();

        int[] array = new int[1000000];
        for (int x = 0; x < array.length; x++) {
            array[x] = x + 1;
        }

        if (ls.search(array, 999999) != -1) {
            System.out.println("Linear Search found value after : " + ls.getTries());
        }

        if (bs.runBinarySearchIteratively(array, 999999, 0, array.length - 1) != -1) {
            System.out.println("Linear Search found value after : " + bs.getTries());
        }

        if (is.runInterpolationSearch(array, 999999, 0, array.length - 1) != -1) {
            System.out.println("Linear Search found value after : " + is.getTries());
        }
    }
}
