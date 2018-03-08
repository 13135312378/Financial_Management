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
                        <a href="agency_fund.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款登记
                        </a>
                    </li>


                    <%--代收款操作--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_operation.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款操作
                        </a>
                    </li>


                    <%--代收款发款--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_send.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款发款
                        </a>
                    </li>


                    <%--代收款合并发款--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_merge.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款合并发款
                        </a>
                    </li>


                    <%--代收款批次发款--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_batch.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 代收款批次发款
                        </a>
                    </li>


                    <%--代收款批次管理--%>
                    <li class="sidebar-nav-link">
                        <a href="agency_manage.jsp" class="sub-active">
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
    <div id="app_manage">
    <div class="tpl-content-wrapper" >

        <div class="container-fluid am-cf" style="height:26px;  ">
            <div class="page-header-heading" ><span class=""></span> 代收货款管理 <small>代收款批次管理 </small></div>
        </div>


        <div class="row-content am-cf">
            <div class="row">
                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">
                        <div class="widget-body  am-fr">

                            <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                                <div class="am-form-group">
                                    <div class="am-btn-toolbar">
                                        <div class="am-btn-group am-btn-group-xs">
                                            <button type="button" class="am-btn am-btn-default am-btn-success" ><span class="am-icon-plus"></span> 新建</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary" ><span class="am-icon-save"></span> 编辑</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-warning" ><span class="am-icon-archive"></span>删除</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary" ><span class="am-icon-trash-o"></span> 审核</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary" ><span class="am-icon-trash-o"></span> 驳回</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary" ><span class="am-icon-trash-o"></span> 取消发款</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary" ><span class="am-icon-trash-o"></span> 现金发款</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary"><span class="am-icon-trash-o"></span> 北部湾转款</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary"><span class="am-icon-trash-o"></span> 短信通知</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary"><span class="am-icon-trash-o"></span> 转款信息导出</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-danger"><span class="am-icon-trash-o"></span> 结算凭证补印</button>
                                            <%--<button type="button" class="am-btn am-btn-default am-btn-danger"><span class="am-icon-trash-o"></span> 结算清单补印</button>--%>
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
                                    批次号&nbsp;&nbsp;:&nbsp;&nbsp;
                                    <input type="text" style="width:139px; "/>
                                </div>



                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    登记日期&nbsp;:&nbsp;<input type="text" style="width:139px; " value="<%=date%>" id="datetimepicker_manage" data-date-format="yyyy-mm-dd">
                                </div>

                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    至&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input type="text" style="width:139px; " value="<%=date%>" id="datetimepicker1_manage" data-date-format="yyyy-mm-dd">
                                </div>

                                <br/>
                                <br/>


                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    收款人&nbsp;&nbsp;:&nbsp;&nbsp;
                                    <input type="text" style="width:139px; "/>
                                </div>

                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    客户编码&nbsp;&nbsp;:&nbsp;&nbsp;
                                    <input type="text" style="width:139px; "/>
                                </div>

                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    银行类型&nbsp;&nbsp;:&nbsp;
                                    <select style="width:139px; padding-top:3px; padding-bottom:3px;  ">
                                        <option value="option1">平台件</option>
                                        <option value="option2">IT业界</option>
                                    </select>
                                </div>

                                <br/>
                                <br/>

                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    转款类型&nbsp;&nbsp;:&nbsp;
                                    <select style="width:139px; padding-top:3px; padding-bottom:3px;  ">
                                        <option value="option1">平台件</option>
                                        <option value="option2">IT业界</option>
                                    </select>
                                </div>


                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    转款状态&nbsp;&nbsp;:&nbsp;
                                    <select style="width:139px; padding-top:3px; padding-bottom:3px;  ">
                                        <option value="option1">平台件</option>
                                        <option value="option2">IT业界</option>
                                    </select>
                                </div>


                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    短信状态&nbsp;&nbsp;:&nbsp;
                                    <select style="width:139px; padding-top:3px; padding-bottom:3px;  ">
                                        <option value="option1">平台件</option>
                                        <option value="option2">IT业界</option>
                                    </select>
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
                            <div class="widget-title  am-cf" style="margin-top:8px; ">批次转款列表</div>
                            <br/>



                            <div>

                                <span>共计：4票 &nbsp;&nbsp;代收款总计：10000&nbsp;&nbsp;服务费及扣款合计：2000</span>
                                <br/>
                                <span>已选：2票 &nbsp;&nbsp;代转贷款货款总计：1000 &nbsp;&nbsp;待转服务费及扣款合计：2000 </span>
                            </div>

                            <%--表单内容区域--%>
                            <%--表单内容--%>
                            <div class="am-scrollable-horizontal">
                                <table width="100%" class="am-table am-table-bordered am-table-striped am-text-nowrap" id="example-r1" >
                                    <thead>
                                    <tr>
                                        <th>代付款序号</th>
                                        <th></th>
                                        <th>批次号</th>
                                        <th>批次状态</th>
                                        <th>创建时间</th>
                                        <th>创建者编码</th>
                                        <th>单数</th>
                                        <th>总金额</th>
                                        <th>实际付款金额</th>
                                        <th>转款时间</th>
                                        <th>转款人</th>
                                        <th>转款类型</th>


                                        <th>手续费</th>
                                        <th>客户名称</th>
                                        <th>客户代码</th>
                                        <th>客户手机</th>
                                        <th>卡号类型</th>
                                        <th>银行账户</th>
                                        <th>领款人</th>
                                        <th>证件号码</th>
                                        <th>转款状态</th>


                                        <th>通知状态</th>
                                        <th>挂失费</th>
                                        <th>短信费</th>
                                        <th>代收扣</th>
                                        <th>公司编码</th>
                                        <th>部门编码</th>
                                        <th>组织类型</th>

                                        <th>创建人</th>
                                        <th>创建时间</th>
                                        <th>修改人</th>
                                        <th>是否删除</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>

                                    <tbody id="fund_tb">
                                    <tr class="gradeX" v-for="(tbwaybill,index) in send_manage" id="merges">
                                        <td>{{tbwaybill.batch_payment_id}}</td>
                                        <td><input type="checkbox" name="id"></td>
                                        <td>{{tbwaybill.batch_no}}</td>
                                        <%--批次状态:1-无操作, 2-取消转款 3-已审核 4-已驳回--%>
                                        <td v-if="tbwaybill.batch_status=1">无操作</td>
                                        <td v-else-if="tbwaybill.batch_status=2">取消转款</td>
                                        <td v-else-if="tbwaybill.batch_status=3">已审核</td>
                                        <td v-else-if="tbwaybill.batch_status=4">已驳回</td>

                                        <td>{{tbwaybill.create_tm}}</td>
                                        <td>{{tbwaybill.create_emp_code}}</td>
                                        <td>{{tbwaybill.waybill_count}}</td>
                                        <td>{{tbwaybill.total_amt}}</td>
                                        <td>{{tbwaybill.real_pay_amt}}</td>
                                        <td>{{tbwaybill.pay_tm}}</td>
                                        <td>{{tbwaybill.pay_emp_code}}</td>
                                        <%--转款类型（1：现金  、 2：银行卡）--%>
                                        <td v-if="tbwaybill.transfer_type=1">现金</td>
                                        <td v-else-if="tbwaybill.transfer_type=2">银行卡</td>


                                        <td>{{tbwaybill.counter_amt}}</td>
                                        <td>{{tbwaybill.customer_name}}</td>
                                        <td>{{tbwaybill.customer_code}}</td>
                                        <td>{{tbwaybill.customer_phone}}</td>
                                        <td>{{tbwaybill.card_type}}</td>
                                        <td>{{tbwaybill.bank_account}}</td>
                                        <td>{{tbwaybill.payee}}</td>
                                        <td>{{tbwaybill.identify_number}}</td>

                                        <%--转款状态 ：（1： 已转  、2 ：可转、3：不可转）--%>
                                        <td v-if="tbwaybill.transfer_status=1">已转 </td>
                                        <td v-else-if="tbwaybill.transfer_status=2">可转</td>
                                        <td v-else-if="tbwaybill.transfer_status=3">不可转</td>


                                        <%--通知状态 ( 1未通知 2 已通知)--%>
                                        <td v-if="tbwaybill.inform_status=1">未通知 </td>
                                        <td v-else-if="tbwaybill.inform_status=2">已通知</td>

                                        <td>{{tbwaybill.lost_fee}}</td>
                                        <td>{{tbwaybill.msg_service_fee}}</td>
                                        <td>{{tbwaybill.collect_deduce_fee}}</td>
                                        <td>{{tbwaybill.comp_code}}</td>
                                        <td>{{tbwaybill.dept_code}}</td>
                                        <td>{{tbwaybill.org_type}}</td>
                                        <td>{{tbwaybill.creater}}</td>
                                        <td>{{tbwaybill.creater_time}}</td>
                                        <td>{{tbwaybill.modifier}}</td>
                                       <%--是否删除 0未删除；1 已删除  默认 0--%>
                                        <td v-if="tbwaybill.is_delete=1">未删除 </td>
                                        <td v-else-if="tbwaybill.is_delete=2">已删除 </td>

                                    <%--修改状态--%>
                                        <%--未登记显示登记操作--%>
                                        <td>
                                        </td>


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


    </div>
</div>


<script>

    $(function(){

        var vm = new Vue({
            el: "#app_manage", //引用div的id
            data: {
                submitUrl:"/getallbatch.action", //跳转的路径
                tbwaybill:"",
                send_manage: [],  //表单数据集合
                titleName:"",
                paymentId:""  //表单数据的id
            },
            methods: {
                //表单绑定数值的方法
                getAll : function(){
                    //上面方法从新赋值
                    var currenr_this=this;
                    //跳转的路径
                    currenr_this.submitUrl='/getallbatch.action';
                    //通过json方式得到数据
                    $.getJSON(currenr_this.submitUrl,function(result,status){
                        //把结果集赋给定义的users，用来页面展示
                        currenr_this._data.send_manage=result;
                        console.info(result);
                    })
                }
            },
            //页面加载数据
            created : function(){
                this.getAll();
            }
        });


    })

</script>








<script src="assets/js/amazeui.min.js"></script>
<script src="assets/js/amazeui.datatables.min.js"></script>
<script src="assets/js/dataTables.responsive.min.js"></script>
<script src="assets/js/app.js"></script>





<%--挂失登记--%>
<div class="am-modal am-modal-no-btn" tabindex="" id="fundguahsi">
    <div class="am-modal-dialog" style="background-color:white; ">
        <div class="am-btn am-btn-warning am-btn-primary am-btn-block">挂失操作
            <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
        </div>

        <div class="am-modal-bd">
            <%--查询输入区域--%>
            <form action="" method="post">
                <table class="am-table am-table-centered am-text-middle am-text-nowrap" border="0">
                    <tr>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="radio" value="临时挂失" name="ra">临时挂失
                            &nbsp;&nbsp;&nbsp;
                            <input type="radio" value="正式挂失，挂失费20元" name="ra">正式挂失，挂失费20元
                            &nbsp;&nbsp;&nbsp;
                            <input type="checkbox" value="挂失费从代收款扣减" name="r">挂失费从代收款扣减
                        </td>

                    </tr>
                    <tr>
                        <td>
                            运单号&nbsp;:&nbsp;<input type="text" style="width:146px;"/></td>


                        挂失人&nbsp;:&nbsp;<input type="text" style="width:146px;"/></td>
                        </td>

                    </tr>

                    <tr>
                        <td>
                            登记证件号&nbsp;:&nbsp;<input type="text" style="width:146px;"/></td>
                        </td>
                    </tr>

                    <tr>

                        <td>
                            备注&nbsp;:&nbsp;<textarea name="" cols="18" rows="5"></textarea>
                        </td>
                    </tr>

                    <tr> <td>
                        <button type="button" class="am-btn am-btn-warning am-radius" style="height:34px; ">挂失打印</button>
                        <button type="button" class="am-btn am-btn-default" style="height:34px; " data-am-modal-close>取消</button>
                    </td>
                    </tr>
                </table>
            </form>

        </div>
    </div>
</div>




















</body>

</html>
