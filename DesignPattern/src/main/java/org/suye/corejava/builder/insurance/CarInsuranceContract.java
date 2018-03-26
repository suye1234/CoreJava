package org.suye.corejava.builder.insurance;

import org.suye.corejava.builder.insurance.base.InsuranceContract;

/**
 * Created by Administrator on 2016/12/13.
 */
public class CarInsuranceContract extends InsuranceContract {
    private String carType;

    public String getCarType() {
        return carType;
    }

    public CarInsuranceContract() {
    }

    @Override
    public void print() {
        System.out.println("CarInsuranceContract{" +
                "contractId='" + contractId + '\'' +
                ", personName='" + personName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", carType='" + carType + '\'' +
                '}');
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
