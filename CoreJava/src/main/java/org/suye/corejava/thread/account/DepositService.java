package org.suye.corejava.thread.account;

/**
 * Created by suye on 2017/3/10.
 */
public class DepositService implements Runnable {
    private AccountService account;    // 存入账户
    private double money;       // 存入金额

    public DepositService(AccountService account, double money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        account.deposit(money);
    }
}
