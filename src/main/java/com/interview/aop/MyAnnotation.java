package com.interview.aop;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.*;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD}) // 若没有 @Target，则该 Annotation 可以用于任何地方。
@Retention(RetentionPolicy.RUNTIME) // 这就意味着，编译器会将该 Annotation 信息保留在 .class 文件中，并且能被虚拟机读取。
@Inherited
public @interface MyAnnotation {
    String[] value() default "unknown";

}

@MyAnnotation({"default", "not found"})
class AnnotatedClazz {
    public AnnotatedClazz() {

    }


    public static void main(String[] args) {
        AnnotatedClazz clazz = new AnnotatedClazz();
        Class<AnnotatedClazz> clazzClass = AnnotatedClazz.class;
        AnnotatedType[] annotatedInterfaces = clazzClass.getAnnotatedInterfaces();
        System.out.println("annotatedInterfaces = " + Arrays.toString(annotatedInterfaces));
        boolean present = clazzClass.isAnnotationPresent(MyAnnotation.class);
        System.out.println("present = " + present);
        MyAnnotation annotation = clazzClass.getAnnotation(MyAnnotation.class);
        System.out.println("annotation = " + annotation);
        String[] value = annotation.value();
        Arrays.stream(value).forEach(item -> System.out.println("item: " + item));
    }
}

class Manipulate {
    private final static Logger logger = LoggerFactory.getLogger(Manipulate.class);

    public static Boolean flag;

    @MyAnnotation
    public void division() {
        int i = 6 / 0;
    }

    @MyAnnotation
    public void plus() {
        int i = 1 + 1;
    }

    @MyAnnotation
    public void times(){
        int i = 2 * 3;
    }

    public static void main(String[] args) {
        // 反射获取 class
        Manipulate manipulate = new Manipulate();
        Class manipulateClass = manipulate.getClass();
        try {
            Field flag = manipulateClass.getDeclaredField("flag");
            logger.info("flag field: {}", flag.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        // 获取到所有method
        Method[] methods = manipulateClass.getMethods();
        // 如果method具有注解
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                try {
                    method.setAccessible(true);
                    method.invoke(manipulate,"1",2,false,8L);
                    logger.info("this method has no error");
                } catch (Exception e) {
                    logger.warn("error: {}", e.getMessage());
                } finally {
                    logger.info("done..");
                }

            }
        }
    }
}


