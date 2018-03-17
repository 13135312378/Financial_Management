package com.ssm.controller;

import com.ssm.entity.FinanceReceiptApply;
import com.ssm.service.FinanceReceiptApplyService;
import com.ssm.service.impl.FinanceReceiptApplyServiceImpl;
import com.ssm.uitl.Result;
import com.ssm.uitl.WritableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("finance/*")
@RestController
public class FinanceReceiptManageController {

    @Autowired
    private FinanceReceiptApplyService financeReceiptApplyService;


    /**
     *查询所有发票 地址：/finance/getAllFinanceReceiptManage.action
     *
     */
    @RequestMapping("/getAllFinanceReceiptManage.action")
    public List<FinanceReceiptApply> getAllRuleChildGroup(FinanceReceiptApply financeReceiptApply) {
        List<FinanceReceiptApply> list = financeReceiptApplyService.getAllFinanceReceiptApply(financeReceiptApply);
        return list;
    }


    /**
     *修改状态发票 地址：/finance/updateFinanceReceiptStatus.action
     *
     */
    @RequestMapping("/updateFinanceReceiptStatus.action")
    public Result updateFinanceReceiptStatus(String id,byte value) {
        String [] ReceiptApplyId = id.split(",");
        if(ReceiptApplyId.length>0){
            for (String aid :ReceiptApplyId) {
                FinanceReceiptApply financeReceiptApply = new FinanceReceiptApply();
                financeReceiptApply.setReceiptStatus(value);
                financeReceiptApply.setReceiptApplyId(Integer.parseInt(aid));
                financeReceiptApplyService.updateByPrimaryKeySelective(financeReceiptApply);
            }
        }
        return new Result();
    }

    /**
     *修改状态发票(导出) 地址：/finance/getFinanceReceiptExcle.action
     *
     */
    @RequestMapping("/getFinanceReceiptExcle.action")
    public Result getFinanceReceiptExcle(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session=request.getSession();
        //设置请求头信息
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/vnd.ms-excel;charset=UTF-8");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddmmss");
        response.addHeader("Content-Disposition",
                "attachment; filename="+ dateFormat.format(new Date()) + ".xls");

        String root = session.getServletContext().getRealPath("/");
        String path = root + "xls/";
        File newfile = new File(path);
        if(!newfile.isDirectory()){
            newfile.mkdir();
        }

        File file = new File(path+"/"+dateFormat.format(new Date()) + ".xls");

        List<FinanceReceiptApply> list = financeReceiptApplyService.getAllFinanceReceiptApply(null);
        WritableUtils.write(file,list);

        FileInputStream in = new FileInputStream(file);
        OutputStream os = response.getOutputStream(); // 创建输出流

        byte[] b = new byte[2048];
        int length = 0;
        while ((length = in.read(b)) != -1) {
            os.write(b, 0, length);
            os.flush();
        }
        in.close();
        os.close();
        return null;
    }




}
