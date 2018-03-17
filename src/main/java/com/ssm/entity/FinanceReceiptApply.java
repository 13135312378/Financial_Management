package com.ssm.entity;

import java.util.Date;

public class FinanceReceiptApply {

    //主键ID
    private Integer receiptApplyId;
    //对账单/运单
    private String waybillNo;
    //申请流水号
    private String serialNumber;
    //E卡通/会员号
    private String eCardNo;
    //发票号
    private String receiptNo;
    //发票登记人(发货客户）
    private String registerName;
    //登记人电话
    private String registerMobile;
    //纳税人识别号
    private String taxIdentificationNo;
    //开户行
    private Byte accountBank;
    //银行卡号
    private String bankCardNo;
    //地址
    private String address;
    //发票金额
    private String receiptAmt;
    //1:未开票 2:已申请 3:
    private Byte receiptStatus;
    //税率
    private Long taxRate;
    //税额
    private Long taxAmt;
    //不含税金额
    private Long noTaxAmt;
    //运单数
    private Long waybillTotal;
    //0：免税，1：不免税
    private Byte isDutyFree;
    //发票类型
    private Byte receiptType;
    //申请网点
    private String applyDept;
    //申请时间
    private Date applyTm;
    //申请人(网点操作人)
    private String applyEmp;
    //申请人名称
    private String applyName;
    //开票人(录单人)
    private String drawerEmp;
    //开票人名称
    private String drawerName;
    //公司code
    private String compCode;
    //组织类型:作业、财务结算、成员企业
    private String orgType;
    //创建人（主键+工号code）
    private String creater;
    //创建时间
    private Date createrTime;
    //修改人(主键+工号code)
    private String modifier;
    //修改时间
    private Date modifierTime;
    //是否删除 0未删除；1 已删除
    private Byte isDelete;
    //版本号
    private Date latestTime;

    private Long recordVersion;

    //set和get方法
    public Integer getReceiptApplyId() {
        return receiptApplyId;
    }

    public void setReceiptApplyId(Integer receiptApplyId) {
        this.receiptApplyId = receiptApplyId;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo == null ? null : waybillNo.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String geteCardNo() {
        return eCardNo;
    }

    public void seteCardNo(String eCardNo) {
        this.eCardNo = eCardNo == null ? null : eCardNo.trim();
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo == null ? null : receiptNo.trim();
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName == null ? null : registerName.trim();
    }

    public String getRegisterMobile() {
        return registerMobile;
    }

    public void setRegisterMobile(String registerMobile) {
        this.registerMobile = registerMobile == null ? null : registerMobile.trim();
    }

    public String getTaxIdentificationNo() {
        return taxIdentificationNo;
    }

    public void setTaxIdentificationNo(String taxIdentificationNo) {
        this.taxIdentificationNo = taxIdentificationNo == null ? null : taxIdentificationNo.trim();
    }

    public Byte getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(Byte accountBank) {
        this.accountBank = accountBank;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getReceiptAmt() {
        return receiptAmt;
    }

    public void setReceiptAmt(String receiptAmt) {
        this.receiptAmt = receiptAmt == null ? null : receiptAmt.trim();
    }

    public Byte getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(Byte receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    public Long getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Long taxRate) {
        this.taxRate = taxRate;
    }

    public Long getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(Long taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Long getNoTaxAmt() {
        return noTaxAmt;
    }

    public void setNoTaxAmt(Long noTaxAmt) {
        this.noTaxAmt = noTaxAmt;
    }

    public Long getWaybillTotal() {
        return waybillTotal;
    }

    public void setWaybillTotal(Long waybillTotal) {
        this.waybillTotal = waybillTotal;
    }

    public Byte getIsDutyFree() {
        return isDutyFree;
    }

    public void setIsDutyFree(Byte isDutyFree) {
        this.isDutyFree = isDutyFree;
    }

    public Byte getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(Byte receiptType) {
        this.receiptType = receiptType;
    }

    public String getApplyDept() {
        return applyDept;
    }

    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept == null ? null : applyDept.trim();
    }

    public Date getApplyTm() {
        return applyTm;
    }

    public void setApplyTm(Date applyTm) {
        this.applyTm = applyTm;
    }

    public String getApplyEmp() {
        return applyEmp;
    }

    public void setApplyEmp(String applyEmp) {
        this.applyEmp = applyEmp == null ? null : applyEmp.trim();
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName == null ? null : applyName.trim();
    }

    public String getDrawerEmp() {
        return drawerEmp;
    }

    public void setDrawerEmp(String drawerEmp) {
        this.drawerEmp = drawerEmp == null ? null : drawerEmp.trim();
    }

    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String drawerName) {
        this.drawerName = drawerName == null ? null : drawerName.trim();
    }

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode == null ? null : compCode.trim();
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifierTime() {
        return modifierTime;
    }

    public void setModifierTime(Date modifierTime) {
        this.modifierTime = modifierTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(Date latestTime) {
        this.latestTime = latestTime;
    }

    public Long getRecordVersion() {
        return recordVersion;
    }

    public void setRecordVersion(Long recordVersion) {
        this.recordVersion = recordVersion;
    }
}