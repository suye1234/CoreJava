package org.suye.corejava.factory;

import org.junit.Test;

/**
 * Created by suye on 2018/3/23.
 */
public class SenderFactoryTest {
    @Test
    public void testSenderFactory() {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("sms");
        sender.send();

        sender = factory.produceMail();
        sender.send();

        Provider provider = new SmsSenderFactory();
        sender = provider.produce();
        sender.send();
    }
}
