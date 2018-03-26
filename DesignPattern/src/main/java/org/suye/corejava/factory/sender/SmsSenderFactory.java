package org.suye.corejava.factory.sender;

/**
 * Created by suye on 2018/3/23.
 */
public class SmsSenderFactory implements AbstractSenderFactory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
