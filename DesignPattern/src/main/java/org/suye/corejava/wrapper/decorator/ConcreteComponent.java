package org.suye.corejava.wrapper.decorator;

import org.suye.corejava.wrapper.decorator.service.Component;

/**
 * Created by Administrator on 2016/12/19.
 */
public class ConcreteComponent implements Component{
    @Override
    public void operate() {
        System.out.println("Print ConcreteComponent.........");
    }
}
