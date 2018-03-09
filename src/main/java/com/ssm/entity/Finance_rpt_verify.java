package com.ssm.entity;

import java.util.Date;

public class Finance_rpt_verify {

    /**
     * 核销实体类
     */
    private  int verify_id;	//主键ID
    private  String serial_number;	//理赔编码, 回款流水号, 充值流水号
    private  String certificate_no;	//凭证号
    private  String dept_code; 	//充值网点, 回款网点,登记网点, 寄件网点
    private  String biz_type; 	//业务类型

    //与运单产生一对一的关系
    private Tb_waybill tbWaybill;

    public Tb_waybill getTbWaybill() {
        return tbWaybill;
    }

    public void setTbWaybill(Tb_waybill tbWaybill) {
        this.tbWaybill = tbWaybill;
    }

    //与核销明细产生一对一的关系
    private  Finance_rpt_cashier_record finance_rpt_cashier_record;

    public Finance_rpt_cashier_record getFinance_rpt_cashier_record() {
        return finance_rpt_cashier_record;
    }

    public void setFinance_rpt_cashier_record(Finance_rpt_cashier_record finance_rpt_cashier_record) {
        this.finance_rpt_cashier_record = finance_rpt_cashier_record;
    }

    private  String in_emp;   //	制单人
    private Date in_tm; 	//寄件日期
    private  Date cop_pay_tm;	//转款日期-代收款
    private  String src_dept_code;	//发站
    private  String dest_dept_code;	//到站
    private  String goods_name;	//品名
    private  int total;	//件数
    private  String src_emp_name;	//发货人
    private  String dest_emp_name;	//收货人
    private  String pay_type; 	//付款方式
    private  int verify_type;	//核销类型/项目(1: 预付款充值核销 2: 回款核销 3: 理赔核销 4: 运单费用)
    private  String audit_dept_code;	//审核网点

    private  int audit_status;	//审核状态0 1

    private  Date audit_tm;	//审核时间
    private  String org_type;	//组织类型:作业、财务结算、成员企业
    private  String modifier;	//修改人（主键+工号code）
    private  Date modifier_time;	//修改时间
    private  String creater;  //创建人（主键+工号code）
    private  Date creater_time;	//创建时间


    public Finance_rpt_verify() {
    }

    public int getVerify_id() {
        return verify_id;
    }

    public void setVerify_id(int verify_id) {
        this.verify_id = verify_id;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getCertificate_no() {
        return certificate_no;
    }

    public void setCertificate_no(String certificate_no) {
        this.certificate_no = certificate_no;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public String getBiz_type() {
        return biz_type;
    }

    public void setBiz_type(String biz_type) {
        this.biz_type = biz_type;
    }

    public String getIn_emp() {
        return in_emp;
    }

    public void setIn_emp(String in_emp) {
        this.in_emp = in_emp;
    }

    public Date getIn_tm() {
        return in_tm;
    }

    public void setIn_tm(Date in_tm) {
        this.in_tm = in_tm;
    }

    public Date getCop_pay_tm() {
        return cop_pay_tm;
    }

    public void setCop_pay_tm(Date cop_pay_tm) {
        this.cop_pay_tm = cop_pay_tm;
    }

    public String getSrc_dept_code() {
        return src_dept_code;
    }

    public void setSrc_dept_code(String src_dept_code) {
        this.src_dept_code = src_dept_code;
    }

    public String getDest_dept_code() {
        return dest_dept_code;
    }

    public void setDest_dept_code(String dest_dept_code) {
        this.dest_dept_code = dest_dept_code;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getSrc_emp_name() {
        return src_emp_name;
    }

    public void setSrc_emp_name(String src_emp_name) {
        this.src_emp_name = src_emp_name;
    }

    public String getDest_emp_name() {
        return dest_emp_name;
    }

    public void setDest_emp_name(String dest_emp_name) {
        this.dest_emp_name = dest_emp_name;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public int getVerify_type() {
        return verify_type;
    }

    public void setVerify_type(int verify_type) {
        this.verify_type = verify_type;
    }

    public String getAudit_dept_code() {
        return audit_dept_code;
    }

    public void setAudit_dept_code(String audit_dept_code) {
        this.audit_dept_code = audit_dept_code;
    }

    public int getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(int audit_status) {
        this.audit_status = audit_status;
    }

    public Date getAudit_tm() {
        return audit_tm;
    }

    public void setAudit_tm(Date audit_tm) {
        this.audit_tm = audit_tm;
    }

    public String getOrg_type() {
        return org_type;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
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
}
