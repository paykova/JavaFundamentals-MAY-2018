import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class p03_VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Set<Integer> firstPlayer = new LinkedHashSet<>();
        Set<Integer> secondPlayer = new LinkedHashSet<>();

        fillNumbers(scanner, firstPlayer, secondPlayer);

        for (int i = 0; i < 50; i++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                System.out.println(firstPlayer.isEmpty() ? "Second player win!" : "First player win!");
                return;
            }

            int firstNum = firstPlayer.iterator().next();
            firstPlayer.remove(firstNum);
            int secondNum = secondPlayer.iterator().next();
            secondPlayer.remove(secondNum);

            if (firstNum > secondNum) {
                firstPlayer.add(firstNum);
                firstPlayer.add(secondNum);
            } else if (secondNum > firstNum) {
                secondPlayer.add(firstNum);
                secondPlayer.add(secondNum);
            }
        }

        printResult(firstPlayer, secondPlayer);


    }

    private static void printResult(Set<Integer> firstPlayer, Set<Integer> secondPlayer) {

        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else if (firstPlayer.size() < secondPlayer.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }


    }

    private static void fillNumbers(Scanner scanner, Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
        String[] firstPlayerCards = scanner.nextLine().trim().split("\\s+");
        String[] secondPlayerCards = scanner.nextLine().trim().split("\\s+");

        for (String firstPlayerCard : firstPlayerCards) {
            firstPlayer.add(Integer.parseInt(firstPlayerCard));
        }
        for (String secondPlayerCard : secondPlayerCards) {
            secondPlayer.add(Integer.parseInt(secondPlayerCard));
        }
    }
}
