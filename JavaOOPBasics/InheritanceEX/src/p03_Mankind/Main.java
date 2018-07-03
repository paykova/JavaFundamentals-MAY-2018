package p03_Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        try{
            String[] studentInfo = reader.readLine().split(" ");
            String studentFirstName = studentInfo[0];
            String studentLastName = studentInfo[1];
            String facultyNumber = studentInfo[2];

            Student student = new Student(studentFirstName, studentLastName, facultyNumber);

            String[] workerInfo = reader.readLine().split(" ");
            String workerFirstName = workerInfo[0];
            String workerLastName = workerInfo[1];
            double weekSalary = Double.parseDouble(workerInfo[2]);
            int workingHours = Integer.parseInt(workerInfo[3]);

            Worker worker = new Worker(workerFirstName, workerLastName, weekSalary, workingHours);

            System.out.println(student);
            System.out.println(worker);
        } catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
