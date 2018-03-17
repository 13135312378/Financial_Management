package com.ssm.entity;

public class Finance_receipt_apply {

    private int receipt_apply_id; //主键ID
    private String  waybill_no;    //对账单/运单
    private String serial_number;  //申请流水号
    private String e_card_no;    //E卡通/会员号
    private String receipt_no; //发票号
    private String register_name;   //发票登记人(发货客户）
    private String register_mobile;   //登记人电话
    private String tax_identification_no;   //纳税人识别号
    private Boolean account_bank;   //开户行
    private String bank_card_no;   //银行卡号
    private String address;   //地址
    private double receipt_amt;   //发票金额
    private Boolean receipt_status;  //1:未开票 2:已申请 3:
    private double tax_rate; //税率
    private double tax_amt;  //税额
    private double no_tax_amt;  //不含税金额
    private double waybill_total; //运单数
    private Boolean is_duty_free; //0：免税，1：不免税
    private Boolean receipt_type; //发票类型
    private String apply_dept; //申请网点
    private double apply_tm; //申请时间
    private String apply_emp; //申请人(网点操作人)
    private String apply_name; //申请人名称
    private String drawer_emp; //开票人(录单人)
    private String drawer_name; //开票人名称
    private String comp_code; //公司code
    private String org_type; //组织类型:作业、财务结算、成员企业
    private String creater; //创建人（主键+工号code）
    private double reater_time; //创建时间
    private String modifier; //修改人(主键+工号code)
    private double modifier_time; //修改时间
    private Boolean is_delete; //是否删除 0未删除；1 已删除
    private double record_version; //版本号

    //无参构造
    public Finance_receipt_apply() {

    }

    //有参构造
    public Finance_receipt_apply(int receipt_apply_id, String waybill_no, String serial_number, String e_card_no, String receipt_no, String register_name, String register_mobile, String tax_identification_no, Boolean account_bank, String bank_card_no, String address, double receipt_amt, Boolean receipt_status, double tax_rate, double tax_amt, double no_tax_amt, double waybill_total, Boolean is_duty_free, Boolean receipt_type, String apply_dept, double apply_tm, String apply_emp, String apply_name, String drawer_emp, String drawer_name, String comp_code, String org_type, String creater, double reater_time, String modifier, double modifier_time, Boolean is_delete, double record_version) {
        this.receipt_apply_id = receipt_apply_id;
        this.waybill_no = waybill_no;
        this.serial_number = serial_number;
        this.e_card_no = e_card_no;
        this.receipt_no = receipt_no;
        this.register_name = register_name;
        this.register_mobile = register_mobile;
        this.tax_identification_no = tax_identification_no;
        this.account_bank = account_bank;
        this.bank_card_no = bank_card_no;
        this.address = address;
        this.receipt_amt = receipt_amt;
        this.receipt_status = receipt_status;
        this.tax_rate = tax_rate;
        this.tax_amt = tax_amt;
        this.no_tax_amt = no_tax_amt;
        this.waybill_total = waybill_total;
        this.is_duty_free = is_duty_free;
        this.receipt_type = receipt_type;
        this.apply_dept = apply_dept;
        this.apply_tm = apply_tm;
        this.apply_emp = apply_emp;
        this.apply_name = apply_name;
        this.drawer_emp = drawer_emp;
        this.drawer_name = drawer_name;
        this.comp_code = comp_code;
        this.org_type = org_type;
        this.creater = creater;
        this.reater_time = reater_time;
        this.modifier = modifier;
        this.modifier_time = modifier_time;
        this.is_delete = is_delete;
        this.record_version = record_version;
    }

    //有参构造
    public Finance_receipt_apply(String waybill_no, String serial_number, String e_card_no, String receipt_no, String register_name, String register_mobile, String tax_identification_no, Boolean account_bank, String bank_card_no, String address, double receipt_amt, Boolean receipt_status, double tax_rate, double tax_amt, double no_tax_amt, double waybill_total, Boolean is_duty_free, Boolean receipt_type, String apply_dept, double apply_tm, String apply_emp, String apply_name, String drawer_emp, String drawer_name, String comp_code, String org_type, String creater, double reater_time, String modifier, double modifier_time, Boolean is_delete, double record_version) {
        this.waybill_no = waybill_no;
        this.serial_number = serial_number;
        this.e_card_no = e_card_no;
        this.receipt_no = receipt_no;
        this.register_name = register_name;
        this.register_mobile = register_mobile;
        this.tax_identification_no = tax_identification_no;
        this.account_bank = account_bank;
        this.bank_card_no = bank_card_no;
        this.address = address;
        this.receipt_amt = receipt_amt;
        this.receipt_status = receipt_status;
        this.tax_rate = tax_rate;
        this.tax_amt = tax_amt;
        this.no_tax_amt = no_tax_amt;
        this.waybill_total = waybill_total;
        this.is_duty_free = is_duty_free;
        this.receipt_type = receipt_type;
        this.apply_dept = apply_dept;
        this.apply_tm = apply_tm;
        this.apply_emp = apply_emp;
        this.apply_name = apply_name;
        this.drawer_emp = drawer_emp;
        this.drawer_name = drawer_name;
        this.comp_code = comp_code;
        this.org_type = org_type;
        this.creater = creater;
        this.reater_time = reater_time;
        this.modifier = modifier;
        this.modifier_time = modifier_time;
        this.is_delete = is_delete;
        this.record_version = record_version;
    }


    //get和set方法
    public int getReceipt_apply_id() {
        return receipt_apply_id;
    }

    public void setReceipt_apply_id(int receipt_apply_id) {
        this.receipt_apply_id = receipt_apply_id;
    }

    public String getWaybill_no() {
        return waybill_no;
    }

    public void setWaybill_no(String waybill_no) {
        this.waybill_no = waybill_no;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getE_card_no() {
        return e_card_no;
    }

    public void setE_card_no(String e_card_no) {
        this.e_card_no = e_card_no;
    }

    public String getReceipt_no() {
        return receipt_no;
    }

    public void setReceipt_no(String receipt_no) {
        this.receipt_no = receipt_no;
    }

    public String getRegister_name() {
        return register_name;
    }

    public void setRegister_name(String register_name) {
        this.register_name = register_name;
    }

    public String getRegister_mobile() {
        return register_mobile;
    }

    public void setRegister_mobile(String register_mobile) {
        this.register_mobile = register_mobile;
    }

    public String getTax_identification_no() {
        return tax_identification_no;
    }

    public void setTax_identification_no(String tax_identification_no) {
        this.tax_identification_no = tax_identification_no;
    }

    public Boolean getAccount_bank() {
        return account_bank;
    }

    public void setAccount_bank(Boolean account_bank) {
        this.account_bank = account_bank;
    }

    public String getBank_card_no() {
        return bank_card_no;
    }

    public void setBank_card_no(String bank_card_no) {
        this.bank_card_no = bank_card_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getReceipt_amt() {
        return receipt_amt;
    }

    public void setReceipt_amt(double receipt_amt) {
        this.receipt_amt = receipt_amt;
    }

    public Boolean getReceipt_status() {
        return receipt_status;
    }

    public void setReceipt_status(Boolean receipt_status) {
        this.receipt_status = receipt_status;
    }

    public double getTax_rate() {
        return tax_rate;
    }

    public void setTax_rate(double tax_rate) {
        this.tax_rate = tax_rate;
    }

    public double getTax_amt() {
        return tax_amt;
    }

    public void setTax_amt(double tax_amt) {
        this.tax_amt = tax_amt;
    }

    public double getNo_tax_amt() {
        return no_tax_amt;
    }

    public void setNo_tax_amt(double no_tax_amt) {
        this.no_tax_amt = no_tax_amt;
    }

    public double getWaybill_total() {
        return waybill_total;
    }

    public void setWaybill_total(double waybill_total) {
        this.waybill_total = waybill_total;
    }

    public Boolean getIs_duty_free() {
        return is_duty_free;
    }

    public void setIs_duty_free(Boolean is_duty_free) {
        this.is_duty_free = is_duty_free;
    }

    public Boolean getReceipt_type() {
        return receipt_type;
    }

    public void setReceipt_type(Boolean receipt_type) {
        this.receipt_type = receipt_type;
    }

    public String getApply_dept() {
        return apply_dept;
    }

    public void setApply_dept(String apply_dept) {
        this.apply_dept = apply_dept;
    }

    public double getApply_tm() {
        return apply_tm;
    }

    public void setApply_tm(double apply_tm) {
        this.apply_tm = apply_tm;
    }

    public String getApply_emp() {
        return apply_emp;
    }

    public void setApply_emp(String apply_emp) {
        this.apply_emp = apply_emp;
    }

    public String getApply_name() {
        return apply_name;
    }

    public void setApply_name(String apply_name) {
        this.apply_name = apply_name;
    }

    public String getDrawer_emp() {
        return drawer_emp;
    }

    public void setDrawer_emp(String drawer_emp) {
        this.drawer_emp = drawer_emp;
    }

    public String getDrawer_name() {
        return drawer_name;
    }

    public void setDrawer_name(String drawer_name) {
        this.drawer_name = drawer_name;
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

    public double getReater_time() {
        return reater_time;
    }

    public void setReater_time(double reater_time) {
        this.reater_time = reater_time;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public double getModifier_time() {
        return modifier_time;
    }

    public void setModifier_time(double modifier_time) {
        this.modifier_time = modifier_time;
    }

    public Boolean getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    public double getRecord_version() {
        return record_version;
    }

    public void setRecord_version(double record_version) {
        this.record_version = record_version;
    }



}
