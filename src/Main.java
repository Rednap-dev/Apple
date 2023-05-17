import java.io.IOException;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Apple apple = new Apple();
        String color = null;
        System.out.println(color);
        try {
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);
            color = "orange";
            throw new IllegalAccessException("Exception Alpha! ");
        }catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }
        System.out.println(color);
    }
}
