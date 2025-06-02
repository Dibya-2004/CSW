package Assignment_3;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] m2 = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        System.out.println("Matrix A:");
        printMatrix(m1);
        System.out.println("Matrix B:");
        printMatrix(m2);
        try {
            int[][] sum = add(m1, m2);
            System.out.println("\nMatrix Addition:");
            printMatrix(sum);
            int[][] product = mul(m1, m2);
            System.out.println("\nMatrix Multiplication:");
            printMatrix(product);
            int[][] transpose = transposeMatrix(m1);
            System.out.println("\nTranspose of Matrix A:");
            printMatrix(transpose);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    public static int[][] add(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            throw new ArrayIndexOutOfBoundsException("Dimention dont  match.....");
        }
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }
    public static int[][] mul(int[][] m1, int[][] m2) {
        if (m1[0].length != m2.length) {
            throw new ArrayIndexOutOfBoundsException("Matrix A's column count must equal Matrix B's row count for multiplication.");
        }
        int rowsA = m1.length;
        int colsA = m1[0].length;
        int rowsB = m2.length;
        int colsB = m2[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
