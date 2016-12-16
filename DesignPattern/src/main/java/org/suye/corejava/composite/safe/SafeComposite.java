package org.suye.corejava.composite.safe;

import org.suye.corejava.composite.safe.service.SafeComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/15.
 */
public class SafeComposite implements SafeComponent {
    private String name;

    public SafeComposite(String name) {
        this.name = name;
    }

    private List<SafeComponent> childComponents = new ArrayList<SafeComponent>();

    /**
     * 输出对象的自身结构
     *
     * @param preStr 前缀，主要是按照层级拼接空格，实现向后缩进
     */
    @Override
    public void printStructure(String preStr) {
        // 先把自己输出
        System.out.println(preStr + " Composite is " + name);
        //如果还包含有子组件，那么就输出这些子组件对象
        if (this.childComponents != null) {
            //添加两个空格，表示向后缩进两个空格
            preStr += " ";
            //输出当前对象的子对象
            for (SafeComponent c : childComponents) {
                //递归输出每个子对象
                c.printStructure(preStr);
            }
        }
    }

    public void addChild(SafeComponent component) {
        childComponents.add(component);
    }

    public void removeChild(int index) {
        childComponents.remove(index);
    }

    public List<SafeComponent> getChildComponents() {
        return childComponents;
    }
}
