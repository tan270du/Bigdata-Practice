<%--
  Created by IntelliJ IDEA.
  User: vacuity
  Date: 16/1/7
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>预订门票</title>
    <meta name="keywords" content="index"/>
    <meta name="description" content="index"/>
    <link href="/css/tBase.css" rel="stylesheet" type="text/css">
    <link href="/css/announcement.css" rel="stylesheet" type="text/css">
    <link href="/css/float.css" rel="stylesheet" type="text/css">
    <link href="/css/order2.css" rel="stylesheet" type="text/css">

</head>
<body class="fill_orders Fill_orders_tk" onload="pageReload();">
<input type="hidden" value="0" id="page_reload"/>
<!-- #BeginLibraryItem "/lbi/head.lbi" -->

<!--head-->
<jsp:include page="/WEB-INF/jsp/lvxbang/common/header.jsp"></jsp:include>
<!--head  end--><!-- #EndLibraryItem -->
<div class="main cl">
    <div class="free_exercise_div cl">
        <p class="n_title">
            <%--您在这里：&nbsp;<a href="${INDEX_PATH}/lvxbang/user/order.jhtml">订单</a>&nbsp;&gt;&nbsp;填写门票订单 --%>
        </p>

        <input id="orderId" type="hidden" value="${order.id}"/>
        <input id="orderDetailId" type="hidden" value="${orderDetailId}"/>
        <input id="ticketId" type="hidden" value="${ticket.id}"/>
        <input id="ticketPriceId" type="hidden" value="${ticketPrice.id}"/>
        <input id="price" type="hidden" value="${ticketDateprice.priPrice + ticketDateprice.rebate}"/>

        <!--左侧-->
        <div class="free_e_fl fl">
            <!--标题-->
            <div class="fill_title">
                <p class="name ff_yh fs20">${ticketPrice.name}</p>

                <p class="js cl"><b class="fs16">订单信息</b>
                    <%--(预授权或付款成功后如需修改、取消、退订，将按您所订资源的退变更条款收取费用)</p>--%>
            </div>

            <div class="free_e_fl_c fill_div">
                <ul class="free_e_fl_c_ut b">
                    <li class="w1">&nbsp; </li>
                    <li class="w2">商品</li>
                    <li class="w3">日期</li>
                    <li class="w4">单价(元)</li>
                    <li class="w5">数量</li>
                    <li class="w6">小计(元)</li>
                </ul>
                <div class="free_e_fl_lm posiR">
                    <!--景点-->

                    <div class="free_e_fl_lm_div jingdian">
                        <ul class="free_e_fl_lm_ul">
                            <li>
                                <div class="free_e_fl_lm_ul_div">
                                    <div class="w1 fl">&nbsp;</div>
                                    <div class="w2 fl hc_name textC long-name" style="text-align: center;">
                                        ${ticketPrice.name}
                                    </div>
                                    <div class="w5 fl">
                                        <input id="default-date" type="hidden"
                                               value="<fmt:formatDate value='${ticketDateprice.huiDate}' pattern='yyyy-MM-dd'/>"/>
                                        <div class="time_p"><i class="ico rili"></i>
                                            <%--<input type="text"--%>
                                            <%--placeholder="2015-08-24" value=""--%>
                                            <%--class="input"--%>
                                            <%--onclick="WdatePicker({onpicked:changeDate, minDate: '%y-%M-%d' })"--%>
                                            <%--id="ticketDate"/>--%>
                                            <input id="ticketDate" class="input" onclick="enalbeCalendar()"
                                                   readonly="readonly"/>
                                            <div id="priceCalendar" style="width: 300px; padding-top: 30px"
                                                 class="visibility-hidden"></div>
                                        </div>
                                    </div>
                                    <%--<div class="w6 fl">--%>
                                        <%--<div class="sfz fl posiR">--%>
                                            <%--<p class="name">成人票</p><i></i>--%>

                                            <%--<p class="sfzp disn">--%>
                                                <%--<a href="javaScript:;">成人票</a>--%>
                                                <%--<a href="javaScript:;">儿童票</a>--%>
                                                <%--<a href="javaScript:;">学生票</a>--%>
                                            <%--</p>--%>
                                        <%--</div>--%>
                                    <%--</div>--%>
                                    <p class="w7 fl" id="singlePrice" style="width:30px;margin-left: 30px;">
                                        <fmt:formatNumber type="number"
                                                          pattern="###.#">${ticketDateprice.priPrice + ticketDateprice.rebate}</fmt:formatNumber></p>

                                    <div class="w8 fl" style="width: 50px;margin-left: 43px;">
                                        <div class="opera_num">
                                            <a href="javascript:;" class="minus"
                                               onclick="TicketOrder.changePrice(-1)">-</a>

                                            <p class="posiR"><input class="quantity" type="text"
                                                                    onkeyup="value=value.replace(/[^\d]/g,'')" value="1"
                                                                    maxlength="3" id="passengerNum"
                                                                    onchange="TicketOrder.changePrice(0)"></p>
                                            <a href="javascript:;" class="plus"
                                               onclick="TicketOrder.changePrice(1)">+</a>
                                        </div>
                                    </div>
                                    <p class="w9 fl b" id="singleSumCost"><fmt:formatNumber type="number"
                                                                                            pattern="###.#">${ticketDateprice.priPrice + ticketDateprice.rebate}</fmt:formatNumber></p>

                                    <p class="cl"></p>
                                </div>
                                <div class="fill_div_nr">
                                    <p class="title b fs14">常用出行人:</p>

                                    <div class="fill_name" id="contacts">
                                        <c:forEach items="${touristList}" var="tourist">
                                        <span class="oval4" style="margin-bottom:5px;">
                                            ${tourist.name}
                                            <input type="hidden" class="id" value="${tourist.id}"/>
                                            <input type="hidden" class="name" value="${tourist.name}"/>
                                            <input type="hidden" class="peopleType" value="${tourist.peopleType}"/>
                                            <input type="hidden" class="idType" value="${tourist.idType}"/>
                                            <input type="hidden" class="idNumber" value="${tourist.idNumber}"/>
                                            <input type="hidden" class="tel" value="${tourist.tel}"/>
                                        </span>
                                        </c:forEach>
                                        <p class="cl"></p>
                                    </div>
                                    <div id="touristList">
                                        <div class="nr cl touristClass">
                                            <input type="hidden" class="touristId"/>
                                            <b class="fl num disB fs16">1</b>

                                            <div class="fl fill_div_nr_fr">
                                                <div class="fill_w1 cl">
                                                    <div class="DebitCard_d2 fl oval4">
                                                        <input type="text" placeholder="姓名(请确保与证件保持一致)" value=""
                                                               class="input touristName">
                                                    </div>
                                                    <%--<div class="sfz fl posiR oval4">--%>
                                                        <%--<p class="name touristPeopleType">成人</p><i></i>--%>

                                                        <%--<p class="sfzp disn">--%>
                                                            <%--<a href="javaScript:;">成人</a>--%>
                                                            <%--<a href="javaScript:;">儿童</a>--%>
                                                        <%--</p>--%>
                                                    <%--</div>--%>
                                                </div>
                                                <div class="fill_w2 cl oval4">
                                                    <div class="sfz fl posiR">
                                                        <p class="name touristIdType">身份证</p><i></i>

                                                        <p class="sfzp disn">
                                                            <a href="javaScript:;">身份证</a>
                                                            <a href="javaScript:;">护照</a>
                                                        </p>
                                                    </div>
                                                    <div class="DebitCard_d2 fl">
                                                        <input type="text" placeholder="请输入您的证件号" value=""
                                                               class="input touristIdNum">
                                                    </div>
                                                </div>
                                                <div class="fill_w3 cl oval4">
                                                    <div class="DebitCard_d2 ">
                                                        <input type="text" placeholder="请输入手机号" value=""
                                                               class="input touristTel">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </div>

                                    <p class="cl"></p>

                                </div>
                            </li>
                        </ul>
                        <p class="cl"></p>
                    </div>

                    <p class="cl"></p>
                </div>
            </div>


            <div class="fill_top_div">
                <div class="name"><b class="fs16">联系人信息</b>(<span class="red">*</span>为必填)</div>
                <div class="fill_top_div_js">
                    <p class="top"></p>

                    <div class="nr" style="padding: 30px 60px 0px;">
                        <ul>
                            <%--<li>--%>
                                <%--<p class="fl"><span class="red mr5">*</span>联系人姓名</p>--%>

                                <%--<div class="oval4 fl"><input type="text" placeholder="请输入联系人姓名" value="${order.recName==null?user.userName:order.recName}"--%>
                                                             <%--class="input" id="contactsName">--%>
                                <%--</div>--%>
                            <%--</li>--%>
                            <%--<li>--%>
                                <%--<p class="fl" style="margin-left: 115px;"><span class="red mr5">*</span>联系人手机号</p>--%>

                                <%--<div class="oval4 fl"><input type="text" placeholder="请输入联系人手机号" value="${order.mobile==null?user.telephone:order.mobile}"--%>
                                                             <%--class="input" id="contactsTel">--%>
                                <%--</div>--%>
                            <%--</li>--%>
                                <li>
                                    <p class="fl"><span class="red mr5">*</span>联系人姓名</p>

                                    <div class="oval4 fl"><input type="text" placeholder="请输入联系人姓名" value="${order.recName==null?user.userName:order.recName}" class="input" id="contactsName">
                                    </div>

                                    <p class="fl" style="margin-left: 115px;"><span class="red mr5">*</span>联系人手机号</p>

                                    <div class="oval4 fl"><input type="text" placeholder="请输入联系人手机号" value="${order.mobile==null?user.telephone:order.mobile}" class="input" id="contactsTel">
                                    </div>
                                </li>
                        </ul>
                    </div>
                </div>

                <c:if test="${(userCouponsList != null && fn:length(userCouponsList) > 0) || (userCouponId != null && userCouponId != '')}">
                    <p style="font-size: 16px;margin-bottom: 20px;color: #333;font-weight: bold;">可用红包<span style="color: #ff6000;">（${fn:length(userCouponsList) + ((userCouponId != null && userCouponId != '')?1:0)}）</span></p>
                    <div class="" style="background-color: rgb(239,250,254);border: 1px solid rgb(163,208,237);margin-bottom: 47px;width:auto;padding: 20px 50px 20px 50px;">
                        <p style="font-size:14px;margin-bottom: 20px;">以下为可用红包。</p>
                        <div class="nr">
                            <ul>
                                <c:if test="${userCouponId != null && userCouponId != ''}">
                                    <li class="redPacketLi" couponid="${order.userCoupon.id}" style="height:14px;font-size:12px;margin-bottom: 10px;" useCondition="${order.userCoupon.coupon.useCondition}"
                                        faceValue="${order.userCoupon.coupon.faceValue}">
                                        <span class="checkbox fl shiyong"><i ></i></span>
                                        <div style="width:80px;float:left;">${order.userCoupon.coupon.faceValue}元</div>
                                        <div style="width:150px;float:left;">满<span style="color:red;">${order.userCoupon.coupon.useCondition}</span>元可用 </div>
                                        <div style="width:230px;float:left;">
                                                ${order.userCoupon.limitProductTypes}红包
                                        </div>
                                        <div style="width:170px;float:left;">
                                                <%--<fmt:formatDate pattern="yyyy-MM-dd" value="${c.coupon.validStart}" type="both"/>--%>
                                            有效期至<fmt:formatDate pattern="yyyy-MM-dd" value="${order.userCoupon.validEnd}" type="both"/>
                                        </div>
                                        <c:if test="${fn:length(order.userCoupon.coupon.instructions) > 10}">
                                            <div class="moreknow" style="width: 180px;float: left;">${fn:substring(order.userCoupon.coupon.instructions, 0, 10)}...
                                    <span style="display: none;border: 1px dashed #34bf82;
                                                 float:right; background-color:#fff;
                                                 width:auto;padding: 10px;max-width: 300px;
                                                 margin-top: 5px;z-index: 999;" class="posiA">
                                            ${order.userCoupon.coupon.instructions}
                                    </span>
                                            </div>
                                        </c:if>
                                        <c:if test="${fn:length(order.userCoupon.coupon.instructions) <= 10}">
                                            <div>${order.userCoupon.coupon.instructions}</div>
                                        </c:if>
                                    </li>
                                </c:if>
                                <c:forEach items="${userCouponsList}" var="c" varStatus="status">
                                    <li class="redPacketLi" couponid="${c.id}" style="height:14px;font-size:12px;padding-top: 10px;margin-bottom: 10px;
                                    <c:if test="${(userCouponId != null && userCouponId != '') || status.index > 0}">border-top:1px dashed rgb(163,208,237);</c:if>
                                            " useCondition="${c.coupon.useCondition}"
                                        faceValue="${c.coupon.faceValue}">
                                        <span class="checkbox fl "><i ></i></span>
                                        <div style="width:80px;float:left;">${c.coupon.faceValue}元</div>
                                        <div style="width:150px;float:left;">满<span style="color:red;">${c.coupon.useCondition}</span>元可用 </div>
                                        <div style="width:230px;float:left;">${c.limitProductTypes}红包</div>
                                        <div style="width:170px;float:left;">
                                                <%--<fmt:formatDate pattern="yyyy-MM-dd" value="${c.coupon.validStart}" type="both"/>--%>
                                            有效期至<fmt:formatDate pattern="yyyy-MM-dd" value="${c.validEnd}" type="both"/>
                                        </div>
                                        <c:if test="${fn:length(c.coupon.instructions) > 10}">
                                            <div class="moreknow" style="width: 180px;float: left;">${fn:substring(c.coupon.instructions, 0, 10)}...
                                    <span style="display: none;border: 1px dashed #34bf82;
                                                 float:right; background-color:#fff;
                                                 width:auto;padding: 10px;max-width: 300px;
                                                 margin-top: 5px;z-index: 999;" class="posiA">
                                            ${c.coupon.instructions}
                                    </span>
                                            </div>
                                        </c:if>
                                        <c:if test="${fn:length(c.coupon.instructions) <= 10}">
                                            <div>${c.coupon.instructions}</div>
                                        </c:if>
                                    </li>
                                </c:forEach>

                            </ul>
                        </div>
                    </div>
                </c:if>

            </div>

            <div class="fill_bottom_div">
                <div class="top fs13">
                    <span class="fl checkbox checked" input="options" id="provisionCheck"><i></i></span>

                    <a href="javascript:;" class="protocol" style="color:#aaa;" onmouseover="this.style.cssText='color:#01af63'" onmouseout="this.style.cssText='color:#aaa'">
                        <p class="fl">我已阅读并接受协议条款、补充条款及其他所有内容</p>
                    </a>
                </div>

                <div class="bottom">
                    <a href="javaScript:;" style="background-color:#f66000;" class="oval4 b fs14 textC fl" onclick="javascript:history.go(-1);">上一步</a>
                    <input id="submitFlag" type="hidden" value="ok"/>
                    <a href="javascript:;" class="b fs20 ff_yh textC  posiA " onclick="TicketOrder.submitOrder()">去支付</a>

                    <p class="fr b ff_yh fs16">应付总额：<span class="fs20 red"
                                                          id="sumCost">¥<fmt:formatNumber type="number"
                                                                                          pattern="###.#">${ticketDateprice.priPrice + ticketDateprice.rebate}</fmt:formatNumber>元</span>
                    </p>
                </div>
            </div>

            <p class="cl"></p>
        </div>

        <!--右侧-->
        <div class="free_e_fr fr fill_fr" id="nav">
            <div class="nav">
                <p class="title">费用明细</p>

                <div class="free_e_fr_div cl">
                    <div class="free_e_fr_t" style="font-size: 14px;">
                        <ul class="free_e_fr_ul">

                            <li>
                                <b class="name">景点</b>

                                <div class="cl nr" id="rightPanel">
                                    <label class="fl" style="line-height: 14px;">${ticket.name}</label>
                                    <span class="fl cw" style="line-height: 14px;">
                                        <%--成人票--%>
                                    </span>
                                    <span class="fl num rightPanelTouristNum" style="line-height: 14px;margin-left: 50px;">1x</span>
                                    <b class="price fr" id="rightCost"
                                       style="line-height: 14px;font-weight: bold;">¥<fmt:formatNumber type="number"
                                                                                                       pattern="###.#">${ticketDateprice.priPrice + ticketDateprice.rebate}</fmt:formatNumber></b>
                                </div>

                            </li>
                        </ul>
                        <p class="cl"></p>
                    </div>
                    <div class="free_e_fr_c">
                        <div class="cl free_e_fr_c_p" style="font-size: 14px;">
                            <label class="fl">应付总额:</label>
                            <b class="fr fs16" id="rightTotalCost">¥<fmt:formatNumber type="number"
                                                                                      pattern="###.#">${ticketDateprice.priPrice + ticketDateprice.rebate}</fmt:formatNumber></b>
                        </div>
                        <%--<div class="cl free_e_fr_c_p free_e_fr_c_p2">--%>
                        <%--<label class="fl">小帮价:</label>--%>
                        <%--<b class="fr fs20 ff_yh">1988</b>--%>
                        <%--<span class="fr mr5">7.5折</span>--%>
                        <%--</div>--%>

                        <a href="javascript:;" class="free_e_fr_but ffhover b oval4" onclick="TicketOrder.submitOrder()">下一步去支付</a>
                    </div>


                    <p class="cl"></p>
                </div>

                <div class="fill_fr_div posiR">
                    <div class="name posiR fs16"><i></i>注意事项</div>
                    <p class="nr cl" style="margin-right: 15px;overflow: auto;max-height: 200px;">
                        <%--1> 退款手续费：¥15/张<br/>--%>
                        <%--2> 使用日期截止后当天20:00可申请退款<br/>--%>
                        <%--3> 不支持部分退款<br/>--%>
                        <%--4> 其他规定，请见<span>退款说明</span><br/>--%>
                        1> 旅行帮景点门票供应商为携程旅行网。<br/>
                        <%--2> 加各景点每张票的预订须知<br/>--%>
                        <c:forEach items="${ticketPriceAddInfos}" var="tpi" varStatus="ti">
                           ${ti.index+2}> ${tpi.subTitle} :
                            <c:forEach items="${tpi.descDetails}" var="desc">
                                ${desc}
                            </c:forEach>
                            <br/>
                        </c:forEach>
                    </p>

                    <div class="flot">
                        <b>咨询电话</b>

                        <p>400-0131-770</p>
                        <%--<p>4006587799转<br/>1420#</p>--%>
                    </div>
                </div>

            </div>

        </div>

        <p class="cl"></p>
    </div>


</div>


<!-- #BeginLibraryItem "/lbi/foot2.lbi" -->
<!--foot-->
<jsp:include page="/WEB-INF/jsp/lvxbang/common/footer.jsp"></jsp:include>
<!--foot end--><!-- #EndLibraryItem --></body>
</html>

<link rel='stylesheet' href='/fullcalendar-2.4.0/lib/cupertino/jquery-ui.min.css'/>
<link href='/fullcalendar-2.4.0/fullcalendar.css' rel='stylesheet'/>
<link href='/fullcalendar-2.4.0/fullcalendar.print.css' rel='stylesheet' media='print'/>
<script src='/fullcalendar-2.4.0/lib/moment.min.js'></script>
<script src='/fullcalendar-2.4.0/fullcalendar.min.js'></script>


<script src="/js/lib/Time/WdatePicker.js" type="text/javascript"></script>
<script src="/js/lvxbang/order/order_util.js" type="text/javascript"></script>
<script src="/js/lvxbang/order/ticket.js" type="text/javascript"></script>
<script src="/js/lib/common_util.js" type="text/javascript"></script>


<script>
    $(document).ready(function () {
        $("img").lazyload({
            effect: "fadeIn"
        });

        //搜索框
        $(".categories .input").click(function () {
            $(".categories_div").hide();
            $(this).next(".categories_div").show();
        });

        $(".categories_div li").click(function () {
            var label = $("label", this).text();
            $(this).closest(".categories").children(".input").val(label);
        });

        $('.categories  .input').on('click', function (event) {
            // 阻止冒泡
            if (event.stopPropagation) {    // standard
                event.stopPropagation();
            } else {
                // IE6-8
                event.cancelBubble = true;
            }
        });
        $(document).on("click", function () {
            $(".categories_div").hide();
            changeFocus();
        });

        $("img").lazyload({
            effect: "fadeIn"
        });


        //删除按钮
        $(".Free_exe_d_d .close").click(function () {
            $(this).parent('li').fadeOut(500, function () {
                $(this).parent('li').remove();
            });
        });


        //checkbox
//        $(".free_exercise_div .checkbox").click(function () {
        $(".fill_bottom_div .checkbox").click(function () {
            var input = $(this).attr("input");
            var myStaute = $(this).attr("data-staute");
            if (!myStaute) {
                if (input == "selectall") {
                    $(this).addClass("checked").attr("data-staute", "1").parents('.free_e_fl_c').find(".free_e_fl_lm .checkbox").addClass("checked").attr("data-staute", "1");
                }
                else if (input == "selectall_group") {
                    $(this).addClass("checked").attr("data-staute", "1").parent('.free_e_fl_c_title').next(".free_e_fl_lm_div").find("ul .checkbox").addClass("checked").attr("data-staute", "1");
                }
                else {
                    $(this).addClass("checked").attr("data-staute", "1");
                }
            }
            else {
                if (input == "selectall") {
                    $(this).parents('.free_e_fl_c').find(".free_e_fl_lm .checkbox").removeClass("checked").removeAttr("data-staute");
                } else if (input == "selectall_group") {
                    $(this).removeClass("checked").removeAttr("data-staute").parent('.free_e_fl_c_title').next(".free_e_fl_lm_div").find("ul .checkbox").removeClass("checked").removeAttr("data-staute");
                    $(this).parents('.free_e_fl_c').find(".free_e_fl_c_ut .checkbox").removeClass("checked").removeAttr("data-staute");

                }
                $(this).removeClass("checked").removeAttr("data-staute");
                $(this).parents('.free_e_fl_lm_div').prev('.free_e_fl_c_title').find(".checkbox").removeClass("checked").removeAttr("data-staute");
                $(this).parents('.free_e_fl_c').find(".free_e_fl_c_ut .checkbox").removeClass("checked").removeAttr("data-staute");
            }
        });


        //radio

        $(".tong .radio").click(function () {
            var myStaute = $(this).parent(".tong").attr("data-staute");
            if (!myStaute) {
                $(this).parent(".tong").addClass("checked").attr("data-staute", "1");
            } else {
                $(this).parent(".tong").removeClass("checked").removeAttr("data-staute");
            }
        });


        //下拉框
        $(".sfz .name,sfz i").click(function () {
            $(this).siblings(".sfzp").show();
        });

        $(".sfzp a").click(function () {
            var label = $(this).text();
            $(this).parent(".sfzp").hide();
            $(this).parent(".sfzp").siblings(".name").text(label);
        });

        //日历时间
        $('.rili').click(function(e){
            if ($("#priceCalendar").hasClass("visibility-hidden")) {
                $("#priceCalendar").removeClass("visibility-hidden");
            }
            // 阻止冒泡
            if (e.stopPropagation) {    // standard
                e.stopPropagation();
            } else {
                // IE6-8
                e.cancelBubble = true;
            }
        });

    });
    //后退是刷新页面
    function pageReload(){
        if($('#page_reload').val()==0){
            $('#page_reload').val('1')
        }else{
            location.reload();
        }
    }
</script>

<script type="text/html" id="tpl-tourist-list-item">
    <div class="nr cl touristClass">
        <input type="hidden" class="touristId"/>
        <b class="fl num disB fs16">{{ticket_num}}</b>

        <div class="fl fill_div_nr_fr">
            <div class="fill_w1 cl">
                <div class="DebitCard_d2 fl oval4">
                    <input type="text" placeholder="姓名(请确保与证件保持一致)" value="{{name}}"
                           class="input touristName">
                </div>
                <%--<div class="sfz fl posiR oval4">--%>
                    <%--{{if peopleType == "ADULT"}}--%>
                    <%--<p class="name touristPeopleType">成人</p><i></i>--%>
                    <%--{{/if}}--%>
                    <%--{{if peopleType == "KID"}}--%>
                    <%--<p class="name touristPeopleType">儿童</p><i></i>--%>
                    <%--{{/if}}--%>


                    <%--<p class="sfzp disn">--%>
                        <%--<a href="javaScript:;">成人</a>--%>
                        <%--<a href="javaScript:;">儿童</a>--%>
                    <%--</p>--%>
                <%--</div>--%>
            </div>
            <div class="fill_w2 cl oval4">
                <div class="sfz fl posiR">
                    {{if idType == "IDCARD"}}
                    <p class="name touristIdType">身份证</p><i></i>
                    {{/if}}
                    {{if idType == "PASSPORT"}}
                    <p class="name touristIdType">护照</p><i></i>
                    {{/if}}

                    <p class="sfzp disn">
                        <a href="javaScript:;">身份证</a>
                        <a href="javaScript:;">护照</a>
                    </p>
                </div>
                <div class="DebitCard_d2 fl">
                    <input type="text" placeholder="请输入您的证件号" value="{{idNumber}}"
                           class="input touristIdNum">
                </div>
            </div>
            <div class="fill_w3 cl oval4">
                <div class="DebitCard_d2 ">
                    <input type="text" placeholder="请输入手机号" value="{{tel}}"
                           class="input touristTel">
                </div>
            </div>
        </div>
    </div>
</script>



