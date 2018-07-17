package p09_CustomListIterator;

public class Sorter<T> {

    public Sorter() {
    }

    public static <T extends Comparable<T>> void sort (CustomList<T> list){
        list.sortAscending();
    }
}