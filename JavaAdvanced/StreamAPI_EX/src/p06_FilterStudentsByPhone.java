import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.in;

public class p06_FilterStudentsByPhone {
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
                String phone = splitLine[2];

                if(!map.containsKey(names)){
                    map.put(names, phone);
                }
                map.put(names, phone);
            }
        }
        map.entrySet().stream()
                .filter(s -> (s.getValue().startsWith("02") || s.getValue().startsWith("+3592")))
                .forEach(s -> System.out.println(s.getKey()));
    }
}
