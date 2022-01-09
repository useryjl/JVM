package com.yjl.inter;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-09
 */
public class TestMyInterface implements MyInterface {
    @Override
    public void add() {
        System.out.println("add()");
    }

    @Override
    public String getString() {
        return "getString哈哈";
    }
}
