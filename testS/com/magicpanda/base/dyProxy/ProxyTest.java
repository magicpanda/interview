package com.magicpanda.base.dyProxy;

/**
 * Created with IntelliJ IDEA.
 * User: 利彬
 * Date: 15-3-13
 * Time: 下午4:36
 * To change this template use File | Settings | File Templates.
 */

import org.junit.Test;

/**
 * 动态代理测试类
 * @author zyb
 * @since 2012-8-9
 *
 */
public class ProxyTest {

    @Test
    public void testProxy() throws Throwable {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", true);
        // 实例化目标对象
        UserService userService = new UserServiceImpl();

        // 实例化InvocationHandler
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);

        // 根据目标对象生成代理对象
        UserService proxy = (UserService) invocationHandler.getProxy();

        // 调用代理对象的方法
        proxy.add();

    }

    @Test
    public void testGenerateProxyClass() {
        ProxyGeneratorUtils.writeProxyClassToHardDisk("G:/$Proxy11.class");
    }
}