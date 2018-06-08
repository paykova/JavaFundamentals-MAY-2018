import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.in;

public class p03_StudentsByAge {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Map<String, Integer> map = new LinkedHashMap<>();

        while(true){
            String input = reader.readLine();
            if ("END".equals(input)){
                break;
            }
            if (input.isEmpty()){
                continue;
            } else {
                String[] splitInput = input.split("\\s+");
                String names = splitInput[0] + " " + splitInput[1];
                int age = Integer.parseInt(splitInput[2]);
                if(!map.containsKey(names)){
                    map.put(names, 0);
                }
                map.put(names, age);
            }
        }

        map.entrySet().stream()
                .filter(s -> (s.getValue() >= 18 && s.getValue() <= 24))
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

    }
}
