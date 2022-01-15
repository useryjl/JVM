package com.yjl.javase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-14
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(123);
            }
        });
        service.shutdown();
    }
}
