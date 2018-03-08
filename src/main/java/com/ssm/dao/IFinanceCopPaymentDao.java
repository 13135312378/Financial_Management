package com.ssm.dao;

import com.ssm.entity.Finance_cop_batch_payment;
import com.ssm.entity.Finance_cop_payment;
import com.ssm.entity.Tb_waybill;

import java.util.List;

/**
 * 代收货款管理中需要的业务方法
 */
public interface IFinanceCopPaymentDao {

    /**
     * 代收款登记
     * @return
     */
    //得到运单和代收款信息
    public List<Tb_waybill> getwaybill_payment();

    //未登记的状态进行登记1>6
    public void updatepayment_state(int waybill_id);

    //登记状态改为取消登记>6-1
    public void updatepayment_stateq(int waybill_id);

    //修改挂失状态
    public void updatepayment_guashi(String oper_state,String lost_name,String lost_identify,String note,double lost_fee,int waybill_id);


    /**
     * 代收款操作
     */
    //登记审核
    public void update_operation_ds(int waybill_id);

    //取消登记审核
    public void update_operation_qs(int waybill_id);

    //取消挂失
    public void update_operation_gs(int waybill_id);

    //冻结
    public void update_operation_dj(int waybill_id);

    //解冻
    public void update_operation_jd(int waybill_id);

   //取消发款
    public void update_operation_qf(int waybill_id);

    //发款审核
    public void update_operation_fk(int waybill_id);


    /**
     * 代收款发款
     */
    //绑定代收款发款信息
    public List<Tb_waybill> getwaybill_payment_fk();

    //审核通过
    public void update_send_shtg(int waybill_id);

   //撤销审核通过
    public void update_send_shbtg(int waybill_id);

   //得到批次管理
    public List<Finance_cop_batch_payment> getAll_batch();



}
