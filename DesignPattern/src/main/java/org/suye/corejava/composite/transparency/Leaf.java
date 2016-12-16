package org.suye.corejava.composite.transparency;

import org.suye.corejava.composite.transparency.service.Component;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Leaf extends Component{
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStructure(String preStr) {
        System.out.println(preStr + " Leaf is " + name );
    }
}
