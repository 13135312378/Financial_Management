<%@ page import="sun.management.counter.Variability" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/22
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <meta charset="utf-8">
    <title>银河财务管理子系统后台管理</title>
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
    <script type="text/javascript" src="js/vue.js"></script>

</head>


<body data-type="widgets">

<script src="assets/js/theme.js"></script>
<div class="am-g tpl-g">
    <!-- 头部 -->
    <header>

        <!-- logo -->
        <div class="am-fl tpl-header-logo" >
            <a href="javascript:;" ><span style="font-size:24px; ">银河财务管理</span></a>
        </div>

        <!-- 右侧内容 -->
        <div class="tpl-header-fluid">
            <!-- 侧边切换 -->
            <div class="am-fl tpl-header-switch-button am-icon-list" style="margin-top:20px;  ">
                    <span>

                </span>
            </div>

            <!-- 搜索 -->
            <div class="am-fl tpl-header-search">
                <form class="tpl-header-search-form" action="javascript:;">
                    <button class="tpl-header-search-btn am-icon-search"></button>
                    <input class="tpl-header-search-box" type="text" placeholder="搜索内容...">
                </form>
            </div>

            <!-- 其它功能-->
            <div class="am-fr tpl-header-navbar">
                <ul>
                    <!-- 欢迎语 -->
                    <li class="am-text-sm tpl-header-navbar-welcome">
                        <a href="javascript:;">欢迎你, <span>Admin</span> </a>
                    </li>

                    <!-- 新邮件 -->
                    <li class="am-dropdown tpl-dropdown" data-am-dropdown style="margin-top:20px;">
                        <a href="javascript:;" class="am-dropdown-toggle tpl-dropdown-toggle" data-am-dropdown-toggle>
                            <i class="am-icon-envelope"></i>
                            <span class="am-badge am-badge-success am-round item-feed-badge">4</span>
                        </a>

                        <!-- 弹出列表 -->
                        <ul class="am-dropdown-content tpl-dropdown-content">
                            <li class="tpl-dropdown-menu-messages">
                                <a href="javascript:;" class="tpl-dropdown-menu-messages-item am-cf">
                                    <div class="menu-messages-ico">
                                        <img src="assets/img/user04.png" alt="">
                                    </div>
                                    <div class="menu-messages-time">
                                        3小时前
                                    </div>
                                    <div class="menu-messages-content">
                                        <div class="menu-messages-content-title">
                                            <i class="am-icon-circle-o am-text-success"></i>
                                            <span>夕风色</span>
                                        </div>
                                        <div class="am-text-truncate"> Amaze UI 的诞生，依托于 GitHub 及其他技术社区上一些优秀的资源；Amaze UI 的成长，则离不开用户的支持。 </div>
                                        <div class="menu-messages-content-time">2016-09-21 下午 16:40</div>
                                    </div>
                                </a>
                            </li>

                            <li class="tpl-dropdown-menu-messages">
                                <a href="javascript:;" class="tpl-dropdown-menu-messages-item am-cf">
                                    <div class="menu-messages-ico">
                                        <img src="assets/img/user02.png" alt="">
                                    </div>
                                    <div class="menu-messages-time">
                                        5天前
                                    </div>
                                    <div class="menu-messages-content">
                                        <div class="menu-messages-content-title">
                                            <i class="am-icon-circle-o am-text-warning"></i>
                                            <span>禁言小张</span>
                                        </div>
                                        <div class="am-text-truncate"> 为了能最准确的传达所描述的问题， 建议你在反馈时附上演示，方便我们理解。 </div>
                                        <div class="menu-messages-content-time">2016-09-16 上午 09:23</div>
                                    </div>
                                </a>
                            </li>
                            <li class="tpl-dropdown-menu-messages">
                                <a href="javascript:;" class="tpl-dropdown-menu-messages-item am-cf">
                                    <i class="am-icon-circle-o"></i> 进入列表…
                                </a>
                            </li>
                        </ul>
                    </li>



                    <!-- 新提示 -->
                    <li class="am-dropdown" data-am-dropdown style="margin-top:20px;">
                        <a href="javascript:;" class="am-dropdown-toggle" data-am-dropdown-toggle>
                            <i class="am-icon-bell"></i>
                            <span class="am-badge am-badge-warning am-round item-feed-badge">5</span>
                        </a>

                        <!-- 弹出列表 -->
                        <ul class="am-dropdown-content tpl-dropdown-content">
                            <li class="tpl-dropdown-menu-notifications">
                                <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                    <div class="tpl-dropdown-menu-notifications-title">
                                        <i class="am-icon-line-chart"></i>
                                        <span> 有6笔新的销售订单</span>
                                    </div>
                                    <div class="tpl-dropdown-menu-notifications-time">
                                        12分钟前
                                    </div>
                                </a>
                            </li>
                            <li class="tpl-dropdown-menu-notifications">
                                <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                    <div class="tpl-dropdown-menu-notifications-title">
                                        <i class="am-icon-star"></i>
                                        <span> 有3个来自人事部的消息</span>
                                    </div>
                                    <div class="tpl-dropdown-menu-notifications-time">
                                        30分钟前
                                    </div>
                                </a>
                            </li>
                            <li class="tpl-dropdown-menu-notifications">
                                <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                    <div class="tpl-dropdown-menu-notifications-title">
                                        <i class="am-icon-folder-o"></i>
                                        <span> 上午开会记录存档</span>
                                    </div>
                                    <div class="tpl-dropdown-menu-notifications-time">
                                        1天前
                                    </div>
                                </a>
                            </li>


                            <li class="tpl-dropdown-menu-notifications">
                                <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                    <i class="am-icon-bell"></i> 进入列表…
                                </a>
                            </li>
                        </ul>
                    </li>

                    <!-- 退出 -->
                    <li class="am-text-sm">
                        <a href="login.jsp">
                            <span class="am-icon-sign-out"></span> 退出
                        </a>
                    </li>
                </ul>
            </div>
        </div>

    </header>
    <!-- 风格切换 -->
    <div class="tpl-skiner">
        <div class="tpl-skiner-toggle am-icon-cog">
        </div>
        <div class="tpl-skiner-content">
            <div class="tpl-skiner-content-title">
                选择主题
            </div>
            <div class="tpl-skiner-content-bar">
                <span class="skiner-color skiner-white" data-color="theme-white"></span>
                <span class="skiner-color skiner-black" data-color="theme-black"></span>
            </div>
        </div>
    </div>





    <!-- 侧边导航栏 -->
    <div class="left-sidebar">
        <!-- 用户信息 -->
        <div class="tpl-sidebar-user-panel">
            <div class="tpl-user-panel-slide-toggleable">
                <div class="tpl-user-panel-profile-picture">
                    <img src="assets/img/user04.png" alt="">
                </div>
                <span class="user-panel-logged-in-text">
              <i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
              禁言小张
          </span>
                <a href="javascript:;" class="tpl-user-panel-action-link"> <span class="am-icon-pencil"></span> 账号设置</a>
            </div>
        </div>

        <!-- 菜单 -->
        <ul class="sidebar-nav">
            <li class="sidebar-nav-link">
                <a href="index.jsp" class="active">
                    <i class="am-icon-home sidebar-nav-link-logo"></i> 首页
                </a>
            </li>


            <li class="sidebar-nav-link">
                <a href="javascript:;" class="sidebar-nav-sub-title">
                    <i class="am-icon-table sidebar-nav-link-logo"></i> 营收款管理
                    <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
                </a>
                <ul class="sidebar-nav sidebar-nav-sub">


                    <%--现金日报表--%>
                    <li class="sidebar-nav-link" >
                        <a href="cash_statement.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 现金日报表
                        </a>
                    </li>



                    <%--网点营收报表    --%>
                    <li class="sidebar-nav-link">
                        <a href="stipple_revenue.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 网点营收报表
                        </a>
                    </li>


                    <%--全网营收报表    --%>
                    <li class="sidebar-nav-link">
                        <a href="full_revenue.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 全网营收报表
                        </a>
                    </li>


                    <%--现金回款录入--%>
                    <li class="sidebar-nav-link">
                        <a href="cash_return_money.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 现金回款录入
                        </a>
                    </li>


                    <%--网点回款管理--%>
                    <li class="sidebar-nav-link">
                        <a href="stipple_return_money.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 网点回款管理
                        </a>
                    </li>



                    <%--回款管理 --%>
                    <li class="sidebar-nav-link" >
                        <a href="returned_money.jsp"  >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 回款管理
                        </a>
                    </li>


                    <%-- 转寄管理    --%>
                    <li class="sidebar-nav-link" >
                        <a href="forward_letter.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 转寄管理
                        </a>
                    </li>


                    <%--财务确认收入明细    --%>
                    <li class="sidebar-nav-link" >
                        <a href="finance_detail.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 财务确认收入明细
                        </a>
                    </li>


                    <%--财务确认收入汇总--%>
                    <li class="sidebar-nav-link" >
                        <a href="finance_summariz.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 财务确认收入汇总
                        </a>
                    </li>


                    <%--出纳记账--%>
                    <li class="sidebar-nav-link" >
                        <a href="cashier_tally.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 出纳记账
                        </a>
                    </li>


                    <%--凭证审核--%>
                    <li class="sidebar-nav-link" >
                        <a href="voucher_audit.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 凭证审核
                        </a>
                    </li>



                    <%--科目设置--%>
                    <li class="sidebar-nav-link" >
                        <a href="subject_setting.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 科目设置
                        </a>
                    </li>



                    <%--核销方向--%>
                    <li class="sidebar-nav-link" >
                        <a href="verification_direction.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 核销方向
                        </a>
                    </li>


                    <%--核销项目--%>
                    <li class="sidebar-nav-link">
                        <a href="verification_project.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 核销项目
                        </a>
                    </li>

                </ul>
            </li>



            <%--发票管理--%>
            <li class="sidebar-nav-link">
                <a href="javascript:;" class="sidebar-nav-sub-title">
                    <i class="am-icon-tv sidebar-nav-link-logo"></i> 发票管理
                    <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
                </a>

                <ul class="sidebar-nav sidebar-nav-sub" >
                    <%--开票申请--%>
                    <li class="sidebar-nav-link">
                        <a href="make_apply.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 开票申请
                        </a>
                    </li>

                    <%--开票管理--%>
                    <li class="sidebar-nav-link">
                        <a href="make_manage.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 开票管理
                        </a>
                    </li>
                </ul>
            </li>





            <%--主营业务核销--%>
            <li class="sidebar-nav-link">
                <a href="javascript:;" class="sidebar-nav-sub-title">
                    <i class="am-icon-wpforms sidebar-nav-link-logo"></i> 主营业务核销
                    <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
                </a>
                <ul class="sidebar-nav sidebar-nav-sub" >

                    <%--预付款充值核销--%>
                    <li class="sidebar-nav-link">
                        <a href="advance_pay.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 预付款充值核销
                        </a>
                    </li>


                    <%--回款核销--%>
                    <li class="sidebar-nav-link">
                        <a href="returned_apply.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 回款核销
                        </a>
                    </li>


                    <%--理赔核销--%>
                    <li class="sidebar-nav-link">
                        <a href="claim_apply.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 理赔核销
                        </a>
                    </li>

                    <%--运单费用项核销--%>
                    <li class="sidebar-nav-link">
                        <a href="waybill_money.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 运单费用项核销
                        </a>
                    </li>
                </ul>
            </li>



            <%--代收货款管理--%>
            <li class="sidebar-nav-link">
                <a href="javascript:;" class="sidebar-nav-sub-title">
                    <i class="am-icon-bar-chart sidebar-nav-link-logo"></i> 代收货款管理
                    <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
                </a>
                <ul class="sidebar-nav sidebar-nav-sub" style="display: block;">


                    <%--代收款登记--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_fund.jsp" class="sub-active">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款登记
                        </a>
                    </li>


                    <%--代收款操作--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_operation.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款操作
                        </a>
                    </li>


                    <%--代收款发款--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_send.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款发款
                        </a>
                    </li>


                    <%--代收款合并发款--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_merge.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款合并发款
                        </a>
                    </li>


                    <%--代收款批次发款--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_batch.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款批次发款
                        </a>
                    </li>


                    <%--代收款批次管理--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_manage.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款批次管理
                        </a>
                    </li>

                </ul>
            </li>



            <li class="sidebar-nav-link">
                <a href="javascript:;" class="sidebar-nav-sub-title">
                    <i class="am-icon-calendar sidebar-nav-link-logo"></i> 月结账款管理
                    <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
                </a>
                <ul class="sidebar-nav sidebar-nav-sub">


                    <%--月结明细--%>
                    <li class="sidebar-nav-link">
                        <a href="monthly_detail.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 月结明细
                        </a>
                    </li>


                    <%--月结账单管理--%>
                    <li class="sidebar-nav-link">
                        <a href="monthly_bill.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 月结账单管理
                        </a>
                    </li>


                    <%--月结回款核销--%>
                    <li class="sidebar-nav-link">
                        <a href="monthly_returned.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 月结回款核销
                        </a>
                    </li>

                    <%--应收账款余额--%>
                    <li class="sidebar-nav-link">
                        <a href="monthly_balance.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 应收账款余额
                        </a>
                    </li>


                    <%--垫付款回扣管理--%>
                    <li class="sidebar-nav-link">
                        <a href="monthly_advence.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 垫付款回扣管理
                        </a>
                    </li>


                </ul>
            </li>


            <li class="sidebar-nav-link">
                <a href="">
                    <i class="am-icon-clone sidebar-nav-link-logo"></i> 注册
                    <span class="am-badge am-badge-secondary sidebar-nav-link-logo-ico am-round am-fr am-margin-right-sm">6</span>
                </a>
            </li>



            <li class="sidebar-nav-link">
                <a href="login.jsp">
                    <i class="am-icon-key sidebar-nav-link-logo"></i> 登录
                </a>
            </li>

        </ul>

    </div>









    <!-- 内容区域 -->
    <div id="app">
    <div class="tpl-content-wrapper" >

        <div class="container-fluid am-cf" style="height:26px;  ">
            <div class="page-header-heading" ><span class=""></span> 代收货款管理 <small>代收款登记 </small></div>
        </div>


        <div class="row-content am-cf">


            <div class="row">

                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">

                    <div class="widget am-cf">

                        <div class="widget-body  am-fr">
                            <%--操作按钮区域--%>
                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                <div class="am-form-group">
                                    <div class="am-btn-toolbar">
                                        <div class="am-btn-group am-btn-group-xs">
                                             <button type="button" class="am-btn am-btn-default am-btn-warning" @click="fund_buying()"><span class="am-icon-reply"></span> 凭证补印</button>
                                             <button type="button" class="am-btn am-btn-default am-btn-danger"><span class="am-icon-send-o" @click="getExcle()"></span> 导出列表</button>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="widget-head am-cf">
                            </div>
                            <div class="widget-title  am-cf" style="margin-top:8px; ">查询条件</div>
                            <br/>


                            <form action="" method="post">

                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                  运单号&nbsp;&nbsp;:&nbsp;&nbsp;
                                    <input type="text" style="width:139px; "/>
                                </div>


                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    货单号&nbsp;&nbsp;:&nbsp;&nbsp;
                                    <input type="text" style="width:139px; "/>
                                </div>



                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    E卡通号&nbsp;:&nbsp;
                                    <input type="text" style="width:134px; "/>
                                </div>

                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    <button type="button" class="am-btn am-btn-warning am-square" style="width:68px; height:34px;">添加</button>
                                    <button type="reset" class="am-btn am-btn-default" style="width:68px; height:34px;  margin-left:10px; ">重置</button>
                                </div>

                            </form>
                            <%--搜索区域--%>

                            <br>
                            <div class="widget-head am-cf">
                            </div>
                            <div class="widget-title  am-cf" style="margin-top:8px; ">登记列表</div>
                            <br/>

                            <div>

                                <span>共计：4票 &nbsp;&nbsp;代收款总计：10000&nbsp;&nbsp;手续费及其他合计：2000 &nbsp;&nbsp; 实转：900800</span>
                                <br/>
                                <span>已选：2票 &nbsp;&nbsp;代收款总计：1000 &nbsp;&nbsp;手续费及其他合计：2000 &nbsp;&nbsp; 实转：900800</span>
                            </div>

                            <%--表单内容区域--%>
                            <%--表单内容--%>
                            <div class="am-scrollable-horizontal">
                                <table width="100%" class="am-table am-table-bordered am-table-striped am-text-nowrap" id="example-r1" >
                                    <thead>
                                    <tr>
                                        <th>代付款序号</th>
                                        <th><input type="checkbox" name="fund_all" value="1"></th>
                                        <th>登记批次号</th>
                                        <th>E通卡</th>
                                        <th>运单号</th>
                                        <th>货单号</th>
                                        <th>操作状态</th>
                                        <th>银行收款类型</th>
                                        <th>银行收款账号</th>
                                        <th>代收货款</th>
                                        <th>代收货款服务费</th>
                                        <th>收扣款总金额</th>
                                        <th>挂失费</th>
                                        <th>短信服务费</th>
                                        <th>转账状态</th>
                                        <th>转账类型</th>
                                        <th>转账时间</th>
                                        <th>寄件网点</th>
                                        <th>收件网点</th>
                                        <th>营收日期</th>
                                        <th>登记联系人</th>
                                        <th>登记人手机</th>
                                        <th>寄件联系人</th>
                                        <th>寄件人手机</th>
                                        <th>登记人证件号</th>
                                        <th>操作人</th>
                                        <th>操作时间</th>
                                        <th>预警标志</th>
                                        <th>短信发送标志</th>
                                        <th>备注</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>

                                    <tbody id="fund_tb">
                                    <tr class="gradeX" v-for="(tbwaybill,index) in tbwaybills">
                                        <td>{{tbwaybill.waybill_id}}</td>
                                        <td><input type="checkbox" name="id" :value="tbwaybill.waybill_id"></td>
                                        <td>{{tbwaybill.finance_cop_payment.batch_code}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.e_card_no}}</td>
                                        <td>{{tbwaybill.waybill_no}}</td>
                                        <td>{{tbwaybill.goods_no}}</td>
                                        <%--1-无操作,2-取消发款,3-确认已转款,4-冻结,5-解冻,6-登记,7-取消登记,8-登记审核,9-临时挂失,10-正式挂失,11-解挂失,12超期审核,13-删除代收款--%>
                                        <td v-if="tbwaybill.finance_cop_payment.oper_state=='1'">未登记</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='2'">取消发款</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='3'">确认已转款</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='4'">冻结</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='5'">解冻</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='6'">已登记</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='7'">取消登记</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='8'">登记审核</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='9'">临时挂失</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='10'">正式挂失</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='11'">解挂失</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='12'">超期审核</td>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='13'">删除代收款</td>

                                        <td>{{tbwaybill.finance_cop_payment.bankaccount_type}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.receive_account}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.fee_amount}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.service_fee}}</td>

                                        <td>{{tbwaybill.finance_cop_payment.minus_total_fee}}</td>

                                        <td>{{tbwaybill.finance_cop_payment.lost_fee}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.message_server_fee}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.payment_state}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.payment_type}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.payment_tm}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.source_zone_code}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.dest_zone_code}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.income_tm}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.register_name}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.register_mobile}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.send_peo}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.send_mobile}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.register_identify}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.oper_emp_code}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.oper_tm}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.warning_state}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.messaged_flag}}</td>
                                        <td>{{tbwaybill.finance_cop_payment.note}}</td>

                                        <%--修改状态--%>
                                        <%--未登记显示登记操作--%>

                                        <td v-if="tbwaybill.finance_cop_payment.oper_state=='1' || tbwaybill.finance_cop_payment.oper_state=='7'">
                                            <div class="tpl-table-black-operation">
                                            <a href="javascript:;" @click="fund_dengji(index)">
                                                <i class="am-icon-send-o"></i>
                                                登记
                                            </a>
                                            </div>
                                         </td>
                                       <%--登记状态显示取消登记--%>
                                        <td v-else-if="tbwaybill.finance_cop_payment.oper_state=='6'">
                                            <div class="tpl-table-black-operation">
                                            <a href="javascript:;" @click="fund_quxiao(index)">
                                                <i class="am-icon-send-o"></i>
                                                取消登记
                                            </a>
                                            </div>
                                        </td>
                                        <%--不是未登记和取消登记状态不显示--%>
                                         <td v-else-if="tbwaybill.finance_cop_payment.oper_state!='1' || tbwaybill.finance_cop_payment.oper_state!='6'"></td>

                                        <td v-if="tbwaybill.finance_cop_payment.oper_state=='1' || tbwaybill.finance_cop_payment.oper_state=='7' || tbwaybill.finance_cop_payment.oper_state=='2' || tbwaybill.finance_cop_payment.oper_state=='4' || tbwaybill.finance_cop_payment.oper_state=='5' || tbwaybill.finance_cop_payment.oper_state=='11'">
                                            <div class="tpl-table-black-operation">
                                                <a href="javascript:;" class="tpl-table-black-operation-del" @click="guashi(index)">
                                                    <i class="am-icon-save"></i>挂失
                                                </a>
                                            </div>
                                        </td>
                                       <td v-else-if="tbwaybill.finance_cop_payment.oper_state!='1' || tbwaybill.finance_cop_payment.oper_state!='7' || tbwaybill.finance_cop_payment.oper_state!='2' || tbwaybill.finance_cop_payment.oper_state!='4' || tbwaybill.finance_cop_payment.oper_state!='5' || tbwaybill.finance_cop_payment.oper_state!='11'"></td>



                                    </tr>
                                    <!-- more data -->
                                    </tbody>
                                </table>
                            </div>
                            <%--表单内容区域--%>


                             <div class="am-u-lg-12 am-cf">
                                <div class="am-fr">
                                    <ul class="am-pagination tpl-pagination">
                                        <li class="am-disabled"><a href="#">«</a></li>
                                        <li class="am-active"><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li><a href="#">»</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>



        <%--查看运单详情--%>
        <%--登记--%>
        <div class="am-modal am-modal-confirm" tabindex="-1" id="funddengji">
            <div class="am-modal-dialog">
                <div class="am-btn am-btn-warning am-btn-primary am-btn-block">代付款登记操作</div>
                <div class="am-modal-bd">
                    你，确定要登记这条记录吗？
                </div>
                <div class="am-modal-footer">
                    <span class="am-modal-btn" data-am-modal-cancel>取消</span>
                    <span class="am-modal-btn" data-am-modal-confirm @click="payments()">确定</span>
                </div>
            </div>
        </div>


        <%--取消登记--%>
        <div class="am-modal am-modal-confirm" tabindex="-1" id="fundquxiao">
            <div class="am-modal-dialog">
                <div class="am-btn am-btn-warning am-btn-primary am-btn-block">代付款登记的取消登记</div>
                <div class="am-modal-bd">
                    你，确定要取消登记这条记录吗？
                </div>
                <div class="am-modal-footer">
                    <span class="am-modal-btn" data-am-modal-cancel>取消</span>
                    <span class="am-modal-btn" data-am-modal-confirm @click="paymentsure()">确定</span>
                </div>
            </div>
        </div>

          <%--挂失操作--%>
        <%--挂失登记--%>
        <div class="am-modal am-modal-no-btn" tabindex="-1" id="fundguahsi">
            <div class="am-modal-dialog" style="background-color:white; ">
                <div class="am-btn am-btn-warning am-btn-primary am-btn-block">挂失操作
                    <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
                </div>

                <div class="am-modal-bd">
                    <%--查询输入区域--%>
                    <form id="formti" method="post" >

                        &nbsp;&nbsp;&nbsp;
                         <div id="rap">
                        <input type="radio" value="9" name="ra" >临时挂失
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="radio" value="10" name="ra" >正式挂失，挂失费20元
                         </div>
                        &nbsp;&nbsp;&nbsp;
                        运单号&nbsp;:&nbsp;<input type="text" style="width:226px;" value="" id="waybill_id" disabled="true"/></td>
                        <br/><br/>
                        &nbsp;&nbsp;&nbsp;
                        挂失人&nbsp;:&nbsp;<input type="text" style="width:226px;" value="" id="lost_name"/></td>
                        <br/><br/>
                        &nbsp;&nbsp;&nbsp;
                        登记证件号&nbsp;:&nbsp;<input type="text" style="width:200px;" value="" id="lost_identify"/></td>
                        <br/><br/>
                        &nbsp;&nbsp;&nbsp;
                        备注&nbsp;:&nbsp;<textarea name="" cols="24" rows="4" id="note" ></textarea>
                        <br/> <br/>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <button type="button" class="am-btn am-btn-warning am-radius" style="height:34px; " @click="guashi_sure()">确定挂失</button>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <button type="button" class="am-btn am-btn-default" style="height:34px; " data-am-modal-close>取消</button>



                    </form>

                </div>
            </div>
        </div>






    </div>


</div>




<script>

    $(function(){
        var waybill_ids;
        var waybill_id;
        var waybill_id_guashi;

        var vm = new Vue({
            el: "#app", //引用div的id
            data: {
                submitUrl:"/get_Allwaybillandpayment.action", //跳转的路径
                tbwaybill:"",
                tbwaybills: [],  //表单数据集合
                titleName:"",
                paymentId:""  //表单数据的id


            },
            methods: {
                //表单绑定数值的方法
                getAll : function(){
                    //上面方法从新赋值
                    var currenr_this=this;
                    //跳转的路径
                    currenr_this.submitUrl='/get_Allwaybillandpayment.action';
                    //通过json方式得到数据
                    $.getJSON(currenr_this.submitUrl,function(result,status){
                        //把结果集赋给定义的users，用来页面展示
                        currenr_this._data.tbwaybills=result;
                        console.info(result);
                    })
                },


                //登记,弹出模态框
                fund_dengji:function (index) {
                    var item=this.tbwaybills[index];
                    waybill_ids=item.finance_cop_payment.waybill_id;
                    $('#funddengji').modal({
                    });
                },
                //确定
                payments:function(){
                    //上面方法从新赋值
                    alert(waybill_ids);
                    $.ajax({
                        url:'/update_state_payment.action',
                        data:{waybill_ids:waybill_ids},
                        dataType:'JSON',
                        success:function(result){
                            alert('登记错误！');
                        },
                        error:function(result){
                            alert('信息登记成功，正在进入登记审核！');
                            location.reload();  //刷新页面
                        }

                    })
                },

                //取消登记，弹出模态框
                fund_quxiao:function (index) {
                    var item=this.tbwaybills[index];
                    waybill_id=item.finance_cop_payment.waybill_id;
                    $('#fundquxiao').modal({
                    });
                },
                //确定
                paymentsure:function(){
                    $.ajax({
                        url:'/update_state_payment_quxiao.action',
                        data:{waybill_id:waybill_id},
                        dataType:'JSON',
                        success:function(result){
                            alert('错误！');
                        },
                        error:function(result){
                            alert('取消登记成功，信息显示为未登记！');
                            location.reload();  //刷新页面
                        }
                    })
                },

                //挂失
                guashi:function (index) {
                    var items=this.tbwaybills[index];
                    waybill_id_guashi=items.finance_cop_payment.waybill_id;
                    //运单号
                    document.getElementById("waybill_id").value=items.waybill_no;
                    //挂失人
                    document.getElementById("lost_name").value=items.finance_cop_payment.lost_name;
                    //登记证件号
                    document.getElementById("lost_identify").value=items.finance_cop_payment.lost_identify;
                    //备注
                    document.getElementById("note").value=items.finance_cop_payment.note;
                    $('#fundguahsi').modal({
                        width:500,
                        height:480
                    });
                },
                //页面内容,确定操作
                guashi_sure:function(){
                    alert(waybill_id_guashi);
                    //获取挂失状态的值
                    var lost_state=$('#rap input[name="ra"]:checked ').val();
                     //挂失人
                    var lost_name=$('#lost_name').val();
                    //登记证件号
                    var lost_identify=$('#lost_identify').val();
                    //备注
                    var note=$('#note').val();
                    $.ajax({
                        //nid='+$('#nid').val()+'&ntid='+$('#n_tid').val()
                       // url:"/update_state_payment_guashi.action?waybill_id="+waybill_id_guashi+"&& lost_state="+lost_state+"&& lost_identify="+lost_identify+"&& note="+note,  //地址
                         url:'/update_state_payment_guashi.action?waybill_id='+waybill_id_guashi+'&oper_state='+lost_state+'&lost_identify='+lost_identify+'&note='+note+'&lost_name='+lost_name+' ',
                        data:$('#formti').serialize(),  //表单提交数据
                        dataType:'JSON',   //转json格式
                        success:function(result){
                            alert("操作失败!");
                        },
                        error:function(result){
                            alert( "操作成功!");
                            location.reload();  //刷新页面
                        }
                    });
                },
                //导出列表
                getExcle:function(){
                    window.location.href="/getFinanceReceiptExcle.action";
                }
            },
            //页面加载数据
            created : function(){
                this.getAll();
            }
        });
        //全选,设置chheckbox name='all' tbody id=tb
        $("input[name=fund_all]").click(function () {
            if (this.checked) {
                $("#fund_tb :checkbox").prop("checked", true);
            } else {
                $("#fund_tb :checkbox").prop("checked", false);
            }
        });



    })

</script>

<script src="assets/js/amazeui.min.js"></script>
<script src="assets/js/amazeui.datatables.min.js"></script>
<script src="assets/js/dataTables.responsive.min.js"></script>
<script src="assets/js/app.js"></script>

</body>

</html>
