package p01_ClassBox;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String volumeArea (){
        double volume = this.length * this.width * this.height;
        return String.format("Volume - %.2f", volume);
    }

    public String lateralArea (){
        double lateral = (2 * this.length * this.height) + (2 * this.width * this.height);
        return String.format("Lateral Surface Area - %.2f", lateral);
    }

    public String surfaceArea (){
        double surface = (2 * this.length * this.width) + (2 * this.length * this.height) + (2 * this.width * this.height);
        return String.format("Surface Area - %.2f", surface);
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb.append(this.surfaceArea())
                .append(System.lineSeparator())
                .append(this.lateralArea())
                .append(System.lineSeparator())
                .append(this.volumeArea());

        return sb.toString();

    }
}
