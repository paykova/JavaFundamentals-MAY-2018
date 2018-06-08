import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p01_StudentsByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();
        List<String> info = new ArrayList<>();

        while (!"END".equals(input)){
            info.add(input);
            input = reader.readLine();
        }

        Collections.sort(info);

        for (int i = 0; i < info.size(); i++) {
            String[] temp = info.get(i).split(" ");
            String num = temp[2];

            Arrays.stream(input
                    .split(" "))
                    .filter(x -> {
                        return num.equals("2");
                    })
                    .collect(Collectors.toList())
                    .forEach(x -> System.out.println(temp[0] + " " + temp[1]));
        }
    }
}