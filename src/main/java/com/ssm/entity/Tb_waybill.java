package com.ssm.entity;

import java.util.Date;
import java.util.Set;

/**
 * 运单表
 */
public class Tb_waybill {

    private int waybill_id;	 //Id号
    private String waybill_no;	 //运单号
    private String audited_flag;//审核标志
    private Date audited_tm;	//审核时间
    private String audited_emp_code;	//审核人编码
    private String biz_type_code;		//业务类型
    private String goods_no;		//货单号
    private int category_count;	//特殊计费数量
    private String chargeable_unit;	//计费单位
    private double chargeable_weight; //计费重量
    private double real_weight;		//实际重量
    private  int quantity; //	件数
    private double volume;		//体积
    private String province_code;		//收件方省编码
    private String city_code;		//收件方市编码
    private String county_code; //	收件方区/县编码
    private String town_code;		//乡镇编码
    private String consign_code;	//托寄物编码
    private String consign_name;		//托寄物内容
    private String consignee;		//收件人
    private String consignee_address;		//收件地址
    private String consignee_comp_name;		//收件公司
    private String consignee_cont_name;		//收件方联系人
    private String consignee_phone_prefix;		//收件人电话
    private String consignee_phone;		//收件人电话区号
    private String source_zone_code;		//寄件网点
    private String send_comp_name;		//寄件公司名称
    private String send_cont_name;		//寄件联系人
    private String send_cust_code;		//寄件客户编码
    private String sender;		//寄件人
    private String send_phone_prefix;		//寄件人电话区号
    private String send_phone;		//寄件人电话
    private Date send_tm;		//寄件时间
    private String consignor_emp_code;		//揽件人-网点员工
    private Date consignor_tm;		//揽件时间
    private String dest_zone_code;	//目的网点编码
    private String dispatch_area_code;		//派送区域代码
    private String dispatch_big_area_code;		//派送大区代码
    private String dispatch_small_area_code;	 //派送小区代码
    private String forward_code;		//转寄地编码
    private String forward_flag;		//转寄标识
    private String forward_na;		//转寄地名称
    private String inputer_emp_code;	//录入员
    private Date input_tm;		//录入时间
    private String data_source_type;		//据来源类型
    private String upload_type;		//上传类型
    private String lock_version_no;		//锁本版号
    private String memo;		//备注
    private String modified_emp_code;		//修改人编号
    private Date modified_tm;		//修改时间
    private String order_no;		//订单号
    private String service_type_code;		//服务方式
    private String settlement_type_code;		//结算类型
    private String product_type_code;		//产品类型
    private String payment_type_code;		//付款类型
    private String print_num;		//标签打印数
    private  int version_no;	//版本号
    private  String route;		//运单路由
    private String status;		//运单状态 1-正常,2-中止单,3-作废单,4-返货
    private String waybill_type_code;		//运单类型  1-清单2-回单
    private String comp_code;		//企业代码


    //运单表与代付款收款表产生一对多的关系
    private Set<Finance_cop_payment> finance_cop_payment;

    public Set<Finance_cop_payment> getFinance_cop_payment() {
        return finance_cop_payment;
    }

    public void setFinance_cop_payment(Set<Finance_cop_payment> finance_cop_payment) {
        this.finance_cop_payment = finance_cop_payment;
    }








    //构造方法
    public  Tb_waybill(){

    }

    public Tb_waybill(String waybill_no, String audited_flag, Date audited_tm, String audited_emp_code, String biz_type_code, String goods_no, int category_count, String chargeable_unit, double chargeable_weight, double real_weight, int quantity, double volume, String province_code, String city_code, String county_code, String town_code, String consign_code, String consign_name, String consignee, String consignee_address, String consignee_comp_name, String consignee_cont_name, String consignee_phone_prefix, String consignee_phone, String source_zone_code, String send_comp_name, String send_cont_name, String send_cust_code, String sender, String send_phone_prefix, String send_phone, Date send_tm, String consignor_emp_code, Date consignor_tm, String dest_zone_code, String dispatch_area_code, String dispatch_big_area_code, String dispatch_small_area_code, String forward_code, String forward_flag, String forward_na, String inputer_emp_code, Date input_tm, String data_source_type, String upload_type, String lock_version_no, String memo, String modified_emp_code, Date modified_tm, String order_no, String service_type_code, String settlement_type_code, String product_type_code, String payment_type_code, String print_num, int version_no, String route, String status, String waybill_type_code, String comp_code) {
        this.waybill_no = waybill_no;
        this.audited_flag = audited_flag;
        this.audited_tm = audited_tm;
        this.audited_emp_code = audited_emp_code;
        this.biz_type_code = biz_type_code;
        this.goods_no = goods_no;
        this.category_count = category_count;
        this.chargeable_unit = chargeable_unit;
        this.chargeable_weight = chargeable_weight;
        this.real_weight = real_weight;
        this.quantity = quantity;
        this.volume = volume;
        this.province_code = province_code;
        this.city_code = city_code;
        this.county_code = county_code;
        this.town_code = town_code;
        this.consign_code = consign_code;
        this.consign_name = consign_name;
        this.consignee = consignee;
        this.consignee_address = consignee_address;
        this.consignee_comp_name = consignee_comp_name;
        this.consignee_cont_name = consignee_cont_name;
        this.consignee_phone_prefix = consignee_phone_prefix;
        this.consignee_phone = consignee_phone;
        this.source_zone_code = source_zone_code;
        this.send_comp_name = send_comp_name;
        this.send_cont_name = send_cont_name;
        this.send_cust_code = send_cust_code;
        this.sender = sender;
        this.send_phone_prefix = send_phone_prefix;
        this.send_phone = send_phone;
        this.send_tm = send_tm;
        this.consignor_emp_code = consignor_emp_code;
        this.consignor_tm = consignor_tm;
        this.dest_zone_code = dest_zone_code;
        this.dispatch_area_code = dispatch_area_code;
        this.dispatch_big_area_code = dispatch_big_area_code;
        this.dispatch_small_area_code = dispatch_small_area_code;
        this.forward_code = forward_code;
        this.forward_flag = forward_flag;
        this.forward_na = forward_na;
        this.inputer_emp_code = inputer_emp_code;
        this.input_tm = input_tm;
        this.data_source_type = data_source_type;
        this.upload_type = upload_type;
        this.lock_version_no = lock_version_no;
        this.memo = memo;
        this.modified_emp_code = modified_emp_code;
        this.modified_tm = modified_tm;
        this.order_no = order_no;
        this.service_type_code = service_type_code;
        this.settlement_type_code = settlement_type_code;
        this.product_type_code = product_type_code;
        this.payment_type_code = payment_type_code;
        this.print_num = print_num;
        this.version_no = version_no;
        this.route = route;
        this.status = status;
        this.waybill_type_code = waybill_type_code;
        this.comp_code = comp_code;
    }


    public Tb_waybill(int waybill_id, String waybill_no, String audited_flag, Date audited_tm, String audited_emp_code, String biz_type_code, String goods_no, int category_count, String chargeable_unit, double chargeable_weight, double real_weight, int quantity, double volume, String province_code, String city_code, String county_code, String town_code, String consign_code, String consign_name, String consignee, String consignee_address, String consignee_comp_name, String consignee_cont_name, String consignee_phone_prefix, String consignee_phone, String source_zone_code, String send_comp_name, String send_cont_name, String send_cust_code, String sender, String send_phone_prefix, String send_phone, Date send_tm, String consignor_emp_code, Date consignor_tm, String dest_zone_code, String dispatch_area_code, String dispatch_big_area_code, String dispatch_small_area_code, String forward_code, String forward_flag, String forward_na, String inputer_emp_code, Date input_tm, String data_source_type, String upload_type, String lock_version_no, String memo, String modified_emp_code, Date modified_tm, String order_no, String service_type_code, String settlement_type_code, String product_type_code, String payment_type_code, String print_num, int version_no, String route, String status, String waybill_type_code, String comp_code) {
        this.waybill_id = waybill_id;
        this.waybill_no = waybill_no;
        this.audited_flag = audited_flag;
        this.audited_tm = audited_tm;
        this.audited_emp_code = audited_emp_code;
        this.biz_type_code = biz_type_code;
        this.goods_no = goods_no;
        this.category_count = category_count;
        this.chargeable_unit = chargeable_unit;
        this.chargeable_weight = chargeable_weight;
        this.real_weight = real_weight;
        this.quantity = quantity;
        this.volume = volume;
        this.province_code = province_code;
        this.city_code = city_code;
        this.county_code = county_code;
        this.town_code = town_code;
        this.consign_code = consign_code;
        this.consign_name = consign_name;
        this.consignee = consignee;
        this.consignee_address = consignee_address;
        this.consignee_comp_name = consignee_comp_name;
        this.consignee_cont_name = consignee_cont_name;
        this.consignee_phone_prefix = consignee_phone_prefix;
        this.consignee_phone = consignee_phone;
        this.source_zone_code = source_zone_code;
        this.send_comp_name = send_comp_name;
        this.send_cont_name = send_cont_name;
        this.send_cust_code = send_cust_code;
        this.sender = sender;
        this.send_phone_prefix = send_phone_prefix;
        this.send_phone = send_phone;
        this.send_tm = send_tm;
        this.consignor_emp_code = consignor_emp_code;
        this.consignor_tm = consignor_tm;
        this.dest_zone_code = dest_zone_code;
        this.dispatch_area_code = dispatch_area_code;
        this.dispatch_big_area_code = dispatch_big_area_code;
        this.dispatch_small_area_code = dispatch_small_area_code;
        this.forward_code = forward_code;
        this.forward_flag = forward_flag;
        this.forward_na = forward_na;
        this.inputer_emp_code = inputer_emp_code;
        this.input_tm = input_tm;
        this.data_source_type = data_source_type;
        this.upload_type = upload_type;
        this.lock_version_no = lock_version_no;
        this.memo = memo;
        this.modified_emp_code = modified_emp_code;
        this.modified_tm = modified_tm;
        this.order_no = order_no;
        this.service_type_code = service_type_code;
        this.settlement_type_code = settlement_type_code;
        this.product_type_code = product_type_code;
        this.payment_type_code = payment_type_code;
        this.print_num = print_num;
        this.version_no = version_no;
        this.route = route;
        this.status = status;
        this.waybill_type_code = waybill_type_code;
        this.comp_code = comp_code;
    }

    //get
    public int getWaybill_id() {
        return waybill_id;
    }

    public String getWaybill_no() {
        return waybill_no;
    }

    public String getAudited_flag() {
        return audited_flag;
    }

    public Date getAudited_tm() {
        return audited_tm;
    }

    public String getAudited_emp_code() {
        return audited_emp_code;
    }

    public String getBiz_type_code() {
        return biz_type_code;
    }

    public String getGoods_no() {
        return goods_no;
    }

    public int getCategory_count() {
        return category_count;
    }

    public String getChargeable_unit() {
        return chargeable_unit;
    }

    public double getChargeable_weight() {
        return chargeable_weight;
    }

    public double getReal_weight() {
        return real_weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getVolume() {
        return volume;
    }

    public String getProvince_code() {
        return province_code;
    }

    public String getCity_code() {
        return city_code;
    }

    public String getCounty_code() {
        return county_code;
    }

    public String getTown_code() {
        return town_code;
    }

    public String getConsign_code() {
        return consign_code;
    }

    public String getConsign_name() {
        return consign_name;
    }

    public String getConsignee() {
        return consignee;
    }

    public String getConsignee_address() {
        return consignee_address;
    }

    public String getConsignee_comp_name() {
        return consignee_comp_name;
    }

    public String getConsignee_cont_name() {
        return consignee_cont_name;
    }

    public String getConsignee_phone_prefix() {
        return consignee_phone_prefix;
    }

    public String getConsignee_phone() {
        return consignee_phone;
    }

    public String getSource_zone_code() {
        return source_zone_code;
    }

    public String getSend_comp_name() {
        return send_comp_name;
    }

    public String getSend_cont_name() {
        return send_cont_name;
    }

    public String getSend_cust_code() {
        return send_cust_code;
    }

    public String getSender() {
        return sender;
    }

    public String getSend_phone_prefix() {
        return send_phone_prefix;
    }

    public String getSend_phone() {
        return send_phone;
    }

    public Date getSend_tm() {
        return send_tm;
    }

    public String getConsignor_emp_code() {
        return consignor_emp_code;
    }

    public Date getConsignor_tm() {
        return consignor_tm;
    }

    public String getDest_zone_code() {
        return dest_zone_code;
    }

    public String getDispatch_area_code() {
        return dispatch_area_code;
    }

    public String getDispatch_big_area_code() {
        return dispatch_big_area_code;
    }

    public String getDispatch_small_area_code() {
        return dispatch_small_area_code;
    }

    public String getForward_code() {
        return forward_code;
    }

    public String getForward_flag() {
        return forward_flag;
    }

    public String getForward_na() {
        return forward_na;
    }

    public String getInputer_emp_code() {
        return inputer_emp_code;
    }

    public Date getInput_tm() {
        return input_tm;
    }

    public String getData_source_type() {
        return data_source_type;
    }

    public String getUpload_type() {
        return upload_type;
    }

    public String getLock_version_no() {
        return lock_version_no;
    }

    public String getMemo() {
        return memo;
    }

    public String getModified_emp_code() {
        return modified_emp_code;
    }

    public Date getModified_tm() {
        return modified_tm;
    }

    public String getOrder_no() {
        return order_no;
    }

    public String getService_type_code() {
        return service_type_code;
    }

    public String getSettlement_type_code() {
        return settlement_type_code;
    }

    public String getProduct_type_code() {
        return product_type_code;
    }

    public String getPayment_type_code() {
        return payment_type_code;
    }

    public String getPrint_num() {
        return print_num;
    }

    public int getVersion_no() {
        return version_no;
    }

    public String getRoute() {
        return route;
    }

    public String getStatus() {
        return status;
    }

    public String getWaybill_type_code() {
        return waybill_type_code;
    }

    public String getComp_code() {
        return comp_code;
    }


    //set
    public void setWaybill_id(int waybill_id) {
        this.waybill_id = waybill_id;
    }

    public void setWaybill_no(String waybill_no) {
        this.waybill_no = waybill_no;
    }

    public void setAudited_flag(String audited_flag) {
        this.audited_flag = audited_flag;
    }

    public void setAudited_tm(Date audited_tm) {
        this.audited_tm = audited_tm;
    }

    public void setAudited_emp_code(String audited_emp_code) {
        this.audited_emp_code = audited_emp_code;
    }

    public void setBiz_type_code(String biz_type_code) {
        this.biz_type_code = biz_type_code;
    }

    public void setGoods_no(String goods_no) {
        this.goods_no = goods_no;
    }

    public void setCategory_count(int category_count) {
        this.category_count = category_count;
    }

    public void setChargeable_unit(String chargeable_unit) {
        this.chargeable_unit = chargeable_unit;
    }

    public void setChargeable_weight(double chargeable_weight) {
        this.chargeable_weight = chargeable_weight;
    }

    public void setReal_weight(double real_weight) {
        this.real_weight = real_weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public void setCounty_code(String county_code) {
        this.county_code = county_code;
    }

    public void setTown_code(String town_code) {
        this.town_code = town_code;
    }

    public void setConsign_code(String consign_code) {
        this.consign_code = consign_code;
    }

    public void setConsign_name(String consign_name) {
        this.consign_name = consign_name;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public void setConsignee_address(String consignee_address) {
        this.consignee_address = consignee_address;
    }

    public void setConsignee_comp_name(String consignee_comp_name) {
        this.consignee_comp_name = consignee_comp_name;
    }

    public void setConsignee_cont_name(String consignee_cont_name) {
        this.consignee_cont_name = consignee_cont_name;
    }

    public void setConsignee_phone_prefix(String consignee_phone_prefix) {
        this.consignee_phone_prefix = consignee_phone_prefix;
    }

    public void setConsignee_phone(String consignee_phone) {
        this.consignee_phone = consignee_phone;
    }

    public void setSource_zone_code(String source_zone_code) {
        this.source_zone_code = source_zone_code;
    }

    public void setSend_comp_name(String send_comp_name) {
        this.send_comp_name = send_comp_name;
    }

    public void setSend_cont_name(String send_cont_name) {
        this.send_cont_name = send_cont_name;
    }

    public void setSend_cust_code(String send_cust_code) {
        this.send_cust_code = send_cust_code;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setSend_phone_prefix(String send_phone_prefix) {
        this.send_phone_prefix = send_phone_prefix;
    }

    public void setSend_phone(String send_phone) {
        this.send_phone = send_phone;
    }

    public void setSend_tm(Date send_tm) {
        this.send_tm = send_tm;
    }

    public void setConsignor_emp_code(String consignor_emp_code) {
        this.consignor_emp_code = consignor_emp_code;
    }

    public void setConsignor_tm(Date consignor_tm) {
        this.consignor_tm = consignor_tm;
    }

    public void setDest_zone_code(String dest_zone_code) {
        this.dest_zone_code = dest_zone_code;
    }

    public void setDispatch_area_code(String dispatch_area_code) {
        this.dispatch_area_code = dispatch_area_code;
    }

    public void setDispatch_big_area_code(String dispatch_big_area_code) {
        this.dispatch_big_area_code = dispatch_big_area_code;
    }

    public void setDispatch_small_area_code(String dispatch_small_area_code) {
        this.dispatch_small_area_code = dispatch_small_area_code;
    }

    public void setForward_code(String forward_code) {
        this.forward_code = forward_code;
    }

    public void setForward_flag(String forward_flag) {
        this.forward_flag = forward_flag;
    }

    public void setForward_na(String forward_na) {
        this.forward_na = forward_na;
    }

    public void setInputer_emp_code(String inputer_emp_code) {
        this.inputer_emp_code = inputer_emp_code;
    }

    public void setInput_tm(Date input_tm) {
        this.input_tm = input_tm;
    }

    public void setData_source_type(String data_source_type) {
        this.data_source_type = data_source_type;
    }

    public void setUpload_type(String upload_type) {
        this.upload_type = upload_type;
    }

    public void setLock_version_no(String lock_version_no) {
        this.lock_version_no = lock_version_no;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setModified_emp_code(String modified_emp_code) {
        this.modified_emp_code = modified_emp_code;
    }

    public void setModified_tm(Date modified_tm) {
        this.modified_tm = modified_tm;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public void setService_type_code(String service_type_code) {
        this.service_type_code = service_type_code;
    }

    public void setSettlement_type_code(String settlement_type_code) {
        this.settlement_type_code = settlement_type_code;
    }

    public void setProduct_type_code(String product_type_code) {
        this.product_type_code = product_type_code;
    }

    public void setPayment_type_code(String payment_type_code) {
        this.payment_type_code = payment_type_code;
    }

    public void setPrint_num(String print_num) {
        this.print_num = print_num;
    }

    public void setVersion_no(int version_no) {
        this.version_no = version_no;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setWaybill_type_code(String waybill_type_code) {
        this.waybill_type_code = waybill_type_code;
    }

    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }
}
