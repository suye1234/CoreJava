package org.suye.corejava.factory.simple;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2016/12/12.
 */
public class LoginFactoryTest {

    @Test
    public void testPasswordLogin(){
        String type = LoginFactory.TYPE_PASSWORD;

        String name = "lisi";
        String password = "456";

        Assert.assertTrue(LoginFactory.getLoginInstance(type).verify(name,password));
    }


    @Test
    public void testDomainLogin(){
        String type = LoginFactory.TYPE_DOMAIN;

        String name = "zhangsan";
        String password = "123";

        Assert.assertTrue(LoginFactory.getLoginInstance(type).verify(name,password));
    }

}
