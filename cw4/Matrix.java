package PGO_12c.cw4;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {

    private static int[][] tempMatrix;
    private int[][] mainMatrix;

    public Matrix(int[][] mainMatrix) {
        this.mainMatrix = mainMatrix;
    }

    public int[][] getTempMatrix() {
        return tempMatrix;
    }

    public void setTempMatrix(int[][] tempMatrix) {
        this.tempMatrix = tempMatrix;
    }

    public int[][] getMainMatrix() {
        return mainMatrix;
    }

    public void setMainMatrix(int[][] mainMatrix) {
        this.mainMatrix = mainMatrix;
    }

    public static void setUpMatrix(int rowCount, int columnCount) {
        if (rowCount <= 0 || columnCount <= 0) {
            throw new RuntimeException("Incorrect matrix size");
        } else {
            tempMatrix = new int[rowCount][columnCount];
        }
    }

    public static void insertRow(int[] row) {

    }

    public static Matrix create() {
        Matrix mainMatrix = new Matrix(tempMatrix);
        tempMatrix = null;
        return mainMatrix;
    }

    public void print() {
        for (int i = 0; i < mainMatrix.length; i++) {
            for (int j = 0; j < mainMatrix.length; j++) {
                System.out.print(mainMatrix[i][j]);
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
