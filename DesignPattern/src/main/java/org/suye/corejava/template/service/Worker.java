package org.suye.corejava.template.service;

/**
 * Created by suye on 2017/1/20.
 */
public abstract  class Worker {

    /**
     * 模板方法，定义总算法
     */
    public void dailyRoutine(){
        // 具体方法由模板类实现
        getUp();

        eatBreakfast();

        // 钩子方法，只提供默认实现，子类可以替换
        gotoWork();

        // 抽象方法由子类实现
        doWork();

        returnToHome();

        relax();

        sleep();
    }


    private void getUp(){
        System.out.println("Worker gets up.......");
    }


    private void eatBreakfast(){
        System.out.println("Worker eatBreakfast.......");

    }

    protected void gotoWork(){
        System.out.println("Walk to doWork...... ");
    }

    protected abstract void doWork();


    protected void returnToHome(){
        System.out.println("Walk to home...... ");
    }

    protected void relax(){
        System.out.println("Listen to music........");
    }

    private void sleep(){
        System.out.println("Worker go to bed..........");

    }


}
