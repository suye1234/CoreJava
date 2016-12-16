package org.suye.corejava.composite;

import org.junit.Test;
import org.suye.corejava.composite.safe.SafeComposite;
import org.suye.corejava.composite.safe.SafeLeaf;
import org.suye.corejava.composite.transparency.Composite;
import org.suye.corejava.composite.transparency.Leaf;
import org.suye.corejava.composite.transparency.service.Component;

/**
 * Created by Administrator on 2016/12/15.
 */
public class CompositeTest {
    @Test
    public void testSafeComposite() {
        SafeComposite root = new SafeComposite("服装");
        SafeComposite c1 = new SafeComposite("男装");
        SafeComposite c2 = new SafeComposite("女装");
        SafeLeaf leaf1 = new SafeLeaf("衬衫");

        SafeLeaf leaf2 = new SafeLeaf("夹克");
        SafeLeaf leaf3 = new SafeLeaf("裙子");
        SafeLeaf leaf4 = new SafeLeaf("套装");

        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);
        root.printStructure("");
    }


    @Test
    public void testTransparency() {
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");
        Component leaf1 = new Leaf("衬衫");

        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");

        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);
        root.printStructure("");
    }
}
