package org.suye.corejava.prototype.simple;

import org.suye.corejava.prototype.simple.service.SimplePrototype;

/**
 * Created by Administrator on 2016/12/14.
 */
public class SimpleClient {
    private SimplePrototype prototype;


    public SimpleClient(SimplePrototype prototype) {
        this.prototype = prototype;
    }

    public void operate(){
        SimplePrototype newPrototype = prototype.clone();
    }

}
