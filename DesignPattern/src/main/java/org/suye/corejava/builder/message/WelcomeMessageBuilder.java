package org.suye.corejava.builder.message;


import org.suye.corejava.builder.message.service.MessageBuilder;

/**
 * Created by Administrator on 2016/12/13.
 */
public class WelcomeMessageBuilder extends MessageBuilder {
    public WelcomeMessageBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("欢迎主题");
    }

    @Override
    public void buildBody() {
        msg.setBody("欢迎内容");
    }
}
