import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class p02_MatrixOfPalindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] inputLine = reader.readLine().split(" ");

        int n = Integer.parseInt(inputLine[0]);
        int m = Integer.parseInt(inputLine[1]);

//        for (char i = (char) (97 + n); i < (char) (97 + m); i++) {
//            for (char j = (char) (97 + n); j < (char) (97 + m); j++) {
//                for (char k = (char) (97 + n); k < (char) (97 + m); k++) {
//                    if (i == k) {
//                        System.out.println(i + "" + j + "" + k);
//                    }
//                }
//
//            }
//        }

        String[][] matrix = new String[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[j][i] = String.valueOf((char) (i +97)) + String.valueOf((char) (i +97 + j)) + String.valueOf((char) (i +97))  ;

            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }


    }
}
