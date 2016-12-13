package org.suye.corejava.singleton.innerclass;

/**
 * Created by Administrator on 2016/12/13.
 */
public class InnerClassLazySingleton {
    private InnerClassLazySingleton() {
    }

    private static class InnerClassLazySingletonHolder {

        // 静态初始化器，由JVM来保证线程安全
        private static InnerClassLazySingleton instance = new InnerClassLazySingleton();

    }

    public static InnerClassLazySingleton getInstance() {
        return InnerClassLazySingletonHolder.instance;
    }


}
