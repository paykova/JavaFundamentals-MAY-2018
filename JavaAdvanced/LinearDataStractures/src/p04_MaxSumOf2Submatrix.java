import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p04_MaxSumOf2Submatrix {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];

        int maxSum = Integer.MIN_VALUE;
        int resultRow = 0;
        int resultCol = 0;

        for (int i = 0; i < rows ; i++) {
            String[] numbers = bf.readLine().split(", ");
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j] = Integer.parseInt(numbers[j]);

            }
        }

        for (int i = 0; i < matrix.length - 1 ; i++) {
            for (int j = 0; j < matrix[i].length - 1 ; j++) {
                int sum = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];

                if (sum > maxSum){
                    maxSum = sum;
                    resultRow = i;
                    resultCol = j;
                }
            }
        }

        System.out.println(matrix[resultRow][resultCol] + " " + matrix[resultRow][resultCol+1]);
        System.out.println(matrix[resultRow + 1][resultCol] + " " + matrix[resultRow + 1][resultCol +1]);
        System.out.println(maxSum);
    }
}
