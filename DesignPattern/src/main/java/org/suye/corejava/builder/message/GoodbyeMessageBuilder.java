package org.suye.corejava.builder.message;

import org.suye.corejava.builder.message.service.MessageBuilder;

/**
 * Created by Administrator on 2016/12/13.
 */
public class GoodbyeMessageBuilder extends MessageBuilder {

    public GoodbyeMessageBuilder() {
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("欢送主题");
    }

    @Override
    public void buildBody() {
        msg.setBody("欢送内容");
    }
}
