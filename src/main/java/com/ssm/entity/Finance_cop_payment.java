package com.ssm.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * 代收款付款表 主表
 */
public class Finance_cop_payment {

    private  int waybill_id;  //代收款付款id

    //与运单表产生关系--一对一关系
    private  Tb_waybill tb_waybill;

    public Tb_waybill getTb_waybill() {
        return tb_waybill;
    }

    public void setTb_waybill(Tb_waybill tb_waybill) {
        this.tb_waybill = tb_waybill;
    }

    private String source_zone_code;	//寄件网点
    private String dest_zone_code;	//收件网点
    private String payment_account;	//转款帐号
    private String account_type;		//转款帐号类型
    private Date income_tm;		//营收日期
    private String receive_account;	//银行收款帐号
    private String bankaccount_type;		//银行卡号类型
    private  double fee_amount;  //代收货款金额
    private  double service_fee;		//代收货款服务费
    private  double minus_total_fee;		//代收扣款总金额
    private  double lost_fee;		//挂失费
    private  String purpose;		//目的,用途
    private  String payment_note;		//付款备注信息
    private  String payment_emp;		//发款人
    private  Date payment_tm;		//发款（转帐）时间 (导出时填写)
    private  int payment_type;	//转帐类型
    private int payment_state;	//转帐状态
    private  String consignor_cont_name;		//寄件联系人
    private  String consignor_mobile;		//寄方手机
    private Date consigned_tm;		//寄件时间
    private  String register_name;	//登记人
    private  String register_mobile;		//登记人手机
    private  String register_identify;		//登记人的证件号码
    private  String send_peo;		//寄件联系人
    private  String send_mobile;		//寄件人电话
    private  Date send_tm;		//寄件时间

    private  String oper_state;		//操作状态1-无操作,2-取消发款,3-确认已转款,4-冻结,5-解冻,6-登记,7-取消登记,8-登记审核,9-临时挂失,10-正式挂失,11-解挂失,12超期审核,13-删除代收款,

    private  String oper_emp_code;	//操作人
    private  Date oper_tm;		//操作时间
    private  String note;		//备注
    private int warning_state;	//预警标志  1-使用警告  2-解除警告
    private int messaged_flag;	//短信发送状态
    private  String register_dept_code;		//登记人点部
    private Date register_tm;		//登记时间
    private  String lost_identify;	//挂失证件号
    private  String lost_name;		//挂失人
    private  double message_server_fee;		//短信服务费
    private int is_expire;	 //是否超期(1-超期,2-不超期)
    private  String comp_code;		//企业代码
    private int biz_type_code; 	//业务类型
    private  String apply_emp_name;	//申请人
    private  String apply_emp_code;		//申请人工号
    private Date apply_tm;		//申请日期
    private  String to_comp_code;		//公司代码(签收公司)
    private Date period_days;		//转款周期
    private  String batch_code;		//批次号
    private Date batch_oper_tm;	//批次登记日期
    private  String e_card_no;		//e卡通号
    private  String payee_mobile;		//领款手机
    private  String payee_identify;		//领款人身份证号
    private  String payee;		//领款人
    private  String org_type;		//组织类型
    private  String creater;		//创建人（主键+工号code）
    private  String creater_time;		//创建时间
    private  String modifier;		//修改人（主键+工号code）
    private  Date modifier_time;		//修改时间
    private  Date latest_time;
    private  double record_version;	//版本


    //构造方法
    public Finance_cop_payment(){

    }

    public Finance_cop_payment(String oper_state,String lost_name,String lost_identify,String note,double lost_fee){
        this.oper_state=oper_state;
        this.lost_name=lost_name;
        this.lost_identify=lost_identify;
        this.note=note;
        this.lost_fee=lost_fee;

    }


    public Finance_cop_payment(int waybill_id, String source_zone_code, String dest_zone_code, Date income_tm, String receive_account, String bankaccount_type, double fee_amount, double service_fee, double minus_total_fee, double lost_fee, Date payment_tm, int payment_type, int payment_state, String register_name, String register_mobile, String register_identify, String send_peo, String send_mobile, String oper_state, String oper_emp_code, Date oper_tm, String note, int warning_state, int messaged_flag, double message_server_fee, String batch_code, String e_card_no) {
        this.waybill_id = waybill_id;
        this.source_zone_code = source_zone_code;
        this.dest_zone_code = dest_zone_code;
        this.income_tm = income_tm;
        this.receive_account = receive_account;
        this.bankaccount_type = bankaccount_type;
        this.fee_amount = fee_amount;
        this.service_fee = service_fee;
        this.minus_total_fee = minus_total_fee;
        this.lost_fee = lost_fee;
        this.payment_tm = payment_tm;
        this.payment_type = payment_type;
        this.payment_state = payment_state;
        this.register_name = register_name;
        this.register_mobile = register_mobile;
        this.register_identify = register_identify;
        this.send_peo = send_peo;
        this.send_mobile = send_mobile;
        this.oper_state = oper_state;
        this.oper_emp_code = oper_emp_code;
        this.oper_tm = oper_tm;
        this.note = note;
        this.warning_state = warning_state;
        this.messaged_flag = messaged_flag;
        this.message_server_fee = message_server_fee;
        this.batch_code = batch_code;
        this.e_card_no = e_card_no;
    }

    //get


    public int getWaybill_id() {
        return waybill_id;
    }

    public String getSource_zone_code() {
        return source_zone_code;
    }

    public String getDest_zone_code() {
        return dest_zone_code;
    }

    public String getPayment_account() {
        return payment_account;
    }

    public String getAccount_type() {
        return account_type;
    }

    public Date getIncome_tm() {
        return income_tm;
    }

    public String getReceive_account() {
        return receive_account;
    }

    public String getBankaccount_type() {
        return bankaccount_type;
    }

    public double getFee_amount() {
        return fee_amount;
    }

    public double getService_fee() {
        return service_fee;
    }

    public double getMinus_total_fee() {
        return minus_total_fee;
    }

    public double getLost_fee() {
        return lost_fee;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getPayment_note() {
        return payment_note;
    }

    public String getPayment_emp() {
        return payment_emp;
    }

    public Date getPayment_tm() {
        return payment_tm;
    }

    public int getPayment_type() {
        return payment_type;
    }

    public int getPayment_state() {
        return payment_state;
    }

    public String getConsignor_cont_name() {
        return consignor_cont_name;
    }

    public String getConsignor_mobile() {
        return consignor_mobile;
    }

    public Date getConsigned_tm() {
        return consigned_tm;
    }

    public String getRegister_name() {
        return register_name;
    }

    public String getRegister_mobile() {
        return register_mobile;
    }

    public String getRegister_identify() {
        return register_identify;
    }

    public String getSend_peo() {
        return send_peo;
    }

    public String getSend_mobile() {
        return send_mobile;
    }

    public Date getSend_tm() {
        return send_tm;
    }

    public String getOper_state() {
        return oper_state;
    }

    public String getOper_emp_code() {
        return oper_emp_code;
    }

    public Date getOper_tm() {
        return oper_tm;
    }

    public String getNote() {
        return note;
    }

    public int getWarning_state() {
        return warning_state;
    }

    public int getMessaged_flag() {
        return messaged_flag;
    }

    public String getRegister_dept_code() {
        return register_dept_code;
    }

    public Date getRegister_tm() {
        return register_tm;
    }

    public String getLost_identify() {
        return lost_identify;
    }

    public String getLost_name() {
        return lost_name;
    }

    public double getMessage_server_fee() {
        return message_server_fee;
    }

    public int getIs_expire() {
        return is_expire;
    }

    public String getComp_code() {
        return comp_code;
    }

    public int getBiz_type_code() {
        return biz_type_code;
    }

    public String getApply_emp_name() {
        return apply_emp_name;
    }

    public String getApply_emp_code() {
        return apply_emp_code;
    }

    public Date getApply_tm() {
        return apply_tm;
    }

    public String getTo_comp_code() {
        return to_comp_code;
    }

    public Date getPeriod_days() {
        return period_days;
    }

    public String getBatch_code() {
        return batch_code;
    }

    public Date getBatch_oper_tm() {
        return batch_oper_tm;
    }

    public String getE_card_no() {
        return e_card_no;
    }

    public String getPayee_mobile() {
        return payee_mobile;
    }

    public String getPayee_identify() {
        return payee_identify;
    }

    public String getPayee() {
        return payee;
    }

    public String getOrg_type() {
        return org_type;
    }

    public String getCreater() {
        return creater;
    }

    public String getCreater_time() {
        return creater_time;
    }

    public String getModifier() {
        return modifier;
    }

    public Date getModifier_time() {
        return modifier_time;
    }

    public Date getLatest_time() {
        return latest_time;
    }

    public double getRecord_version() {
        return record_version;
    }

    //set


    public void setWaybill_id(int waybill_id) {
        this.waybill_id = waybill_id;
    }

    public void setSource_zone_code(String source_zone_code) {
        this.source_zone_code = source_zone_code;
    }

    public void setDest_zone_code(String dest_zone_code) {
        this.dest_zone_code = dest_zone_code;
    }

    public void setPayment_account(String payment_account) {
        this.payment_account = payment_account;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public void setIncome_tm(Date income_tm) {
        this.income_tm = income_tm;
    }

    public void setReceive_account(String receive_account) {
        this.receive_account = receive_account;
    }

    public void setBankaccount_type(String bankaccount_type) {
        this.bankaccount_type = bankaccount_type;
    }

    public void setFee_amount(double fee_amount) {
        this.fee_amount = fee_amount;
    }

    public void setService_fee(double service_fee) {
        this.service_fee = service_fee;
    }

    public void setMinus_total_fee(double minus_total_fee) {
        this.minus_total_fee = minus_total_fee;
    }

    public void setLost_fee(double lost_fee) {
        this.lost_fee = lost_fee;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setPayment_note(String payment_note) {
        this.payment_note = payment_note;
    }

    public void setPayment_emp(String payment_emp) {
        this.payment_emp = payment_emp;
    }

    public void setPayment_tm(Date payment_tm) {
        this.payment_tm = payment_tm;
    }

    public void setPayment_type(int payment_type) {
        this.payment_type = payment_type;
    }

    public void setPayment_state(int payment_state) {
        this.payment_state = payment_state;
    }

    public void setConsignor_cont_name(String consignor_cont_name) {
        this.consignor_cont_name = consignor_cont_name;
    }

    public void setConsignor_mobile(String consignor_mobile) {
        this.consignor_mobile = consignor_mobile;
    }

    public void setConsigned_tm(Date consigned_tm) {
        this.consigned_tm = consigned_tm;
    }

    public void setRegister_name(String register_name) {
        this.register_name = register_name;
    }

    public void setRegister_mobile(String register_mobile) {
        this.register_mobile = register_mobile;
    }

    public void setRegister_identify(String register_identify) {
        this.register_identify = register_identify;
    }

    public void setSend_peo(String send_peo) {
        this.send_peo = send_peo;
    }

    public void setSend_mobile(String send_mobile) {
        this.send_mobile = send_mobile;
    }

    public void setSend_tm(Date send_tm) {
        this.send_tm = send_tm;
    }

    public void setOper_state(String oper_state) {
        this.oper_state = oper_state;
    }

    public void setOper_emp_code(String oper_emp_code) {
        this.oper_emp_code = oper_emp_code;
    }

    public void setOper_tm(Date oper_tm) {
        this.oper_tm = oper_tm;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setWarning_state(int warning_state) {
        this.warning_state = warning_state;
    }

    public void setMessaged_flag(int messaged_flag) {
        this.messaged_flag = messaged_flag;
    }

    public void setRegister_dept_code(String register_dept_code) {
        this.register_dept_code = register_dept_code;
    }

    public void setRegister_tm(Date register_tm) {
        this.register_tm = register_tm;
    }

    public void setLost_identify(String lost_identify) {
        this.lost_identify = lost_identify;
    }

    public void setLost_name(String lost_name) {
        this.lost_name = lost_name;
    }

    public void setMessage_server_fee(double message_server_fee) {
        this.message_server_fee = message_server_fee;
    }

    public void setIs_expire(int is_expire) {
        this.is_expire = is_expire;
    }

    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }

    public void setBiz_type_code(int biz_type_code) {
        this.biz_type_code = biz_type_code;
    }

    public void setApply_emp_name(String apply_emp_name) {
        this.apply_emp_name = apply_emp_name;
    }

    public void setApply_emp_code(String apply_emp_code) {
        this.apply_emp_code = apply_emp_code;
    }

    public void setApply_tm(Date apply_tm) {
        this.apply_tm = apply_tm;
    }

    public void setTo_comp_code(String to_comp_code) {
        this.to_comp_code = to_comp_code;
    }

    public void setPeriod_days(Date period_days) {
        this.period_days = period_days;
    }

    public void setBatch_code(String batch_code) {
        this.batch_code = batch_code;
    }

    public void setBatch_oper_tm(Date batch_oper_tm) {
        this.batch_oper_tm = batch_oper_tm;
    }

    public void setE_card_no(String e_card_no) {
        this.e_card_no = e_card_no;
    }

    public void setPayee_mobile(String payee_mobile) {
        this.payee_mobile = payee_mobile;
    }

    public void setPayee_identify(String payee_identify) {
        this.payee_identify = payee_identify;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public void setCreater_time(String creater_time) {
        this.creater_time = creater_time;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setModifier_time(Date modifier_time) {
        this.modifier_time = modifier_time;
    }

    public void setLatest_time(Date latest_time) {
        this.latest_time = latest_time;
    }

    public void setRecord_version(double record_version) {
        this.record_version = record_version;
    }
}
