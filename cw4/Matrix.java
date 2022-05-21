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
        if (row.length != tempMatrix.length) {
            throw new RuntimeException("Incorrect row size");
        } else {
            for (int i = 0; i < tempMatrix[0].length; i++) {
                if (tempMatrix[i][0] == 0) {
                    for (int j = 0; j < row.length; j++) {
                            tempMatrix[i][j] = row[j];
                    } break;
                }
            }
        }
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
        if (m.getMainMatrix().length != this.mainMatrix.length ||
                m.getMainMatrix()[0].length != this.mainMatrix[0].length) {
            throw new RuntimeException("Cannot add these matrixes.");
        } else {
            for (int i = 0; i < this.mainMatrix.length; i++) {
                for (int j = 0; j < this.mainMatrix.length; j++) {
                    this.mainMatrix[i][j] = this.mainMatrix[i][j] + m.getMainMatrix()[i][j];
                }
            }
        }
        return this;
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        int newlyAdded[][] = new int[m1.getMainMatrix().length][m1.getMainMatrix()[0].length];
        Matrix finallyAdded = new Matrix(newlyAdded);
        if (m1.getMainMatrix().length != m2.getMainMatrix().length ||
                m1.getMainMatrix()[0].length != m2.getMainMatrix()[0].length) {
            throw new RuntimeException("Cannot add these matrixes.");
            } else {
            for (int i = 0; i < m1.mainMatrix.length; i++) {
                for (int j = 0; j < m1.mainMatrix.length; j++) {
                    newlyAdded[i][j] = m1.mainMatrix[i][j] + m2.getMainMatrix()[i][j];
                }
            }
        }
        return finallyAdded;
    }

    public Matrix subtract(Matrix m) {
        if (m.getMainMatrix().length != this.mainMatrix.length ||
                m.getMainMatrix()[0].length != this.mainMatrix[0].length) {
            throw new RuntimeException("Cannot add these matrixes.");
        } else {
            for (int i = 0; i < this.mainMatrix.length; i++) {
                for (int j = 0; j < this.mainMatrix.length; j++) {
                    this.mainMatrix[i][j] = this.mainMatrix[i][j] - m.getMainMatrix()[i][j];
                }
            }
        }
        return this;
    }

    public Matrix subtract(Matrix m1, Matrix m2) {
        int newlySubtracted[][] = new int[m1.getMainMatrix().length][m1.getMainMatrix()[0].length];
        Matrix finallySubtracted = new Matrix(newlySubtracted);
        if (m1.getMainMatrix().length != m2.getMainMatrix().length ||
                m1.getMainMatrix()[0].length != m2.getMainMatrix()[0].length) {
            throw new RuntimeException("Cannot add these matrixes.");
        } else {
            for (int i = 0; i < m1.mainMatrix.length; i++) {
                for (int j = 0; j < m1.mainMatrix.length; j++) {
                    newlySubtracted[i][j] = m1.mainMatrix[i][j] + m2.getMainMatrix()[i][j];
                }
            }
        }
        return finallySubtracted;
    }
}
