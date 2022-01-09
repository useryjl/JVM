package com.yjl.TestMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-08
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("1",1);
        hashMap.put("2",2);
        hashMap.put("3",3);
        hashMap.put("4",4);
        hashMap.put("5",5);
        hashMap.put("6",6);

        System.out.println(hashMap);
        Set<String> keySet = hashMap.keySet();
        for (String s:keySet){
            System.out.println(s);
            Object o = hashMap.get(s);
            System.out.println(o);
        }
    }
}
