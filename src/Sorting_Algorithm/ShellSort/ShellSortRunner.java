package Sorting_Algorithm.ShellSort;

import java.util.Arrays;

public class ShellSortRunner {
    public static void main(String[] args) {

        int[] arr1 = {3,5,4};

        System.out.println("SSort olmadan onceki liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*******************************");

        System.out.println("SSort  sonrasi liste : ");
        ShellSort.shellSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("*******************************");

    }
}
