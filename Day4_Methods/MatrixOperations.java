import java.util.*;
public class MatrixOperations {
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m[i][j] = rand.nextInt(10);
        return m;
    }

    public static int[][] transpose(int[][] m) {
        int rows = m.length, cols = m[0].length;
        int[][] t = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                t[j][i] = m[i][j];
        return t;
    }

    public static double determinant(int[][] m) {
        if (m.length == 2)
            return m[0][0] * m[1][1] - m[0][1] * m[1][0];
        return 0;
    }

    public static void main(String[] args) {
        int[][] matrix = createMatrix(2, 2);
        int[][] trans = transpose(matrix);
        double det = determinant(matrix);
        for (int[] row : matrix) System.out.println(Arrays.toString(row));
        System.out.println("Transpose:");
        for (int[] row : trans) System.out.println(Arrays.toString(row));
        System.out.println("Determinant: " + det);
    }
}
