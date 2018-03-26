package org.suye.corejava.thread.wait;

/**
 * Created by suye on 2017/3/19.
 */
public class Wait {
    private int counter = 0;
    private String name = null;

    public Wait(int counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    public synchronized void doSomthing() {
        int tempCounter = --counter;
        if (tempCounter <= 0) {
            customizedNotifyAll();
        } else {
            while (tempCounter > 0) {
                try {
                    System.out.println(Thread.currentThread().getName() + "-<" + name + tempCounter + ">" + "will invoke WAIT()");
                    --tempCounter;
                    wait();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                    notifyAll();
                }
                System.out.println(Thread.currentThread().getName() + "-<" + name + tempCounter + ">" + "has been ACTIVED");
            }
            customizedNotifyAll();

        }

    }

    public void customizedNotifyAll() {
        notifyAll();
        System.out.println(Thread.currentThread().getName() + "-<" + name + counter + ">" + "::" + "INVOKED NOTIFYALL() AND FINISHED");
    }
}
