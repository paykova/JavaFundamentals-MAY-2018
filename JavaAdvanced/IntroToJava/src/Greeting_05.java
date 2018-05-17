import java.util.Scanner;

import static java.lang.System.in;

public class Greeting_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        if (firstName.isEmpty()){
            firstName = "*****";
        }
        if (secondName.isEmpty()){
            secondName = "*****";
        }

        System.out.printf("Hello, %s %s!", firstName, secondName);
    }
}

