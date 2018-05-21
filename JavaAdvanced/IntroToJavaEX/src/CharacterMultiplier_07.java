import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterMultiplier_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("\\s+");

        String firstString = input[0].trim();
        String secondString = input[1].trim();

        int size1 = firstString.length();
        int size2 = secondString.length();
        int total = 0;


            for (int i = 0; i < Math.max(size1, size2); i++) {
                if (i < size1 && i < size2){
                    int sum = firstString.charAt(i) * secondString.charAt(i);
                    total = total + sum;
                }
                else if (i < size1){
                    int sum = firstString.charAt(i);
                    total = total + sum;
                }
                else if (i<size2){
                    int sum = secondString.charAt(i);
                    total = total + sum;
                }

            }
        System.out.println(total);
        }
    }