<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/13
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>银河财务管理子系统后台登录</title>
    <link href="css/main.css" rel="stylesheet" type="text/css" />

    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <script src="assets/js/echarts.min.js"></script>
    <link rel="stylesheet" href="assets/css/amazeui.min.css" />
    <link rel="stylesheet" href="assets/css/amazeui.datatables.min.css" />
    <link rel="stylesheet" href="assets/css/app.css">
    <script src="assets/js/jquery.min.js"></script>

</head>
<body>



<div class="login">
    <div class="box png">

        <%--logo标志--%>
      <div class="logo png"></div>
            <%--文本框位置--%>
         <div class="input">
              <div class="log">


                  <form action="/login.action" method="post">

                <div class="name">
                    <label>用户名</label><input type="text" class="text" id="value_1" placeholder="用户名" name="uname" >
                </div>


                <div class="pwd">
                    <label>密　码</label><input type="password" class="text" id="value_2" placeholder="密码" name="upass" >
                    <input type="submit" class="submit"  value="登录">
                <div class="check"></div>

                </div>

                <div class="tip"></div>

                 </form>






               </div>




           </div>
            <%--文本框位置--%>



    </div>
    <div class="air-balloon ab-1 png"></div>
    <div class="air-balloon ab-2 png"></div>
    <div class="footer"></div>
</div>








<script type="text/javascript" src="js/jQuery.js"></script>
<script type="text/javascript" src="js/fun.base.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script src="js/DD_belatedPNG.js" type="text/javascript"></script>
<script>DD_belatedPNG.fix('.png')</script>

</body>
</html>
