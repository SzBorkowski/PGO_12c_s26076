package PGO_12c.cw1;

import java.util.Scanner;

public class zd7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę nieparzystą nie mniejszą niż 5: ");
        int n = scan.nextInt();
        boolean warunek = false;
        while(!warunek) {
            if (n >= 5 && n % 2 != 0) {
                warunek = true;
            } else {
                System.out.print("Spróbuj ponownie: ");
                n = scan.nextInt();
            }
        }
        String[][] arr = new String [n][n];
        druk(n, arr);
    }
    public static void druk(int n, String[][] arr) {
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= n-1; j++) {
                if (i == 0) {
                    arr[i][j] = "*";
                } else if (j == 0) {
                    arr[i][j] = "*";
                } else if (i == j) {
                    arr[i][j] = "*";
                } else if (j == n-1) {
                    arr[i][j] = "*";
                } else if (i == n-1) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = " ";
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
