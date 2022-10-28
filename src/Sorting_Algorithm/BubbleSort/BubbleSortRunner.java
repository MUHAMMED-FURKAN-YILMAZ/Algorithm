package Sorting_Algorithm.BubbleSort;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {

        int[] arr = {5,52,8,6,3,7,1,0,4,9};
        System.out.println("BSOrt oncesi liste : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("*********************");

        System.out.println("BSort sonrasi liste : ");
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("***********************");
    }
}
