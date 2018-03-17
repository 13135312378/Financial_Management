package com.ssm.controller;

import com.ssm.dao.IFinance_bac_verification;
import com.ssm.entity.Finance_bac_verification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Finance_bac_verificationController {
    @Autowired
    private  IFinance_bac_verification iFinance_bac_verification;


      @ResponseBody
      @RequestMapping("getverification")
      public List<Finance_bac_verification> getver(){
          System.out.println("天王盖地虎");
          System.out.println("天王盖地虎s");
    List<Finance_bac_verification> li=  iFinance_bac_verification.getverification();
          return li;
      }




}
