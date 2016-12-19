package org.suye.corejava.builder.kfc;

import org.suye.corejava.builder.kfc.service.KidsMealBuilder;

/**
 * Created by Administrator on 2016/12/19.
 */
public class KidsMealBuilderB extends KidsMealBuilder {
    @Override
    public void buildMainItem() {
        kidsMeal.setMainItem("steak");
    }

    @Override
    public void buildSideItem() {
        kidsMeal.setSideItem("salad");
    }

    @Override
    public void buildDrink() {
        kidsMeal.setDrink("sprite");
    }
}
