package org.suye.corejava.builder.kfc;

import org.suye.corejava.builder.kfc.service.KidsMealBuilder;

/**
 * Created by Administrator on 2016/12/19.
 */
public class KidsMealBuilderA extends KidsMealBuilder {
    @Override
    public void buildMainItem() {
        kidsMeal.setMainItem("hamburger");
    }

    @Override
    public void buildSideItem() {
        kidsMeal.setSideItem("fries");
    }

    @Override
    public void buildDrink() {
        kidsMeal.setDrink("coke");
    }

}
