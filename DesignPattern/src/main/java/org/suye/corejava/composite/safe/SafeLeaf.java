package org.suye.corejava.composite.safe;

import org.suye.corejava.composite.safe.service.SafeComponent;

/**
 * Created by Administrator on 2016/12/15.
 */
public class SafeLeaf implements SafeComponent {
    private String name;

    public SafeLeaf(String name) {
        this.name = name;
    }

    public void printStructure(String preStr) {
        System.out.println(preStr + " Leaf is " + name );
    }
}
