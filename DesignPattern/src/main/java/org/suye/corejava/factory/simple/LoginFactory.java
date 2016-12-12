package org.suye.corejava.factory.simple;

import org.suye.corejava.factory.simple.service.Login;

/**
 * 静态工厂类.
 */
public class LoginFactory {
    public static final String TYPE_DOMAIN = "domain";
    public static final String TYPE_PASSWORD = "password";

    public static Login getLoginInstance(String type){
        if(TYPE_DOMAIN.equals(type)){
            return new DomainLogin();
        }else if(TYPE_PASSWORD.equals(type)){
            return new PasswordLogin();
        }

        return null;
    }
}
