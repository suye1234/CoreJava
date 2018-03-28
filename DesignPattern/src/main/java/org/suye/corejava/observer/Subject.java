package org.suye.corejava.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suye on 2018/3/28.
 */
public abstract class Subject {
    protected String state;

    private List<Listener> listeners = new ArrayList<>();

    public void register(Listener listener) {
        listeners.add(listener);
        System.out.println("Attached a new listener....");
    }

    public void unregister(Listener listener) {
        listeners.remove(listener);
    }

    public void notifyObservers() {
        for (Listener listener : listeners) {
            listener.onSubjectChanged(this);
        }
    }

    public String getState() {
        return state;
    }
}
