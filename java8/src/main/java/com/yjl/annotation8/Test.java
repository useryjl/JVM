package com.yjl.annotation8;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-09
 */
public class Test {
    public static void main(String[] args) {
        Class<Myclass> aClass = Myclass.class;
        try {
            Method show = aClass.getDeclaredMethod("show");
            Myannotation[] annotationsByType = show.getAnnotationsByType(Myannotation.class);
            for (Myannotation myannotation:annotationsByType){
                //System.out.println(myannotation.value());
                if (myannotation.value().equals("123")){
                    System.out.println("123");
                }else if (myannotation.value().equals("YJL")){
                    System.out.println("YJL");
                }else {
                    System.out.println(789);
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
