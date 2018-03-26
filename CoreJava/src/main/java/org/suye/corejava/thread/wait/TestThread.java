package org.suye.corejava.thread.wait;

import java.util.AbstractSequentialList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by suye on 2017/3/19.
 */
public class TestThread implements Runnable {

    private Wait wait;

    public TestThread(Wait wait){
        this.wait = wait;
    }
    public void run() {

        wait.doSomthing();
    }

    public static void main(String [] args){
        Wait wait = new Wait(4,"DAVID");
        Thread  t1 = new Thread(new TestThread(wait));
        Thread  t2 = new Thread(new TestThread(wait));
        Thread  t3 = new Thread(new TestThread(wait));
        Thread  t4 = new Thread(new TestThread(wait));
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }

}