package org.suye.corejava.strategy;

import org.suye.corejava.strategy.service.MemberStrategy;

/**
 * Created by suye on 2017/1/20.
 */
public class Price {
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double quote(double amount){

        return memberStrategy.calcPrice(amount);
    }
}
