package p01_ListIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {

    public static final String STOP = "END";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        ListIterator<String> listIterator = null;

        String line;
        while(!STOP.equals(line = reader.readLine())){
            String command = line.split(" ")[0];

            switch (command){
                case "Create":
                    String[] elements = Arrays.stream(line.split(" ")).skip(1).toArray(String[]::new);
                    listIterator = new ListIterator<String>(elements);
                    break;
                case "Move":
                    System.out.println(listIterator.move());
                    break;
                case "Print":
                    try{
                        listIterator.print();
                    } catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(listIterator.hasNext());
                    break;
            }
        }
    }
}
