package p07_CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

         final String STOP = "END";
         String inputLine = reader.readLine();
         MyList<String> myList = new MyListImpl<>();

         while(!inputLine.equals(STOP)){
             String[] line = inputLine.split(" ");
             String command = line[0];

             switch (command){
                 case "Add":
                     myList.add(line[1]);
                     break;
                 case "Remove":
                     myList.remove(Integer.parseInt(line[1]));
                     break;
                 case "Max":
                     System.out.println(myList.getMax());
                     break;
                 case "Min":
                     System.out.println(myList.getMin());
                     break;
                 case "Greater":
                     System.out.println(myList.countGreaterThan(line[1]));
                     break;
                 case "Swap":
                     myList.swap(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
                     break;
                 case "Contains":
                     System.out.println(myList.contains(line[1]));
                     break;
                 case "Print":
                     myList.getCollection().forEach(System.out::println);
                     break;
             }

             inputLine = reader.readLine();
         }
    }
}
