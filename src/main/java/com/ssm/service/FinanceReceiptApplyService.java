package com.ssm.service;

import com.ssm.entity.FinanceReceiptApply;
import com.ssm.uitl.Result;

import java.util.List;

public interface FinanceReceiptApplyService {

    //删除
    int deleteByPrimaryKey(Integer receiptApplyId);

    //添加
    Result insert(FinanceReceiptApply record);
    //添加
    Result insertSelective(FinanceReceiptApply record);

    Result selectByPrimaryKey(Integer receiptApplyId);

    //查询
    List<FinanceReceiptApply> getAllFinanceReceiptApply(FinanceReceiptApply record);

    //修改
    Result updateByPrimaryKeySelective(FinanceReceiptApply record);
    //修改
    Result updateByPrimaryKey(FinanceReceiptApply record);
}