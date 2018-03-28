package org.suye.corejava.observer;

/**
 * Created by suye on 2018/3/28.
 */
public class ConcreteSubject extends Subject {
    public void change(String newState){
        state = newState;

        System.out.println("主题状态变更为:" + newState);
        // 通知观察者们
        super.notifyObservers();
    }
}
