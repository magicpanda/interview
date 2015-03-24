package com.magicpanda.base.dyProxy;

/**
 * Created with IntelliJ IDEA.
 * User: 利彬
 * Date: 15-3-13
 * Time: 下午4:35
 * To change this template use File | Settings | File Templates.
 */

/**
 * 目标对象实现的接口，用JDK来生成代理对象一定要实现一个接口
 * @author zyb
 * @since 2012-8-9
 *
 */
public interface UserService {

    /**
     * 目标方法
     */
    public abstract void add();

}
