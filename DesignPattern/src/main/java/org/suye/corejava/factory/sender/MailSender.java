package org.suye.corejava.factory.sender;

/**
 * Created by suye on 2018/3/23.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
