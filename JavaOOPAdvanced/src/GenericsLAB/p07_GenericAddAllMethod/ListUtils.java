package GenericsLAB.p07_GenericAddAllMethod;

import java.util.List;

public class ListUtils {

    public static <T> void addAll(List<? super T> destination, List<? extends T> source){
     destination.addAll(source);
    }
}
