package com.magicpanda.J8.lambda.base;

/**
 * Created by 利彬 on 2015/3/24.
 */
public class test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("===test===");
        // Anonymous Runnable
        Runnable r1 = new Runnable() {

            public void run() {
                System.out.println("hello world one!");
            }
        };

        //Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");

        r1.run();
        r2.run();
    }
}