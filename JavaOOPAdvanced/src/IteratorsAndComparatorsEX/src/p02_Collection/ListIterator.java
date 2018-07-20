package p02_Collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterator <T>{

    private static final int INDEX_BY_DEFAULT = 0;

    List<T> list;
    private int index;

    public ListIterator(T... list) {
        this.list = new ArrayList<>(Arrays.asList(list));
        this.index = INDEX_BY_DEFAULT;
    }


    public boolean move(){
        if (hasNext()){
            this.index++;
            return true;
        }
        return false;
    }

    public void print(){
        if (list.size() == 0){
            throw new IllegalArgumentException("Invalid Operation!");
        }
        System.out.println(list.get(index));
    }

    public boolean hasNext(){
       return this.index < list.size() - 1;
    }

    public void printAll(){
        for (T s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
