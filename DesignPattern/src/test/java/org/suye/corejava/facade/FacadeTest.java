package org.suye.corejava.facade;

import org.junit.Assert;
import org.junit.Test;

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
}
