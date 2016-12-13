package org.suye.corejava.singleton.lazy;

/**
 * 懒汉式单例模式，时间换空间.
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(null != instance){
            instance = new LazySingleton();
        }

        return instance;
    }
}
