package p01_Reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args)
            throws IllegalAccessException,
            InstantiationException,
            NoSuchMethodException,
            InvocationTargetException {

        Class<Reflection> aClass = Reflection.class;

        System.out.println(aClass);
        System.out.println(aClass.getSuperclass());
        Class[] interfaces = aClass.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Reflection ref = aClass.getDeclaredConstructor().newInstance();

        System.out.println(ref);
    }
}
