import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;

public class p07_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();
        Map<String, String> contactForm = new LinkedHashMap<>();


        while (!"stop".equals(text)) {
            String email = scanner.nextLine();

            contactForm.put(text, email);
            text = scanner.nextLine();
        }

        if (!contactForm.isEmpty()){
            for (Map.Entry<String, String> stringStringEntry : contactForm.entrySet()) {
                if (stringStringEntry.getValue().endsWith("us")
                        || stringStringEntry.getValue().endsWith("uk")
                        || stringStringEntry.getValue().endsWith("com")) {
                    continue;
                } else {
                    System.out.printf("%s -> %s%n", stringStringEntry.getKey(), stringStringEntry.getValue());
                }
            }
        }


    }
}
