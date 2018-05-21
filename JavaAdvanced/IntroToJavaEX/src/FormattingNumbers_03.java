import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import static java.lang.System.in;

public class FormattingNumbers_03 {
    private static final int MAX_LENGTH = 10;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = br.readLine().split("\\s+");

        int a = Integer.parseInt(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        double c = Double.parseDouble(numbers[2]);

        String hexadecimalA = Integer.toHexString(a).toUpperCase();
        String binaryA = Integer.toBinaryString(a);
        String formatB = String.format("%.2f", b);
        String formatC = String.format("%.3f", c);

        String result = String.format("|%s|%s|%s|%s|",
                getPadRight(hexadecimalA, " "),
                getPadLeft(binaryA, "0"),
                getPadLeft(formatB, " "),
                getPadRight(formatC, " ")
        );

        System.out.println(result);
    }

    private static String getPadRight(String string, String fill) {
        return string + new String(new char[MAX_LENGTH - string.length()]).replace("\0", fill);
    }

    private static String getPadLeft(String string, String fill) {
        return new String(new char[MAX_LENGTH - string.length()]).replace("\0", fill) + string;
    }
    }
