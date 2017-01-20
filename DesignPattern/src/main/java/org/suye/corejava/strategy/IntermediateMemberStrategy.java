package org.suye.corejava.strategy;

import org.suye.corejava.strategy.service.MemberStrategy;

/**
 * Created by suye on 2017/1/20.
 */
public class IntermediateMemberStrategy implements MemberStrategy{
    @Override
    public double calcPrice(double amount) {
        return amount * 0.8;
    }
}
