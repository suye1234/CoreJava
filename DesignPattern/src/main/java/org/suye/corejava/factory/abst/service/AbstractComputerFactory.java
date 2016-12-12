package org.suye.corejava.factory.abst.service;

/**
 * Created by Administrator on 2016/12/12.
 */
public interface AbstractComputerFactory {
    Cpu createCpu();

    Mainboard createMainboard();
}
