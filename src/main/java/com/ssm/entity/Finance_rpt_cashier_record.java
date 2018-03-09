package com.ssm.entity;

import java.util.Date;

public class Finance_rpt_cashier_record {

    /**
     * 核销明细
     */

    private int  cashier_id;	//出纳记账ID

   //与核销明细产生一对一关系
    private  Finance_rpt_verify finance_rpt_verifys;

    public Finance_rpt_verify getFinance_rpt_verifys() {
        return finance_rpt_verifys;
    }

    public void setFinance_rpt_verifys(Finance_rpt_verify finance_rpt_verifys) {
        this.finance_rpt_verifys = finance_rpt_verifys;
    }

    private  int balofpay_type;	//资金方向（收入：1;支出 ：2）
    private  double fee_amt;	//费用
    private  String op_type_code;	//操作类型(1-运单,2-运输,3-外转,9-手工)
    private  String business_fee_type_code;	//费用类型
    private  String pro_type;	//问题类别
    private  String remark;	//备注
    private  String verification_direction_code;	//核销去向
    private  int verification_state;	//核销状态(1-未核销,2-已核销)
    private Date verification_tm;	//核销时间
    private  String verification_person_code;	//核销人Code
    private  String verification_note;	//核销备注
    private  String verification_dept_code;	//核销部门编码
    private  String verification_dept_name;	//核销部门名称
    private  String verification_person_name;	//核销人名称
    private  String verification_comp_code;	//核销人所属公司/核销网点
    private  int certificate_type_code; //凭证号类别
    private  String certificate_type_name;	//凭证号类别名称
    private  String certificate_audit_code;	//凭证审核人编码
    private  Date certificate_audit_dt;	//凭证审核日期
    private  int certificate_audit_state;	//凭证审核状态
    private  String certificate_audit_name;	//凭证审核人名称
    private  String certificate_audit_dept_code;	//凭证审核网点
    private  String certificate_audit_dept_name;	//凭证审核网点名称
    private  String certificate_dept_area_code;	//凭证核销网点区域Code
    private  String receipt_no; //收据号码
    private  String invoice_no;	//发票号码
    private  String check_no;	//支票号码
    private  String cashier_auditor_code;	//出纳核销人编码
    private  Date cashier_audit_d;	//出纳核销日期
    private  int cashier_audit_state; //	出纳核销状态
    private  String cashier_auditor_name;	//出纳核销人名称
    private  String cashier_auditor_dept_code;	//出纳核销部门编码
    private  String cashier_auditor_dept_name;	//出纳核销部门名称
    private  String cashier_dept_area_code;	//出纳核销网点区域Code
    private  double actual_fee_ammout;	//实际费用/金额，核销时录入
    private  double actual_deliver_fee;	//实际派送费

    private  Date charge_off_tm;	//出账日期

    private  String dept_area_code;	//网点所属区域Code
    private  String comp_code; //企业代码
    private  String org_type;	//组织类型:作业、财务结算、成员企业
    private  String creater;	//创建人（主键+工号code）
    private  String creater_time;	//创建时间
    private  String modifier;	//修改人（主键+工号code）
    private  String modifier_time;	//	修改时间
    private  double record_version;	//版本号


    public Finance_rpt_cashier_record() {
    }


    public int getCashier_id() {
        return cashier_id;
    }

    public void setCashier_id(int cashier_id) {
        this.cashier_id = cashier_id;
    }

    public int getBalofpay_type() {
        return balofpay_type;
    }

    public void setBalofpay_type(int balofpay_type) {
        this.balofpay_type = balofpay_type;
    }

    public double getFee_amt() {
        return fee_amt;
    }

    public void setFee_amt(double fee_amt) {
        this.fee_amt = fee_amt;
    }

    public String getOp_type_code() {
        return op_type_code;
    }

    public void setOp_type_code(String op_type_code) {
        this.op_type_code = op_type_code;
    }

    public String getBusiness_fee_type_code() {
        return business_fee_type_code;
    }

    public void setBusiness_fee_type_code(String business_fee_type_code) {
        this.business_fee_type_code = business_fee_type_code;
    }

    public String getPro_type() {
        return pro_type;
    }

    public void setPro_type(String pro_type) {
        this.pro_type = pro_type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getVerification_direction_code() {
        return verification_direction_code;
    }

    public void setVerification_direction_code(String verification_direction_code) {
        this.verification_direction_code = verification_direction_code;
    }

    public int getVerification_state() {
        return verification_state;
    }

    public void setVerification_state(int verification_state) {
        this.verification_state = verification_state;
    }

    public Date getVerification_tm() {
        return verification_tm;
    }

    public void setVerification_tm(Date verification_tm) {
        this.verification_tm = verification_tm;
    }

    public String getVerification_person_code() {
        return verification_person_code;
    }

    public void setVerification_person_code(String verification_person_code) {
        this.verification_person_code = verification_person_code;
    }

    public String getVerification_note() {
        return verification_note;
    }

    public void setVerification_note(String verification_note) {
        this.verification_note = verification_note;
    }

    public String getVerification_dept_code() {
        return verification_dept_code;
    }

    public void setVerification_dept_code(String verification_dept_code) {
        this.verification_dept_code = verification_dept_code;
    }

    public String getVerification_dept_name() {
        return verification_dept_name;
    }

    public void setVerification_dept_name(String verification_dept_name) {
        this.verification_dept_name = verification_dept_name;
    }

    public String getVerification_person_name() {
        return verification_person_name;
    }

    public void setVerification_person_name(String verification_person_name) {
        this.verification_person_name = verification_person_name;
    }

    public String getVerification_comp_code() {
        return verification_comp_code;
    }

    public void setVerification_comp_code(String verification_comp_code) {
        this.verification_comp_code = verification_comp_code;
    }

    public int getCertificate_type_code() {
        return certificate_type_code;
    }

    public void setCertificate_type_code(int certificate_type_code) {
        this.certificate_type_code = certificate_type_code;
    }

    public String getCertificate_type_name() {
        return certificate_type_name;
    }

    public void setCertificate_type_name(String certificate_type_name) {
        this.certificate_type_name = certificate_type_name;
    }

    public String getCertificate_audit_code() {
        return certificate_audit_code;
    }

    public void setCertificate_audit_code(String certificate_audit_code) {
        this.certificate_audit_code = certificate_audit_code;
    }

    public Date getCertificate_audit_dt() {
        return certificate_audit_dt;
    }

    public void setCertificate_audit_dt(Date certificate_audit_dt) {
        this.certificate_audit_dt = certificate_audit_dt;
    }

    public int getCertificate_audit_state() {
        return certificate_audit_state;
    }

    public void setCertificate_audit_state(int certificate_audit_state) {
        this.certificate_audit_state = certificate_audit_state;
    }

    public String getCertificate_audit_name() {
        return certificate_audit_name;
    }

    public void setCertificate_audit_name(String certificate_audit_name) {
        this.certificate_audit_name = certificate_audit_name;
    }

    public String getCertificate_audit_dept_code() {
        return certificate_audit_dept_code;
    }

    public void setCertificate_audit_dept_code(String certificate_audit_dept_code) {
        this.certificate_audit_dept_code = certificate_audit_dept_code;
    }

    public String getCertificate_audit_dept_name() {
        return certificate_audit_dept_name;
    }

    public void setCertificate_audit_dept_name(String certificate_audit_dept_name) {
        this.certificate_audit_dept_name = certificate_audit_dept_name;
    }

    public String getCertificate_dept_area_code() {
        return certificate_dept_area_code;
    }

    public void setCertificate_dept_area_code(String certificate_dept_area_code) {
        this.certificate_dept_area_code = certificate_dept_area_code;
    }

    public String getReceipt_no() {
        return receipt_no;
    }

    public void setReceipt_no(String receipt_no) {
        this.receipt_no = receipt_no;
    }

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public String getCheck_no() {
        return check_no;
    }

    public void setCheck_no(String check_no) {
        this.check_no = check_no;
    }

    public String getCashier_auditor_code() {
        return cashier_auditor_code;
    }

    public void setCashier_auditor_code(String cashier_auditor_code) {
        this.cashier_auditor_code = cashier_auditor_code;
    }

    public Date getCashier_audit_d() {
        return cashier_audit_d;
    }

    public void setCashier_audit_d(Date cashier_audit_d) {
        this.cashier_audit_d = cashier_audit_d;
    }

    public int getCashier_audit_state() {
        return cashier_audit_state;
    }

    public void setCashier_audit_state(int cashier_audit_state) {
        this.cashier_audit_state = cashier_audit_state;
    }

    public String getCashier_auditor_name() {
        return cashier_auditor_name;
    }

    public void setCashier_auditor_name(String cashier_auditor_name) {
        this.cashier_auditor_name = cashier_auditor_name;
    }

    public String getCashier_auditor_dept_code() {
        return cashier_auditor_dept_code;
    }

    public void setCashier_auditor_dept_code(String cashier_auditor_dept_code) {
        this.cashier_auditor_dept_code = cashier_auditor_dept_code;
    }

    public String getCashier_auditor_dept_name() {
        return cashier_auditor_dept_name;
    }

    public void setCashier_auditor_dept_name(String cashier_auditor_dept_name) {
        this.cashier_auditor_dept_name = cashier_auditor_dept_name;
    }

    public String getCashier_dept_area_code() {
        return cashier_dept_area_code;
    }

    public void setCashier_dept_area_code(String cashier_dept_area_code) {
        this.cashier_dept_area_code = cashier_dept_area_code;
    }

    public double getActual_fee_ammout() {
        return actual_fee_ammout;
    }

    public void setActual_fee_ammout(double actual_fee_ammout) {
        this.actual_fee_ammout = actual_fee_ammout;
    }

    public double getActual_deliver_fee() {
        return actual_deliver_fee;
    }

    public void setActual_deliver_fee(double actual_deliver_fee) {
        this.actual_deliver_fee = actual_deliver_fee;
    }

    public Date getCharge_off_tm() {
        return charge_off_tm;
    }

    public void setCharge_off_tm(Date charge_off_tm) {
        this.charge_off_tm = charge_off_tm;
    }

    public String getDept_area_code() {
        return dept_area_code;
    }

    public void setDept_area_code(String dept_area_code) {
        this.dept_area_code = dept_area_code;
    }

    public String getComp_code() {
        return comp_code;
    }

    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }

    public String getOrg_type() {
        return org_type;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getCreater_time() {
        return creater_time;
    }

    public void setCreater_time(String creater_time) {
        this.creater_time = creater_time;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifier_time() {
        return modifier_time;
    }

    public void setModifier_time(String modifier_time) {
        this.modifier_time = modifier_time;
    }

    public double getRecord_version() {
        return record_version;
    }

    public void setRecord_version(double record_version) {
        this.record_version = record_version;
    }
}
