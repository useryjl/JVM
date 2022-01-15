package com.yjl.javase.oop;

/**
 * @author ll3306
 * @Description  传值 传址
 * 基本数据类型 传值
 * 引用数据类型 传地址，引用数据类型里面只能放null、地址
 *
 * @eg:
 *
 * @create 2022-01-12
 */
public class ValueOrAdress {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        Data data = new Data();
        data.swap(a,b);
        System.out.println("main-swap>>>>>>>>"+"a:"+a+"b:"+b);
        System.out.println("\t\t\t");

        Data dataOpt = new Data();
        int i = dataOpt.swapOpt(dataOpt);
        System.out.println(i);


        System.out.println("\t\t\t");

    }
}

class Data{
    int a=10;
    int b=20;
    public int swapOpt(Data data){
        int tmp;
        tmp=data.a;
        data.a=data.b;
        data.b=tmp;
        System.out.println("swapOpt->>>>>>a="+a+","+"b="+b);
        return a;

    }


    public void swap(int a,int b){
        int tmp;
        tmp=a;
        a=b;
        b=tmp;
        System.out.println("1->>>>>>a="+a+","+"b="+b);

    }
}
