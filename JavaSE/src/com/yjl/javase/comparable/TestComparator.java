package com.yjl.javase.comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ll3306
 * @Description  Comparator接口和Comparable接口，对象排序时使用，对象排序，实际是对象的属性进行排序；
 * 返回1 默认从小到大
 *
 * @create 2022-01-15
 */
public class TestComparator {
    public static void main(String[] args) {
        Goods[] goods = new Goods[5];
        goods[0]=new Goods("手机1",12);
        goods[1]=new Goods("手机2",44);
        goods[2]=new Goods("手机3",18);
        goods[3]=new Goods("手机4",96);
        goods[4]=new Goods("手机5",96);
        Arrays.sort(goods, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1.getCount()>o2.getCount()){
                    return 1;
                }else if (o1.getCount()<o2.getCount()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        String string = Arrays.toString(goods);
        System.out.println(string);
    }
}
