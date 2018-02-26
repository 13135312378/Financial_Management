package com.ssm.controller;

import com.ssm.dao.IUserDaos;
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


    @RequestMapping("login")
    public List<User> getAll() throws Exception{
      List<User> list=iUserDaos.getAllUsers();
        System.out.println("进入：");
      return list;
//     "redirect:/user.jsp";
    }




}
