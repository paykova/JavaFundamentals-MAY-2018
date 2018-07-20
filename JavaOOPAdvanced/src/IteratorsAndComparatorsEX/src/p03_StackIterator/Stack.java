package p03_StackIterator;

import java.util.*;

public class Stack <T> implements Iterable<T> {

    private final int INITIAL_CAPACITY = 16;
    private final int DEFAULT_ELEMENT_COUNT = 0;

    private T[] elements;
    private int elementCount;

    public Stack() {
        this.elements = (T[]) new Object[INITIAL_CAPACITY];
        this.elementCount = DEFAULT_ELEMENT_COUNT;
    }

    //    private List<T> elements;
//
//    public Stack(T... elements) {
//        this.elements = new Deque<>(Arrays.asList(elements));
//    }
//
//    public void pop(){
//        if(elements.size() > 0){
//            this.elements.remove(elements.size() - 1);
//        } else {
//            System.out.println("No elements");
//        }
    }
}
