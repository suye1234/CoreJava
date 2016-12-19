package org.suye.corejava.builder.kfc.service;

/**
 * Created by Administrator on 2016/12/19.
 */
public class KidsMeal {
    private String mainItem;

    private String sideItem;

    private String drink;

    private String toy;

    public String getMainItem() {
        return mainItem;
    }

    public void setMainItem(String mainItem) {
        this.mainItem = mainItem;
    }

    public String getSideItem() {
        return sideItem;
    }

    public void setSideItem(String sideItem) {
        this.sideItem = sideItem;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "KidsMeal{" +
                "mainItem='" + mainItem + '\'' +
                ", sideItem='" + sideItem + '\'' +
                ", drink='" + drink + '\'' +
                ", toy='" + toy + '\'' +
                '}';
    }
}
