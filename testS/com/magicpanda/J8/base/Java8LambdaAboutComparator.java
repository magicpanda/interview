package com.magicpanda.J8.base;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by 利彬 on 2015/3/24.
 */
public class Java8LambdaAboutComparator {
    public static int myCompare(String in, String out){
        return in.length() - out.length();
    }

    public static void main(String[] args) {
        Arrays.sort(args, Java8LambdaAboutComparator::myCompare);
        Arrays.sort(args, (o1, o2) -> o1.length() - o2.length());
        Arrays.sort(args, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
    }
}