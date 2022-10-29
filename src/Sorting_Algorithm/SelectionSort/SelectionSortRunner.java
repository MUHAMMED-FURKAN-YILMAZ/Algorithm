package Sorting_Algorithm.SelectionSort;

import java.util.Arrays;

public class SelectionSortRunner {
    public static void main(String[] args) {

        int [] arr1 = {5,3,4,2};
        System.out.println("SSort oncesi liste :");
        System.out.println(Arrays.toString(arr1));
        System.out.println("***************************");

        System.out.println("SSort sonrasi liste");
        SelectionSort.selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("***************************");

    }
}
