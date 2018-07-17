package p08_CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListImpl <T extends Comparable<T>> implements MyList<T> {

    private List<T> list;

    public MyListImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        list.add(element);
    }

    public boolean isValid(int index){
        if (index <= list.size() && index > 0){
            return true;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (isValid(index)){
            return list.remove(index);
        }
        return null;
    }

    @Override
    public boolean contains(T element) {
        if(list.contains(element)){
            return true;
        }
        return false;
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {
        T temp = list.get(firstIndex);
        this.list.set(firstIndex, this.list.get(secondIndex));
        this.list.set(secondIndex, temp);

    }

    @Override
    public int countGreaterThan(T element) {
        int count = 0;
        for (T t : this.list) {
            if (t.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public T getMax() {
        return Collections.max(this.list);
    }

    @Override
    public T getMin() {
        return Collections.min(this.list);
    }

    @Override
    public Iterable<T> getCollection() {
        return this.list;
    }

    @Override
    public void sortAscending(){
        Collections.sort(this.list);
    }
}
