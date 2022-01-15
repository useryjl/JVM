package com.yjl.javase.thread;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-14
 */
class myThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+1);
    }
}

public class Test1 {
    public static void main(String[] args) {
        myThread myThread = new myThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }
}
