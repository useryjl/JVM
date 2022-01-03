package com.yjl.jvm;

/**
 * @author yjl
 * @Description
 * new 关键字实例化对象时，会调用其父类的无参数构造方法
 * @create 2022-01-03
 */
public class Animal {
    public Animal() {
        System.out.println("调用了父类的构造方法->   public Animal() ");
    }

    public Animal(int age) {
        this.age = age;
    }

    public int age=100;
    public void eat(){
        System.out.println("开吃");
    }
}
