package com.ssm.dao;

import com.ssm.entity.FinanceReceiptApply;

import java.util.List;

public interface FinanceReceiptApplyDao {

    int deleteByPrimaryKey(Integer receiptApplyId);

    int insert(FinanceReceiptApply record);

    int insertSelective(FinanceReceiptApply record);

    FinanceReceiptApply selectByPrimaryKey(Integer receiptApplyId);

    List <FinanceReceiptApply>  getAllFinanceReceiptApply(FinanceReceiptApply record);

    int updateByPrimaryKeySelective(FinanceReceiptApply record);

    int updateByPrimaryKey(FinanceReceiptApply record);
}