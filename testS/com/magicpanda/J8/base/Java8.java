package com.magicpanda.J8.base;

/**
 * Created by 利彬 on 2015/3/24.
 */
import java.awt.Button;

public class Java8 {
    public static void main(String[] args) throws InterruptedException {
        Button myButton = new Button();
        myButton.addActionListener(ae -> System.out.println(ae.getSource()));
        Thread.sleep(10000);
    }
}