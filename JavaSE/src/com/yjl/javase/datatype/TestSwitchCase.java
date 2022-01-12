package com.yjl.javase.datatype;

import java.util.Scanner;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-11
 */
public class TestSwitchCase {
    public static void main(String[] args) {
        boolean isFlag=true;
        while (isFlag){
            System.out.println("请输入a、b、c、d,按q退出菜单");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            switch (s){
                case "a":
                    System.out.println("a");
                    break;
                case "b":
                    System.out.println("b");
                    break;
                case "c":
                    System.out.println("c");
                    break;
                case "d":
                    System.out.println("d");
                    break;
                case "q":
                    System.out.println("正在退出菜单......");
                    isFlag=false;
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }
    }
}
