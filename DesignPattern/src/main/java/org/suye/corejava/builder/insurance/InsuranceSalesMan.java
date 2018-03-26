package org.suye.corejava.builder.insurance;

import org.apache.commons.lang3.time.DateUtils;
import org.suye.corejava.builder.insurance.base.InsuranceBuilder;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/13.
 */
public class InsuranceSalesMan {
    public void contract(){
        InsuranceBuilder insuranceBuilder = new CarInsuranceBuilder();

        insuranceBuilder.setContractId("201803261424");
        insuranceBuilder.setPersonName("Stephen");
        insuranceBuilder.setContractDate(new Date(), DateUtils.addDays(new Date(), 1));
        insuranceBuilder.setOtherData("BMW");
        insuranceBuilder.getInsuranceContract().print();
    }
}
