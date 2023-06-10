import java.util.Scanner;

public class Problem_6_Matrix_Methods {
static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matrix = createMatrix(2, 2);
        System.out.println();

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        System.out.println("Test result for valid indexes: " + areIndexesValid(matrix, 2, 3));

        System.out.println("The max element of the matrix is: " + getMaxElement(matrix));

        getSubMatrixWithMaxSum(matrix);

    }

    public static int[][] createMatrix(int rowsCount, int columnsCount) {
        int[][] matrix = new int[rowsCount][columnsCount];

        for(int i = 0; i < rowsCount; i++) {
            for(int j = 0; j < columnsCount; j++){
                System.out.println("Please, provide a number for row " + i + " and column " + j);
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix);
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static boolean areIndexesValid(int[][] matrix, int rowIndex, int columnIndex) {
        return rowIndex < matrix.length + 1 && columnIndex < matrix[0].length + 1;
    }

    public static int getMaxElement(int[][] matrix) {
        int max = Integer.MIN_VALUE;

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    public static void getSubMatrixWithMaxSum(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int rowIndex = 0;
        int columnIndex = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int column = 0; column < matrix[0].length - 1; column++) {
                int currentSum =
                        matrix[row][column] +
                                matrix[row + 1][column] +
                                matrix[row][column + 1] +
                                matrix[row + 1][column + 1];

                if (currentSum > max) {
                    max = currentSum;
                    rowIndex = row; // start printing from this row index
                    columnIndex = column; // start printing from this column index
                }
            }
        }

        System.out.println(matrix[rowIndex][columnIndex] + " " + matrix[rowIndex][columnIndex + 1]);
        System.out.println(matrix[rowIndex + 1][columnIndex] + " " + matrix[rowIndex + 1][columnIndex + 1]);
    }

}
