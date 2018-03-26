package org.suye.corejava.builder;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.builder.insurance.CarInsuranceContract;
import org.suye.corejava.builder.insurance.base.InsuranceBuilder;
import org.suye.corejava.builder.insurance.InsuranceSalesMan;
import org.suye.corejava.builder.kfc.KfcCashier;
import org.suye.corejava.builder.kfc.KidsMealBuilderB;
import org.suye.corejava.builder.kfc.service.KidsMeal;
import org.suye.corejava.builder.message.GoodbyeMessageBuilder;
import org.suye.corejava.builder.message.MessageDirector;
import org.suye.corejava.builder.message.WelcomeMessageBuilder;
import org.suye.corejava.builder.message.service.MessageBuilder;
import org.suye.corejava.builder.product.ConcreteBuilder;
import org.suye.corejava.builder.product.ProductDirector;
import org.suye.corejava.builder.product.Product;
import org.suye.corejava.builder.product.service.Builder;

/**
 * Created by Administrator on 2016/12/13.
 */
public class BuilderTest {

    @Test
    public void testConstructProduct(){
        Builder builder = new ConcreteBuilder();
        ProductDirector director = new ProductDirector(builder);

        director.construct();

        Product product = builder.retrieveResult();

        System.out.println(product.getPart1());
        System.out.println(product.getPart2());

        Assert.assertTrue(true);
    }

    @Test
    public void testSendWelcomeMessage(){
        MessageBuilder welcomeBuilder = new WelcomeMessageBuilder();

        MessageDirector director = new MessageDirector(welcomeBuilder);

        director.construct("zhangsan@sina.com.cn", "lisi@sina.com.cn");

        Assert.assertTrue(true);
    }


    @Test
    public void testSendGoodbyeMessage(){
        MessageBuilder goodbyeBuilder = new GoodbyeMessageBuilder();

        MessageDirector director = new MessageDirector(goodbyeBuilder);

        director.construct("wangwu@sina.com.cn", "qianliu@sina.com.cn");

        Assert.assertTrue(true);
    }

    @Test
    public void testCreateInsurance(){
        InsuranceSalesMan insuranceSalesMan = new InsuranceSalesMan();

        insuranceSalesMan.contract();
    }

    @Test
    public void testOrderKidsMeal(){
        KidsMeal kidsMeal = new KfcCashier(new KidsMealBuilderB()).orderKidsMeal();

        System.out.println(kidsMeal.toString());

        Assert.assertTrue(true);
    }

}
