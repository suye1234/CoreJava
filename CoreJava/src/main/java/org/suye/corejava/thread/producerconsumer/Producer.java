package org.suye.corejava.thread.producerconsumer;

/**
 * Created by suye on 2017/2/17.
 * 生产者
 */

public class Producer implements Runnable {
    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.destroy();
        }

    }
}