package com.ssm.dao;

import com.ssm.entity.Finance_cop_payment;
import com.ssm.entity.Tb_waybill;

import java.util.List;

/**
 * 代收货款管理中需要的业务方法
 */
public interface IFinanceCopPaymentDao {

    //得到运单和代收款信息
    public List<Tb_waybill> getwaybill_payment();

    //未登记的状态进行登记1>6
    public void updatepayment_state(int waybill_id);

    //登记状态改为取消登记>6-1
    public void updatepayment_stateq(int waybill_id);

    //修改挂失状态
    public void updatepayment_guashi(String oper_state,String lost_name,String lost_identify,String note,double lost_fee,int waybill_id);












}
