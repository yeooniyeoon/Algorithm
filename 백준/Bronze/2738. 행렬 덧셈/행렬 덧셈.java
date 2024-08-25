import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] matrixSize = br.readLine().split(" ");

        int row = Integer.parseInt(matrixSize[0]);
        int col = Integer.parseInt(matrixSize[1]);

        int[][] matrixA = new int[row][col];
        int[][] matrixB = new int[row][col];
        int[][] resultMatrix = new int[row][col];

        matrixA = readMatrix(row, col, matrixA);
        matrixB = readMatrix(row, col, matrixB);

        resultMatrix = addMatrix(row, col, matrixA, matrixB);
        printMatrix(row, col, resultMatrix);
    }

    public static int[][] readMatrix(int row, int col, int[][] matrix) throws IOException {
        for (int i = 0; i < row; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++)
                matrix[i][j] = Integer.parseInt(input[j]);
        }
        return matrix;
    }

    public static int[][] addMatrix(int row, int col, int matrixA[][], int matrixB[][]) {
        int[][] resultMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
        }
        return resultMatrix;
    }

    public static void printMatrix(int row, int col, int[][] matrix) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}