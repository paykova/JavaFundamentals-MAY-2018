package p10_Tuple;

public class Tuple<T, E> {

    private  T firstItem;
    private E secondItem;

    public Tuple(T firstItem, E secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T getFirstItem() {
        return firstItem;
    }

    public E getSecondItem() {
        return secondItem;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", this.getFirstItem(), this.secondItem);
    }
}
