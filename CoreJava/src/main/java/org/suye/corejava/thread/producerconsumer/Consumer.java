package org.suye.corejava.thread.producerconsumer;

/**
 * Created by suye on 2017/2/17.
 */
public class Consumer implements Runnable {
    private Resource resource;

    public Consumer(Resource resource) {
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
            resource.create();
        }

    }
}
