package com.yjl.javase.datatype;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-10
 */
public class TestDataTypeOp {
    public static void main(String[] args) {
        int a=10;
        char b='A';  //65   byte,short,char->int
        System.out.println(a+b);

        Long l=10l;
        System.out.println(l+a);

        float f=10.0f;
        System.out.println(f+l);

        double d=20.0000;
        System.out.println((d+f));
    }
}
