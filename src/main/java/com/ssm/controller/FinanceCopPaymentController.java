package com.ssm.controller;

import com.ssm.dao.IFinanceCopPaymentDao;
import com.ssm.entity.Finance_cop_batch_payment;
import com.ssm.entity.Finance_cop_payment;
import com.ssm.entity.Tb_waybill;
import com.sun.org.apache.bcel.internal.generic.FieldOrMethod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.transform.Result;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 代收货款管理中需要实现的业务实现
 */


@Controller
public class FinanceCopPaymentController {

    @Autowired
    private IFinanceCopPaymentDao iFinanceCopPaymentDao;

    /**
     * 代收款登记
     * @return
     */
    //绑值
    @RequestMapping("get_Allwaybillandpayment")
    @ResponseBody
    public List<Tb_waybill> get_Allwaybillandpayment(){
        System.out.println("进入。。。。。");
        List<Tb_waybill> list=iFinanceCopPaymentDao.getwaybill_payment();
        return list;
    }

    /**
     * 修改未登记，取消登记状态改为登记状态
     */
    @RequestMapping("update_state_payment")
    public void update_state_payment(int waybill_ids){
         iFinanceCopPaymentDao.updatepayment_state(waybill_ids);
    }

    /**
     * 修改登记状态，取消登记1
     */
    @RequestMapping("update_state_payment_quxiao")
    public void update_state_payment_quxiao(int waybill_id){
        iFinanceCopPaymentDao.updatepayment_stateq(waybill_id);
    }


    /**
     * 修改挂失状态为临时挂失
     */
    @RequestMapping("update_state_payment_guashi")
    public void update_state_payment_guashi(int waybill_id, @Param("oper_state")String  oper_state, String lost_identify, String note, String lost_name, HttpServletRequest request) throws Exception{
        System.out.println(oper_state);
        String lost_names=new String(request.getParameter("lost_name").getBytes("ISO8859-1"),"UTF-8");
       String notes=new String(request.getParameter("note").getBytes("ISO8859-1"),"UTF-8");
       double lost_fee;
       if(oper_state.equals("10")){
           lost_fee=20;
       }
       else{
           lost_fee=0;
       }
        iFinanceCopPaymentDao.updatepayment_guashi(oper_state, lost_names, lost_identify, notes, lost_fee,waybill_id);

    }

    /**
     * 代收款登记数据导出
     */
    @RequestMapping("getFinanceReceiptExcle")
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

        List<Tb_waybill> list=iFinanceCopPaymentDao.getwaybill_payment();


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


    /**
     * 代收款操作
     */

    //登记进入登记审核
    @RequestMapping("update_operation_dscontro")
     public void update_operation_dscontro(int waybill_id){
        iFinanceCopPaymentDao.update_operation_ds(waybill_id);
     }

     //取消登记审核
    @RequestMapping("update_operation_qscontro")
     public void update_operation_qscontro(int waybill_id){
        iFinanceCopPaymentDao.update_operation_qs(waybill_id);
     }

     //取消挂失
    @RequestMapping("update_opration_gscontro")
     public void update_opration_gscontro(int waybill_id){
        iFinanceCopPaymentDao.update_operation_gs(waybill_id);
     }

     //冻结
    @RequestMapping("update_operation_djcontro")
    public void update_operation_djcontro(int waybill_id){
        iFinanceCopPaymentDao.update_operation_dj(waybill_id);
    }

    //解冻
    @RequestMapping("update_operation_jdcontro")
    public void update_operation_jdcontro(int waybill_id){
        iFinanceCopPaymentDao.update_operation_jd(waybill_id);
    }


    //取消发款
    @RequestMapping("update_operation_qfcontro")
    public void update_operation_qfcontro(int waybill_id){
        iFinanceCopPaymentDao.update_operation_qf(waybill_id);
    }

    //发款审核
    @RequestMapping("update_operation_fkcontro")
    public void update_operation_fkcontro(int waybill_id){
        iFinanceCopPaymentDao.update_operation_fk(waybill_id);
    }


    /**
     * 代收款发款
     */

    //绑定代收款发款为发款审核状态的记录
    @ResponseBody
    @RequestMapping("get_All_operationfk")
    public List<Tb_waybill> get_All_operationfk(){
        List<Tb_waybill> list=iFinanceCopPaymentDao.getwaybill_payment_fk();
        return list;
    }

   //审核通过
    @RequestMapping("update_send_shtgcontro")
   public void update_send_shtgcontro(int waybill_id){
        iFinanceCopPaymentDao.update_send_shtg(waybill_id);
   }

   //撤销审核
    @RequestMapping("update_send_shbtgcontro")
    public void update_send_shbtgcontro(int waybill_id){
        iFinanceCopPaymentDao.update_send_shbtg(waybill_id);
    }


    /**
     * 批次管理
     */
    @ResponseBody
    @RequestMapping("getallbatch")
    public List<Finance_cop_batch_payment> getallbatch(){
        List<Finance_cop_batch_payment> list=iFinanceCopPaymentDao.getAll_batch();
        return list;
    }






}
