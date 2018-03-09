package com.ssm.controller;

import com.ssm.dao.IFinance_rpt_verifyDao;
import com.ssm.entity.Finance_rpt_verify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Finance_rpt_verityController {



      @Autowired
      private IFinance_rpt_verifyDao iFinance_rpt_verifyDao;



    /**
     * 预付款充值核销
     */

     //绑定数据
    @RequestMapping("getAll_Verifys")
    @ResponseBody
    public List<Finance_rpt_verify> getAll_Verifys(){
        List<Finance_rpt_verify> list=iFinance_rpt_verifyDao.getAll_Verify();
        return list;
    }

    //核销
    @RequestMapping("update_verify_hxcontro")
    public void update_verify_hxcontro(int verify_id){
        iFinance_rpt_verifyDao.update_verify_states(verify_id);
    }

    //撤销核销
    @RequestMapping("update_verify_cscontro")
    public void update_verify_cscontro(int verify_id){
        iFinance_rpt_verifyDao.update_verify_statescx(verify_id);
    }


    /**
     * 回款核销
     */
     @RequestMapping("getAll_VerifyHK")
     @ResponseBody
     public List<Finance_rpt_verify> getAll_VerifyHK(){
         List<Finance_rpt_verify> list=iFinance_rpt_verifyDao.getALL_hk_Verify();
         return list;
     }

    //核销
    @RequestMapping("update_verify_states_hkcontro")
    public void update_verify_states_hkcontro(int verify_id){
        iFinance_rpt_verifyDao.update_verify_state_hkhx(verify_id);
    }

    //撤销核销
    @RequestMapping("update_verify_states_hkcxcontro")
    public void update_verify_states_hkcxcontro(int verify_id){
        iFinance_rpt_verifyDao.update_verify_state_hkcx(verify_id);
    }


    /**
     * 理赔核销
     */
      //绑定数据
    @RequestMapping("getAll_Verifylpcontro")
    @ResponseBody
     public List<Finance_rpt_verify> getAll_Verifylpcontro(){
        List<Finance_rpt_verify> list=iFinance_rpt_verifyDao.getAll_Verify_lp();
        return list;
     }

     //核销
    @RequestMapping("update_verify_lphxcontro")
    public void update_verify_lphxcontro(int verify_id){
        iFinance_rpt_verifyDao.update_verify_lphx(verify_id);
    }

    //撤销核销
    @RequestMapping("update_verify_lpcxcontro")
    public void update_verify_lpcxcontro(int verify_id){
        iFinance_rpt_verifyDao.update_verify_cxhxlp(verify_id);
    }


    /**
     * 运单费用项核销
     */
    //绑值
    @RequestMapping("getAllsyd")
    @ResponseBody
     public List<Finance_rpt_verify> getAllsyd(){
        List<Finance_rpt_verify> list=iFinance_rpt_verifyDao.getAll_verify_ydfy();
        return  list;
     }

     //核销
    @RequestMapping("update_verify_ydhxcontro")
    public void update_verify_ydhxcontro(int verify_id){
        iFinance_rpt_verifyDao.update_verify_ydhx(verify_id);
    }

    //撤销核销
    @RequestMapping("update_verify_ydcxhxcontro")
    public void update_verify_ydcxhxcontro(int verify_id){
        iFinance_rpt_verifyDao.update_verify_ydcxhx(verify_id);
    }






}
