package com.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;

public class Finance_cas_pay_rec_details {
    //账单明细
    private int  pay_rec_detail_id;//表ID
  //  private int pay_receivable_id;//账单ID
  //  private String bill_no;//账单流水号
    private Date bill_dt;//账单日期
    private String dept_code;//账单部门
    private double fee_amt;//金额
    private String fee_type_code;//费用类型
    private String creater;//创建人

    private Timestamp creater_timee;//创建日期
    private String comp_code;//公司代码
    private String modifier_time;//修改人
    private  Date record_version;//修改日期
    private  String latest_time;

    //账单
     private  Finance_cas_payable_receivable Finance_cas_payable_receivable;

    public com.ssm.entity.Finance_cas_payable_receivable getFinance_cas_payable_receivable() {
        return Finance_cas_payable_receivable;
    }

    public void setFinance_cas_payable_receivable(com.ssm.entity.Finance_cas_payable_receivable finance_cas_payable_receivable) {
        Finance_cas_payable_receivable = finance_cas_payable_receivable;
    }

    public Finance_cas_pay_rec_details() {
    }

    public Finance_cas_pay_rec_details(int pay_rec_detail_id, Date bill_dt, String dept_code, double fee_amt, String fee_type_code, String creater, Timestamp creater_timee, String comp_code, String modifier_time, Date record_version, String latest_time) {
        this.pay_rec_detail_id = pay_rec_detail_id;
        this.bill_dt = bill_dt;
        this.dept_code = dept_code;
        this.fee_amt = fee_amt;
        this.fee_type_code = fee_type_code;
        this.creater = creater;
        this.creater_timee = creater_timee;
        this.comp_code = comp_code;
        this.modifier_time = modifier_time;
        this.record_version = record_version;
        this.latest_time = latest_time;
    }

    public int getPay_rec_detail_id() {
        return pay_rec_detail_id;
    }

    public void setPay_rec_detail_id(int pay_rec_detail_id) {
        this.pay_rec_detail_id = pay_rec_detail_id;
    }

    public Date getBill_dt() {
        return bill_dt;
    }

    public void setBill_dt(Date bill_dt) {
        this.bill_dt = bill_dt;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public double getFee_amt() {
        return fee_amt;
    }

    public void setFee_amt(double fee_amt) {
        this.fee_amt = fee_amt;
    }

    public String getFee_type_code() {
        return fee_type_code;
    }

    public void setFee_type_code(String fee_type_code) {
        this.fee_type_code = fee_type_code;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Timestamp getCreater_timee() {
        return creater_timee;
    }

    public void setCreater_timee(Timestamp creater_timee) {
        this.creater_timee = creater_timee;
    }

    public String getComp_code() {
        return comp_code;
    }

    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }

    public String getModifier_time() {
        return modifier_time;
    }

    public void setModifier_time(String modifier_time) {
        this.modifier_time = modifier_time;
    }

    public Date getRecord_version() {
        return record_version;
    }

    public void setRecord_version(Date record_version) {
        this.record_version = record_version;
    }

    public String getLatest_time() {
        return latest_time;
    }

    public void setLatest_time(String latest_time) {
        this.latest_time = latest_time;
    }
}
