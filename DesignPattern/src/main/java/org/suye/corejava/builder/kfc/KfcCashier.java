package org.suye.corejava.builder.kfc;

import org.suye.corejava.builder.kfc.service.KidsMeal;
import org.suye.corejava.builder.kfc.service.KidsMealBuilder;

/**
 * Created by Administrator on 2016/12/19.
 */
public class KfcCashier {
    private KidsMealBuilder kidsMealBuilder;

    public KfcCashier(KidsMealBuilder kidsMealBuilder) {
        this.kidsMealBuilder = kidsMealBuilder;
    }

    public KidsMeal orderKidsMeal(){
        kidsMealBuilder.buildMainItem();
        kidsMealBuilder.buildSideItem();
        kidsMealBuilder.buildDrink();
        kidsMealBuilder.buildToy();

        return kidsMealBuilder.getKidsMeal();
    }
}
