package org.suye.corejava.bridge;

import org.suye.corejava.bridge.service.AbstractMessage;
import org.suye.corejava.bridge.service.MessageImplementor;

/**
 * Created by suye on 2017/1/18.
 */
public class UrgentMessage extends AbstractMessage {

    public UrgentMessage(MessageImplementor implementor) {
        super(implementor);
    }

    public void sendMessage() {
        super.implementor.send();
    }

    public void watch(){
        System.out.println("This is a urgent message, must be watching....");

    }
}
