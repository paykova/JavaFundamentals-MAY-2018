import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03_SumMatrixElements {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(", ");

        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = new int [row][col];
        int sum = 0;


        for (int i = 0; i < row ; i++) {
            String[] numbers = bf.readLine().split(", ");
            for (int j = 0; j <col ; j++) {
                matrix[i][j] = Integer.parseInt(numbers[j]);

                sum += Integer.parseInt(numbers[j]);
            }
        }
        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);
    }
}
