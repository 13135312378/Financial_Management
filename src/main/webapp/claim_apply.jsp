<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
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

    <%--时间--%>
    <link rel="stylesheet" href="assets/css/amazeui.datetimepicker.css"/>
    <script src="assets/js/amazeui.datetimepicker.min.js"></script>

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

                <ul class="sidebar-nav sidebar-nav-sub" style="display: block;">
                    <%--预付款充值核销--%>
                    <li class="sidebar-nav-link">
                        <a href="advance_pay.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 预付款充值核销
                        </a>
                    </li>


                    <%--回款核销--%>
                    <li class="sidebar-nav-link">
                        <a href="returned_apply.jsp">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 回款核销
                        </a>
                    </li>


                    <%--理赔核销--%>
                    <li class="sidebar-nav-link">
                        <a href="claim_apply.jsp" class="sub-active">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 理赔核销
                        </a>
                    </li>

                    <%--运单费用项核销--%>
                    <li class="sidebar-nav-link">
                        <a href="waybill_money.jsp">
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
                <ul class="sidebar-nav sidebar-nav-sub">

                    <%--代收款登记--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_fund.jsp">
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
    <div id="app_claim">
    <div class="tpl-content-wrapper" >

        <div class="container-fluid am-cf" style="height:26px;  ">
            <div class="page-header-heading" ><span class=""></span> 主营业务核销 <small>理赔核销 </small></div>
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
                                            <button type="button" class="am-btn am-btn-default am-btn-success" @click="claim_search()"><span class="am-icon-search"></span> 批量查寻</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary"  @click="claim_hexiao()"><span class="am-icon-save"></span> 核销</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-warning" @click="claim_chexiao()"><span class="am-icon-reply"></span> 撤销核销</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-danger"><span class="am-icon-send-o"></span> 导出列表</button>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="widget-head am-cf">
                            </div>
                            <div class="widget-title  am-cf" style="margin-top:8px; ">查询条件</div>
                            <br/>


                            <form action="" method="post">
                                <%
                                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                                    String date= format.format(new Date());
                                %>

                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    登记日期&nbsp;:&nbsp;<input type="text" style="width:139px; " value="<%=date%>" id="datetimepicker_claim" data-date-format="yyyy-mm-dd">
                                </div>

                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    至&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input type="text" style="width:139px; " value="<%=date%>" id="datetimepicker1_claim" data-date-format="yyyy-mm-dd">
                                </div>


                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    业务类型&nbsp;&nbsp;:&nbsp;&nbsp;
                                    <select style="width:139px; padding-top:3px; padding-bottom:3px;">
                                        <option value="option1">平台件</option>
                                        <option value="option2">IT业界</option>
                                    </select>
                                </div>


                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    寄件网点&nbsp;&nbsp;:&nbsp;&nbsp;
                                    <input type="text" style="width:139px; "/>
                                </div>


                                <br/>
                                <br/>


                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    出账日期&nbsp;:&nbsp;<input type="text" style="width:139px; " value="<%=date%>" id="datetimepicker2_claim" data-date-format="yyyy-mm-dd">
                                </div>

                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    至&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input type="text" style="width:139px; " value="<%=date%>" id="datetimepicker3_claim" data-date-format="yyyy-mm-dd">
                                </div>


                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    核销状态&nbsp;&nbsp;:&nbsp;&nbsp;
                                    <select style="width:139px; padding-top:3px; padding-bottom:3px;  ">
                                        <option value="option1">平台件</option>
                                        <option value="option2">IT业界</option>
                                    </select>
                                </div>


                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    理赔编码&nbsp;&nbsp;:&nbsp;&nbsp;
                                    <input type="text" style="width:136px; "/>
                                </div>


                                <br> <br><br>

                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                                    <button type="button" class="am-btn am-btn-warning am-square" style="width:68px; height:34px;  margin-left:360px; ">查询</button>
                                    <button type="reset" class="am-btn am-btn-default" style="width:68px; height:34px;  margin-left:30px; ">重置</button>
                                </div>

                            </form>


                            <%--搜索区域--%>
                            <br>
                            <div class="widget-head am-cf">
                            </div>
                            <div class="widget-title  am-cf" style="margin-top:8px; ">查询结果</div>
                            <br/>


                            <%--表单内容区域--%>
                            <%--表单内容--%>
                                <div class="am-scrollable-horizontal">
                                    <table width="100%" class="am-table am-table-bordered am-table-striped am-text-nowrap" id="example-r1" >
                                        <thead>
                                        <tr>
                                            <th>序号</th>
                                            <th></th>
                                            <th>回款流水号</th>
                                            <th>充值网点</th>
                                            <th>业务类型</th>
                                            <th>审核网点</th>
                                            <th>审核状态</th>
                                            <th>审核日期</th>
                                            <th>出账日期</th>
                                            <th>凭证号</th>
                                            <th>核销去向</th>
                                            <th>充值金额</th>
                                            <th>收入</th>
                                            <th>支出</th>
                                            <th>收据号码</th>
                                            <th>发票号码</th>
                                            <th>支票号码</th>
                                            <th>核销人</th>
                                            <th>核销网点</th>
                                            <th>核销日期</th>
                                            <th>出纳审核日期</th>
                                            <th>凭证审核状态</th>
                                            <th>凭证审核人</th>
                                            <th>凭证审核日期</th>

                                            <th>操作</th>
                                        </tr>
                                        </thead>

                                        <tbody id="returned_tb">
                                        <tr class="gradeX" v-for="(verify,index) in verifys">
                                            <td>{{verify.verify_id}}</td>
                                            <td><input type="checkbox"></td>
                                            <td>{{verify.serial_number}}</td>
                                            <td>{{verify.dept_code}}</td>
                                            <td>{{verify.biz_type}}</td>
                                            <td>{{verify.audit_dept_code}}</td>
                                            <%--审核状态0 1--%>
                                            <td v-if="verify.audit_status==0" style="color:red;">未核销</td>
                                            <td v-else-if="verify.audit_status==1">已核销</td>


                                            <td>{{verify.audit_tm}}</td>
                                            <td>{{verify.finance_rpt_cashier_record.charge_off_tm}}</td>
                                            <td>{{verify.certificate_no}}</td>
                                            <td>{{verify.finance_rpt_cashier_record.verification_direction_code}}</td>
                                            <td>充值金额未知</td>
                                            <td>收入未知</td>
                                            <td>支出未知</td>
                                            <td>{{verify.finance_rpt_cashier_record.receipt_no}}</td>
                                            <td>{{verify.finance_rpt_cashier_record.invoice_no}}</td>
                                            <td>{{verify.finance_rpt_cashier_record.check_no}}</td>
                                            <td>{{verify.finance_rpt_cashier_record.verification_person_code}}</td>
                                            <td>{{verify.finance_rpt_cashier_record.verification_comp_code}}</td>
                                            <td>{{verify.finance_rpt_cashier_record.verification_tm}}</td>
                                            <td>{{verify.finance_rpt_cashier_record.cashier_audit_d}}</td>
                                            <%--凭证审核状态--%>
                                            <td v-if="verify.finance_rpt_cashier_record.certificate_audit_state==0">未审核</td>
                                            <td v-else-if="verify.finance_rpt_cashier_record.certificate_audit_state==1">已审核</td>

                                            <td>{{verify.finance_rpt_cashier_record.certificate_audit_name}}</td>
                                            <td>{{verify.finance_rpt_cashier_record.certificate_audit_dt}}</td>

                                            <td>
                                                 <span>
                                            <div class="tpl-table-black-operation">
                                                <a href="javascript:;" @click="claim_yes(index)" v-if="verify.audit_status==0" >
                                                    <i class="am-icon-send-o"></i>
                                                    核销
                                                </a>

                                                <a href="javascript:;" @click="claim_no(index)" v-if="verify.audit_status==1" class="tpl-table-black-operation-del">
                                                    <i class="am-icon-send-o"></i>
                                                    撤销核销
                                                </a>
                                            </div>
                                        </span>
                                            </td>
                                        </tr>
                                        <!-- more data -->
                                        </tbody>
                                    </table>
                                </div>

                            <%--表单内容区域--%>




                            <%--分页区域--%>
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
                            <%--分页区域--%>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>



        <%--核销--%>
        <div class="am-modal am-modal-confirm" tabindex="-1" id="claimhexiao">
            <div class="am-modal-dialog">
                <div class="am-btn am-btn-warning am-btn-primary am-btn-block">回款信息的确认</div>
                <div class="am-modal-bd">
                    你，确定要核销这条记录吗？
                </div>
                <div class="am-modal-footer">
                    <span class="am-modal-btn" data-am-modal-cancel>取消</span>
                    <span class="am-modal-btn" data-am-modal-confirm @click="claim_hxgsure()">确定</span>
                </div>
            </div>
        </div>




        <%--撤销核销--%>
        <div class="am-modal am-modal-confirm" tabindex="-1" id="claimchexiao">
            <div class="am-modal-dialog">
                <div class="am-btn am-btn-warning am-btn-primary am-btn-block">回款信息的撤销确认</div>
                <div class="am-modal-bd">
                    你，确定要撤销核销这条记录吗？
                </div>
                <div class="am-modal-footer">
                    <span class="am-modal-btn" data-am-modal-cancel>取消</span>
                    <span class="am-modal-btn" data-am-modal-confirm @click="claim_cxhxgsure()">确定</span>
                </div>
            </div>
        </div>






    </div>
    <%--body结束--%>
</div>



<script>

    $(function(){
        var verify_id_lphx;
        var verify_id_cxhklp;
        var vm = new Vue({
            el: "#app_claim", //引用div的id
            data: {
                submitUrl:"/getAll_Verifylpcontro.action", //跳转的路径
                verify:"",
                verifys: []//表单数据集合


            },
            methods: {
                //表单绑定数值的方法
                getAll : function(){
                    //上面方法从新赋值
                    var currenr_this=this;
                    //跳转的路径
                    currenr_this.submitUrl='/getAll_Verifylpcontro.action';
                    //通过json方式得到数据
                    $.getJSON(currenr_this.submitUrl,function(result,status){
                        //把结果集赋给定义的users，用来页面展示
                        currenr_this._data.verifys=result;
                        console.info(result) //得到对象集合
                    })
                },
                //核销
                claim_yes:function (index) {
                    //拿到对象
                    var item=this.verifys[index];
                    //获取该对象的id
                    verify_id_lphx=item.verify_id;
                    $('#claimhexiao').modal({});
                },
                //确定核销
                claim_hxgsure:function () {
                    $.ajax({
                        url:'/update_verify_lphxcontro.action',
                        data:{verify_id:verify_id_lphx},
                        dataType:'JSON',
                        success:function(result){
                            alert('审核失误！');
                        },
                        error:function(result){
                            alert('审核成功！');
                            location.reload();  //刷新页面
                        }
                    })
                },
                //撤销核销
                claim_no:function () {
                    //拿到对象
                    var item=this.verifys[index];
                    //获取该对象的id
                    verify_id_cxhklp=item.verify_id;
                    $('#claimchexiao').modal({});
                },
                //确定撤销核销
                claim_cxhxgsure:function () {
                    $.ajax({
                        url:'/update_verify_lpcxcontro.action',
                        data:{verify_id:verify_id_cxhklp},
                        dataType:'JSON',
                        success:function(result){
                            alert('审核失误！');
                        },
                        error:function(result){
                            alert('审核成功！');
                            location.reload();  //刷新页面
                        }
                    })
                }
            },
            //页面加载数据
            created : function(){
                this.getAll();
            }
        });



        $('#datetimepicker_returned').datetimepicker();  //日期显示
        $('#datetimepicker1_returned').datetimepicker();  //日期显示
        $('#datetimepicker2_returned').datetimepicker();  //日期显示
        $('#datetimepicker3_returned').datetimepicker();  //日期显示

        //全选,设置chheckbox name='all' tbody id=tb
        $("input[name=returned_all]").click(function () {
            if (this.checked) {
                $("#returned_tb :checkbox").prop("checked", true);
            } else {
                $("#returned_tb :checkbox").prop("checked", false);
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
