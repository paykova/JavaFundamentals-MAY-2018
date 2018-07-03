package p02_SalaryIncrease;

import java.text.DecimalFormat;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private DecimalFormat format;

    public Person(String firstName, String lastName, int age, double salary) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }

    public Person() {
        this.format = new DecimalFormat("#.0###########################");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus, int age){
        double sum;
        if (this.age < 30 ){
            this.salary = ((bonus / 2 / 100) * this.salary) + this.salary;
        } else {
            this.salary = ((bonus / 100) * this.salary) + this.salary;
        }
    }

    @Override
    public String toString(){
        return String.format("%s %s gets %s leva",
                this.firstName, this.lastName,
                this.format.format(this.getSalary())) ;
    }
}
