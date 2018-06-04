import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class p01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Set<String> names = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            names.add(input);
        }

        for (String name : names) {
            System.out.println(name);
        }

    }
}