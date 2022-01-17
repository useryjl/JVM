package com.yjl.javase.collection;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yjl.javase.comparable.Goods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author ll3306
 * @Description  collection接口是List 和 Set 的父接口
 * 集合中放的是引用类型数据，123这种基本数据类型则会自动装箱
 * @create 2022-01-15
 */
public class TestInterface {
    public static void main(String[] args) {
         Collection collection = new ArrayList();
         collection.add(new Goods("yjl2",2));
         collection.add(new Integer(1));
         collection.add(23);  //自动装箱
         collection.add(new Goods("yjl",2));

         System.out.println(collection.toString());
        boolean contains = collection.contains(new Goods("yjl", 2));
        System.out.println(contains);  //contains方法比较的是内容 会调用类的equals方法

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println("进入iterator迭代器.....");
            Object next = iterator.next();
            System.out.println(next);
        }


        collection.forEach((x)->{
            System.out.println(x);
        });

    }
}
