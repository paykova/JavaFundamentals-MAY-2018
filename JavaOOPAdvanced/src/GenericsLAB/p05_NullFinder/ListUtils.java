package GenericsLAB.p05_NullFinder;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static List<Integer> getNullIndices(List<?> list) {
        List<Integer> indices = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                indices.add(i);
            }
        }
        return indices;
    }
}
