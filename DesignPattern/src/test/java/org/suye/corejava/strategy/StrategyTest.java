package org.suye.corejava.strategy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by suye on 2017/1/20.
 */
public class StrategyTest {
    @Test
    public void testMemberStrategy(){
        // 根据会员策略，动态计算报价
        Price price = new Price(new IntermediateMemberStrategy());

        double amount = 100;

        System.out.println(price.quote(amount));

        Assert.assertEquals(80.0d, price.quote(amount),0);
    }
}
