package GenericsLAB.p05_NullFinder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(){{add (null); add("adada");}};

        System.out.println(ListUtils.getNullIndices(list));
    }
}
