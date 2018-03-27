package org.suye.corejava.template;

import org.suye.corejava.template.base.Worker;

/**
 * Created by suye on 2017/1/20.
 */
public class Manager extends Worker {
    @Override
    protected void doWork() {
        System.out.println("Manger is working");
    }

    @Override
    protected void gotoWork() {
        System.out.println("Drive to doWork");
    }

    @Override
    protected void relax() {
        System.out.println("Drink in bar");
    }
}
