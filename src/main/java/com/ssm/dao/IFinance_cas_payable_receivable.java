package com.ssm.dao;

import com.ssm.entity.Finance_bac_subject_def;
import com.ssm.entity.Finance_cas_payable_receivable;

import java.util.List;

public interface IFinance_cas_payable_receivable {

    //查询所有
    public List<Finance_cas_payable_receivable> getFinance_cas_payable_receivable();
}
