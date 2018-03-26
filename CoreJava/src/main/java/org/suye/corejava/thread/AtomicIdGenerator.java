package org.suye.corejava.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by suye on 2017/2/16.
 */
public class AtomicIdGenerator{
    private final AtomicInteger counter = new AtomicInteger(0);

    public int getNext(){
        return counter.getAndIncrement();
    }

    public int getValue(){
        return counter.get();
    }

    // getAndIncrement方法的内部实现方式，这也是CAS方法的一般模式，CAS方法不一定成功，所以包装在一个无限循环中，直到成功
    public final int getAndIncrement(){
        for(;;){
            int current = counter.get();
            int next = current +1;
            if(counter.compareAndSet(current,next))
                return current;
        }
    }
}