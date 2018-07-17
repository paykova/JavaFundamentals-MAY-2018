package p08_CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorter<T> {

    public Sorter() {
    }

    public static <T extends Comparable<T>> void sort (MyList<T> list){
        list.sortAscending();
    }
}
