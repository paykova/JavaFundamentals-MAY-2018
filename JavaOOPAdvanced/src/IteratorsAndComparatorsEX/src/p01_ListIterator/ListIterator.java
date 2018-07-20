package p01_ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterator<T> {


    private List<T> list;
    private int index;

    public ListIterator(T... list) {
        this.list = new ArrayList<>(Arrays.asList(list));
        this.index = 0;
    }

    public ListIterator(List<String> list) {
        this.list = new ArrayList<>();
    }

    public boolean move() {
        if (hasNext()) {
            this.index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        }
        return false;
    }

    public void print() {
       if (this.list.size() == 0){
           throw new IllegalArgumentException("Invalid Operation!");
       }
        System.out.println(this.list.get(this.index));

    }

}
