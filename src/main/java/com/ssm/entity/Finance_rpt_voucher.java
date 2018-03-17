package com.ssm.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

public class Finance_rpt_voucher {
    //凭证主表
      private  int voucher_id; //id
      private   int input_type;//录入类型：1-核销产生 2-手工录入
      private   int income_type;//类型：1-收入 2-支出
      private Timestamp input_tm;//录入日期(产生日期)
      private  String  voucher_no;// 凭证号
      private  String input_emp_code;//录入员工(经办人)
      private  Double fee_amt;//涉及费用
      private  String dept_code ;//站点
       private String manual_voucher_no;//手工凭证号
      private  int  gl_number ;//笔数
     private  String  audited_emp_code;//审核人
     private Date audited_tm;//审核日期
     private  String   payee;//领款人
     private  String payee_ident;//领款人证件号
    private String   remarks;//备注
    private  int   audited_flg;//审核状态：0-未审核 1-已审核
    private  String  first_grade;//一级科目
     private String     second_grade;//二级科目
      private String    third_grade;//三级科目
       private String    fourth_grade;//四级科目
     private  int  doc_type;//凭证类型：0-正常 1-作废原单 2-反核销
      private String  comp_code;//公司代码
    private String vertical_item;//核销项目
      private int       oper_type;//操作类型：1-收(付)款 2-冲账
   private String creater;//创建人
     private   Date  creater_time;//创建日期
    private  String modifier;//修改人
    private Date   modifier_time;//修改时间
    private Date latest_time;//最近修改日期
     private int  record_version;//锁版本号
    private  String ATTRIBUTE1;
    private String     ATTRIBUTE2;
   private String  ATTRIBUTE3 ;
    private  String   ATTRIBUTE4;

    //核销明细
      private Set<Finance_rpt_voucher_details> Finance_rpt_voucher_details;

    public Set<com.ssm.entity.Finance_rpt_voucher_details> getFinance_rpt_voucher_details() {
        return Finance_rpt_voucher_details;
    }

    public void setFinance_rpt_voucher_details(Set<com.ssm.entity.Finance_rpt_voucher_details> finance_rpt_voucher_details) {
        Finance_rpt_voucher_details = finance_rpt_voucher_details;
    }

    public Finance_rpt_voucher() {
    }

    public int getVoucher_id() {
        return voucher_id;
    }

    public void setVoucher_id(int voucher_id) {
        this.voucher_id = voucher_id;
    }

    public int getInput_type() {
        return input_type;
    }

    public void setInput_type(int input_type) {
        this.input_type = input_type;
    }

    public int getIncome_type() {
        return income_type;
    }

    public void setIncome_type(int income_type) {
        this.income_type = income_type;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Timestamp getInput_tm() {
        return input_tm;
    }

    public void setInput_tm(Timestamp input_tm) {
        this.input_tm = input_tm;
    }

    public String getVoucher_no() {
        return voucher_no;
    }

    public void setVoucher_no(String voucher_no) {
        this.voucher_no = voucher_no;
    }

    public String getInput_emp_code() {
        return input_emp_code;
    }

    public void setInput_emp_code(String input_emp_code) {
        this.input_emp_code = input_emp_code;
    }

    public Double getFee_amt() {
        return fee_amt;
    }

    public void setFee_amt(Double fee_amt) {
        this.fee_amt = fee_amt;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public String getManual_voucher_no() {
        return manual_voucher_no;
    }

    public void setManual_voucher_no(String manual_voucher_no) {
        this.manual_voucher_no = manual_voucher_no;
    }

    public int getGl_number() {
        return gl_number;
    }

    public void setGl_number(int gl_number) {
        this.gl_number = gl_number;
    }

    public String getAudited_emp_code() {
        return audited_emp_code;
    }

    public void setAudited_emp_code(String audited_emp_code) {
        this.audited_emp_code = audited_emp_code;
    }

    public Date getAudited_tm() {
        return audited_tm;
    }

    public void setAudited_tm(Date audited_tm) {
        this.audited_tm = audited_tm;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getPayee_ident() {
        return payee_ident;
    }

    public void setPayee_ident(String payee_ident) {
        this.payee_ident = payee_ident;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getAudited_flg() {
        return audited_flg;
    }

    public void setAudited_flg(int audited_flg) {
        this.audited_flg = audited_flg;
    }

    public String getFirst_grade() {
        return first_grade;
    }

    public void setFirst_grade(String first_grade) {
        this.first_grade = first_grade;
    }

    public String getSecond_grade() {
        return second_grade;
    }

    public void setSecond_grade(String second_grade) {
        this.second_grade = second_grade;
    }

    public String getThird_grade() {
        return third_grade;
    }

    public void setThird_grade(String third_grade) {
        this.third_grade = third_grade;
    }

    public String getFourth_grade() {
        return fourth_grade;
    }

    public void setFourth_grade(String fourth_grade) {
        this.fourth_grade = fourth_grade;
    }

    public int getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(int doc_type) {
        this.doc_type = doc_type;
    }

    public String getComp_code() {
        return comp_code;
    }

    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }

    public String getVertical_item() {
        return vertical_item;
    }

    public void setVertical_item(String vertical_item) {
        this.vertical_item = vertical_item;
    }

    public int getOper_type() {
        return oper_type;
    }

    public void setOper_type(int oper_type) {
        this.oper_type = oper_type;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
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

    public Date getLatest_time() {
        return latest_time;
    }

    public void setLatest_time(Date latest_time) {
        this.latest_time = latest_time;
    }

    public int getRecord_version() {
        return record_version;
    }

    public void setRecord_version(int record_version) {
        this.record_version = record_version;
    }

    public String getATTRIBUTE1() {
        return ATTRIBUTE1;
    }

    public void setATTRIBUTE1(String ATTRIBUTE1) {
        this.ATTRIBUTE1 = ATTRIBUTE1;
    }

    public String getATTRIBUTE2() {
        return ATTRIBUTE2;
    }

    public void setATTRIBUTE2(String ATTRIBUTE2) {
        this.ATTRIBUTE2 = ATTRIBUTE2;
    }

    public String getATTRIBUTE3() {
        return ATTRIBUTE3;
    }

    public void setATTRIBUTE3(String ATTRIBUTE3) {
        this.ATTRIBUTE3 = ATTRIBUTE3;
    }

    public String getATTRIBUTE4() {
        return ATTRIBUTE4;
    }

    public void setATTRIBUTE4(String ATTRIBUTE4) {
        this.ATTRIBUTE4 = ATTRIBUTE4;
    }
}
