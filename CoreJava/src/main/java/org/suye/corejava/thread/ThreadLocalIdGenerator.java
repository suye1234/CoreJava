package org.suye.corejava.thread;

/**
 * Created by suye on 2017/2/16.
 */
public class ThreadLocalIdGenerator{
    private final ThreadLocal<ThreadUnsafeIdGenerator> idGenerator = ThreadLocal.withInitial(() -> {
        return new ThreadUnsafeIdGenerator();//IdGenerator 是个初始int value =0,然后getNext(){  return value++}
    });

    public  int getNext(){
        ThreadUnsafeIdGenerator threadUnsafeIdGenerator = idGenerator.get();

        int value = threadUnsafeIdGenerator.getNext();

        return value;
    }

    public  int getValue(){
        return idGenerator.get().getValue();
    }
}