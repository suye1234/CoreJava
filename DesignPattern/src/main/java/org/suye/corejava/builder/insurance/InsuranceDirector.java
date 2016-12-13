package org.suye.corejava.builder.insurance;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/13.
 */
public class InsuranceDirector {
    private InsuranceBuilder insuranceBuilder;

    public InsuranceDirector(InsuranceBuilder insuranceBuilder) {
        this.insuranceBuilder = insuranceBuilder;
    }

    public void construct(){
        insuranceBuilder.setContractId("201612131424");
        insuranceBuilder.setPersonName("Stephen");
        insuranceBuilder.setContractDate(new Date(), DateUtils.addDays(new Date(), 1));
        insuranceBuilder.getInsuranceContract().print();
    }
}
