package p01_Person;

public class Child extends Person {

    public Child(String name, int age) {
        super(name, age);
    }

    public Child() {
    }

    @Override
    protected void setAge(int age) {
        super.setAge(age);
        if (age > 15){
            throw new IllegalArgumentException("Child's age must be lesser then 15!");
        }
    }
}
