package com.ssm.controller;

import com.ssm.dao.IFinanceCopPaymentDao;
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
     * 代收款登记绑定
     * @return
     */
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
        System.out.println("登记："+waybill_ids);
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
//        Finance_cop_payment financeCopPayment=new Finance_cop_payment(oper_state, lost_name, lost_identify, note, lost_fee);
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
     *通过代收款编号得到运单详情
     */

//    @RequestMapping("gettb_waybill")
//    @ResponseBody
//    public List<Tb_waybill> gettb_waybill(int finance_cop_paymentid){
//        System.out.println("得到传递过来的id:"+finance_cop_paymentid);
//        Finance_cop_payment finance_cop_payment=iFinanceCopPaymentDao.getwaybillsById(finance_cop_paymentid);
//        List<Tb_waybill> list=new ArrayList<Tb_waybill>();
//        try {
//            list = finance_cop_payment.getTb_waybills();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//            return  list;
//    }
//



}
