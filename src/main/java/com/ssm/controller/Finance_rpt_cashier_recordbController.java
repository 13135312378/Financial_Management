package com.ssm.controller;

import com.ssm.dao.IFinance_rpt_cashier_recordb;
import com.ssm.entity.Finance_rpt_cashier_recordb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Finance_rpt_cashier_recordbController {

    @Autowired
    private IFinance_rpt_cashier_recordb IFinance_rpt_cashier_recordb;



    @RequestMapping("getrecordb")
    private List<Finance_rpt_cashier_recordb> getrecordb(){
        List<Finance_rpt_cashier_recordb> li = IFinance_rpt_cashier_recordb.getrecordb();

        for (Finance_rpt_cashier_recordb rec : li) {
            System.out.println("金额："+rec.getFee_amt());
        }

        return li;

    }


}
