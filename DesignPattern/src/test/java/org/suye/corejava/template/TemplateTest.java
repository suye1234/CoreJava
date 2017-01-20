package org.suye.corejava.template;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.template.service.Worker;

/**
 * Created by suye on 2017/1/20.
 */
public class TemplateTest {
    @Test
    public void testWorker(){
        Worker worker = new Postman();

        worker.dailyRoutine();

        worker = new Manager();

        worker.dailyRoutine();

        worker = new FireFighter();

        worker.dailyRoutine();

        Assert.assertTrue(true);

    }
}
