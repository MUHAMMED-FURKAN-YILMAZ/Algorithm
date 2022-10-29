package Sorting_Algorithm.InsertionSort;

import java.util.Arrays;

public class InsertionSOrtRunner {
    public static void main(String[] args) {

        int[] arr1={12, 9, 4, 99, 120, 1, 3, 10};

        System.out.println("ISort oncesi liste");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*************************");

        System.out.println("ISort sonrasi liste");
        InsertionSort.insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("***************************");

    }
}
