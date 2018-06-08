import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.in;

public class p05_FilterStudentsByEmailDomain {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Map<String, String> map = new LinkedHashMap<>();

        while (true){
            String line = reader.readLine();

            if ("END".equals(line)){
                break;
            }
            if (line.isEmpty()){
                continue;
            }else {
                String[] splitLine = line.split("\\s+");
                String names = splitLine[0] + " " + splitLine[1];
                String email = splitLine[2];

                if(!map.containsKey(names)){
                    map.put(names, email);
                }
                map.put(names, email);
            }
        }

        map.entrySet().stream()
                .filter(s -> s.getValue().endsWith("@gmail.com"))
                .forEach(s -> System.out.println(s.getKey()));

    }

}
