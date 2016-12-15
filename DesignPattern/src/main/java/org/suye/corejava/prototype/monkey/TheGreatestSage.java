package org.suye.corejava.prototype.monkey;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/15.
 */
public class TheGreatestSage {
    // 孙悟空本体
    private Monkey monkey = new Monkey();

    public TheGreatestSage(Monkey monkey) {
        this.monkey = monkey;
    }

    /**
     * 变出分身
     */
    public void change(){
        Monkey copyMonkey = (Monkey)monkey.clone();
        System.out.println("大圣本尊的生日是：" + monkey.getBirthday());
        System.out.println("克隆的大圣的生日是：" + monkey.getBirthday());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getGoldRingStaff() == copyMonkey.getGoldRingStaff()));
    }

    /**
     * 变出分身
     */
    public void deepChange()throws IOException, ClassNotFoundException{
        Monkey copyMonkey = (Monkey)monkey.deepClone();
        System.out.println("大圣本尊的生日是：" + monkey.getBirthday());
        System.out.println("克隆的大圣的生日是：" + monkey.getBirthday());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getGoldRingStaff() == copyMonkey.getGoldRingStaff()));
    }
}
