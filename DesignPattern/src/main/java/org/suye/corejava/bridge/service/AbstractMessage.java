package org.suye.corejava.bridge.service;

/**
 * Created by suye on 2017/1/18.
 */
public abstract class AbstractMessage {
    protected MessageImplementor implementor;

    public AbstractMessage(MessageImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void sendMessage();
}
