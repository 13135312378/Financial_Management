package com.ssm.controller;


import com.ssm.entity.FinanceReceiptApply;
import com.ssm.service.FinanceReceiptApplyService;
import com.ssm.service.impl.FinanceReceiptApplyServiceImpl;
import com.ssm.uitl.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("finance/*")
@RestController
public class FinanceReceiptApplyController {


    @Autowired
    private FinanceReceiptApplyService financeReceiptApplyService;

    /**
     *查询所有发票 地址：/finance/getAllFinanceReceiptApply.action
     *
     */
    @RequestMapping("/getAllFinanceReceiptApply.action")
    public List<FinanceReceiptApply> getAllRuleChildGroup(FinanceReceiptApply financeReceiptApply) {
        List<FinanceReceiptApply> list = financeReceiptApplyService.getAllFinanceReceiptApply(financeReceiptApply);
        return list;
    }


    /**
     *申请发票 地址：/finance/addFinanceReceiptApply.action
     *
     */
    @RequestMapping("/addFinanceReceiptApply.action")
    public Result addFinanceReceiptApply(FinanceReceiptApply financeReceiptApply) {
        financeReceiptApply.setIsDelete((byte)0);
        financeReceiptApply.setReceiptStatus((byte)1);
        financeReceiptApply.setReceiptNo("测试编号");
        Result result = financeReceiptApplyService.insert(financeReceiptApply);
        return result;
    }

    /**
     *删除发票 地址：/finance/delFinanceReceiptApply.action
     * 将发票的的isDelete属性改为1
     */
    @RequestMapping("/delFinanceReceiptApply.action")
    public Result delFinanceReceiptApply(FinanceReceiptApply financeReceiptApply) {
        financeReceiptApply.setIsDelete((byte)2);
        Result result = financeReceiptApplyService.updateByPrimaryKeySelective(financeReceiptApply);
        return result;
    }

    /**
     *修改发票 地址：/finance/updateFinanceReceiptApply.action
     *
     */
    @RequestMapping("/updateFinanceReceiptApply.action")
    public Result updateFinanceReceiptApply(FinanceReceiptApply financeReceiptApply) {
        Result result = financeReceiptApplyService.updateByPrimaryKeySelective(financeReceiptApply);
        return result;
    }
}
