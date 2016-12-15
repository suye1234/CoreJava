package org.suye.corejava.prototype.monkey;

import java.io.Serializable;

/**
 * 金箍棒.
 */
public class GoldRingStaff implements Serializable {
    private float height = 100.0f;

    private float diameter = 10.0f;

    /**
     * 变大
     */
    public void grow(){
        this.height *= 2;
        this.diameter *= 2;
    }

    /**
     * 变小
     */
    public void shrink(){
        this.height /= 2;
        this.diameter /= 2;
    }
}
