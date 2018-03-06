package com.ssm.entity;

import java.util.Date;
import java.util.Set;

public class Finance_cas_payable_receivable {
    private int pay_receivable_id;//账单ID
    private  String bill_no;//账单流水号
    private Date bill_dt;//账单日期
    private String  dept_code ;//账单部门
    private Double bill_fee;//账单金额
    private int bill_direction;//收支方向：1-收入 2-支出
    private  int subtract_type_code;//冲补类型：1-正常单  2-冲单  3-补单
    private  int billing_version_no;//结算版本号
    private  String bill_emp_code;//账单工号
    private  int  bill_type;//账单类型：1-运单  2-代收款  3-干线费  4-手工帐
    private  String fee_type;//费用类型：根据账单费用定义不同的类型
    private int  oper_type;//触发类型：1-录单  2-签收交款  3-垫付  4-转款   5-月结交款  6-回单交单 7-干线支出  8-出纳登记 9-改单  10-作废 11-原返..等支出
    private  int data_source_id;//数据源ID(运单ID、合同ID)
    private  String data_source_no;//数据源(单号、合同号等)
    private String verification_direction;//核销方向：基础资料
    private  int audited_flag;//审核状态：0-未审核 1-已审核
    private Date audited_date;//审核日期
    private  String audit_emp_code;//审核人工号
    private int   verification_state;//核销状态：0-未核销 1-已核销
    private  String verification_emp_code;//核销员工
    private Date verification_date;//核销日期
    private String voucher_no;//凭证号
    private String bill_note;//账单备注
    private String comp_code;//公司代码
    private String creater;//创建人
    private String record_version;//锁版本号
    private Date creater_tm;//创建日期
    private String modifier;//修改人
    private  Date modifier_time;//修改日期
    private  String latest_time;



    //科目
    private Finance_bac_subject_def finance_bac_subject_def;

    public Finance_bac_subject_def getFinance_bac_subject_def() {
        return finance_bac_subject_def;
    }

    public void setFinance_bac_subject_def(Finance_bac_subject_def finance_bac_subject_def) {
        this.finance_bac_subject_def = finance_bac_subject_def;
    }



    //账单明细
    private Set<Finance_cas_pay_rec_details> Finance_cas_pay_rec_details;

    public Set<com.ssm.entity.Finance_cas_pay_rec_details> getFinance_cas_pay_rec_details() {
        return Finance_cas_pay_rec_details;
    }

    public void setFinance_cas_pay_rec_details(Set<com.ssm.entity.Finance_cas_pay_rec_details> finance_cas_pay_rec_details) {
        Finance_cas_pay_rec_details = finance_cas_pay_rec_details;
    }


    public Finance_cas_payable_receivable() {
    }

    public Finance_cas_payable_receivable(int pay_receivable_id, String bill_no, Date bill_dt, String dept_code, Double bill_fee, int bill_direction, int subtract_type_code, int billing_version_no, String bill_emp_code, int bill_type, String fee_type, int oper_type, int data_source_id, String data_source_no, String verification_direction, int audited_flag, Date audited_date, String audit_emp_code, int verification_state, String verification_emp_code, Date verification_date, String voucher_no, String bill_note, String comp_code, String creater, String record_version, Date creater_tm, String modifier, Date modifier_time, String latest_time) {
        this.pay_receivable_id = pay_receivable_id;
        this.bill_no = bill_no;
        this.bill_dt = bill_dt;
        this.dept_code = dept_code;
        this.bill_fee = bill_fee;
        this.bill_direction = bill_direction;
        this.subtract_type_code = subtract_type_code;
        this.billing_version_no = billing_version_no;
        this.bill_emp_code = bill_emp_code;
        this.bill_type = bill_type;
        this.fee_type = fee_type;
        this.oper_type = oper_type;
        this.data_source_id = data_source_id;
        this.data_source_no = data_source_no;
        this.verification_direction = verification_direction;
        this.audited_flag = audited_flag;
        this.audited_date = audited_date;
        this.audit_emp_code = audit_emp_code;
        this.verification_state = verification_state;
        this.verification_emp_code = verification_emp_code;
        this.verification_date = verification_date;
        this.voucher_no = voucher_no;
        this.bill_note = bill_note;
        this.comp_code = comp_code;
        this.creater = creater;
        this.record_version = record_version;
        this.creater_tm = creater_tm;
        this.modifier = modifier;
        this.modifier_time = modifier_time;
        this.latest_time = latest_time;
    }

    public int getPay_receivable_id() {
        return pay_receivable_id;
    }

    public void setPay_receivable_id(int pay_receivable_id) {
        this.pay_receivable_id = pay_receivable_id;
    }

    public String getBill_no() {
        return bill_no;
    }

    public void setBill_no(String bill_no) {
        this.bill_no = bill_no;
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

    public Double getBill_fee() {
        return bill_fee;
    }

    public void setBill_fee(Double bill_fee) {
        this.bill_fee = bill_fee;
    }

    public int getBill_direction() {
        return bill_direction;
    }

    public void setBill_direction(int bill_direction) {
        this.bill_direction = bill_direction;
    }

    public int getSubtract_type_code() {
        return subtract_type_code;
    }

    public void setSubtract_type_code(int subtract_type_code) {
        this.subtract_type_code = subtract_type_code;
    }

    public int getBilling_version_no() {
        return billing_version_no;
    }

    public void setBilling_version_no(int billing_version_no) {
        this.billing_version_no = billing_version_no;
    }

    public String getBill_emp_code() {
        return bill_emp_code;
    }

    public void setBill_emp_code(String bill_emp_code) {
        this.bill_emp_code = bill_emp_code;
    }

    public int getBill_type() {
        return bill_type;
    }

    public void setBill_type(int bill_type) {
        this.bill_type = bill_type;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public int getOper_type() {
        return oper_type;
    }

    public void setOper_type(int oper_type) {
        this.oper_type = oper_type;
    }

    public int getData_source_id() {
        return data_source_id;
    }

    public void setData_source_id(int data_source_id) {
        this.data_source_id = data_source_id;
    }

    public String getData_source_no() {
        return data_source_no;
    }

    public void setData_source_no(String data_source_no) {
        this.data_source_no = data_source_no;
    }

    public String getVerification_direction() {
        return verification_direction;
    }

    public void setVerification_direction(String verification_direction) {
        this.verification_direction = verification_direction;
    }

    public int getAudited_flag() {
        return audited_flag;
    }

    public void setAudited_flag(int audited_flag) {
        this.audited_flag = audited_flag;
    }

    public Date getAudited_date() {
        return audited_date;
    }

    public void setAudited_date(Date audited_date) {
        this.audited_date = audited_date;
    }

    public String getAudit_emp_code() {
        return audit_emp_code;
    }

    public void setAudit_emp_code(String audit_emp_code) {
        this.audit_emp_code = audit_emp_code;
    }

    public int getVerification_state() {
        return verification_state;
    }

    public void setVerification_state(int verification_state) {
        this.verification_state = verification_state;
    }

    public String getVerification_emp_code() {
        return verification_emp_code;
    }

    public void setVerification_emp_code(String verification_emp_code) {
        this.verification_emp_code = verification_emp_code;
    }

    public Date getVerification_date() {
        return verification_date;
    }

    public void setVerification_date(Date verification_date) {
        this.verification_date = verification_date;
    }

    public String getVoucher_no() {
        return voucher_no;
    }

    public void setVoucher_no(String voucher_no) {
        this.voucher_no = voucher_no;
    }

    public String getBill_note() {
        return bill_note;
    }

    public void setBill_note(String bill_note) {
        this.bill_note = bill_note;
    }

    public String getComp_code() {
        return comp_code;
    }

    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getRecord_version() {
        return record_version;
    }

    public void setRecord_version(String record_version) {
        this.record_version = record_version;
    }

    public Date getCreater_tm() {
        return creater_tm;
    }

    public void setCreater_tm(Date creater_tm) {
        this.creater_tm = creater_tm;
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

    public String getLatest_time() {
        return latest_time;
    }

    public void setLatest_time(String latest_time) {
        this.latest_time = latest_time;
    }
}
