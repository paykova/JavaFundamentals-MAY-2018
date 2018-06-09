import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p06_StringMatrixRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // THIS PROBLEM IS NOT SOLVED!!

        List<String> list = new ArrayList<>();
        int len = 0;
        int maxLen = 0;

        while (true) {
            String input = reader.readLine();
            if ("END".equals(input)) {
                break;
            }
           maxLen = input.length();
            if (maxLen > len) {
                len = maxLen;
            }
            list.add(input);
        }
       String[][] matrix = new String[list.size()][len];

        for (String s : list) {
            String word = s;
            for (char i = 0; i <word.length() ; i++) {

                System.out.print(word.charAt(i) + " ");
            }
            System.out.println();
        }
    }

}
