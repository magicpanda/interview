package com.magicpanda.base.dyProxy;

/**
 * Created with IntelliJ IDEA.
 * User: 利彬
 * Date: 15-3-13
 * Time: 下午4:36
 * To change this template use File | Settings | File Templates.
 */

/**
 * 目标对象
 * @author zyb
 * @since 2012-8-9
 *
 */
public class UserServiceImpl implements UserService {

    /* (non-Javadoc)
     * @see dynamic.proxy.UserService#add()
     */
    public void add() {
        System.out.println("--------------------add---------------");
    }
}