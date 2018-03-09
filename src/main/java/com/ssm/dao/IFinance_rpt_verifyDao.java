package com.ssm.dao;

import com.ssm.entity.Finance_rpt_verify;

import java.util.List;

public interface IFinance_rpt_verifyDao {


    /**
     * 预付款充值核销
     */

     //绑定数据
    public List<Finance_rpt_verify> getAll_Verify();

    //核销
    public void update_verify_states(int verify_id);

    //撤销核销
    public void update_verify_statescx(int verify_id);


    /**
     * 回款核销
     */
    //绑定数据
    public List<Finance_rpt_verify> getALL_hk_Verify();

    //核销
    public void update_verify_state_hkhx(int verify_id);

   //撤销核销
   public void update_verify_state_hkcx(int verify_id);


    /**
     * 理赔核销
     */
    //绑定数据
    public List<Finance_rpt_verify> getAll_Verify_lp();

    //核销
    public void update_verify_lphx(int verify_id);

    //撤销核销
    public void update_verify_cxhxlp(int verify_id);

    /**
     * 运单费用核销
     */
     //绑值
     public List<Finance_rpt_verify> getAll_verify_ydfy();

    //核销
    public void update_verify_ydhx(int verify_id);

    //撤销核销
    public void update_verify_ydcxhx(int verify_id);

     public void update();

}
