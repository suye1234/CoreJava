package org.suye.corejava.facade;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.facade.computer.Computer;
import org.suye.corejava.facade.computer.Cpu;
import org.suye.corejava.facade.computer.Disk;
import org.suye.corejava.facade.computer.Memory;
import org.suye.corejava.facade.order.BillService;
import org.suye.corejava.facade.order.CustomerService;
import org.suye.corejava.facade.order.OrderService;
import org.suye.corejava.facade.order.ShipService;

/**
 * Created by suye on 2016/12/26.
 */
public class FacadeTest {

    @Test
    public void testBuyGoods(){
        CustomerService customerService = new CustomerService(new OrderService(), new BillService(), new ShipService());

        customerService.buyGoods();

        Assert.assertTrue(true);
    }

    @Test
    public void testStartComputer(){
        Computer computer = new Computer(new Cpu(), new Memory(), new Disk());

        computer.startup();

        computer.shutdown();

        Assert.assertTrue(true);
    }
}
