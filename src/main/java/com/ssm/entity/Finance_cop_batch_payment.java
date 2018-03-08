package com.ssm.entity;

import java.util.Date;

public class Finance_cop_batch_payment {

    /**
     * 代收货款批次转款表
     */
    private int batch_payment_id;   //主键ID
    private String batch_no;	//批次号
    private  int batch_status;	//批次状态:1-无操作, 2-取消转款 3-已审核 4-已驳回
    private Date create_tm;	//创建时间
    private  String create_emp_code;	//创建者编码
    private String waybill_count;	//单数
    private  double total_amt;	//总金额
    private  double real_pay_amt;	//实际付款金额
    private  Date pay_tm;	//转款时间
    private String pay_emp_code;	//转款人
    private  int transfer_type;	//转款类型（1：现金  、 2：银行卡）

    private  double counter_amt;	//手续费
    private  String customer_name;	//客户名称
    private  String customer_code;	//客户代码
    private  String customer_phone;	//客户手机
    private  String card_type;	//卡号类型
    private  String bank_account;	//银行账户
    private  String payee;	//领款人
    private  String identify_number;	//证件号码
    private int transfer_status;	//转款状态 ：（1： 已转  、2 ：可转、3：不可转）
    private int inform_status;	//通知状态 ( 1未通知 2 已通知)
    private  double lost_fee;	//挂失费
    private  double msg_service_fee;	//短信费
    private  double collect_deduce_fee;	//代收扣
    private  String comp_code;	//公司代码
    private  String dept_code;	//部门编码
    private  String org_type;	//组织类型:作业、财务结算、成员企业
    private String creater;	//创建人（主键+工号code）
    private  Date creater_time;	//创建时间
    private  String modifier; //修改人（主键+工号code）
    private  Date modifier_time;	//修改时间
    private  int is_delete;	//是否删除 0未删除；1 已删除  默认 0
    private  Date latest_time;	//timestamp(3) not null default current_timestamp(3) on update
    private  double record_version;	//版本

    public Finance_cop_batch_payment() {
    }


    public int getBatch_payment_id() {
        return batch_payment_id;
    }

    public void setBatch_payment_id(int batch_payment_id) {
        this.batch_payment_id = batch_payment_id;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public int getBatch_status() {
        return batch_status;
    }

    public void setBatch_status(int batch_status) {
        this.batch_status = batch_status;
    }

    public Date getCreate_tm() {
        return create_tm;
    }

    public void setCreate_tm(Date create_tm) {
        this.create_tm = create_tm;
    }

    public String getCreate_emp_code() {
        return create_emp_code;
    }

    public void setCreate_emp_code(String create_emp_code) {
        this.create_emp_code = create_emp_code;
    }

    public String getWaybill_count() {
        return waybill_count;
    }

    public void setWaybill_count(String waybill_count) {
        this.waybill_count = waybill_count;
    }

    public double getTotal_amt() {
        return total_amt;
    }

    public void setTotal_amt(double total_amt) {
        this.total_amt = total_amt;
    }

    public double getReal_pay_amt() {
        return real_pay_amt;
    }

    public void setReal_pay_amt(double real_pay_amt) {
        this.real_pay_amt = real_pay_amt;
    }

    public Date getPay_tm() {
        return pay_tm;
    }

    public void setPay_tm(Date pay_tm) {
        this.pay_tm = pay_tm;
    }

    public String getPay_emp_code() {
        return pay_emp_code;
    }

    public void setPay_emp_code(String pay_emp_code) {
        this.pay_emp_code = pay_emp_code;
    }

    public int getTransfer_type() {
        return transfer_type;
    }

    public void setTransfer_type(int transfer_type) {
        this.transfer_type = transfer_type;
    }

    public double getCounter_amt() {
        return counter_amt;
    }

    public void setCounter_amt(double counter_amt) {
        this.counter_amt = counter_amt;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_code() {
        return customer_code;
    }

    public void setCustomer_code(String customer_code) {
        this.customer_code = customer_code;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getBank_account() {
        return bank_account;
    }

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getIdentify_number() {
        return identify_number;
    }

    public void setIdentify_number(String identify_number) {
        this.identify_number = identify_number;
    }

    public int getTransfer_status() {
        return transfer_status;
    }

    public void setTransfer_status(int transfer_status) {
        this.transfer_status = transfer_status;
    }

    public int getInform_status() {
        return inform_status;
    }

    public void setInform_status(int inform_status) {
        this.inform_status = inform_status;
    }

    public double getLost_fee() {
        return lost_fee;
    }

    public void setLost_fee(double lost_fee) {
        this.lost_fee = lost_fee;
    }

    public double getMsg_service_fee() {
        return msg_service_fee;
    }

    public void setMsg_service_fee(double msg_service_fee) {
        this.msg_service_fee = msg_service_fee;
    }

    public double getCollect_deduce_fee() {
        return collect_deduce_fee;
    }

    public void setCollect_deduce_fee(double collect_deduce_fee) {
        this.collect_deduce_fee = collect_deduce_fee;
    }

    public String getComp_code() {
        return comp_code;
    }

    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
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

    public Date getLatest_time() {
        return latest_time;
    }

    public void setLatest_time(Date latest_time) {
        this.latest_time = latest_time;
    }

    public double getRecord_version() {
        return record_version;
    }

    public void setRecord_version(double record_version) {
        this.record_version = record_version;
    }

}
