package com.ssm.service.impl;

import com.ssm.dao.FinanceReceiptApplyDao;
import com.ssm.entity.FinanceReceiptApply;
import com.ssm.service.FinanceReceiptApplyService;
import com.ssm.uitl.LogicUtil;
import com.ssm.uitl.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceReceiptApplyServiceImpl implements FinanceReceiptApplyService {

    @Autowired
    private FinanceReceiptApplyDao financeReceiptApplyDao; //调用dao方法

    @Autowired
    private LogicUtil logicUtil;

    //删除
    public int deleteByPrimaryKey(Integer receiptApplyId) {
        return financeReceiptApplyDao.deleteByPrimaryKey(receiptApplyId);
    }

    //添加
    public Result insert(FinanceReceiptApply record) {
        return logicUtil.add(financeReceiptApplyDao.insert(record));
    }
    //添加
    public Result insertSelective(FinanceReceiptApply record) {
        return logicUtil.add(financeReceiptApplyDao.insertSelective(record));
    }

    public Result selectByPrimaryKey(Integer receiptApplyId) {
        return logicUtil.get(financeReceiptApplyDao.selectByPrimaryKey(receiptApplyId));
    }

    //查询
    public List<FinanceReceiptApply> getAllFinanceReceiptApply(FinanceReceiptApply record) {
        return financeReceiptApplyDao.getAllFinanceReceiptApply(record);
    }

    //修改
    public Result updateByPrimaryKeySelective(FinanceReceiptApply record) {

        return logicUtil.update(financeReceiptApplyDao.updateByPrimaryKeySelective(record));
    }
    //修改
    public Result updateByPrimaryKey(FinanceReceiptApply record) {

        return logicUtil.update(financeReceiptApplyDao.updateByPrimaryKey(record));
    }
}
