package p03_ValidationData;

import p02_SalaryIncrease.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        p02_SalaryIncrease.Person person;
        List<p02_SalaryIncrease.Person> people = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        double salary = 0d;
        int age = 0;

        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            String firstName = line[0];
            String lastName = line[1];
            age = Integer.parseInt(line[2]);
            salary = Double.parseDouble(line[3]);
            try{
                person = new p02_SalaryIncrease.Person(firstName, lastName, age, salary);
                people.add(person);
            } catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }
        double bonus = Double.parseDouble(reader.readLine());


        for (Person person1 : people) {
            person1.increaseSalary(bonus, age);
            System.out.println(person1.toString());
        }
    }
}

