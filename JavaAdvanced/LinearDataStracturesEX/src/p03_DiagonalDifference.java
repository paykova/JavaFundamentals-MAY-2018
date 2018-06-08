import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class p03_DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[n][n];
        int[][] sideMatrix = new int[n][n];
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
                if (i == j) {
                    primaryDiagonal += Integer.parseInt(line[j]);
                }
            }
            for (int j = n - 1; j >= 0; j--) {
                sideMatrix[i][j] = Integer.parseInt(line[n - 1 - j]);
                if (i == j) {
                    secondaryDiagonal += Integer.parseInt(line[n - 1 - j]);
                }
            }
        }

//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int[] ints : sideMatrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();

        int total = Math.abs(primaryDiagonal - secondaryDiagonal);
        System.out.println(total);
        }
    }


