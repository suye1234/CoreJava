package org.suye.corejava.factory;

import org.suye.corejava.factory.MailSender;
import org.suye.corejava.factory.Sender;
import org.suye.corejava.factory.SmsSender;

/**
 * Created by suye on 2018/3/23.
 */
public class SenderFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
