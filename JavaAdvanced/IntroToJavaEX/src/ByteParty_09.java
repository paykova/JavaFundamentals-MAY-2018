import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class ByteParty_09 {
    public static void main(String[] args) throws IOException {

       Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            list.add(number);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
