import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p05_MatrixShuffling {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] line = reader.readLine().split(" ");

         int row = Integer.parseInt(line[0]);
         int col = Integer.parseInt(line[1]);
         String[][] matrix = new String[row][col];

        for (int i = 0; i <row ; i++) {
            String[] input = reader.readLine().split(" ");

            for (int j = 0; j < col; j++) {
                matrix[i][j] = input[j];
            }
        }

        while (true){
            String commandLine = reader.readLine();
            if("END".equals(commandLine)){
                break;
            }
            String[] commandArgs = commandLine.split(" ");
            if (commandArgs.length != 5 || !"swap".equals(commandArgs[0]) ){
                System.out.println("Invalid input!");
                continue;
            }
            int row1 = Integer.parseInt(commandArgs[1]);
            int col1 = Integer.parseInt(commandArgs[2]);
            int row2 = Integer.parseInt(commandArgs[3]);
            int col2 = Integer.parseInt(commandArgs[4]);

           // int mat1 = matrix.length;
           // int mat2 = matrix.length;

          //  System.out.println(mat1 + " -------------- " + mat2);

            if (row1 > matrix.length || col1 > matrix.length || row2 > matrix.length || col2 > matrix.length){
                System.out.println("Invalid input!");
                continue;
            }

            String temp = matrix[row1][col1];
            matrix[row1][col1] = matrix[row2][col2];
            matrix[row2][col2] = temp;
            for (int i = 0; i <row ; i++) {
                for (int j = 0; j <col ; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
