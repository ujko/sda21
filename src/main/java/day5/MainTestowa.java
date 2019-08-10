package day5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTestowa {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class clazz = Testowa.class;
        Method[] methods = clazz.getDeclaredMethods();
        for(Method m : methods) {
            if(m.isAnnotationPresent(NaszaAdnotacja.class)) {
                m.invoke(new Testowa());
            }
        }
    }
}
