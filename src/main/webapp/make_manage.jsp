<%--
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

                <ul class="sidebar-nav sidebar-nav-sub"   style="display: block;">
                    <%--开票申请--%>
                    <li class="sidebar-nav-link">
                        <a href="make_apply.jsp" >
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 开票申请
                        </a>
                    </li>

                    <%--开票管理--%>
                    <li class="sidebar-nav-link">
                        <a href="make_manage.jsp" class="sub-active">
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

                <ul class="sidebar-nav sidebar-nav-sub">
                    <%--预付款充值核销--%>
                    <li class="sidebar-nav-link">
                        <a href="advance_pay.jsp">
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
                        <a href="claim_apply.jsp">
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
    <div class="tpl-content-wrapper" id="app">

        <div class="container-fluid am-cf" style="height:26px;  ">
            <div class="page-header-heading" ><span class=""></span> 发票管理 <small>开票管理 </small></div>
        </div>


        <div class="row-content am-cf">
            <div class="row">
                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">
                        <div class="widget-head am-cf">
                            <div class="widget-title  am-cf">文章列表</div>


                        </div>
                        <div class="widget-body  am-fr">

                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                <div class="am-form-group">
                                    <div class="am-btn-toolbar">
                                        <div class="am-btn-group am-btn-group-xs">
                                            <button type="button" class="am-btn am-btn-default am-btn am-btn-secondary" onclick="shangdel(1)"><span class="am-icon-save" ></span> 申请</button>
                                            <button type="button" class="am-btn am-btn-default am-btn am-btn-secondary" onclick="shangdel(2)"><span class="am-icon-save" ></span> 撤销申请</button>
                                            <button type="button" class="am-btn am-btn-defaultam-btn am-btn am-btn-success" onclick="shangdel(3)"><span class="am-icon-archive"></span> 审核</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-warning" onclick="shangdel(4)"><span class="am-icon-trash-o"></span> 审核撤销</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-danger" onclick=" shangdel(5)"><span class="am-icon-save"></span> 发票作废</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-warning" onclick="getExcle()"><span class="am-icon-archive"></span> 导出</button>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="widget-head am-cf">
                            </div>
                            <div class="widget-title  am-cf" style="margin-top:8px; ">&nbsp;&nbsp;查询条件</div>
                            <br/>

                            <%--查询条件--%>
                            <div class="am-u-sm-12 am-u-md-12 am-u-lg-12" >
                                <form class="am-form am-form-horizontal" style="font-size: 0.8em">

                                    <div class="am-form-group">
                                        <label  class="am-u-sm-1 am-form-label">发票状态</label>
                                        <div class="am-u-sm-2">
                                            <select v-model="selected">
                                                <option value="0">显示全部</option>
                                                <option value="1">未申请</option>
                                                <option value="2">已申请</option>
                                                <option value="3">未审核</option>
                                                <option value="4">已审核</option>
                                                <option value="5">未开发票</option>
                                                <option value="6">已开发票</option>
                                                <option value="7">发票作废</option>
                                            </select>
                                        </div>
                                        <div class="am-u-sm-1 am-u-end">
                                            <span class="am-btn am-btn-default am-btn-warning" @click="MySearch()">查询</span>
                                        </div>
                                    </div>
                                </form>
                            </div>

                        </div>


                        <br>
                        <div class="widget-head am-cf">
                        </div>
                        <div class="widget-title  am-cf" style="margin-top:8px; ">&nbsp;&nbsp;查询列表</div>
                        <br/>


                        <%--表单内容区域--%>
                        <div class="am-u-sm-12">
                            <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-r">
                                <thead>
                                <tr>
                                    <th>序号</th>
                                    <th><input type="checkbox" onclick="control()" id="control" name="interest" value="1"></th>
                                    <th>发票号</th>
                                    <th>发票状态</th>
                                    <th>发票类型</th>
                                    <th>发票抬头</th>
                                    <th>运费</th>
                                    <th>开票金额</th>
                                    <th>补税金额</th>
                                    <th>含税</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>

                                <tr class="gradeX" v-for="(finance,index) in finance">
                                    <td>{{finance.receiptApplyId}}</td>
                                    <td><input type="checkbox" name="receiptApplyId" :value="finance.receiptApplyId"></td>
                                    <td>{{finance.receiptNo}}</td>
                                    <td v-if="finance.receiptStatus == 1">未申请</td>
                                    <td v-else-if="finance.receiptStatus == 2">已申请</td>
                                    <td v-else-if="finance.receiptStatus == 3">未审核</td>
                                    <td v-else-if="finance.receiptStatus == 4">已审核</td>
                                    <td v-else-if="finance.receiptStatus == 5">未开发票</td>
                                    <td v-else-if="finance.receiptStatus == 6">已开发票</td>
                                    <td v-else-if="finance.receiptStatus == 7">发票作废</td>
                                    <td>{{finance.receiptType}}</td>
                                    <td>发票抬头未知</td>
                                    <td>运费未知</td>
                                    <td>{{finance.receiptAmt}}</td>
                                    <td>补偿金额未知</td>
                                    <td v-if="finance.isDutyFree == 0">是</td>
                                    <td v-else-if="finance.isDutyFree == 1">否</td>
                                    <td v-if="finance.receiptStatus <=2 ">
                                        <button class="am-btn" @click="getOne(finance)">修改申请</button>
                                    </td>
                                    <td v-else-if="finance.receiptStatus > 2">进入审核中不允许修改</td>
                                </tr>



                                <!-- more data -->
                                </tbody>
                            </table>
                        </div>
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

<%--body结束--%>
</div>

<script>

    var vm = new Vue({
        el: "#app", //引用div的id
        data: function(){
            return {
                submitUrl:"", //跳转的路径
                finance: [] , //表单数据集合
                selected:"0",
            }
        },
        methods: {
            //表单绑定数值的方法
            getAll : function(){
                //上面方法从新赋值
                var currenr_this=this;
                //跳转的路径
                currenr_this.submitUrl='finance/getAllFinanceReceiptManage.action';
                //通过json方式得到数据
                $.getJSON(currenr_this.submitUrl,function(result,status){
                    //把结果集赋给定义的users，用来页面展示
                    currenr_this._data.finance=result;
                })
            },//添加按钮模态框
            MySearch:function () {
                var receiptStatus =  this.selected;
                var No = this.eCardNo;
                var currenr_this=this;
                $.ajax({
                    type: 'POST',
                    url: "finance/getAllFinanceReceiptManage.action",
                    data: {
                        "receiptStatus":receiptStatus
                    },
                    dataType: 'json',
                    success: function (data) {
                        currenr_this._data.finance=data;
                    },
                    error: function (exception) {
                        console.log('Exeption:' + exception);
                    }
                });

            },
            add:function(){


            },
            getOne:function (finance) {
                $("#receiptApplyId").val(finance.receiptApplyId);
                $("#upeCardNo").val(finance.eCardNo);
                $("#upregisterName").val(finance.registerName);
                $("#upregisterMobile").val(finance.registerMobile);
                $("#uptaxIdentificationNo").val(finance.taxIdentificationNo);
                $("#upaccountBank").val(finance.accountBank);
                $("#upbankCardNo").val(finance.bankCardNo);
                $("#upaddress").val(finance.address);
                $("#upcompCode").val(finance.compCode);
                $("#upreceiptType").val(finance.receiptType);
                if(finance.isDutyFree == 0){
                    $("input[name='upisDutyFree']")[0].checked = true;
                }else{
                    $("input[name='upisDutyFree']")[1].checked = true;
                }
                $("#uptaxRate").val(finance.taxRate);
                $("#uptaxAmt").val(finance.taxAmt);
                $("#upreceiptAmt").val(finance.receiptAmt);
                $("#upserialNumber").val(finance.serialNumber);
                $("#upwaybillTotal").val(finance.waybillTotal);
                $('#upform').modal({
                    width:900,
                    closeViaDimmer:false
                });
            },
        },
        //页面加载数据
        created : function(){
            this.getAll();
        }
    });





    //撤销申请
    function shangdel(type){
        if(type == 1){
            $("#apply").modal("open");
        }else if(type == 2){
            $("#sss").modal("open");
        }else if(type == 3){
            $("#audit").modal("open");
        }else if(type == 4){
            $("#undo").modal("open");
        }else if(type == 5){
            $("#fan").modal("open");
        }

    }



    function operation(state) {
        var id = "";
        $("input[name='receiptApplyId']:checked").each(function () {
            var type = $(this).parent().next().next().html()
            if(state == 2){
                //撤销申请
                if(type==="已申请"){
                    id+=($(this).val())+",";
                }
            }else if (state==4){
                //撤销审核
                if(type==="已审核"){
                    id+=($(this).val())+",";
                }
            }else if (state==7){
                //发票作废
                id+=($(this).val())+",";
            }else if(state==3){
                //审核
                if(type==="已申请"|| type  === "未审核"){
                    id+=($(this).val())+",";
                }

            }else if(state==1){
                //申请
                id+=($(this).val())+",";
            }
            $(this).prop("checked",false);
        });
        var vule = 0 ;
        if(state == 2){
            //撤销申请
            vule = 1;
        }else if (state==4){
            //撤销审核
            vule = 3;
        }else if (state==7){
            //发票作废
            vule = 7;
        }else if (state==3){
            //审核
            vule = 4;
        }else if(state==1){
            //申请
            vule = 2;
        }
        if(id.length>1){
            $.ajax({
                type: 'POST',
                url: "finance/updateFinanceReceiptStatus.action",
                data: {
                    "id":id,
                    "value":vule
                },
                dataType: 'json',
                success: function (data) {
                    vm.getAll();
                    $("#control").prop("checked",false);
                },
                error: function (exception) {
                    console.log('Exeption:' + exception);
                }
            });
        }

    }

    <!-- 导出 -->
    function getExcle() {
        window.location.href="finance/getFinanceReceiptExcle.action";
    }

    function control() {
        var f =$("input[id='control']")[0].checked;
        if(f){
            $("input[name='receiptApplyId']").not("input:checked").each(function () {
                $(this).prop("checked",true);
            });
        }else{
            $("input[name='receiptApplyId']:checked").each(function () {
                $(this).prop("checked",false);
            });
        }
    }


    function update() {
        var value = {
            "receiptApplyId":$("#receiptApplyId").val(),
            "eCardNo":$("#upeCardNo").val(),
            "registerName":$("#upregisterName").val(),
            "registerMobile":$("#upregisterMobile").val(),
            "taxIdentificationNo":$("#uptaxIdentificationNo").val(),
            "accountBank":$("#upaccountBank").val(),
            "bankCardNo":$("#upbankCardNo").val(),
            "address":$("#upaddress").val(),
            "compCode":$("#upcompCode").val(),
            "receiptType":$("#upreceiptType").val(),
            "isDutyFree":$("#upisDutyFree").val(),
            "taxRate":$("#uptaxRate").val(),
            "taxAmt":$("#uptaxAmt").val(),
            "receiptAmt":$("#upreceiptAmt").val(),
            "serialNumber":$("#upserialNumber").val(),
            "waybillTotal":$("#upwaybillTotal").val(),

        };
        $.ajax({
            type: 'POST',
            url: "finance/updateFinanceReceiptApply.action",
            data: value,
            dataType: 'json',
            success: function (data) {
                $('#upform').modal("close");
                vm.getAll();
            },
            error: function (exception) {
                console.log('Exeption:' + exception);
            }
        });

    }
</script>



<script src="assets/js/amazeui.min.js"></script>
<script src="assets/js/amazeui.datatables.min.js"></script>
<script src="assets/js/dataTables.responsive.min.js"></script>
<script src="assets/js/app.js"></script>


<div class="am-modal am-modal-no-btn" tabindex="-1" id="addformli">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">开票审核
            <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
        </div>
        <div class="am-modal-bd">
            <table class="am-table am-table-centered am-text-middle am-text-nowrap">
                <tr>
                    <td>E卡通/会员名</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                    <td>登记人</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                    <td>登记人电话</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                <tr>
                    <td>纳税人识别号</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                    <td>开户行</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                    <td>银行卡号</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                </tr>
                <tr>
                    <td>地址</td>
                    <td colspan="3"><input type="text" class="am-modal-prompt-input"></td>
                    <td>运单金额</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                    <td>是否含税：</td>
                    <td><input type="radio" name="mg.gwaibao" value="是">是
                        <input type="radio" name="mg.gwaibao" value="否">否
                    </td>
                </tr>
                <tr>
                    <td>税率%</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                    <td>税额</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                    <td>发票金额</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                </tr>
                <tr>
                    <td>发票号</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                    <td>申请流水号</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                    <td>运单数</td>
                    <td><input type="text" class="am-modal-prompt-input"></td>
                </tr>
                <tr>
                    <td>备注</td>
                    <td colspan="3"><input type="text" class="am-modal-prompt-input"></td>
                    <td>开票人</td>
                    <td><input type="text" class="am-modal-prompt-input">
                    </td>
                </tr>
                <tr >
                    <td colspan="6">
                        <span class="am-btn am-btn-default am-btn-warning" data-am-modal-cancel>保存</span>
                        &nbsp;&nbsp;<span class="am-btn am-btn-default am-btn-warning" data-am-modal-confirm>关闭</span>
                    </td>
                </tr>
            </table>

        </div>
    </div>
</div>

<!-- 撤销审核 -->
<div class="am-modal am-modal-confirm" tabindex="-1" id="undo">
    <div class="am-modal-dialog">
        <div class="am-btn am-btn-warning am-btn-primary am-btn-block">撤销审核</div>
        <div class="am-modal-bd"><br/>
            确认取消该发票？<br/><br/>
        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn" data-am-modal-close onclick="operation(4)">确认取消</span>
            <span class="am-modal-btn" data-am-modal-close>关闭</span>
        </div>
    </div>
</div>


<!-- 申请-->
<div class="am-modal am-modal-confirm" tabindex="-1" id="apply">
    <div class="am-modal-dialog">
        <div class="am-btn am-btn-warning am-btn-primary am-btn-block">申请</div>
        <div class="am-modal-bd"><br/>
            确定申请？<br/><br/>
        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn" data-am-modal-close onclick="operation(1)">确认</span>
            <span class="am-modal-btn" data-am-modal-close>关闭</span>
        </div>
    </div>
</div>

<!-- 审核 -->
<div class="am-modal am-modal-confirm" tabindex="-1" id="audit">
    <div class="am-modal-dialog">
        <div class="am-btn am-btn-warning am-btn-primary am-btn-block">审核</div>
        <div class="am-modal-bd"><br/>
            确定通过审核？<br/><br/>
        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn" data-am-modal-close onclick="operation(3)">确认</span>
            <span class="am-modal-btn" data-am-modal-close>关闭</span>
        </div>
    </div>
</div>

<!-- 撤销申请 -->
<div class="am-modal am-modal-confirm" tabindex="-1" id="sss">
    <div class="am-modal-dialog">
        <div class="am-btn am-btn-warning am-btn-primary am-btn-block">撤销申请</div>
        <div class="am-modal-bd"><br/>
            确认取消该发票申请？<br/><br/>
        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn"  data-am-modal-close onclick="operation(2)">确认取消</span>
            <span class="am-modal-btn" data-am-modal-close>关闭</span>
        </div>
    </div>
</div>

<!-- 发票作废 -->
<div class="am-modal am-modal-confirm" tabindex="-1" id="fan">
    <div class="am-modal-dialog">
        <div class="am-btn am-btn-warning am-btn-primary am-btn-block">发票作废</div>
        <div class="am-modal-bd"><br/>
            确认作废该发票？<br/><br/>
        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn" data-am-modal-close onclick="operation(7)">确认作废</span>
            <span class="am-modal-btn" data-am-modal-close>关闭</span>
        </div>
    </div>
</div>


<div class="am-modal" tabindex="-1" id="upform">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">修改
            <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
        </div>
        <div class="am-modal-bd">
            <table class="am-table am-table-centered am-text-middle am-text-nowrap">
                <input type="hidden" id="receiptApplyId" >
                <tr>
                    <td>E卡通/会员名</td>
                    <td><input type="text" id="upeCardNo" class="am-modal-prompt-input"></td>
                    <td>登记人</td>
                    <td><input type="text" id="upregisterName" class="am-modal-prompt-input"></td>
                    <td>登记人电话</td>
                    <td><input type="text" id="upregisterMobile" class="am-modal-prompt-input"></td>
                <tr>
                    <td>纳税人识别号</td>
                    <td><input type="text" id="uptaxIdentificationNo" class="am-modal-prompt-input"></td>
                    <td>开户行</td>
                    <td><input type="text" id="upaccountBank" class="am-modal-prompt-input"></td>
                    <td>银行卡号</td>
                    <td><input type="text" id="upbankCardNo" class="am-modal-prompt-input"></td>
                </tr>
                <tr>
                    <td>地址</td>
                    <td colspan="3"><input type="text" id="upaddress" class="am-modal-prompt-input"></td>
                    <td>运单金额</td>
                    <td><input type="text"  class="am-modal-prompt-input"></td>
                </tr>
                <tr>
                    <td>公司名称</td>
                    <td colspan="3"><input id="upcompCode" type="text" class="am-modal-prompt-input"></td>
                    <td>开票类型</td>
                    <td><input type="text" id="upreceiptType" class="am-modal-prompt-input"></td>
                </tr>
                <tr>
                    <td>是否含税：</td>
                    <td><input type="radio" id="upisDutyFree"  name="upisDutyFree" value="0">是
                        <input type="radio" id="upisDutyFree" name="upisDutyFree" value="1">否
                    </td>
                    <td> 税率</td>
                    <td><input type="text" id="uptaxRate" class="am-modal-prompt-input"></td>
                    <td>税额</td>
                    <td><input type="text" id="uptaxAmt" class="am-modal-prompt-input"></td>
                </tr>
                <tr>
                    <td>发票金额</td>
                    <td><input type="text" id="upreceiptAmt" class="am-modal-prompt-input"></td>
                    <td> 申请流水号</td>
                    <td><input type="text" id="upserialNumber" class="am-modal-prompt-input"></td>
                    <td>运单数</td>
                    <td><input type="text" id="upwaybillTotal" class="am-modal-prompt-input"></td>
                </tr>
                <tr>
                    <td>备注</td>
                    <td colspan="5"><input type="text" class="am-modal-prompt-input"></td>
                </tr>
                <tr >
                    <td colspan="6">
                        <span class="am-btn am-btn-default am-btn-warning"  onclick="update()">修改</span>
                        &nbsp;&nbsp;<span class="am-btn am-btn-default am-btn-warning" data-am-modal-close>关闭</span>
                    </td>
                </tr>
            </table>

        </div>
    </div>
</div>

</body>

</html>
