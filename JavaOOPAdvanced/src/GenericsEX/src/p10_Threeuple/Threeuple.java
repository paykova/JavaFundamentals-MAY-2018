package p10_Threeuple;


public class Threeuple <T, E, K> {

   private T item1;
   private E item2;
   private K item3;

    public Threeuple(T item1, E item2, K item3) {
        this.setItem1(item1);
        this.setItem2(item2);
        this.setItem3(item3);
    }

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public E getItem2() {
        return item2;
    }

    public void setItem2(E item2) {
        this.item2 = item2;
    }

    public K getItem3() {
        return item3;
    }

    public void setItem3(K item3) {
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.getItem1(), this.item2, this.item3);
    }
}
