package org.suye.corejava.facade;


/**
 * Created by suye on 2016/12/26.
 */
public class CustomerService {
    private OrderService orderService;

    private BillService billService;

    private ShipService shipService;


    public CustomerService(OrderService orderService, BillService billService, ShipService shipService) {
        this.orderService = orderService;
        this.billService = billService;
        this.shipService = shipService;
    }

    public void buyGoods() {
        orderService.createOrder();

        billService.payBill();

        shipService.shipGoods();

        System.out.println("Service finished.");

    }
}
