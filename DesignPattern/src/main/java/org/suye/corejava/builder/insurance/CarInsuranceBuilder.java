package org.suye.corejava.builder.insurance;

import org.suye.corejava.builder.insurance.base.InsuranceBuilder;

/**
 * Created by suye on 2018/3/26.
 */
public class CarInsuranceBuilder extends InsuranceBuilder {
    public CarInsuranceBuilder() {
        super.insuranceContract = new CarInsuranceContract();
    }

    @Override
    public void setOtherData(String otherData) {
        ((CarInsuranceContract) super.insuranceContract).setCarType(otherData);
    }
}
