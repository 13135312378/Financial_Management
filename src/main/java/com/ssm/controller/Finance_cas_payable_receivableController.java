package com.ssm.controller;

import com.ssm.dao.IFinance_bac_subject_def;
import com.ssm.dao.IFinance_cas_pay_rec_details;
import com.ssm.dao.IFinance_cas_payable_receivable;
import com.ssm.entity.Finance_bac_subject_def;
import com.ssm.entity.Finance_cas_pay_rec_details;
import com.ssm.entity.Finance_cas_payable_receivable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Set;

@Controller
public class Finance_cas_payable_receivableController {
    public double money=0;
    @Autowired
    private IFinance_cas_payable_receivable iFinance_cas_payable_receivable;
    @Autowired
    private IFinance_bac_subject_def iFinance_bac_subject_def;
    @Autowired
    private IFinance_cas_pay_rec_details iFinance_cas_pay_rec_details;

    @ResponseBody
    @RequestMapping("fgetalla")

    public List<Finance_cas_payable_receivable> fgetall(){
        System.out.println("进入测试");

        List<Finance_cas_payable_receivable> li= iFinance_cas_payable_receivable.getFinance_cas_payable_receivable();
        List<Finance_cas_payable_receivable> lia= iFinance_cas_payable_receivable.getv_d();

        List<Finance_cas_pay_rec_details> lic = iFinance_cas_pay_rec_details.getdetails();
        for (Finance_cas_pay_rec_details ds : lic) {
            System.out.println("账单时间A:"+ds.getCreater_timee());

        }

        for (Finance_cas_payable_receivable f : lia) {
           // System.out.println("A:"+f.getDept_code());
           // System.out.println("B:"+f.getFinance_bac_subject_def().getSubject_name());
         //   System.out.println("C:"+f.getFinance_cas_pay_rec_details().size());
            Set<Finance_cas_pay_rec_details> lib= f.getFinance_cas_pay_rec_details();
            for (Finance_cas_pay_rec_details bb : lib) {
              //  System.out.println("金额:"+bb.getFee_amt());
                System.out.println("账单时间B："+bb.getCreater_timee());
                System.out.println("生活："+bb.getFee_type_code());
               money=money+bb.getFee_amt();
            }
             f.setBill_fee(money);

          //  System.out.println("总金额："+f.getBill_fee());
          //  System.out.println("对冲："+f.getFinance_bac_subject_def().getIs_red_dashed());

        }
        money=0;
//        for (Finance_cas_payable_receivable f : li) {
//            System.out.println(f.getDept_code());
//        }
        return lia;
    }

    @ResponseBody
    @RequestMapping("fgetallb")
    public  List<Finance_bac_subject_def> getdfe_vece(){

        List<Finance_bac_subject_def> lia = iFinance_bac_subject_def.getdef_veceivable(1);

        return lia;
    }


//  @ResponseBody
  //  @RequestMapping("gettb_waybill")
  //  public  List<Finance_cas_pay_rec_details> gettb_waybill(Finance_cas_pay_rec_details finance_cas_pay_rec_details){
   //     List<Finance_cas_pay_rec_details> lic = iFinance_cas_pay_rec_details.getdetails(finance_cas_pay_rec_details.getPay_rec_detail_id());

   //      return lic;
//
//
//
  // }

}
