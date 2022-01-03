package com.yjl.jvm;

/**
 * @author yjl
 * @Description
 * @create 2022-01-03
 */
public class Cat extends Animal {
    public Cat() {
        System.out.println("调用Cat类无参数构造方法实例对象-> public Cat()");
    }

    @Override
    public void eat() {

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        int age = cat.age;
        cat.eat();
        System.out.println(age);

    //
        JVM jvm = new JVM();

    }
}
