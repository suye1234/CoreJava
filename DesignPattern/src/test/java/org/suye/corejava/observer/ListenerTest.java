package org.suye.corejava.observer;

import org.junit.Test;

/**
 * Created by suye on 2018/3/28.
 */
public class ListenerTest {
    @Test
    public void testSubject(){
        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Listener listener = new ConcreteListener();
        //将观察者对象登记到主题对象上
        subject.register(listener);
        //改变主题对象的状态
        subject.change("new state");
    }
}
