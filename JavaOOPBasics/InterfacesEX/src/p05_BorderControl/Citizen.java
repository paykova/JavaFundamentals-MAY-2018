package p05_BorderControl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Citizen implements Society {

    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getId(String id) {
        return this.id;
    }

    @Override
    public void checkId(String check) {
        if(id.endsWith(check)){
            System.out.println(this.id);
        }

    }
}
