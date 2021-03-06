package org.suye.corejava.thread.blockingqueue;

import java.util.UUID;

/**
 * Created by suye on 2017/3/10.
 */
public class Task {
    private String id;  // 任务的编号

    public Task() {
        id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Task[" + id + "]";
    }
}
