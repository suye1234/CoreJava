package org.suye.corejava.factory.simple;

import org.junit.Test;
import org.suye.corejava.factory.sender.Sender;
import org.suye.corejava.factory.sender.SenderFactory;

/**
 * Created by suye on 2018/3/23.
 */
public class SenderFactoryTest {
    @Test
    public void testSenderFactory() {
        // 普通工厂模式
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("sms");
        sender.send();

        // 多个工厂模式
        sender = factory.produceMail();
        sender.send();

        // 静态工厂模式
        sender = SenderFactory.produceSms();
        sender.send();
    }
}
