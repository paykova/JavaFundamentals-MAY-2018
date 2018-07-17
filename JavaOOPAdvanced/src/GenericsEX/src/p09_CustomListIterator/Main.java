package p09_CustomListIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {

    private static final String STOP_PROGRAM = "END";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line;
        CustomList<String> list = new CustomListImpl<>();

        while (!STOP_PROGRAM.equals(line = reader.readLine())) {
            String[] splitLine = line.split("\\s+");
            switchDispatcher(splitLine, list);
        }
    }

    private static void switchDispatcher(String[] splitLine, CustomList<String> list) {
        String command = splitLine[0];

        switch (command) {
            case "Add":
                list.add(splitLine[1]);
                break;
            case "Remove":
                list.remove(Integer.parseInt(splitLine[1]));
                break;
            case "Contains":
                System.out.println(list.contains(splitLine[1]));
                break;
            case "Swap":
                list.swap(Integer.parseInt(splitLine[1]), Integer.parseInt(splitLine[2]));
                break;
            case "Greater":
                System.out.println(list.countGreaterThan(splitLine[1]));
                break;
            case "Max":
                System.out.println(list.getMax());
                break;
            case "Min":
                System.out.println(list.getMin());
                break;
            case "Print":
                list.getCollection().forEachRemaining(System.out::println);
                break;
            case "Sort":
                Sorter.sort(list);
                //list.sortAscending();
                break;
        }
    }
}