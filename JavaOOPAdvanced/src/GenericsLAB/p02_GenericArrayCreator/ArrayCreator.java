package GenericsLAB.p02_GenericArrayCreator;


import java.lang.reflect.Array;

public class ArrayCreator<T> {

    @SuppressWarnings("unchacked")
   public static <T> T[] create(int length, T item){
       T[] arr = (T[]) new Object[length];

        for (int i = 0; i <length ; i++) {
            arr[i] = item;
        }

       return arr;
    };

    public static <T> T[] create(Class <T> cl, int length, T item){
        T[] arr = (T[]) Array.newInstance(cl, length);

        for (int i = 0; i <length ; i++) {
            arr[i] = item;
        }

        return arr;
    };

}
