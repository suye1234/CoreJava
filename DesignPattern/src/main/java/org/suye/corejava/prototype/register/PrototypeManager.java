package org.suye.corejava.prototype.register;

import org.suye.corejava.prototype.register.service.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/14.
 */
public class PrototypeManager {
    private Map<String, Prototype> registerMap = new HashMap<String,Prototype>();

    public void addPrototype(String name,Prototype prototype){
        registerMap.put(name, prototype);
    }

    public Prototype getPrototype(String name){

        return registerMap.get(name);
    }

    public void removePrototype(String name){
        registerMap.remove(name);
    }

}
