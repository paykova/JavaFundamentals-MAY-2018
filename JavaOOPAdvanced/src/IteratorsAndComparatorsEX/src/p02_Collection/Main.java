package p02_Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {

    public static final String STOP = "END";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line = reader.readLine();


        ListIterator<String> listIterator = null;

        while(!STOP.equals(line)){
            String[] splitLine = line.split(" ");
            String command = splitLine[0];

            switch(command){
                case "Create":
                    String[] elements = Arrays.stream(splitLine).skip(1).toArray(String[]::new);
                    listIterator = new ListIterator<>(elements);
                    break;
                case "Move":
                    System.out.println(listIterator.move());
                    break;
                case "Print":
                    try{
                        listIterator.print();
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }

                    break;
                case "HasNext":
                    System.out.println(listIterator.hasNext());
                    break;
                case "PrintAll":
                    try {
                        listIterator.printAll();
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
            }
            line = reader.readLine();
        }
    }
}
