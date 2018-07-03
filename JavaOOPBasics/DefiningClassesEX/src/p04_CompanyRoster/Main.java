package p04_CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

import static java.lang.System.in;
import static java.lang.System.setOut;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Map<String, Department> map = new HashMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            Employee employee = null;
            String[] line = reader.readLine().split(" ");

            String name = line[0];
            double salary = Double.parseDouble(line[1]);
            String position = line[2];
            String department = line[3];

            if (line.length == 4) {
                employee = new Employee(name, salary, position, department);
                if (map.containsKey(employee.getDepartment())){
                    map.get(employee.getDepartment()).addEmployees(employee);
                } else {
                    map.putIfAbsent(employee.getDepartment(), new Department());
                    map.get(employee.getDepartment()).addEmployees(employee);
                }
            } else if (line.length == 6) {
                String email = line[4];
               int age = Integer.parseInt(line[5]);
               employee = new Employee(name, salary, position, department, email, age);
                if (map.containsKey(employee.getDepartment())){
                    map.get(employee.getDepartment()).addEmployees(employee);
                } else {
                    map.putIfAbsent(employee.getDepartment(), new Department());
                    map.get(employee.getDepartment()).addEmployees(employee);
                }
            } else if (line.length == 5) {
                try {
                    int age = Integer.parseInt(line[4]);
                   employee = new Employee(name, salary, position, department, age);

                } catch (Exception ex) {
                    String email = line[4];
                    employee = new Employee(name, salary, position, department, email);
                }
                if (map.containsKey(employee.getDepartment())){
                    map.get(employee.getDepartment()).addEmployees(employee);
                } else {
                    map.putIfAbsent(employee.getDepartment(), new Department());
                    map.get(employee.getDepartment()).addEmployees(employee);
                }
            }
        }

        map.entrySet().stream()
                .sorted((d1, d2) -> {
                    double d1AvrSalary = d1.getValue().getEmployees().stream().mapToDouble(Employee::getSalary).average().getAsDouble();
                    double d2AvrSalary = d2.getValue().getEmployees().stream().mapToDouble(Employee::getSalary).average().getAsDouble();

                    if(d1AvrSalary == d2AvrSalary){
                        return 0;
                    }
                    return d1AvrSalary > d2AvrSalary ? -1 : 1;
                })
                .limit(1)
                .forEach(depart -> {
                    System.out.println(String.format("Highest Average Salary: %s", depart.getKey()));
                    depart.getValue().getEmployees()
                            .stream()
                            .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                            .forEach(System.out::println);
                });
    }
}
