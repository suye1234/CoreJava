package org.suye.corejava.observer;

/**
 * Created by suye on 2018/3/28.
 */
public class ConcreteListener implements Listener {
    private String observerState;

    @Override
    public void onSubjectChanged(Subject subject) {
        observerState = subject.getState();

        System.out.println("观察者状态更新为：" + observerState);
    }
}
