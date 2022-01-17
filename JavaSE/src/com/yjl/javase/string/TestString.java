package com.yjl.javase.string;

/**
 * @author ll3306
 * @Description  String 不可变，不可变的意思是String底层是一个char类型的数组，final修饰；
 *               所以对String的操作都是新建一个对象，并不在原先的基础上修改；
 *
 * @create 2022-01-15
 */
public class TestString {
    public static void main(String[] args) {
        String s="hello";
        s="hello 123";
        System.out.println(s);

        //返回同一个新String 是重新创建的 不是在原来的基础上修改的;
        String toUpperCase = s.toUpperCase();
        System.out.println(s);

    }
}
