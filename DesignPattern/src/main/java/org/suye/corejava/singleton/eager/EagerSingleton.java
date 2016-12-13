package org.suye.corejava.singleton.eager;

/**
 * 饿汉式单例模式，空间换时间.
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
