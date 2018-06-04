import java.util.*;

import static java.lang.System.in;

public class p05_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, double[]> students = new TreeMap<>();

        for (int i = 0; i <n ; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble).toArray();

            students.put(name, grades);
        }

        for (Map.Entry<String, double[]> all : students.entrySet()) {
            double avr = 0;
            for (double s : all.getValue()) {
                avr += s;
            }
            avr /= all.getValue().length;
            System.out.printf("%s is graduated with %s%n", all.getKey(), avr);        }
    }
}
