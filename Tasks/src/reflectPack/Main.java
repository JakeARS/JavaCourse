package reflectPack;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        try {
            Field[] field = myClass.getClass().getDeclaredFields();
            Method[] methods = MyClass.class.getMethods();
            for (Field f: field) {
                Annotation annotation = f.getAnnotation(RoundAnnotation.class);
                if (annotation != null) {
                    for (Method m : methods) {
                        if (m.getName().toUpperCase().contains(f.getName().toUpperCase()) && m.getName().startsWith("get")) {
                            if (((RoundAnnotation) annotation).value()) {
                                System.out.println(Math.round((double) m.invoke(myClass)));
                            } else {
                                System.out.println((double) m.invoke(myClass));
                            }
                        }
                    }
                }
            }

        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}