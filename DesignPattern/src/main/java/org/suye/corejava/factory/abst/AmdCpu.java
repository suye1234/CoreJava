package org.suye.corejava.factory.abst;

import org.suye.corejava.factory.abst.service.Cpu;

/**
 * Created by Administrator on 2016/12/12.
 */
public class AmdCpu implements Cpu {

    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU的针脚数：" + pins);
    }

    @Override
    public int getPins() {
        return pins;
    }
}
