package org.suye.corejava.factory.simple;

import org.suye.corejava.factory.simple.service.Login;

/**
 * Created by Administrator on 2016/12/12.
 */
public class DomainLogin implements Login {

    public Boolean verify(String name, String password) {
        System.out.println("Domain login...........");

        return "zhangsan".equals(name) && "123".equals(password);
    }
}
