package p01_OverloadMethod;

public class MathOperation {

    public int sum (int a, int b){
       return a + b;
    }

    public int sum (int a, int b, int c){
        return a + b + c ;
    }

    public int sum (int a, double c, int b){
        return (int) (a + b + c);
    }
}
