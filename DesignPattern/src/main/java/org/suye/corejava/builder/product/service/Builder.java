package org.suye.corejava.builder.product.service;

import org.suye.corejava.builder.product.Product;

/**
 * Created by Administrator on 2016/12/13.
 */
public interface Builder {

    void buildPart1();

    void buildPart2();

    Product retrieveResult();
}
