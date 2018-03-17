package com.ssm.uitl;

import com.ssm.entity.FinanceReceiptApply;
import jxl.Workbook;
import jxl.write.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WritableUtils {


      public static void write(File file, List<FinanceReceiptApply> financeReceiptApplies) throws Exception{
          WritableWorkbook book = Workbook.createWorkbook(file);
          WritableSheet sheet = book.createSheet("发票报表", 0);
          WritableFont wf = new WritableFont(WritableFont.TIMES, 11);
          WritableCellFormat wcf = new WritableCellFormat(wf);
          wcf.setWrap(true);
          wcf.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);

          //构造头部
          List<String> head =  getTable();
          for (int i = 0; i<head.size();i++){
              Label label = new Label(i, 0, head.get(i), wcf);
              sheet.addCell(label);
          }

          //打印主体信息
          for (int i= 0;i< financeReceiptApplies.size();i++){
              FinanceReceiptApply financeReceiptApply = financeReceiptApplies.get(i);
              Label id = new Label(0, i+1, financeReceiptApply.getReceiptApplyId().toString(), wcf);
              sheet.addCell(id);

              Label ReceiptApplyNo = new Label(1, i+1, "测试发票号", wcf);
              sheet.addCell(ReceiptApplyNo);

              byte ReceiptStatus = financeReceiptApply.getReceiptStatus();
              Label ReceiptApplyStatus = new Label(2, i+1, getReceiptType().get(""+ReceiptStatus), wcf);
              sheet.addCell(ReceiptApplyStatus);

              Label ReceiptApplyType = new Label(3, i+1,"发票类型未知", wcf);
              sheet.addCell(ReceiptApplyType);

              Label LookUp = new Label(4, i+1, "发票抬头未知", wcf);
              sheet.addCell(LookUp);

              Label freight = new Label(5, i+1, "运费未知", wcf);
              sheet.addCell(freight);

              Label ReceiptAmt = new Label(6, i+1,financeReceiptApply.getReceiptAmt().toString() , wcf);
              sheet.addCell(ReceiptAmt);

              Label supplementary = new Label(7, i+1, "补偿金额未知", wcf);
              sheet.addCell(supplementary);

              String DutyFree = financeReceiptApply.getIsDutyFree() == 0 ? "是":"否";
              Label IsDutyFree = new Label(8, i+1, DutyFree, wcf);
              sheet.addCell(IsDutyFree);
          }
          book.write();
          book.close();
      }

      public static List<String> getTable (){
          List<String> list = new ArrayList<String>();
          list.add("序号");
          list.add("发票号");
          list.add("发票状态");
          list.add("发票类型");
          list.add("发票抬头");
          list.add("运费");
          list.add("开票金额");
          list.add("补税金额");
          list.add("含税");
          return list;
      }

    public static Map<String,String> getReceiptType(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","未申请");
        map.put("2","已申请");
        map.put("3","未审核");
        map.put("4","已审核");
        map.put("5","未开发票");
        map.put("6","已开发票");
        map.put("7","发票作废");
        return map;
    }

}

