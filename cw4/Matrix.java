package PGO_12c.cw4;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {

    private int[][] tempMatrix;
    private int[][] mainMatrix;

    private Matrix(int[][] tempMatrix, int[][] mainMatrix) {
        this.tempMatrix = tempMatrix;
        this.mainMatrix = mainMatrix;
    }

    public static void SetUpMatrix(int rowCount, int columnCount) {

    }

    public static void insertRow(int[] row) {

    }

    public static Matrix Create() {

    }

    public void print() {
        for (int i = 0; i < tempMatrix.length; i++) {
            for (int j = 0; j < tempMatrix.length; j++) {
                System.out.print(tempMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix m) {

    }

    public Matrix add(Matrix m1, Matrix m2) {

    }

    public Matrix subtract(Matrix m) {

    }

    public Matrix subtract(Matrix m1, Matrix m2) {

    }
}
