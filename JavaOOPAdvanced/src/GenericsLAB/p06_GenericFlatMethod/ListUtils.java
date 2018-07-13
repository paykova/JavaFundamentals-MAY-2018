package GenericsLAB.p06_GenericFlatMethod;

import java.util.List;

public class ListUtils {
    public static <T> void flatten(List<? super T> destination, List<List<? extends  T>> source){

        for (List<? extends T> ts : source) {
            destination.addAll(ts);
        }
    }
}
