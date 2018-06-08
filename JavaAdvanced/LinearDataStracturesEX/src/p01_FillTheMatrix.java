import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class p01_FillTheMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] inputLine = reader.readLine().split(", ");

        int n = Integer.parseInt(inputLine[0]);
        String letter = inputLine[1];

        int[][] matrix = new int[n][n];
        int count = 1;
        if ("A".equals(letter)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    matrix[j][i] = count++;
                }
            }
        }
        if ("B".equals(letter)){
            for (int i = 0; i <n ; i++) {
int index = 0;
                for (int j = 0; j <n ; j++) {
                    if (i%2 !=0){
                        matrix[n-1-index][i] = count++;
                        index++;
                    } else {
                        matrix[j][i] = count++;
                    }
                }
            }
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
