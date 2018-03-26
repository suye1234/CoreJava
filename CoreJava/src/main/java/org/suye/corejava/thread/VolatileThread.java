package org.suye.corejava.thread;

/**
 * Created by suye on 2017/2/16.
 */
public class VolatileThread {
    // done属性可以使用volatile关键字，因为此属性的改变不依赖于当前值
    private volatile boolean done;

    public void setDone(boolean done) {
        this.done = done;
    }

    public void work() {
        while (!done) {
            System.out.println("I am working.....");
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        VolatileThread volatileThread = new VolatileThread();

        new Thread(new Runnable() {
            @Override
            public void run() {
                volatileThread.work();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);

                    volatileThread.setDone(true);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }


}