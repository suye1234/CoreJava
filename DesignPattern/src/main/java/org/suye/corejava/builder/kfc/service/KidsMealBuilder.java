package org.suye.corejava.builder.kfc.service;

/**
 * Created by Administrator on 2016/12/19.
 */
public abstract class KidsMealBuilder {
    protected KidsMeal kidsMeal;

    public KidsMealBuilder() {
        this.kidsMeal = new KidsMeal();
    }

    public abstract void buildMainItem();

    public abstract  void buildSideItem();

    public abstract void buildDrink();

    public void buildToy(){
        this.kidsMeal.setToy("Transformer");
    }

    public KidsMeal getKidsMeal() {
        return kidsMeal;
    }
}
