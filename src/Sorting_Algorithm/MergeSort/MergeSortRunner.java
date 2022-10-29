package Sorting_Algorithm.MergeSort;

import Sorting_Algorithm.ShellSort.ShellSort;

import java.util.Arrays;

public class MergeSortRunner {
    public static void main(String[] args) {

        int[] arr1 = {3,5,4,8,12,1,7,2};

        System.out.println("MSort olmadan onceki liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*******************************");

        System.out.println("MSort  sonrasi liste : ");
        ShellSort.shellSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("*******************************");

    }
}
