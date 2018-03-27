package org.suye.corejava.template;

import org.suye.corejava.template.base.Worker;

/**
 * Created by suye on 2017/1/20.
 */
public class Postman extends Worker{
    @Override
    protected void doWork() {
        System.out.println("Post marvel is working");
    }

    @Override
    protected void gotoWork() {
        System.out.println("Go to doWork by bike");
    }

    @Override
    protected void returnToHome() {
        System.out.println("Return to home by bike");
    }
}
