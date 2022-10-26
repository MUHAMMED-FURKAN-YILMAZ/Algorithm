package Sorting_Algorithm.SelectionSort;

public class SelectionSort {

    public static  void selectionSort(int arr[]){

        int min;
        int temp;
        int i=0;
        int j;

        for (; i < arr.length; i++) {
           min=i;
            for (j = i+1; j < arr.length ; j++) {
              if (arr[j]<arr[min]){
                  min=j;
              }
            }
            // swap islemi
            temp = arr[i];
            arr[i] = arr[min];
            arr[min]= temp;
        }


    }

}
