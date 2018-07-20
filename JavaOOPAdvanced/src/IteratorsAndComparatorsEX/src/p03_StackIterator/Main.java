package p03_StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {

    public static final String STOP = "END";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line = reader.readLine();
        Stack<Integer> stack = null;

        while (!STOP.equals(line)){

            String[] splitLine = line.split(" ");
            String command = splitLine[0];

            switch (command){
                case "Push":
                    for (int i = 1; i <splitLine.length ; i++) {
                        stack.push(Integer.valueOf(splitLine[i].trim()));
                    }
                    break;
                case "Pop":
                    try {
                        stack.pop();
                    } catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
            }


        }
    }
}
