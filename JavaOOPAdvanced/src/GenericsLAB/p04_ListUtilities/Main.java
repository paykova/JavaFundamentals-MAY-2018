package GenericsLAB.p04_ListUtilities;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        System.out.println(ListUtils.getMax(list));
        System.out.println(ListUtils.getMin(list));
    }
}
