package p01_Person;

import p01_Person.Child;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        try {
            Child child = new Child(name, age);
            //String personClassName = Person.class.getSimpleName();
            //String childClassName = Child.class.getSimpleName();
            System.out.println(child.toString());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
