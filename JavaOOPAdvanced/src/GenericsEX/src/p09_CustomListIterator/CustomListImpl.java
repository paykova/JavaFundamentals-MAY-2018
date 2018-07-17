package p09_CustomListIterator;

import p09_CustomListIterator.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomListImpl <T extends Comparable<T>> implements CustomList<T> {

    private List<T> list;

    public CustomListImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        list.add(element);
    }

    public boolean isValid(int index){
        return  (index <= list.size() && index >= 0);

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
        if(isValid(firstIndex) && isValid(secondIndex)){
            T temp = this.list.get(firstIndex);
            this.list.set(firstIndex, this.list.get(secondIndex));
            this.list.set(secondIndex, temp);
        }
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
    public Iterator<T> getCollection() {
        return this.list.iterator();
    }

    @Override
    public void sortAscending(){
        Collections.sort(this.list);
    }
}