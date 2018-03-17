package com.ssm.controller;

import com.ssm.dao.IFinance_rpt_voucher;
import com.ssm.entity.Finance_rpt_voucher;
import com.ssm.entity.Finance_rpt_voucher_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Set;

@Controller
public class Finance_rpt_voucherController {
    @Autowired
    private IFinance_rpt_voucher IFinance_rpt_voucher;


    @ResponseBody
    @RequestMapping("getvoucher")
    public List<Finance_rpt_voucher> getvoucher(){

        System.out.println("核销");
        List<Finance_rpt_voucher> li = IFinance_rpt_voucher.getvouche();
        for (Finance_rpt_voucher v : li) {

            Set<Finance_rpt_voucher_details> lib = v.getFinance_rpt_voucher_details();

            v.setGl_number(lib.size());

        }
        return li;
    }
}
