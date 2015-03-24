package com.magicpanda.base.loader;

/**
 * Created with IntelliJ IDEA.
 * User: 利彬
 * Date: 15-3-13
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
public class ClassLoaderTest {
    public static void main(String args[]){
        int i = Integer.MAX_VALUE;
//        ClassLoader defaultClassLoader = getDefaultClassLoader();
        System.out.println();

    }
    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        }
        catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back...
        }
        if (cl == null) {
            // No thread context class loader -> use class loader of this class.
            cl = ClassLoader.class.getClassLoader();
            if (cl == null) {
                // getClassLoader() returning null indicates the bootstrap ClassLoader
                try {
                    cl = ClassLoader.getSystemClassLoader();
                }
                catch (Throwable ex) {
                    // Cannot access system ClassLoader - oh well, maybe the caller can live with null...
                }
            }
        }
        return cl;
    }
}
