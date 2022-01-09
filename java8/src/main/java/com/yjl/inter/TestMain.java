package com.yjl.inter;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-09
 */
public class TestMain {
    public static void main(String[] args) {
        TestMyInterface myInterface = new TestMyInterface();
        myInterface.add();
        System.out.println(myInterface.getString());
        //方法引用： 对象名::实例方法名
        Supplier<String> supplier= myInterface::getString;

        //
        Supplier<String> stringSupplier=()->{
            System.out.println("====这是Lambda表达式====");
            return myInterface.getString();
        };
        String s1 = stringSupplier.get();
        System.out.println(s1);

        String s = supplier.get();
        System.out.println("s:"+s);

    }
}
