package org.kniit.lab9.task17;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            field.setAccessible(true);
            Object value = field.get(obj);
            if (field.isAnnotationPresent(NotNull.class) && value == null){
                System.out.println("Поле " + field.getName() + " не может быть null");
            }
            if (field.isAnnotationPresent(MaxLength.class) && value instanceof String){
                String str = (String) value;
                MaxLength annotation = field.getAnnotation(MaxLength.class);
                if (str.length() > annotation.value()){
                    System.out.println("Длина поля " + field.getName() + " должно быть не более " + annotation.value());
                }
            }
            if (field.isAnnotationPresent(Min.class) && value instanceof int){
                int val = (int) value;
                Min annotation = field.getAnnotation(Min.class);
                if (val < annotation.value()){
                    System.out.println("Значение поля " + field.getName() + " должно быть не менее " + annotation.value());
                }
            }
        }
    }
    
}
