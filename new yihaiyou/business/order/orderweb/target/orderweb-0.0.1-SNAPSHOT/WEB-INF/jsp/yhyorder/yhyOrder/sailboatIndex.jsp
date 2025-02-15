<%--
  Created by IntelliJ IDEA.
  User: zzl
  Date: 2016/10/8
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="../../common/common141.jsp"%>
    <script type="text/javascript" src="/js/yhyorder/sailboat/index.js"></script>
    <title>海上休闲订单管理</title>
    <style>
        .labelClass {
            float: left;
            margin-right: 5px;
            width: 60px;
            text-align: right;
        }
        .row_hd {
            height: 27px;
            width: 100%;
            line-height: 27px;
            border-bottom: 1px solid #ddd;
            background: #f4f4f4;
            margin: 0px 15px 10px 5px;
            padding-left: 5px;
            padding-right: 5px;
            font-weight: 700;
            color: #666;
        }
        .calender_class {
            border: #999 1px solid;
            width: 117px;
            margin-left: -4px;
            height: 22px;
            background: url("/jquery-easyui-1.4.1/themes/icons/date.png") no-repeat scroll right center transparent;
            border-radius: 5px 5px 5px 5px;
            border: 1px solid #95B8E7;
        }
    </style>
</head>
<body style="background-color: white">
<div id="activity_tab" title="海上休闲订单" class="easyui-tabs" fit="true" ShowHeader="true">
    <div id="sailboat" title="帆船订单">
        <div title="" class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
            <!-- 表格工具条 始 -->
            <div id="client_sailboat_tool">
                <form action="" id=client_sailboat_form">
                    <div style="padding:5px 5px 3px 5px;">
                        <input id="client_sailboat_companyId" style="width:200px;"/>
                        <input id="client_sailboat_orderNo" class="easyui-textbox" data-options="prompt:'订单编号'" style="width:160px;"/>
                        <input id="client_sailboat_recName" class="easyui-textbox" data-options="prompt:'取票人'" style="width:140px;">
                        <input id="client_sailboat_mobile" class="easyui-textbox" data-options="prompt:'取票人电话'" style="width:140px;">
                        <input id="client_sailboat_status" class="easyui-combobox" data-options="prompt:'订单状态',editable:false,
                            valueField: 'id',
                            textField: 'value',
                            panelHeight: 'auto',
                             data:　ClientSailboatOrderManage.orderStatus
                            " style="width:140px;">
                        <input id="start_sailboat_createTime" class="easyui-datebox" data-options="prompt:'订单日期始'" style="width:100px;"/>
                        -
                        <input id="end_sailboat_createTime" class="easyui-datebox" data-options="prompt:'订单日期止'" style="width:100px;"/>

                        <a href="javascript:void(0)" id="client_ship_search" class="easyui-linkbutton"  onclick="ClientSailboatOrderManage.doSailboatSearch()">查询</a>
                        <a href="javascript:void(0)" id="client_ship_clear" class="easyui-linkbutton"  onclick="ClientSailboatOrderManage.clearSailboatForm()">重置</a>
                        <%--<label style="float: right;">账户余额：--%>
                            <%--<span style="color:red; font-weight:bold;font-size:20px;">${sysUser.balanceStr}</span>元--%>
                        <%--</label>--%>
                    </div>
                   <%-- <div style="padding:0px 5px 5px 5px;">
                        <input id="client_sailboat_contact" class="easyui-textbox" data-options="prompt:'联系人'" style="width:150px;">
                        <input id="client_sailboat_phone" class="easyui-textbox" data-options="prompt:'联系电话'" style="width:150px;">
                        <input id="start_sailboat_useTime" class="easyui-datebox"
                               data-options="prompt:'出发日期始'" style="width:100px;"/>&nbsp;-
                        <input id="end_sailboat_useTime" class="easyui-datebox"
                               data-options="prompt:'出发日期止'" style="width:100px;"/>
                        <a href="javascript:void(0)" id="client_ship_search" class="easyui-linkbutton"  onclick="ClientSailboatOrderManage.doSailboatSearch('show_dg')">查询</a>
                        <a href="javascript:void(0)" id="client_ship_clear" class="easyui-linkbutton"  onclick="ClientSailboatOrderManage.clearSailboatForm()">清空</a>
                        &lt;%&ndash;<a style=" margin-right: 10px;" href="javascript:void(0)" class="easyui-linkbutton "  onclick="ClientOrderManage.downloadShipSuplierExcel()">导出订单</a>&ndash;%&gt;
                    </div>--%>
                </form>
            </div>
            <!-- 表格工具条 终 -->
            <!-- 表格 始 -->
            <div data-options="region:'center',border:false">
                <table id="client_sailboat_dg"></table>
            </div>
            <!-- 表格 终 -->
        </div>
    </div>

    <div id="yacht" title="游艇订单">
        <div title="" class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
            <!-- 表格工具条 始 -->
            <div id="client_yacht_tool">
                <form action="" id=client_yacht_form">
                    <div style="padding:5px 5px 3px 5px;">
                        <input id="client_yacht_companyId" style="width:200px;"/>
                        <input id="client_yacht_orderNo" class="easyui-textbox" data-options="prompt:'订单编号'" style="width:160px;"/>
                        <input id="client_yacht_recName" class="easyui-textbox" data-options="prompt:'取票人'" style="width:140px;">
                        <input id="client_yacht_mobile" class="easyui-textbox" data-options="prompt:'取票人电话'" style="width:140px;">
                        <input id="client_yacht_status" class="easyui-combobox" data-options="prompt:'订单状态',editable:false,
                            valueField: 'id',
                            textField: 'value',
                            panelHeight: 'auto',
                             data:　ClientSailboatOrderManage.orderStatus
                            " style="width:140px;">
                        <input id="start_yacht_createTime" class="easyui-datebox" data-options="prompt:'订单日期始'" style="width:100px;"/>
                        -
                        <input id="end_yacht_createTime" class="easyui-datebox" data-options="prompt:'订单日期止'" style="width:100px;"/>

                        <a href="javascript:void(0)"  class="easyui-linkbutton"  onclick="ClientSailboatOrderManage.doYachtSearch()">查询</a>
                        <a href="javascript:void(0)"  class="easyui-linkbutton"  onclick="ClientSailboatOrderManage.clearYachtForm()">重置</a>
                       <%-- <label style="float: right;">账户余额：
                            <span style="color:red; font-weight:bold;font-size:20px;">${sysUser.balanceStr}</span>元
                        </label>--%>
                    </div>
                    <%--<div style="padding:0px 5px 5px 5px;">
                        <input id="client_sailboat_contact" class="easyui-textbox" data-options="prompt:'取票人'" style="width:150px;">
                        <input id="client_yacht_phone" class="easyui-textbox" data-options="prompt:'取票人电话'" style="width:150px;">
                        <input id="start_yacht_useTime" class="easyui-datebox"
                               data-options="prompt:'出发日期始'" style="width:100px;"/>&nbsp;-
                        <input id="end_yacht_useTime" class="easyui-datebox"
                               data-options="prompt:'出发日期止'" style="width:100px;"/>
                        <a href="javascript:void(0)" id="client_ship_search" class="easyui-linkbutton"  onclick="ClientSailboatOrderManage.doYachtSearch('show_dg')">查询</a>
                        <a href="javascript:void(0)" id="client_ship_clear" class="easyui-linkbutton"  onclick="ClientSailboatOrderManage.clearYachtForm()">清空</a>
                        &lt;%&ndash;<a style=" margin-right: 10px;" href="javascript:void(0)" class="easyui-linkbutton "  onclick="ClientOrderManage.downloadShipSuplierExcel()">导出订单</a>&ndash;%&gt;
                    </div>--%>
                </form>
            </div>
            <!-- 表格工具条 终 -->
            <!-- 表格 始 -->
            <div data-options="region:'center',border:false">
                <table id="client_yacht_dg"></table>
            </div>
            <!-- 表格 终 -->
        </div>
    </div>

    <div id="huanguyou" title="鹭岛游订单">
        <div title="" class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
            <!-- 表格工具条 始 -->
            <div id="client_huanguyou_tool">
                <form action="" id=client_huanguyou_form">
                    <div style="padding:5px 5px 3px 5px;">
                        <input id="client_huanguyou_companyId" style="width:200px;"/>
                        <input id="client_huanguyou_orderNo" class="easyui-textbox" data-options="prompt:'订单编号'" style="width:160px;"/>
                        <input id="client_huanguyou_recName" class="easyui-textbox" data-options="prompt:'取票人'" style="width:140px;">
                        <input id="client_huanguyou_mobile" class="easyui-textbox" data-options="prompt:'取票人电话'" style="width:140px;">
                        <input id="client_huanguyou_status" class="easyui-combobox" data-options="prompt:'订单状态',editable:false,
                            valueField: 'id',
                            textField: 'value',
                            panelHeight: 'auto',
                             data:　ClientSailboatOrderManage.orderStatus
                            " style="width:140px;">
                        <input id="start_huanguyou_createTime" class="easyui-datebox" data-options="prompt:'订单日期始'" style="width:100px;"/>
                        -
                        <input id="end_huanguyou_createTime" class="easyui-datebox" data-options="prompt:'订单日期止'" style="width:100px;"/>

                        <a href="javascript:void(0)"  class="easyui-linkbutton"  onclick="ClientSailboatOrderManage.doHuanguyouSearch()">查询</a>
                        <a href="javascript:void(0)"  class="easyui-linkbutton"  onclick="ClientSailboatOrderManage.clearHuanguyouForm()">重置</a>

                    </div>

                </form>
            </div>
            <!-- 表格工具条 终 -->
            <!-- 表格 始 -->
            <div data-options="region:'center',border:false">
                <table id="client_huanguyou_dg"></table>
            </div>
            <!-- 表格 终 -->
        </div>
    </div>
    <!-- 编辑窗口 -->
</div>
<div id="editPanel" class="easyui-dialog" title="录入订单信息"
     data-options="fit:true,resizable:false,modal:true,closed:true,draggable:false">
    <iframe name="editIframe" id="editIframe" scrolling="no" frameborder="0"  style="width:100%;height:100%;"></iframe>
</div>


</body>
</html>
