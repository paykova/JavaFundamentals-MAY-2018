package GenericsLAB.p01_jarOfT;

import java.util.ArrayDeque;

public class Jar <T> {

    private ArrayDeque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<T>();
    }

    public void add (T element){
        elements.push(element);

    };
    public T remove(){
        if(this.elements.size() > 0){
            return this.elements.pop();
        }
     return null;
    }
}
