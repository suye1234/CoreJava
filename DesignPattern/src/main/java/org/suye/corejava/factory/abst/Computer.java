package org.suye.corejava.factory.abst;

import org.suye.corejava.factory.abst.service.AbstractComputerFactory;
import org.suye.corejava.factory.abst.service.Cpu;
import org.suye.corejava.factory.abst.service.Mainboard;

/**
 * Created by suye on 2018/3/26.
 */
public class Computer {
    private AbstractComputerFactory computerFactory;

    private Cpu cpu;

    private Mainboard mainboard;

    public void installCompute(){
        cpu = computerFactory.createCpu();

        mainboard = computerFactory.createMainboard();
    }

    public void work(){
        mainboard.installCpu();

        cpu.calculate();
    }

    public Computer(AbstractComputerFactory computerFactory) {
        this.computerFactory = computerFactory;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }
}
