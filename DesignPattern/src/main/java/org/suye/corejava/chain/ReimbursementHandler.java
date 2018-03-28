package org.suye.corejava.chain;

/**
 * Created by suye on 2018/3/28.
 */
public abstract class ReimbursementHandler {
    protected ReimbursementHandler lastHandler;

    public ReimbursementHandler getLastHandler(){
        return lastHandler;
    }

    public void setLastHandler(ReimbursementHandler lastHandler){
        this.lastHandler = lastHandler;
    }

    public abstract String handleReimbursementRequest(String user, Double fee);

}
