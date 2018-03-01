package com.ssm.controller;

import com.ssm.dao.IFinance_cas_payable_receivable;
import com.ssm.entity.Finance_bac_subject_def;
import com.ssm.entity.Finance_cas_payable_receivable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Finance_cas_payable_receivableController {

    @Autowired
    private IFinance_cas_payable_receivable iFinance_cas_payable_receivable;
    @ResponseBody
    @RequestMapping("fgetalla")
    public List<Finance_cas_payable_receivable> fgetall(){
        System.out.println("进入测试");
        List<Finance_cas_payable_receivable> li= iFinance_cas_payable_receivable.getFinance_cas_payable_receivable();
        for (Finance_cas_payable_receivable f : li) {
            System.out.println(f.getDept_code());
        }
        return li;
    }

}
