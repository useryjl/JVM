package com.yjl.javase.oop;

/**
 * @author ll3306
 * @Description  形参: 可变长度参数
 * 1。只能出现在参数列表的末尾;
 * 2。使用时和数组的使用方式一样；
 *
 * @create 2022-01-12
 */
public class TestCLArguments {
    public void show(String ... args){
        System.out.println(args[0]+","+args[1]);
    }
    public static void main(String[] args) {
        TestCLArguments testCLArguments = new TestCLArguments();
        testCLArguments.show("abc","def");
    }
}
