package org.suye.corejava.factory.polymorphic;

import org.junit.Test;
import org.suye.corejava.factory.sender.Provider;
import org.suye.corejava.factory.sender.Sender;
import org.suye.corejava.factory.sender.SmsSenderFactory;

/**
 * Created by suye on 2018/3/23.
 */
public class SenderFactoryTest {
    @Test
    public void testSenderFactory() {
        // 工厂方法模式
        Provider provider = new SmsSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
