import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class p04_MaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] line = reader.readLine().split(" ");

        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int[][] matrix = new int[n][m];

        for (int i = 0; i <n ; i++) {
            String[] input = reader.readLine().split(" ");
            for (int j = 0; j <m ; j++) {

                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        int sum=0;
        int maxSum = 0;
        int index1 = 0;
        int index2=0;

        for (int i = 0; i <n-2 ; i++) {
            for (int j = 0; j <m-2 ; j++) {

                maxSum = matrix[i][j] + matrix[i+1][j] + matrix[i+2][j] +
                        matrix[i][j+1] + matrix[i+1][j+1] + matrix[i+2][j+1] +
                        matrix[i][j+2] + matrix[i+1][j+2] + matrix[i+2][j+2];
                if (maxSum>sum){
                    sum = maxSum;
                    index1 = i;
                    index2=j;
                }
            }

            maxSum =0;

        }
       // System.out.println(index1);
        //System.out.println(index2);
        //System.out.println(matrix[index1][index2]);
        System.out.println( "Sum = " + sum);
        //System.out.println(index1 + " " + index2);
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }


        for (int i = index1; i <index1 +3 ; i++) {
            for (int j = index2; j <index2 +3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
