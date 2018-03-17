package com.ssm.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Finance_rpt_cashier_recordb {
    //记账出纳表
    private int cashier_record_id;//记账ID
    private int balofpay_type;//资金方向（收入：1;支出 ：2）
    private double fee_amt;//金额
    private String waybill_no;//运单号
    private Date reg_dt ;//登记日期
    private String business_fee_type_code;//费用类型
    private String remark;//备注
    private String verification_direction_code;//核销去向代码
    private String certificate_no;//凭证号
    private String certificate_type_code;//凭证号类别
    private String certificate_type_name;//凭证号类别名称
    private String financial_subjet_level1_code;//一级科目编码
    private String financial_subjet_level2_code;//二级科目编码
    private String financial_subjet_level3_code;//三级科目编码
    private String financial_subjet_level4_code;//四级科目编码
    private String receipt_no;//收据号码
    private String invoice_no;//发票号码
    private String check_no;//支票号码
    private String verification_note;//核销备注
    private String verification_direction_name;//核销去向名称
    private String cashier_auditor_code;//出纳核销人编码
    private String cashier_audit_dt;//出纳核销日期
    private String cashier_audit_state;//出纳核销状态
    private String certificate_auditor_code;//凭证审核人编码
    private Date certificate_audit_dt;//凭证审核日期
    private int certificate_audit_state;//凭证审核状态
    private String cashier_auditor_name;//出纳核销人名称
    private String certificate_auditor_name;//凭证审核人名称
    private String verification_person_name;//核销人名称
    private int actual_fee_ammout;//实际费用，核销时录入
    private int actual_deliver_fee;//实际派送费
    private String verification_comp_code;//核销人所属公司
    private Date abnormal_submit_tm;//提交日期
    private String abnormal_submit_dept_code;//提交网点
    private String verify_dept_area_code;//核销网点区域Code
    private String cashier_dept_area_code;//出纳核销网点区域Code
    private String certificate_dept_area_code;//凭证核销网点区域Code
    private Date charge_off_tm;//出账日期
    private String comp_code;//公司code
    private String org_type;//织类型:作业、财务结算、成员企业
    private String creater;//创建人（主键+工号code）
    private Date creater_time;//创建时间
    private String modifier;//修改人（主键+工号code）
    private Date modifier_time;//修改时间
    private int is_delete;//是否删除 0未删除；1 已删除  默认 0
    private Timestamp latest_time;//imestamp(3) not null default current_timestamp(3) on update   自动更新
    private int record_version;//版本号


    public Finance_rpt_cashier_recordb() {
    }

    public int getCashier_record_id() {
        return cashier_record_id;
    }

    public void setCashier_record_id(int cashier_record_id) {
        this.cashier_record_id = cashier_record_id;
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

    public String getWaybill_no() {
        return waybill_no;
    }

    public void setWaybill_no(String waybill_no) {
        this.waybill_no = waybill_no;
    }

    public Date getReg_dt() {
        return reg_dt;
    }

    public void setReg_dt(Date reg_dt) {
        this.reg_dt = reg_dt;
    }

    public String getBusiness_fee_type_code() {
        return business_fee_type_code;
    }

    public void setBusiness_fee_type_code(String business_fee_type_code) {
        this.business_fee_type_code = business_fee_type_code;
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

    public String getCertificate_no() {
        return certificate_no;
    }

    public void setCertificate_no(String certificate_no) {
        this.certificate_no = certificate_no;
    }

    public String getCertificate_type_code() {
        return certificate_type_code;
    }

    public void setCertificate_type_code(String certificate_type_code) {
        this.certificate_type_code = certificate_type_code;
    }

    public String getCertificate_type_name() {
        return certificate_type_name;
    }

    public void setCertificate_type_name(String certificate_type_name) {
        this.certificate_type_name = certificate_type_name;
    }

    public String getFinancial_subjet_level1_code() {
        return financial_subjet_level1_code;
    }

    public void setFinancial_subjet_level1_code(String financial_subjet_level1_code) {
        this.financial_subjet_level1_code = financial_subjet_level1_code;
    }

    public String getFinancial_subjet_level2_code() {
        return financial_subjet_level2_code;
    }

    public void setFinancial_subjet_level2_code(String financial_subjet_level2_code) {
        this.financial_subjet_level2_code = financial_subjet_level2_code;
    }

    public String getFinancial_subjet_level3_code() {
        return financial_subjet_level3_code;
    }

    public void setFinancial_subjet_level3_code(String financial_subjet_level3_code) {
        this.financial_subjet_level3_code = financial_subjet_level3_code;
    }

    public String getFinancial_subjet_level4_code() {
        return financial_subjet_level4_code;
    }

    public void setFinancial_subjet_level4_code(String financial_subjet_level4_code) {
        this.financial_subjet_level4_code = financial_subjet_level4_code;
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

    public String getVerification_note() {
        return verification_note;
    }

    public void setVerification_note(String verification_note) {
        this.verification_note = verification_note;
    }

    public String getVerification_direction_name() {
        return verification_direction_name;
    }

    public void setVerification_direction_name(String verification_direction_name) {
        this.verification_direction_name = verification_direction_name;
    }

    public String getCashier_auditor_code() {
        return cashier_auditor_code;
    }

    public void setCashier_auditor_code(String cashier_auditor_code) {
        this.cashier_auditor_code = cashier_auditor_code;
    }

    public String getCashier_audit_dt() {
        return cashier_audit_dt;
    }

    public void setCashier_audit_dt(String cashier_audit_dt) {
        this.cashier_audit_dt = cashier_audit_dt;
    }

    public String getCashier_audit_state() {
        return cashier_audit_state;
    }

    public void setCashier_audit_state(String cashier_audit_state) {
        this.cashier_audit_state = cashier_audit_state;
    }

    public String getCertificate_auditor_code() {
        return certificate_auditor_code;
    }

    public void setCertificate_auditor_code(String certificate_auditor_code) {
        this.certificate_auditor_code = certificate_auditor_code;
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

    public String getCashier_auditor_name() {
        return cashier_auditor_name;
    }

    public void setCashier_auditor_name(String cashier_auditor_name) {
        this.cashier_auditor_name = cashier_auditor_name;
    }

    public String getCertificate_auditor_name() {
        return certificate_auditor_name;
    }

    public void setCertificate_auditor_name(String certificate_auditor_name) {
        this.certificate_auditor_name = certificate_auditor_name;
    }

    public String getVerification_person_name() {
        return verification_person_name;
    }

    public void setVerification_person_name(String verification_person_name) {
        this.verification_person_name = verification_person_name;
    }

    public int getActual_fee_ammout() {
        return actual_fee_ammout;
    }

    public void setActual_fee_ammout(int actual_fee_ammout) {
        this.actual_fee_ammout = actual_fee_ammout;
    }

    public int getActual_deliver_fee() {
        return actual_deliver_fee;
    }

    public void setActual_deliver_fee(int actual_deliver_fee) {
        this.actual_deliver_fee = actual_deliver_fee;
    }

    public String getVerification_comp_code() {
        return verification_comp_code;
    }

    public void setVerification_comp_code(String verification_comp_code) {
        this.verification_comp_code = verification_comp_code;
    }

    public Date getAbnormal_submit_tm() {
        return abnormal_submit_tm;
    }

    public void setAbnormal_submit_tm(Date abnormal_submit_tm) {
        this.abnormal_submit_tm = abnormal_submit_tm;
    }

    public String getAbnormal_submit_dept_code() {
        return abnormal_submit_dept_code;
    }

    public void setAbnormal_submit_dept_code(String abnormal_submit_dept_code) {
        this.abnormal_submit_dept_code = abnormal_submit_dept_code;
    }

    public String getVerify_dept_area_code() {
        return verify_dept_area_code;
    }

    public void setVerify_dept_area_code(String verify_dept_area_code) {
        this.verify_dept_area_code = verify_dept_area_code;
    }

    public String getCashier_dept_area_code() {
        return cashier_dept_area_code;
    }

    public void setCashier_dept_area_code(String cashier_dept_area_code) {
        this.cashier_dept_area_code = cashier_dept_area_code;
    }

    public String getCertificate_dept_area_code() {
        return certificate_dept_area_code;
    }

    public void setCertificate_dept_area_code(String certificate_dept_area_code) {
        this.certificate_dept_area_code = certificate_dept_area_code;
    }

    public Date getCharge_off_tm() {
        return charge_off_tm;
    }

    public void setCharge_off_tm(Date charge_off_tm) {
        this.charge_off_tm = charge_off_tm;
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

    public Date getCreater_time() {
        return creater_time;
    }

    public void setCreater_time(Date creater_time) {
        this.creater_time = creater_time;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifier_time() {
        return modifier_time;
    }

    public void setModifier_time(Date modifier_time) {
        this.modifier_time = modifier_time;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }

    public Timestamp getLatest_time() {
        return latest_time;
    }

    public void setLatest_time(Timestamp latest_time) {
        this.latest_time = latest_time;
    }

    public int getRecord_version() {
        return record_version;
    }

    public void setRecord_version(int record_version) {
        this.record_version = record_version;
    }
}
