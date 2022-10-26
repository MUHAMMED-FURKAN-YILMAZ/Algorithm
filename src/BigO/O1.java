package BigO;

public class O1 { // O(n) --> O(1)  ( Constant Complexity )

    public static void main(String[] args) {

        // Task: verilen Array'in son elemanini ekrana yazdirin
        int[] arr = {1,10,23,43,77,1234}; // 6 eleman
        System.out.println(arr[arr.length - 1]); // Tek islem


        // baska bir ornek : Verilen sayinin cift olup olmadigini kontrol ediniz
        int x=24;
        if (x%2 == 0) System.out.println("cift");





    }




}
