package org.suye.corejava.thread;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by suye on 2017/2/20.
 */
public class ClassLoaderTest {
    @Test
    public void testClassLoader(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        // The current class loader is AppClassloader
        System.out.println("Current loader: " + classLoader);
        // The parent class loader is ExtClassloader
        System.out.println("Parent loader: " + classLoader.getParent());
        // The grand parent class loader is root class loader, but it can't be found in JAVA
        System.out.println("Grand parent loader: " + classLoader.getParent().getParent());

        Assert.assertTrue(true);
    }

}
