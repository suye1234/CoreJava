package org.suye.corejava.builder.insurance;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/13.
 */
public class InsuranceBuilder {
    private InsuranceContract insuranceContract;

    public InsuranceBuilder() {
        this.insuranceContract = new InsuranceContract();
    }

    public void setContractId(String contractId){
        if(StringUtils.isBlank(contractId)) throw new IllegalArgumentException("合同编号不能为空");

        insuranceContract.setContractId(contractId);
    }


    public void setPersonName(String personName){
        if(StringUtils.isNotBlank(insuranceContract.getCompanyName()))
            throw new IllegalArgumentException("一份保险合同不能同时与个人和公司签订");

        insuranceContract.setPersonName(personName);
    }

    public void setCompanyName(String companyName){
        if(StringUtils.isNotBlank(insuranceContract.getPersonName()))
            throw new IllegalArgumentException("一份保险合同不能同时与个人和公司签订");

        insuranceContract.setCompanyName(companyName);
    }

    public void setContractDate(Date startDate, Date endDate){
        if(null == startDate || null == endDate)  throw new IllegalArgumentException("一份保险合同必须有开始生效的日期和失效日期");

        if(endDate.before(startDate)) throw new IllegalArgumentException("一份保险合同的失效日期必须大于生效日期");

        insuranceContract.setBeginDate(startDate);
        insuranceContract.setEndDate(endDate);
    }


    public InsuranceContract getInsuranceContract(){
        return insuranceContract;
    }

}
