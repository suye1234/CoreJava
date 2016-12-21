package org.suye.corejava.flyweight.flyweight;

import org.suye.corejava.flyweight.flyweight.service.Flyweight;

/**
 * Created by Administrator on 2016/12/21.
 */
public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void print(String extrinsicState) {
        System.out.println("Intrinsic State is " + intrinsicState);
        System.out.println("Extrinsic State is " + extrinsicState);
    }
}
