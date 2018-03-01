package com.ssm.controller;

import com.ssm.dao.IFinance_bac_subject_def;
import com.ssm.entity.Finance_bac_subject_def;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class Finance_bac_subject_defController {

    @Autowired
    private IFinance_bac_subject_def iFinance_bac_subject_def;
@ResponseBody
  @RequestMapping("fgetall")
     public List<Finance_bac_subject_def> fgetall(){
      System.out.println("进入测试");
    List<Finance_bac_subject_def> li= iFinance_bac_subject_def.getfinance_bac_subject_def();
      for (Finance_bac_subject_def f : li) {
          System.out.println(f.getSubject_name());
      }
      return li;
     }

}
