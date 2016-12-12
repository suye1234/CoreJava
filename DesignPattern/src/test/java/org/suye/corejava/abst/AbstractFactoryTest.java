package org.suye.corejava.abst;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.factory.abst.AmdFactory;
import org.suye.corejava.factory.abst.IntelFactory;
import org.suye.corejava.factory.abst.service.AbstractComputerFactory;
import org.suye.corejava.factory.abst.service.Cpu;
import org.suye.corejava.factory.abst.service.Mainboard;

/**
 * Created by Administrator on 2016/12/12.
 */
public class AbstractFactoryTest {

    @Test
    public void testInstallIntelComputer(){
        AbstractComputerFactory intelFactory = new IntelFactory();

        Cpu cpu = intelFactory.createCpu();
        Mainboard mainboard = intelFactory.createMainboard();

        cpu.calculate();
        mainboard.installCpu();

        Assert.assertEquals(755, cpu.getPins());
        Assert.assertEquals(755,mainboard.getCpuHoles());
    }

    @Test
    public void testInstallAmdComputer(){
        AbstractComputerFactory amdFactory = new AmdFactory();

        Cpu cpu = amdFactory.createCpu();
        Mainboard mainboard = amdFactory.createMainboard();

        cpu.calculate();
        mainboard.installCpu();

        Assert.assertEquals(938, cpu.getPins());
        Assert.assertEquals(938,mainboard.getCpuHoles());
    }
}
