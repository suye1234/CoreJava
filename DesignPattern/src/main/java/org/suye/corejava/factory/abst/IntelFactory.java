package org.suye.corejava.factory.abst;

import org.suye.corejava.factory.abst.service.AbstractComputerFactory;
import org.suye.corejava.factory.abst.service.Cpu;
import org.suye.corejava.factory.abst.service.Mainboard;

/**
 * Created by Administrator on 2016/12/12.
 */
public class IntelFactory implements AbstractComputerFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
