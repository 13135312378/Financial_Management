package com.ssm.controller;

import com.ssm.dao.IFinance_bac_subject_def;
import com.ssm.dao.IUserDaos;
import com.ssm.entity.Finance_bac_subject_def;
import com.ssm.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserDaos iUserDaos;
    @Autowired
    private IFinance_bac_subject_def iFinance_bac_subject_def;


    @RequestMapping("login")
    public String login(User user) throws Exception{
        //List<User> list=iUserDaos.getAllUsers();
        User u=iUserDaos.login(user);

     System.out.println("草率从事cs");

        if (u!=null){
           return"redirect:/index.jsp";
        }else {
            return "redirect:/login.jsp";
        }
//     "redirect:/user.jsp";
    }




}
