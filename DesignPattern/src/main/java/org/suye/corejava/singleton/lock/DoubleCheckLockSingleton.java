package org.suye.corejava.singleton.lock;

/**
 * 双重检查加锁实现单例，避免每次调用获取实例方法都判断同步问题.
 */
public class DoubleCheckLockSingleton {
    private volatile  static DoubleCheckLockSingleton instance = null;

    private DoubleCheckLockSingleton(){}

    public static DoubleCheckLockSingleton getInstance(){
        // 先检查实例是否存在，如果不存在才进入下面的同步快
        if(null != instance){
            // 同步块，线程安全的创建实例
            synchronized (DoubleCheckLockSingleton.class){
                // 再次检查实例是否存在，如果不存在才创建实例
                if(instance == null){
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }

        return instance;
    }
}
