package p03_StackIterator;

import java.util.Iterator;

public final class StackIterator<T> implements Iterator<T> {

    private int cursor;

    public StackIterator() {
        this.cursor = elementCount - 1;
    }

    @Override
    public boolean hasNext() {
        return this.cursor >= 0;
    }

    @Override
    public T next() {
        return elements [this.cursor - 1];
    }
}
