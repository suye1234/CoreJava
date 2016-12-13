package org.suye.corejava.builder.message;

import org.suye.corejava.builder.message.service.MessageBuilder;

/**
 * Created by Administrator on 2016/12/13.
 */
public class MessageDirector {
    private MessageBuilder messageBuilder;

    public MessageDirector(MessageBuilder messageBuilder) {
        this.messageBuilder = messageBuilder;
    }

    /**
     * 产品构造方法，负责调用各零件的建造方法
     */
    public void construct(String toAddress, String fromAddress) {
        messageBuilder.buildTo(toAddress);
        messageBuilder.buildFrom(fromAddress);
        messageBuilder.buildSubject();
        messageBuilder.buildBody();
        messageBuilder.buildSendDate();
        messageBuilder.sendMessage();
    }

}
