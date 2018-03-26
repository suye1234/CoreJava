package org.suye.corejava.factory.abst;

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

        Computer intelComputer = new Computer(intelFactory);

        intelComputer.installCompute();
        intelComputer.work();

        Assert.assertEquals(755, intelComputer.getCpu().getPins());
        Assert.assertEquals(755,intelComputer.getMainboard().getCpuHoles());
    }

    @Test
    public void testInstallAmdComputer(){
        AbstractComputerFactory amdFactory = new AmdFactory();

        Computer intelComputer = new Computer(amdFactory);

        intelComputer.installCompute();
        intelComputer.work();

        Assert.assertEquals(938, intelComputer.getCpu().getPins());
        Assert.assertEquals(938,intelComputer.getMainboard().getCpuHoles());
    }
}
