package org.suye.corejava.factory;

/**
 * Created by suye on 2018/3/23.
 */
public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
