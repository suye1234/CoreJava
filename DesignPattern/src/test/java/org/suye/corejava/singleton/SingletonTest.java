package org.suye.corejava.singleton;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.singleton.eager.EagerSingleton;
import org.suye.corejava.singleton.enumeration.EnumSingleton;
import org.suye.corejava.singleton.innerclass.InnerClassLazySingleton;
import org.suye.corejava.singleton.lazy.LazySingleton;
import org.suye.corejava.singleton.lock.DoubleCheckLockSingleton;

/**
 * Created by Administrator on 2016/12/13.
 */
public class SingletonTest {

    @Test
    public void testEagerSingleton() {
        EagerSingleton instance1 = EagerSingleton.getInstance();

        EagerSingleton instance2 = EagerSingleton.getInstance();

        Assert.assertTrue(instance1 == instance2);
    }


    @Test
    public void testLazySingleton() {
        LazySingleton instance1 = LazySingleton.getInstance();

        LazySingleton instance2 = LazySingleton.getInstance();

        Assert.assertTrue(instance1 == instance2);
    }


    @Test
    public void testDoubleCheckLockSingleton() {
        DoubleCheckLockSingleton instance1 = DoubleCheckLockSingleton.getInstance();

        DoubleCheckLockSingleton instance2 = DoubleCheckLockSingleton.getInstance();

        Assert.assertTrue(instance1 == instance2);
    }

    @Test
    public void testInnerClassLazySingleton() {
        InnerClassLazySingleton instance1 = InnerClassLazySingleton.getInstance();

        InnerClassLazySingleton instance2 = InnerClassLazySingleton.getInstance();

        Assert.assertTrue(instance1 == instance2);
    }

    @Test
    public void testEnumSingleton() {
        EnumSingleton instance1 = EnumSingleton.uniqueInstance;

        EnumSingleton instance2 = EnumSingleton.uniqueInstance;

        Assert.assertTrue(instance1 == instance2);
    }


}
