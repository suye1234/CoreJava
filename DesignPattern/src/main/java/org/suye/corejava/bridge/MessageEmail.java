package org.suye.corejava.bridge;

import org.suye.corejava.bridge.service.MessageImplementor;

/**
 * Created by suye on 2017/1/18.
 */
public class MessageEmail implements MessageImplementor{
    public void send() {
        System.out.println("Send message by EMAIL");
    }
}
