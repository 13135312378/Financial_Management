package com.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;

public class Finance_bac_verification {
    //核销方向
    private int  verification_id;//id
    private  String  verification_name;//核销方向
    private   String  verification_code;//核销代码
    private Timestamp creater_time;//创建时间：

    private  String  creater_dept_code;//创建网点
    private String creater ;//创建人
    private  String modifier;//修改人
    private Date   modifier_time;//修改时间

    private String   modifier_dept_code;//修改网点代码
    private  String comp_code;//公司代码
    private String org_type;//组织类型:作业、财务结算、成员企业
    private  int sys_flag;//是否是系统配置 是:1  否：0
    private  int is_delete;//1 :是0：否（系统不能删除）

    private  String  remark;//备注
    private  int   record_version;//版本号

    private    Date  latest_time;//最后修改时间
    private  String column_1;
    private  String column_2;
    private  String column_3;

    public Finance_bac_verification() {
    }

    public Finance_bac_verification(int verification_id, String verification_name, String verification_code, Timestamp creater_time, String creater_dept_code, String creater, String modifier, Date modifier_time, String modifier_dept_code, String comp_code, String org_type, int sys_flag, int is_delete, String remark, int record_version, Date latest_time, String column_1, String column_2, String column_3) {
        this.verification_id = verification_id;
        this.verification_name = verification_name;
        this.verification_code = verification_code;
        this.creater_time = creater_time;
        this.creater_dept_code = creater_dept_code;
        this.creater = creater;
        this.modifier = modifier;
        this.modifier_time = modifier_time;
        this.modifier_dept_code = modifier_dept_code;
        this.comp_code = comp_code;
        this.org_type = org_type;
        this.sys_flag = sys_flag;
        this.is_delete = is_delete;
        this.remark = remark;
        this.record_version = record_version;
        this.latest_time = latest_time;
        this.column_1 = column_1;
        this.column_2 = column_2;
        this.column_3 = column_3;
    }

    public int getVerification_id() {
        return verification_id;
    }

    public void setVerification_id(int verification_id) {
        this.verification_id = verification_id;
    }

    public String getVerification_name() {
        return verification_name;
    }

    public void setVerification_name(String verification_name) {
        this.verification_name = verification_name;
    }

    public String getVerification_code() {
        return verification_code;
    }

    public void setVerification_code(String verification_code) {
        this.verification_code = verification_code;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Timestamp getCreater_time() {
        return creater_time;
    }

    public void setCreater_time(Timestamp creater_time) {
        this.creater_time = creater_time;
    }

    public String getCreater_dept_code() {
        return creater_dept_code;
    }

    public void setCreater_dept_code(String creater_dept_code) {
        this.creater_dept_code = creater_dept_code;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
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

    public String getModifier_dept_code() {
        return modifier_dept_code;
    }

    public void setModifier_dept_code(String modifier_dept_code) {
        this.modifier_dept_code = modifier_dept_code;
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

    public int getSys_flag() {
        return sys_flag;
    }

    public void setSys_flag(int sys_flag) {
        this.sys_flag = sys_flag;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getRecord_version() {
        return record_version;
    }

    public void setRecord_version(int record_version) {
        this.record_version = record_version;
    }

    public Date getLatest_time() {
        return latest_time;
    }

    public void setLatest_time(Date latest_time) {
        this.latest_time = latest_time;
    }

    public String getColumn_1() {
        return column_1;
    }

    public void setColumn_1(String column_1) {
        this.column_1 = column_1;
    }

    public String getColumn_2() {
        return column_2;
    }

    public void setColumn_2(String column_2) {
        this.column_2 = column_2;
    }

    public String getColumn_3() {
        return column_3;
    }

    public void setColumn_3(String column_3) {
        this.column_3 = column_3;
    }
}
