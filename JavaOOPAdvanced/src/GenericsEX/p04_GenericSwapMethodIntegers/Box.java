package GenericsEX.p04_GenericSwapMethodIntegers;

public class Box <T>{
    private T elements;

    public Box(T elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.getClass().getName(), this.elements);
    }
}
