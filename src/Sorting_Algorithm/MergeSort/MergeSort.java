package Sorting_Algorithm.MergeSort;

public class MergeSort {

    public static void merge(int[] arr, int left, int middle, int right){

        // sol taraftaki alt-array'in uzunlugu
        int low = middle - left+1;

        //sagdaki alt-array'in uzunlugu
        int high= right-middle;

        // sol-sag alt arrayler olusturuluyor
        int[] l = new int[low];// sol alt-array
        int[] r = new int[high];// sag alt-array

        int i=0, j=0;
        // elemanlari soldaki alt-array'e kopyaliyoruz
        for (i=0;i<low; i++){
            l[i]= arr[left+1];
        }
        // elemanlari sagdaki alt-array'e kopyaliyoruz
        for (j=0; j<high; j++){
            r[j]= arr[middle+1+j];
        }

        int k=left; // sortlamaya caslanacak index;
        i=0;// merge oncesi, variable sifirlama !!
        j=0;

        while (i<low && j<high){ // sol-sag alt array'le mergeleniyor
            if (l[i]<= r[j]){
                arr[k]=l[i];
                i++;
            }
            else {
                arr[k]=r[j];
                j++;
            }
            k++;
        }

        while (i<low){ // sol alt-array'de kalan elemanlar mergeleniyor
            arr[k]=l[i];
            i++;
            k++;
        }

        while (j<high){ // sag alt-array'de kalan elemanlar mergeleniyor
            arr[k]=r[j];
            j++;
            k++;
        }


    }

    public static void mergeSort(int[] arr, int left, int right){
        int middle;

        if (left < right){
            middle = (left + right)/2;
            mergeSort(arr, left, middle);// sol alt-array
            mergeSort(arr, middle+1, right);// sag alt-array

            merge(arr,left,middle,right);// sol ve sag alt array'ler mergeleniyor
        }
    }

}
