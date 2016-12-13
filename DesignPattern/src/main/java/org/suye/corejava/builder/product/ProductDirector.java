package org.suye.corejava.builder.product;

import org.suye.corejava.builder.product.service.Builder;

/**
 * Created by Administrator on 2016/12/13.
 */
public class ProductDirector {
    private Builder builder;

    public ProductDirector(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
