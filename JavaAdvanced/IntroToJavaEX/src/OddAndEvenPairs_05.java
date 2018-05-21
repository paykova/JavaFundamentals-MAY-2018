import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddAndEvenPairs_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("\\s+");

        int size = input.length;

        if (size % 2 != 0){
            System.out.println("invalid length");
        }
        else {
            for (int i = 0; i < size; i+=2) {
                int a = Integer.parseInt(input[i]);
                int b = Integer.parseInt(input[i +1]);

                if (a % 2 == 0 && b % 2 ==0){
                    System.out.printf("%d, %d -> both are even%n", a, b);
                }
                else if (a % 2 != 0 && b % 2 != 0){
                    System.out.printf("%d, %d -> both are odd%n", a, b);
                }
                else {
                    System.out.printf("%d, %d -> different%n", a, b);
                }

            }
        }
    }
}
