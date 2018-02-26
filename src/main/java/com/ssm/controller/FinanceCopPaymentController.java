package com.ssm.controller;

import com.ssm.dao.IFinanceCopPaymentDao;
import com.ssm.entity.Finance_cop_payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 代收货款管理中需要实现的业务实现
 */


@Controller
public class FinanceCopPaymentController {

    @Autowired
    private IFinanceCopPaymentDao iFinanceCopPaymentDao;

    @ResponseBody
    @RequestMapping("get_AllFinance")
    public List<Finance_cop_payment> get_AllFinance(){

        List<Finance_cop_payment> list=iFinanceCopPaymentDao.getalllogin();

        return list;
    }






}
