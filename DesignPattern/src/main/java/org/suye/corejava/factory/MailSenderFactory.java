package org.suye.corejava.factory;

/**
 * Created by suye on 2018/3/23.
 */
public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
