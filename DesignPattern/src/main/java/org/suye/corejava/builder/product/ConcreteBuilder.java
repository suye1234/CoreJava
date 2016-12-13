package org.suye.corejava.builder.product;

import org.suye.corejava.builder.product.service.Builder;

/**
 * Created by Administrator on 2016/12/13.
 */
public class ConcreteBuilder implements Builder {
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPart1() {
        product.setPart1("No: 9527");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Name: XYZ");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
