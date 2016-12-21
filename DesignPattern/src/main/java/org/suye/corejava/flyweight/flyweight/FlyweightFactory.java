package org.suye.corejava.flyweight.flyweight;

import org.suye.corejava.flyweight.flyweight.service.Flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/21.
 */
public class FlyweightFactory {
    private static Map<String, Flyweight> flyweightMap = new HashMap<>();

    public static Flyweight getFlyWeight(List<String> intrinsicStates) {
        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();

        for (String intrinsicState : intrinsicStates) {
            unsharedConcreteFlyweight.addFlyWeight(intrinsicState, getFlyWeight(intrinsicState));
        }

        return unsharedConcreteFlyweight;
    }


    public static Flyweight getFlyWeight(String intrinsicState) {
        Flyweight flyweight = null;

        if (flyweightMap.containsKey(intrinsicState)) {
            flyweight = flyweightMap.get(intrinsicState);
        } else {
            flyweight = new ConcreteFlyweight(intrinsicState);
            flyweightMap.put(intrinsicState, flyweight);
        }

        return flyweight;
    }
}
