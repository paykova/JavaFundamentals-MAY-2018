import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.in;

public class p02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();
        Set<String> guests = new TreeSet<>();

        while (!"PARTY".equals(text)) {
            guests.add(text);
            text = scanner.nextLine();
        }
        while (!"END".equals(text)) {

            text = scanner.nextLine();
            guests.remove(text);
        }
        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
