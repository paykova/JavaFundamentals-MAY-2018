package p05_BorderControl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Robot implements Society {

    private String name;
    private String id;

    public Robot(String name, String id) {
        this.name = name;
        this.id = id;
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

