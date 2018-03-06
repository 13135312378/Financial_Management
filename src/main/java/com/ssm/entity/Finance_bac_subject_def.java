package com.ssm.entity;

import java.util.Date;
import java.util.Set;

public class Finance_bac_subject_def {
      private  int sub_id;//id
      private  String subject_name;//科目名称
      private  String subject_code;//科目代码
      private  String  parent_code;//上级科目代码（所有上级科目号的组合）
      private  String firstsub_name;//一级科目名称
      private  String secondsub_name;//二级科目名称
      private  String  thirdsub_name;//三级科目名称
      private  String  forthsub_name;//四级科目名称
      private  int balance_direction;//余额方向（1：收入  2：支出）
      private   String  creater;//创建人（主键+工号code）
      private   Date creater_time;//创建日期
      private   String comp_code;//公司代码
      private   int subject_level;//当前科目级别（四级1、2、3、4）
      private   int  manual_entry;//是否是手工记账（是：1， 否：2）
      private  String modifier;//修改人
       private   Date modifier_time;//修改时间
      private   int  is_red_dashed;//对冲（1-是，2-否）
      private   int  is_delete;//是否删除 1：未删除；2：已删除
      private   Date latest_time;//最后更新时间　
      private   String record_version;//版本号　
      private   String org_type;//组织类型:作业、财务结算、成员企业
      private  String Column_1 ;
      private  String Column_2 ;
      private  String Column_3 ;


      //账单
    private Set<Finance_cas_payable_receivable> finance_cas_payable_receivables;

    public Set<Finance_cas_payable_receivable> getFinance_cas_payable_receivables() {
        return finance_cas_payable_receivables;
    }

    public void setFinance_cas_payable_receivables(Set<Finance_cas_payable_receivable> finance_cas_payable_receivables) {
        this.finance_cas_payable_receivables = finance_cas_payable_receivables;
    }




    public Finance_bac_subject_def() {
    }

    public Finance_bac_subject_def(int sub_id, String subject_name, String subject_code, String parent_code, String firstsub_name, String secondsub_name, String thirdsub_name, String forthsub_name, int balance_direction, String creater, Date creater_time, String comp_code, int subject_level, int manual_entry, String modifier, Date modifier_time, int is_red_dashed, int is_delete, Date latest_time, String record_version, String org_type, String column_1, String column_2, String column_3) {
        this.sub_id = sub_id;
        this.subject_name = subject_name;
        this.subject_code = subject_code;
        this.parent_code = parent_code;
        this.firstsub_name = firstsub_name;
        this.secondsub_name = secondsub_name;
        this.thirdsub_name = thirdsub_name;
        this.forthsub_name = forthsub_name;
        this.balance_direction = balance_direction;
        this.creater = creater;
        this.creater_time = creater_time;
        this.comp_code = comp_code;
        this.subject_level = subject_level;
        this.manual_entry = manual_entry;
        this.modifier = modifier;
        this.modifier_time = modifier_time;
        this.is_red_dashed = is_red_dashed;
        this.is_delete = is_delete;
        this.latest_time = latest_time;
        this.record_version = record_version;
        this.org_type = org_type;
        Column_1 = column_1;
        Column_2 = column_2;
        Column_3 = column_3;
    }

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getParent_code() {
        return parent_code;
    }

    public void setParent_code(String parent_code) {
        this.parent_code = parent_code;
    }

    public String getFirstsub_name() {
        return firstsub_name;
    }

    public void setFirstsub_name(String firstsub_name) {
        this.firstsub_name = firstsub_name;
    }

    public String getSecondsub_name() {
        return secondsub_name;
    }

    public void setSecondsub_name(String secondsub_name) {
        this.secondsub_name = secondsub_name;
    }

    public String getThirdsub_name() {
        return thirdsub_name;
    }

    public void setThirdsub_name(String thirdsub_name) {
        this.thirdsub_name = thirdsub_name;
    }

    public String getForthsub_name() {
        return forthsub_name;
    }

    public void setForthsub_name(String forthsub_name) {
        this.forthsub_name = forthsub_name;
    }

    public int getBalance_direction() {
        return balance_direction;
    }

    public void setBalance_direction(int balance_direction) {
        this.balance_direction = balance_direction;
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

    public String getComp_code() {
        return comp_code;
    }

    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }

    public int getSubject_level() {
        return subject_level;
    }

    public void setSubject_level(int subject_level) {
        this.subject_level = subject_level;
    }

    public int getManual_entry() {
        return manual_entry;
    }

    public void setManual_entry(int manual_entry) {
        this.manual_entry = manual_entry;
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

    public int getIs_red_dashed() {
        return is_red_dashed;
    }

    public void setIs_red_dashed(int is_red_dashed) {
        this.is_red_dashed = is_red_dashed;
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

    public String getRecord_version() {
        return record_version;
    }

    public void setRecord_version(String record_version) {
        this.record_version = record_version;
    }

    public String getOrg_type() {
        return org_type;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
    }

    public String getColumn_1() {
        return Column_1;
    }

    public void setColumn_1(String column_1) {
        Column_1 = column_1;
    }

    public String getColumn_2() {
        return Column_2;
    }

    public void setColumn_2(String column_2) {
        Column_2 = column_2;
    }

    public String getColumn_3() {
        return Column_3;
    }

    public void setColumn_3(String column_3) {
        Column_3 = column_3;
    }
}
