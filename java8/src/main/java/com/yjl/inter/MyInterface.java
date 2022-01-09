package com.yjl.inter;

/**
 * @author ll3306
 * @Description
 *  Java8 中对接口有了新的规范： 接口中可以有方法的具体实现，此方法的修饰符必须是default
 * @create 2022-01-09
 */
public interface MyInterface {
    public abstract void add();
    default String getString(){
        return "hello,world";
    }

}
