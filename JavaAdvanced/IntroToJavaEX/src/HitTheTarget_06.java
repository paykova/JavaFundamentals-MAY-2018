import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitTheTarget_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("\\s+");

        int number = Integer.parseInt(input[0]);

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == number){
                    System.out.printf("%d + %d = %d%n", i, j, number);
                }
                else if (i - j == number){
                    System.out.printf("%d - %d = %d%n", i, j, number);
                }
            }
        }
    }
}
