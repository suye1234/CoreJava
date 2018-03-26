package org.suye.corejava.builder.insurance.base;

import java.util.Date;

/**
 * Created by suye on 2018/3/26.
 */
public abstract class InsuranceContract {
    //保险合同编号
    protected String contractId;
    /**
     * 被保险人员的名称，同一份保险合同，要么跟人员签订，要么跟公司签订
     * 也就是说，“被保险人员”和“被保险公司”这两个属性，不可能同时有值
     */
    protected String personName;
    //被保险公司的名称
    protected String companyName;
    //保险开始生效日期
    protected Date beginDate;
    //保险失效日期，一定会大于保险开始生效日期
    protected Date endDate;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public abstract void print();
}
