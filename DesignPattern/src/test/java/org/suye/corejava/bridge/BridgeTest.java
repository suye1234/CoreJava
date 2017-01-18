package org.suye.corejava.bridge;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.bridge.service.AbstractMessage;

/**
 * Created by suye on 2017/1/18.
 */
public class BridgeTest {

    @Test
    public void testSendMessage() {
        AbstractMessage message = new CommonMessage(new MessageSms());

        message.sendMessage();

        UrgentMessage message2 = new UrgentMessage(new MessageEmail());

        message2.watch();
        message2.sendMessage();

        SpecialUrgentMessage message3 = new SpecialUrgentMessage(new MessageMobile());

        message3.hurry();
        message3.sendMessage();

        Assert.assertTrue(true);

    }
}
