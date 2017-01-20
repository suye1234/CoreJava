package org.suye.corejava.template;

import org.suye.corejava.template.service.Worker;

/**
 * Created by suye on 2017/1/20.
 */
public class FireFighter extends Worker{
    @Override
    protected void doWork() {
        System.out.println("FireFighter is working");
    }

    @Override
    protected void relax() {
        System.out.println("Relax in GYM");
    }
}
