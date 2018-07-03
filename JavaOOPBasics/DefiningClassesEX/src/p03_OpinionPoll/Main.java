package p03_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());
        Map<Integer, Person> map = new HashMap<>();
        List<Person> list = new ArrayList<>();


        for (int i = 0; i <n ; i++) {
            String[] line = reader.readLine().split(" ");
            String name = line[0];
            int age = Integer.parseInt(line[1]);
            Person person = new Person(name, age);
            list.add(person);
            map.put(i, person);
        }

        Collections.sort(list);

//        for (Person person : map.values()) {
//            if(person.getAge() > 30){
//                System.out.println(person.getName() + " " + person.getAge());
//            }
//        }

        for (Person person : list) {
            if (person.getAge() > 30){
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }

    }
}
