package PGO_12c.cw1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class zd6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int min = 100;
        int max = 1000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
        System.out.println("Pierwotna tablica: "+Arrays.toString(arr));
        sort(arr);
        System.out.print("Posortowana tablica: "+Arrays.toString(arr));
    }
    public static int[] sort(int[] arr)
    {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
