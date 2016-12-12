package org.suye.corejava.factory.simple;

import org.suye.corejava.factory.simple.service.Login;

/**
 * Created by Administrator on 2016/12/12.
 */
public class PasswordLogin implements Login{
    public Boolean verify(String name, String password) {
        System.out.println("Password login...........");

        return "lisi".equals(name) && "456".equals(password);
    }
}
