package org.suye.corejava.thread.account;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by suye on 2017/3/10.
 */
public class LockAccount implements  AccountService{
    private Lock accountLock = new ReentrantLock();
    private double balance; // 账户余额

    /**
     * 存款
     *
     * @param money 存入金额
     */
    @Override
    public void deposit(double money) {
        accountLock.lock();
        try {
            double newBalance = balance + money;
            try {
                Thread.sleep(10); // 模拟此业务需要一段处理时间
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            balance = newBalance;
        } finally {
            accountLock.unlock();
        }
    }

    /**
     * 获得账户余额
     */
    @Override
    public double getBalance() {
        return balance;
    }

}