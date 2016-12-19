package org.suye.corejava.decorator.decorator;

import org.suye.corejava.decorator.decorator.service.Component;

/**
 * Created by Administrator on 2016/12/19.
 */
public class ConcreteComponent implements Component{
    @Override
    public void operate() {
        System.out.println("Print ConcreteComponent.........");
    }
}
