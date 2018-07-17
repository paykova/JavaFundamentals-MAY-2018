package p03_GenericSwapMethodString;

public class Box <T>{

    private T element;

    public Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.element.getClass().getName(), this.element);
    }
}
