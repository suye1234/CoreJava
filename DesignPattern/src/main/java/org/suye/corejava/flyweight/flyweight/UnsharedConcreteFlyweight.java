package org.suye.corejava.flyweight.flyweight;

import org.suye.corejava.flyweight.flyweight.service.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/21.
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public void addFlyWeight(String key, Flyweight flyweight){

        flyweightMap.put(key, flyweight);
    }


    @Override
    public void print(String extrinsicState) {
        Flyweight flyweight = null;

        for(String key : flyweightMap.keySet()){
            flyweight = flyweightMap.get(key);

            flyweight.print(extrinsicState);
        }

    }
}
