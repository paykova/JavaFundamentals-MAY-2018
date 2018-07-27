package p02_GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> aClass = Reflection.class;

        Method[] methods = Reflection.class.getDeclaredMethods();

        Set<Method> setters = new TreeSet<>(Comparator.comparing(Method::getName));
        Set<Method> getters = new TreeSet<>(Comparator.comparing(Method::getName));

        for (Method method : methods) {
            if (method.getName().startsWith("set") && method.getParameterCount() == 1 && method.getReturnType().equals(void.class)){
                setters.add(method);
            } else if (method.getName().startsWith("get") && !method.getReturnType().equals(void.class) && method.getParameterCount() == 0){
                getters.add(method);
            }
        }

        for (Method getter : getters) {
            System.out.printf("%s will return %s%n", getter.getName(), getter.getReturnType().getSimpleName());
        }

        for (Method setter : setters) {
            System.out.printf("%s and will set field of %s%n", setter.getName(), setter.getReturnType().getSimpleName());
        }

    }
}
