package com.yjl.java8;

import java.util.function.Function;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-08
 */
public class TestLambDa {
    public static void main(String[] args) {
        LambDaClass lambDaClass = new LambDaClass();
        lambDaClass.stringOpt("str123suiui",(s)->s.toUpperCase());
        //
        Function<Integer,String> function=(x)->{
            System.out.println("Lambda表达式");
        return x.toString();
        };
        String apply = function.apply(123);
        System.out.println(apply);
    }
}
