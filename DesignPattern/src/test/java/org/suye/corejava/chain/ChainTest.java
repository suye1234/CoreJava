package org.suye.corejava.chain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by suye on 2018/3/28.
 */
public class ChainTest {
    @Test
    public void testReimbursement(){
        //先要组装责任链
        ReimbursementHandler h1 = new GeneralManagerHandler();
        ReimbursementHandler h2 = new DepartmentManagerHandler();
        ReimbursementHandler h3 = new ProjectManagerHandler();
        h2.setLastHandler(h1);
        h3.setLastHandler(h2);

        //开始测试
        String test1 = h3.handleReimbursementRequest("张三", 300d);
        System.out.println("test1 = " + test1);
        String test2 = h3.handleReimbursementRequest("李四", 300d);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");

        String test3 = h3.handleReimbursementRequest("张三", 700d);
        System.out.println("test3 = " + test3);
        String test4 = h3.handleReimbursementRequest("李四", 700d);
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");

        String test5 = h3.handleReimbursementRequest("张三", 1500d);
        System.out.println("test5 = " + test5);
        String test6 = h3.handleReimbursementRequest("李四", 1500d);
        System.out.println("test6 = " + test6);

        Assert.assertTrue(true);
    }
}
