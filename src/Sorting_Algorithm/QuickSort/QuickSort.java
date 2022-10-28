package Sorting_Algorithm.QuickSort;

public class QuickSort {

    public static int partition(int[] dizi, int alt, int ust){

        // dizinin son elemani pivot secelim
        int pivot= dizi[ust];
        int i=(alt-1);

        // ilk iterasyondaki swap islemine uygun hale getiriliyor
        for (int j = alt; j < ust; j++) {

            if (dizi[j] <= pivot ){
                i++;
                int temp=dizi[i];
                dizi[i]=dizi[j];
                dizi[j]=temp;
            }

        }
        // swap islemi
        int temp = dizi[i+1];
        dizi[i+1]=dizi[ust];
        dizi[ust]= temp;

        return i+1;

    }

    public static void quickSort(int[] dizi, int alt, int ust){

        if (alt<ust){
            int pi=partition(dizi, alt, ust);
            // pivot degeri secilip, recursive olarak kendini cagiriyor
            quickSort(dizi, alt, pi-1);
            quickSort(dizi,pi+1,ust);

        }

    }

}
