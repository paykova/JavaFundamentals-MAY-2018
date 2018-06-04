import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.in;

public class p03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> el = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j <line.length ; j++) {
                el.add(line[j]);
            }
        }

        for (String s : el) {
            System.out.print(s + " ");
        }
    }
}
