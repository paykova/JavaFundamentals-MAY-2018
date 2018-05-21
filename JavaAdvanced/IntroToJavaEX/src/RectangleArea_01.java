import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea_01 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split("\\s+");

        double sideA = Double.parseDouble(line[0]);
        double sideB = Double.parseDouble(line[1]);

        double sum = sideA * sideB;

        System.out.printf("%.2f", sum);
    }
}
