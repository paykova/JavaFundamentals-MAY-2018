package GenericsLAB.p03_GenericScale;

public class Main {

    public static void main(String[] args) {

        Scale<Integer> scale = new Scale<>(2, 18);
        Scale<String> scale2 = new Scale<>("aa", "a");

        System.out.println(scale.getHeavier());
        System.out.println(scale2.getHeavier());

    }
}
