package com.ssm.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

public class Finance_rpt_voucher_details {
    //凭证明细表
    private int voucher_details_id;//ID


    //private  int voucher_id;//凭证ID
    private  int waybill_no;//运单号
    private  String voucher_no;//凭证号
    private  String receipt_no;//收据号
    private  String invoice_no;//发票号码
    private  String check_no;//支票号码
    private   String voucher_code;//编号
    private  String batch_code;//批次号
    private  String vertical_item;//核销项目
    private  double   voucher_amount;// 核销金额
    private  String source_zone_code;//始发站
    private  String dest_zone_code;//目的站
    private String consignor_cont_name;//寄件人
    private  String addressee_cont_name;//收件人
    private  String     goods_no;//货号
    private  String    out_dist_code;//目的城市
    private  String     input_emp_code;//收件员工
    private  String dept_code;//网点
    private  Date input_tm;//录单时间
    private  String comp_code;//公司代码
    private  int doc_type;//凭证类型：0-正常 1-作废原单 2-反核销
    private  int oper_type;//操作类型：1-收(付)款 2-冲账
    private  String creater;//创建人
    private   Timestamp creater_time;//	创建日期
    private   String   modifier;//修改人
    private   Date   modifier_time;//修改日期
    private  Date  latest_time;//最近修改日期
    private   int  datetime;//锁版本号
    private    String ATTRIBUTE1;//扩展字段1
    private    String  ATTRIBUTE2;//扩展字段2
    private   String  ATTRIBUTE3;//扩展字段3
    private  String   ATTRIBUTE4;//扩展字段4

    //核销主表
    private Finance_rpt_voucher Finance_rpt_voucher;

    public com.ssm.entity.Finance_rpt_voucher getFinance_rpt_voucher() {
        return Finance_rpt_voucher;
    }

    public void setFinance_rpt_voucher(com.ssm.entity.Finance_rpt_voucher finance_rpt_voucher) {
        Finance_rpt_voucher = finance_rpt_voucher;
    }


    public Finance_rpt_voucher_details() {
    }

    public int getVoucher_details_id() {
        return voucher_details_id;
    }

    public void setVoucher_details_id(int voucher_details_id) {
        this.voucher_details_id = voucher_details_id;
    }

//    public int getVoucher_id() {
//        return voucher_id;
//    }

//    public void setVoucher_id(int voucher_id) {
//        this.voucher_id = voucher_id;
//    }

    public int getWaybill_no() {
        return waybill_no;
    }

    public void setWaybill_no(int waybill_no) {
        this.waybill_no = waybill_no;
    }

    public String getVoucher_no() {
        return voucher_no;
    }

    public void setVoucher_no(String voucher_no) {
        this.voucher_no = voucher_no;
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

    public String getVoucher_code() {
        return voucher_code;
    }

    public void setVoucher_code(String voucher_code) {
        this.voucher_code = voucher_code;
    }

    public String getBatch_code() {
        return batch_code;
    }

    public void setBatch_code(String batch_code) {
        this.batch_code = batch_code;
    }

    public String getVertical_item() {
        return vertical_item;
    }

    public void setVertical_item(String vertical_item) {
        this.vertical_item = vertical_item;
    }

    public double getVoucher_amount() {
        return voucher_amount;
    }

    public void setVoucher_amount(double voucher_amount) {
        this.voucher_amount = voucher_amount;
    }

    public String getSource_zone_code() {
        return source_zone_code;
    }

    public void setSource_zone_code(String source_zone_code) {
        this.source_zone_code = source_zone_code;
    }

    public String getDest_zone_code() {
        return dest_zone_code;
    }

    public void setDest_zone_code(String dest_zone_code) {
        this.dest_zone_code = dest_zone_code;
    }

    public String getConsignor_cont_name() {
        return consignor_cont_name;
    }

    public void setConsignor_cont_name(String consignor_cont_name) {
        this.consignor_cont_name = consignor_cont_name;
    }

    public String getAddressee_cont_name() {
        return addressee_cont_name;
    }

    public void setAddressee_cont_name(String addressee_cont_name) {
        this.addressee_cont_name = addressee_cont_name;
    }

    public String getGoods_no() {
        return goods_no;
    }

    public void setGoods_no(String goods_no) {
        this.goods_no = goods_no;
    }

    public String getOut_dist_code() {
        return out_dist_code;
    }

    public void setOut_dist_code(String out_dist_code) {
        this.out_dist_code = out_dist_code;
    }

    public String getInput_emp_code() {
        return input_emp_code;
    }

    public void setInput_emp_code(String input_emp_code) {
        this.input_emp_code = input_emp_code;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public Date getInput_tm() {
        return input_tm;
    }

    public void setInput_tm(Date input_tm) {
        this.input_tm = input_tm;
    }

    public String getComp_code() {
        return comp_code;
    }

    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }

    public int getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(int doc_type) {
        this.doc_type = doc_type;
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

    public Timestamp getCreater_time() {
        return creater_time;
    }

    public void setCreater_time(Timestamp creater_time) {
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

    public int getDatetime() {
        return datetime;
    }

    public void setDatetime(int datetime) {
        this.datetime = datetime;
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
