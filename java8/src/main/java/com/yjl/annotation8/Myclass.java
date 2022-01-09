package com.yjl.annotation8;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-09
 */
public class Myclass {
    @Myannotation()
    @Myannotation(value = "123")
    public void show(){
        System.out.println("public void show(){}");
    }
}
