package org.suye.corejava.thread.account;

/**
 * Created by suye on 2017/3/10.
 */
public class SynchronizedAccount implements  AccountService{
    private double balance;     // 账户余额

    /**
     * 存款
     * @param money 存入金额
     */
    @Override
    public synchronized void deposit(double money) {
        double newBalance = balance + money;
        try {
            Thread.sleep(10);   // 模拟此业务需要一段处理时间
        }
        catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        balance = newBalance;
    }

    /**
     * 获得账户余额
     */
    @Override
    public double getBalance() {
        return balance;
    }
}