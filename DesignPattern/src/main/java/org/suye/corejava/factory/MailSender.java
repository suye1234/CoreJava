package org.suye.corejava.factory;

import org.suye.corejava.factory.Sender;

/**
 * Created by suye on 2018/3/23.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
