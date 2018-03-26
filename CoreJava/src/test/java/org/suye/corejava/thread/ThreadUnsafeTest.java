package org.suye.corejava.thread;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by suye on 2017/2/16.
 */
public class ThreadUnsafeTest {

    @Test
    public void testThreadUnsafeIdGenerator() {
        final ThreadUnsafeIdGenerator idGeneratorThreadUnsafe = new ThreadUnsafeIdGenerator();

        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1; j++) {
                        System.out.println(idGeneratorThreadUnsafe.getNext());
                    }
                }
            }).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current ID is : " + idGeneratorThreadUnsafe.getValue());

        Assert.assertTrue(true);
    }

    @Test
    public void testSynchronizedIdGenerator() {
        final SynchronizedIdGenerator synchronizedIdGenerator = new SynchronizedIdGenerator();

        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1; j++) {
                        System.out.println(synchronizedIdGenerator.getNext1());
                    }
                }
            }).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current ID is : " + synchronizedIdGenerator.getValue());

        Assert.assertTrue(true);
    }

    @Test
    public void testAtomicIdGenerator() {
        final AtomicIdGenerator atomicIdGenerator = new AtomicIdGenerator();

        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1; j++) {
                        System.out.println(atomicIdGenerator.getNext());
                    }
                }
            }).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current ID is : " + atomicIdGenerator.getValue());

        Assert.assertTrue(true);
    }


    @Test
    public void testLockIdGenerator() {
        final LockIdGenerator lockIdGenerator = new LockIdGenerator();

        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1; j++) {
                        System.out.println(lockIdGenerator.getNext());
                    }
                }
            }).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current ID is : " + lockIdGenerator.getValue());

        Assert.assertTrue(true);
    }

    @Test
    public void testThreadLocalIdGenerator() {
        final ThreadLocalIdGenerator threadLocalIdGenerator = new ThreadLocalIdGenerator();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        System.out.println(Thread.currentThread().getName() + " id = " + threadLocalIdGenerator.getNext());
                        System.out.println(Thread.currentThread().getName() + " id = " + threadLocalIdGenerator.getNext());
                    }
                }
            }).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current ID is : " + threadLocalIdGenerator.getValue());

        Assert.assertTrue(true);
    }


    @Test
    public void testThreadLocalIdGenerator2() {
        final ThreadLocalIdGenerator2 threadLocalIdGenerator = new ThreadLocalIdGenerator2();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        System.out.println(Thread.currentThread().getName() + " id = " + threadLocalIdGenerator.getNext());
                        System.out.println(Thread.currentThread().getName() + " id = " + threadLocalIdGenerator.getNext());
                    }
                }
            }).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current ID is : " + threadLocalIdGenerator.getValue());

        Assert.assertTrue(true);
    }
}
