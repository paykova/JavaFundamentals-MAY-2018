import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class p02_StudentsByFirstLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String text = reader.readLine();
        List<String> list = new ArrayList<>();

        while (!"END".equals(text)) {

            list.add(text);
            text = reader.readLine();
        }

        //Collections.sort(list);
        List<String> someList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            String temporary = list.get(i);

            someList = Arrays.stream(temporary.split(" "))
                    .filter(x -> {
                        String[] splitTemporary = temporary.split(" ");
                        char first = splitTemporary[0].charAt(0);
                        char second = splitTemporary[1].charAt(0);
                        return first < second;
                    }).collect(Collectors.toList());
        }

        someList.forEach(z -> System.out.print(z + " "));

    }
}

