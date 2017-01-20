package org.suye.corejava.bridge;

import org.suye.corejava.bridge.service.AbstractMessage;
import org.suye.corejava.bridge.service.MessageImplementor;

/**
 * Created by suye on 2017/1/18.
 */
public class SpecialUrgentMessage extends AbstractMessage{
    public SpecialUrgentMessage(MessageImplementor implementor) {
        super(implementor);
    }

    public void sendMessage() {
        hurry();

        super.implementor.send();
    }

    public void hurry(){
        System.out.println("This is a special urgent message, must be hurried up!");

    }
}
