import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class p05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        Map<String, String> phonebook = new LinkedHashMap<>();

        while(!"search".equals(text)){

            String[] input = text.split("-");
            String name = input[0];
            String tel = input[1];

            if (!phonebook.containsKey(name)){
                phonebook.put(name, tel);
            }else {
                phonebook.put(name, tel);
            }
            text = scanner.nextLine();
        }

        String input = scanner.nextLine();
        while (!"stop".equals(input)){
            if (!phonebook.containsKey(input)){
                System.out.printf("Contact %s does not exist.", input);
                System.out.println();
            } else {
                System.out.printf("%s -> %s%n", input, phonebook.get(input));
            }
            input = scanner.nextLine();
        }
    }
}
