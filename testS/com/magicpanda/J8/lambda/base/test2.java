package com.magicpanda.J8.lambda.base;

/**
 * Created by 利彬 on 2015/3/24.
 */
public class test2 {
    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }

    public static void main(String args[]) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123
    }
}