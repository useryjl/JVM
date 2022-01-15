package com.yjl.javase.comparable;

import java.util.Arrays;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-15
 */
public class Test {
    public static void main(String[] args) {
        Goods[] goods = new Goods[5];
        goods[0]=new Goods("手机1",12);
        goods[1]=new Goods("手机2",44);
        goods[2]=new Goods("手机3",18);
        goods[3]=new Goods("手机4",96);
        goods[4]=new Goods("手机5",96);

        //System.out.println(goods[0].toString());
        Arrays.sort(goods);
        String string = Arrays.toString(goods);
        System.out.println(string);


    }
}
