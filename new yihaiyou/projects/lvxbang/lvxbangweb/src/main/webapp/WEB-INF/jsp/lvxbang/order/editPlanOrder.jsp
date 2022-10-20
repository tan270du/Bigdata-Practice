<%--
  Created by IntelliJ IDEA.
  User: vacuity
  Date: 16/1/14
  Time: 16:42
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
    <title>线路订单</title>
    <meta name="keywords" content="index"/>
    <meta name="description" content="index"/>
    <link href="/css/tBase.css" rel="stylesheet" type="text/css">
    <link href="/css/announcement.css" rel="stylesheet" type="text/css">
    <link href="/css/float.css" rel="stylesheet" type="text/css">
    <link href="/css/order2.css" rel="stylesheet" type="text/css">

</head>
<body class="fill_orders" onload="pageReload();">
<input type="hidden" value="0" id="page_reload"/>
<!-- #BeginLibraryItem "/lbi/head.lbi" -->
<!--Float_w-->
<!--Float_w end-->

<!--head-->
<jsp:include page="/WEB-INF/jsp/lvxbang/common/header.jsp"></jsp:include>
<!--head  end--><!-- #EndLibraryItem -->
<div class="main cl">
    <div class="free_exercise_div cl">
        <p class="n_title">
            <%--您在这里：&nbsp;<a href="${INDEX_PATH}/lvxbang/user/order.jhtml">订单</a>&nbsp;&gt;&nbsp;填写线路订单 --%>
        </p>

        <!--左侧-->
        <div class="free_e_fl fl">
            <!--标题-->
            <div class="fill_title">
                <input id="orderId" type="hidden" value="${order.id}"/>
                <input id="planName" type="hidden" value="${order.name}"/>
                <p class="name ff_yh fs20">《${order.name}》</p>

                <p class="js cl">
                    <b class="fs16" >
                    订单信息
                    </b>
                    <%--(预授权或付款成功后如需修改、取消、退订，将按您所订资源的退变更条款收取费用)--%>
                </p>
            </div>

            <div class="free_e_fl_c fill_div" >
                <ul class="free_e_fl_c_ut b">
                    <li class="w1">
                        <span class="fl checkbox" input="selectall"><i></i></span>

                        <p class="fl">全选</p>
                    </li>
                    <li class="w2" style="width:100px;">商品</li>
                    <li class="w3" style="margin-left: 135px; ">日期</li>
                    <li class="w4" style=" width:60px;margin-left: 220px;">单价(元)</li>
                    <li class="w5" style="width:30px;margin-left: 80px;">数量</li>
                    <li class="w6" style="margin-left: 27px;">小计(元)</li>
                </ul>
                <div class="free_e_fl_lm posiR">

                    <!--飞机-->
                    <input id="flight-count" type="hidden" value="${planeDetailList.size()}"/>
                    <c:if test="${planeDetailList.size() > 0}">
                        <!--飞机-->
                        <div class="free_e_fl_c_title">
                            <span class="fl checkbox" input="selectall_group"><i></i></span>

                            <p class="fl">飞机</p>
                        </div>

                        <div class="free_e_fl_lm_div">
                            <ul class="free_e_fl_lm_ul">
                                <c:forEach items="${planeDetailList}" var="flight" varStatus="status">
                                    <%--<div>测试${status.index}</div>--%>
                                    <input id="flight-id-${status.index}" type="hidden" value="${flight.productId}"/>
                                    <input id="flight-priceId-${status.index}" type="hidden" value="${flight.priceId}"/>
                                    <input id="flight-date-${status.index}" type="hidden" value="${flight.date}"/>
                                    <li>
                                        <div class="free_e_fl_lm_div">
                                            <ul class="free_e_fl_lm_ul">
                                                <li>
                                                    <div class="free_e_fl_lm_ul_div">
                                                        <div class="w1 fl" style="margin-top: 16px;">
                                                            <span class="fl checkbox" input="options"
                                                                  id="flight-check-${status.index}"><i></i></span>
                                                        </div>
                                                        <div class="w2 fl fj_name">
                                                            <p class="img fl ml10"><img src="/images/fpimg.png"/></p>

                                                            <div class="fr name">
                                                                <p>${flight.company}</p>
                                                                <span>${flight.trafficCode}</span>
                                                            </div>
                                                        </div>
                                                        <div class="w3 fl">
                                                            <div class="time">
                                                                <p>${flight.leaveTime}</p>
                                                                <span>${flight.leavePort}</span>
                                                            </div>
                                                        </div>
                                                        <div class="w4 fl">
                                                            <div class="time2">
                                                                <p>
                                                                    <fmt:formatDate value="${flight.date}"
                                                                                    pattern="yyyy-MM-dd"/>
                                                                    <i class="ico"></i>
                                                                </p>
                                                                <span>${flight.trafficTime}</span>
                                                            </div>
                                                        </div>
                                                        <div class="w5 fl">
                                                            <div class="time3">
                                                                <p>${flight.arriveTime}</p>
                                                                <span>${flight.arrivePort}</span>
                                                            </div>
                                                        </div>
                                                        <input id="flight-seatType-${status.index}" type="hidden"
                                                               value="${flight.type}"/>
                                                        <p class="w6 fl">${flight.type}</p>

                                                        <input id="flight-price-${status.index}" type="hidden" additionalFuelTaxPrice="${flight.additionalFuelTax}" airportBuildFeePrice="${flight.airportBuildFee}"
                                                               value="${flight.price}"/>

                                                        <p class="w7 fl"><fmt:formatNumber type="number" pattern="###.#">${flight.price}</fmt:formatNumber></p>

                                                        <div class="w8 fl">
                                                            <div class="opera_num">
                                                                <a href="javascript:;" class="minus"
                                                                   onclick="PlanOrder.changePrice(-1, 'flight', ${status.index});PlanOrder.addOne()">-</a>

                                                                <p class="posiR"><input class="quantity" type="text"
                                                                                        onkeyup="value=value.replace(/[^\d]/g,'')"
                                                                                        value="${flight.num}"
                                                                                        maxlength="3"
                                                                                        id="flight-passengerNum-${status.index}"
                                                                                        onchange="PlanOrder.changePrice(0, 'flight', ${status.index})">
                                                                </p>
                                                                <a href="javascript:;" class="plus"
                                                                   onclick="PlanOrder.changePrice(1, 'flight', ${status.index});PlanOrder.addOne()">+</a>
                                                            </div>
                                                        </div>
                                                        <p class="w9 fl b"
                                                           id="flight-sumCost-${status.index}"><fmt:formatNumber type="number" pattern="###.#">${flight.singleCost}</fmt:formatNumber></p>
                                                        <%--<p class="w9 fl b"--%>
                                                           <%--id="flight-sumCost-${status.index}"><fmt:formatNumber type="number" pattern="###.#">${flight.singleCost  - flight.additionalFuelTax * flight.num - flight.airportBuildFee * flight.num}</fmt:formatNumber></p>--%>

                                                        <p class="cl"></p>

                                                        <div class="tong" id="flight-copy-${status.index}"><p
                                                                class="fr">旅客信息同上</p><span
                                                                class="radio fr"
                                                                onclick="PlanOrder.copyTourist('flight', ${status.index});PlanOrder.addOne()"></span>
                                                        </div>
                                                    </div>

                                                    <div class="fill_div_nr">
                                                        <p class="title b fs14">常用出行人:</p>

                                                        <div class="fill_name" id="flight-contacts-${status.index}">
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

                                                        <div id="flight-tourist-${status.index}">

                                                            <c:forEach items="${flight.touristList}" var="tourist"
                                                                       varStatus="status">
                                                                <div class="nr cl touristClass">
                                                                    <input type="hidden" class="touristId"/>
                                                                    <b class="fl num disB fs16">${status.index + 1}</b>

                                                                    <div class="fl fill_div_nr_fr">
                                                                        <div class="fill_w1 cl">
                                                                            <div class="DebitCard_d2 fl oval4">
                                                                                <input type="text" placeholder="姓名"
                                                                                       value="${tourist.name}"
                                                                                       class="input touristName">
                                                                            </div>
                                                                            <%--<div class="sfz fl posiR oval4">--%>
                                                                                <%--<c:if test="${tourist.peopleType=='ADULT'}">--%>
                                                                                    <%--<p class="name touristPeopleType">--%>
                                                                                        <%--成人</p>--%>
                                                                                <%--</c:if>--%>
                                                                                <%--<c:if test="${tourist.peopleType=='CHILD'}">--%>
                                                                                    <%--<p class="name touristPeopleType">--%>
                                                                                        <%--儿童</p>--%>
                                                                                <%--</c:if>--%>
                                                                                <%--<i></i>--%>

                                                                                <%--<p class="sfzp disn">--%>
                                                                                    <%--<a href="javaScript:;">成人</a>--%>
                                                                                    <%--<a href="javaScript:;">儿童</a>--%>
                                                                                <%--</p>--%>
                                                                            <%--</div>--%>
                                                                        </div>
                                                                        <div class="fill_w2 cl oval4">
                                                                            <div class="sfz fl posiR">
                                                                                <c:if test="${tourist.idType=='IDCARD'}">
                                                                                    <p class="name touristIdType">身份证</p><i></i>
                                                                                </c:if>
                                                                                <c:if test="${tourist.idType=='PASSPORT'}">
                                                                                    <p class="name touristIdType">护照</p>
                                                                                    <i></i>
                                                                                </c:if>


                                                                                <p class="sfzp disn">
                                                                                    <a href="javaScript:;">身份证</a>
                                                                                    <a href="javaScript:;">护照</a>
                                                                                </p>
                                                                            </div>
                                                                            <div class="DebitCard_d2 fl">
                                                                                <input type="text"
                                                                                       placeholder="请输入您的证件号"
                                                                                       value="${tourist.idNumber}"
                                                                                       class="input touristIdNum">
                                                                            </div>
                                                                        </div>
                                                                        <div class="fill_w3 cl oval4">
                                                                            <div class="DebitCard_d2 ">
                                                                                <input type="text" placeholder="请输入手机号"
                                                                                       value="${tourist.tel}"
                                                                                       class="input touristTel">
                                                                            </div>
                                                                        </div>
                                                                    </div>

                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                        <p class="cl"></p>

                                                    </div>

                                                </li>

                                            </ul>
                                        </div>
                                    </li>

                                </c:forEach>
                            </ul>
                        </div>
                    </c:if>


                    <!--火车-->
                    <input id="train-count" type="hidden" value="${trainDetailList.size()}"/>
                    <c:if test="${trainDetailList.size() > 0}">
                        <!--火车-->
                        <div class="free_e_fl_c_title">
                            <span class="fl checkbox" input="selectall_group"><i></i></span>

                            <p class="fl">火车</p>
                        </div>

                        <div class="free_e_fl_lm_div">
                            <ul class="free_e_fl_lm_ul">
                                <c:forEach items="${trainDetailList}" var="train" varStatus="status">
                                    <%--<div>测试${status.index}</div>--%>

                                    <input id="train-id-${status.index}" type="hidden" value="${train.productId}"/>
                                    <input id="train-priceId-${status.index}" type="hidden" value="${train.priceId}"/>
                                    <input id="train-date-${status.index}" type="hidden" value="${train.date}"/>
                                    <li>
                                        <div class="free_e_fl_lm_div">
                                            <ul class="free_e_fl_lm_ul">
                                                <li>
                                                    <div class="free_e_fl_lm_ul_div">
                                                        <div class="w1 fl" style="margin-top: 16px;">
                                                            <span class="fl checkbox" input="options"
                                                                  id="train-check-${status.index}"><i></i></span>
                                                        </div>
                                                        <div class="w2 fl fj_name">
                                                            <%--<p class="img fl ml10"><img src="/images/fpimg.png"/></p>--%>

                                                            <span class="fl qu" style="margin-top: 14px;">
                                                                <c:if test="${status.index!=trainDetailList.size()-1}">去</c:if>
                                                                 <c:if test="${status.index==trainDetailList.size()-1}">返</c:if>
                                                             </span>
                                                            <div class="fr name">
                                                                <p>${train.company}</p>
                                                                <span>${train.trafficCode}</span>
                                                            </div>
                                                        </div>
                                                        <div class="w3 fl">
                                                            <div class="time">
                                                                <p>${train.leaveTime}</p>
                                                                <span>${train.leavePort}</span>
                                                            </div>
                                                        </div>
                                                        <div class="w4 fl">
                                                            <div class="time2">
                                                                <p>
                                                                    <fmt:formatDate value="${train.date}"
                                                                                    pattern="yyyy-MM-dd"/>
                                                                    <i class="ico"></i>
                                                                </p>
                                                                <span>${train.trafficTime}</span>
                                                            </div>
                                                        </div>
                                                        <div class="w5 fl">
                                                            <div class="time3">
                                                                <p>${train.arriveTime}</p>
                                                                <span>${train.arrivePort}</span>
                                                            </div>
                                                        </div>
                                                        <input id="train-seatType-${status.index}" type="hidden"
                                                               value="${train.type}"/>
                                                        <p class="w6 fl">${train.type}</p>

                                                        <input id="train-price-${status.index}" type="hidden"
                                                               value="${train.price}"/>

                                                        <p class="w7 fl"><fmt:formatNumber type="number" pattern="###.#">${train.price}</fmt:formatNumber></p>

                                                        <div class="w8 fl">
                                                            <div class="opera_num">
                                                                <a href="javascript:;" class="minus"
                                                                   onclick="PlanOrder.changePrice(-1, 'train', ${status.index});PlanOrder.addOne()">-</a>

                                                                <p class="posiR"><input class="quantity" type="text"
                                                                                        onkeyup="value=value.replace(/[^\d]/g,'')"
                                                                                        value="${train.num}"
                                                                                        maxlength="3"
                                                                                        id="train-passengerNum-${status.index}"
                                                                                        onchange="PlanOrder.changePrice(0, 'train', ${status.index})">
                                                                </p>
                                                                <a href="javascript:;" class="plus"
                                                                   onclick="PlanOrder.changePrice(1, 'train', ${status.index});PlanOrder.addOne()">+</a>
                                                            </div>
                                                        </div>
                                                        <p class="w9 fl b"
                                                           id="train-sumCost-${status.index}"><fmt:formatNumber type="number" pattern="###.#">${train.singleCost}</fmt:formatNumber></p>

                                                        <p class="cl"></p>

                                                        <div class="tong" id="train-copy-${status.index}"><p
                                                                class="fr">旅客信息同上</p><span
                                                                class="radio fr"
                                                                onclick="PlanOrder.copyTourist('train', ${status.index});PlanOrder.addOne()"></span>
                                                        </div>
                                                    </div>

                                                    <div class="fill_div_nr">
                                                        <p class="title b fs14">常用出行人:</p>

                                                        <div class="fill_name" id="train-contacts-${status.index}">
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

                                                        <div id="train-tourist-${status.index}">

                                                            <c:forEach items="${train.touristList}" var="tourist"
                                                                       varStatus="status">
                                                                <div class="nr cl touristClass">
                                                                    <input type="hidden" class="touristId"/>
                                                                    <b class="fl num disB fs16">${status.index + 1}</b>

                                                                    <div class="fl fill_div_nr_fr">
                                                                        <div class="fill_w1 cl">
                                                                            <div class="DebitCard_d2 fl oval4">
                                                                                <input type="text" placeholder="姓名"
                                                                                       value="${tourist.name}"
                                                                                       class="input touristName">
                                                                            </div>
                                                                            <%--<div class="sfz fl posiR oval4">--%>
                                                                                <%--<c:if test="${tourist.peopleType=='ADULT'}">--%>
                                                                                    <%--<p class="name touristPeopleType">--%>
                                                                                        <%--成人</p>--%>
                                                                                <%--</c:if>--%>
                                                                                <%--<c:if test="${tourist.peopleType=='CHILD'}">--%>
                                                                                    <%--<p class="name touristPeopleType">--%>
                                                                                        <%--儿童</p>--%>
                                                                                <%--</c:if>--%>
                                                                                <%--<i></i>--%>

                                                                                <%--<p class="sfzp disn">--%>
                                                                                    <%--<a href="javaScript:;">成人</a>--%>
                                                                                    <%--<a href="javaScript:;">儿童</a>--%>
                                                                                <%--</p>--%>
                                                                            <%--</div>--%>
                                                                        </div>
                                                                        <div class="fill_w2 cl oval4">
                                                                            <div class="sfz fl posiR">
                                                                                <c:if test="${tourist.idType=='IDCARD'}">
                                                                                    <p class="name touristIdType">身份证</p><i></i>
                                                                                </c:if>
                                                                                <c:if test="${tourist.idType=='PASSPORT'}">
                                                                                    <p class="name touristIdType">护照</p>
                                                                                    <i></i>
                                                                                </c:if>


                                                                                <p class="sfzp disn">
                                                                                    <a href="javaScript:;">身份证</a>
                                                                                    <a href="javaScript:;">护照</a>
                                                                                </p>
                                                                            </div>
                                                                            <div class="DebitCard_d2 fl">
                                                                                <input type="text"
                                                                                       placeholder="请输入您的证件号"
                                                                                       value="${tourist.idNumber}"
                                                                                       class="input touristIdNum">
                                                                            </div>
                                                                        </div>
                                                                        <div class="fill_w3 cl oval4">
                                                                            <div class="DebitCard_d2 ">
                                                                                <input type="text" placeholder="请输入手机号"
                                                                                       value="${tourist.tel}"
                                                                                       class="input touristTel">
                                                                            </div>
                                                                        </div>
                                                                    </div>

                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                        <p class="cl"></p>

                                                    </div>

                                                </li>

                                            </ul>
                                        </div>
                                    </li>

                                </c:forEach>
                            </ul>
                        </div>
                    </c:if>

                    <!--酒店-->
                    <input id="hotel-count" type="hidden" value="${hotelDetailList.size()}"/>
                    <c:if test="${hotelDetailList.size() > 0}">
                        <div class="free_e_fl_c_title">
                            <span class="fl checkbox" input="selectall_group"><i></i></span>

                            <p class="fl">酒店</p>
                        </div>

                        <div class="free_e_fl_lm_div">
                            <ul class="free_e_fl_lm_ul">
                                <c:forEach items="${hotelDetailList}" var="hotel" varStatus="status">

                                    <input id="hotel-id-${status.index}" type="hidden" value="${hotel.productId}"/>
                                    <%--<input id="hotel-date-${status.index}" type="hidden" value="${hotel.startDate}"/>--%>
                                    <input id="hotel-date-${status.index}" type="hidden"
                                           value="<fmt:formatDate value="${hotel.date}" pattern="yyyy-MM-dd"/>"/>
                                    <%--<input id="hotel-leaveDate-${status.index}" type="hidden" value="${hotel.leaveDate}"/>--%>
                                    <input id="hotel-leaveDate-${status.index}" type="hidden"
                                           value="<fmt:formatDate value="${hotel.leaveDate}" pattern="yyyy-MM-dd"/>"/>


                                    <input id="hotel-code-${status.index}" type="hidden" value="${hotel.priceId}"/>
                                    <input id="hotelPriceStatus-${status.index}" type="hidden" value="${hotel.priceStatus}"/>

                                    <li>
                                        <div class="free_e_fl_lm_ul_div">
                                            <div class="w1 fl" style="margin-top: 2px;">
                                                <span class="fl checkbox" input="options"
                                                      id="hotel-check-${status.index}"><i></i></span>
                                            </div>
                                            <div class="w2 fl hc_name">
                                                    ${hotel.name}
                                            </div>
                                            <div class="w3 fl">
                                                <div class="time">
                                                    <p class="jd_time">入住</p>

                                                    <div class="time_p">
                                                        <fmt:formatDate value="${hotel.date}"
                                                                        pattern="yyyy-MM-dd"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="w4 fl">&nbsp;</div>
                                            <div class="w5 fl">
                                                <div class="time3">
                                                    <p class="jd_time">退房</p>

                                                    <div class="time_p">
                                                        <fmt:formatDate value="${hotel.leaveDate}"
                                                                        pattern="yyyy-MM-dd"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="w6 fl jd_fs" id="hotel_type_show">
                                                <input id="hotel-priceId-${status.index}" type="hidden"
                                                       value="${hotel.priceId}"/>
                                                <input id="hotel-seatType-${status.index}" type="hidden"
                                                       value="${hotel.type}"/>
                                                <p>${fn:substring(hotel.type,0,6)}</p>
                                                <div style="display: none" >
                                                    <p>${fn:substring(hotel.type,6,100)}、
                                                    <c:if test="${hotel.breakfast == false}">
                                                        不含早餐
                                                    </c:if>
                                                    <c:if test="${hotel.breakfast == true}">
                                                        含早餐
                                                    </c:if>
                                                    </p>
                                                </div>

                                            </div>
                                            <input id="hotel-price-${status.index}" type="hidden"
                                                   value="${hotel.price}" days="${hotel.days}" source="${hotel.source}"/>

                                            <p class="w7 fl"><fmt:formatNumber type="number" pattern="###.#">${hotel.price}</fmt:formatNumber></p>

                                            <div class="w8 fl">
                                                <div class="opera_num">
                                                    <a href="javascript:;" class="minus"
                                                       onclick="PlanOrder.changePrice(-1, 'hotel', ${status.index});PlanOrder.addOne()">-</a>

                                                    <p class="posiR"><input class="quantity" type="text"
                                                                            onkeyup="value=value.replace(/[^\d]/g,'')"
                                                                            value="${hotel.num}"
                                                                            maxlength="3"
                                                                            id="hotel-passengerNum-${status.index}"
                                                                            onchange="PlanOrder.changePrice(0, 'hotel', ${status.index})">
                                                    </p>
                                                    <a href="javascript:;" class="plus"
                                                       onclick="PlanOrder.changePrice(1, 'hotel', ${status.index});PlanOrder.addOne()">+</a>
                                                </div>
                                            </div>
                                            <p class="w9 fl b"
                                               id="hotel-sumCost-${status.index}"><fmt:formatNumber type="number" pattern="###.#">${hotel.price*hotel.days*hotel.num}</fmt:formatNumber></p>

                                            <p class="cl"></p>

                                            <div class="tong" id="hotel-copy-${status.index}"><p class="fr">旅客信息同上</p>
                                                <span class="radio fr"
                                                      onclick="PlanOrder.copyTourist('hotel', ${status.index});PlanOrder.addOne()"></span>
                                            </div>
                                        </div>

                                        <div class="fill_div_nr">
                                            <p class="title b fs14">常用出行人:</p>

                                            <div class="fill_name" id="hotel-contacts-${status.index}">
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

                                            <div id="hotel-tourist-${status.index}">
                                                <c:forEach items="${hotel.touristList}" var="tourist"
                                                           varStatus="status">
                                                    <div class="nr cl touristClass">
                                                        <input type="hidden" class="touristId"/>
                                                        <b class="fl num disB fs16">${status.index + 1}</b>

                                                        <div class="fl fill_div_nr_fr">
                                                            <div class="fill_w1 cl">
                                                                <div class="DebitCard_d2 fl oval4">
                                                                    <input type="text" placeholder="姓名"
                                                                           value="${tourist.name}"
                                                                           class="input touristName">
                                                                </div>
                                                                <%--<div class="sfz fl posiR oval4">--%>
                                                                    <%--<c:if test="${tourist.peopleType=='ADULT'}">--%>
                                                                        <%--<p class="name touristPeopleType">成人</p>--%>
                                                                    <%--</c:if>--%>
                                                                    <%--<c:if test="${tourist.peopleType=='CHILD'}">--%>
                                                                        <%--<p class="name touristPeopleType">儿童</p>--%>
                                                                    <%--</c:if>--%>
                                                                    <%--<i></i>--%>

                                                                    <%--<p class="sfzp disn">--%>
                                                                        <%--<a href="javaScript:;">成人</a>--%>
                                                                        <%--<a href="javaScript:;">儿童</a>--%>
                                                                    <%--</p>--%>
                                                                <%--</div>--%>
                                                            </div>
                                                            <div class="fill_w2 cl oval4">
                                                                <div class="sfz fl posiR">
                                                                    <c:if test="${tourist.idType=='IDCARD'}">
                                                                        <p class="name touristIdType">身份证</p><i></i>
                                                                    </c:if>
                                                                    <c:if test="${tourist.idType=='PASSPORT'}">
                                                                        <p class="name touristIdType">护照</p><i></i>
                                                                    </c:if>


                                                                    <p class="sfzp disn">
                                                                        <a href="javaScript:;">身份证</a>
                                                                        <a href="javaScript:;">护照</a>
                                                                    </p>
                                                                </div>
                                                                <div class="DebitCard_d2 fl">
                                                                    <input type="text" placeholder="请输入您的证件号"
                                                                           value="${tourist.idNumber}"
                                                                           class="input touristIdNum">
                                                                </div>
                                                            </div>
                                                            <div class="fill_w3 cl oval4">
                                                                <div class="DebitCard_d2 ">
                                                                    <input type="text" placeholder="请输入手机号"
                                                                           value="${tourist.tel}"
                                                                           class="input touristTel">
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </div>
                                                </c:forEach>
                                            </div>
                                            <p class="cl"></p>

                                        </div>

                                    </li>
                                </c:forEach>
                            </ul>
                            <p class="cl"></p>
                        </div>
                    </c:if>


                    <!--景点-->
                    <input id="ticket-count" type="hidden" value="${ticketDetailList.size()}"/>
                    <c:if test="${ticketDetailList.size() > 0}">
                        <div class="free_e_fl_c_title">
                            <span class="fl checkbox" input="selectall_group"><i></i></span>

                            <p class="fl">景点</p>
                        </div>

                        <div class="free_e_fl_lm_div jingdian">
                            <ul class="free_e_fl_lm_ul">
                                <c:forEach items="${ticketDetailList}" var="ticket" varStatus="status">

                                    <input id="ticket-id-${status.index}" type="hidden" value="${ticket.productId}"/>
                                    <input id="ticket-priceId-${status.index}" type="hidden" value="${ticket.priceId}"/>
                                    <input id="ticket-cityId-${status.index}" type="hidden" value="${ticket.cityId}"/>
                                    <input id="ticket-day-${status.index}" type="hidden" value="${ticket.day}"/>
                                    <li>
                                        <div class="free_e_fl_lm_ul_div">
                                            <div class="w1 fl" style="margin-top: 2px;">
                                                <span class="fl checkbox" input="options"
                                                      id="ticket-check-${status.index}"><i></i></span>
                                            </div>
                                            <div class="w2 fl hc_name long-name" style="width:147px;">
                                                    ${ticket.name}
                                            </div>
                                            <div class="w2 fl long-name long-name-hover" style="display: none"></div>
                                            <div class="w5 fl">
                                                <div class="time_p" style="background-color: #fff9f6;">
                                                    <%--<i class="ico"></i>--%>
                                                    <input type="text"
                                                                                              <%--disabled="disabled"--%>readonly="readonly"
                                                                                              style="width:66px;padding-right: 11px;border:0;background-color: #fff9f6;"
                                                                                              placeholder="2015-08-24"
                                                                                              value="<fmt:formatDate value='${ticket.date}'
                                                                                    pattern="yyyy-MM-dd"/>"
                                                                                              class="input"
                                                                                              <%--onclick="WdatePicker({onpicked:function(dp){PlanOrder.changeDate(${status.index})}, minDate: '%y-%M-%d' })"--%>
                                                                                              id="ticket-date-${status.index}">
                                                </div>
                                            </div>
                                            <div class="w6 fl">
                                                <%--<div class="sfz fl posiR">--%>
                                                    <%--<p class="name">成人票</p><i></i>--%>

                                                    <%--<p class="sfzp disn">--%>
                                                        <%--<a href="javaScript:;">成人票</a>--%>
                                                            <%--<%--<a href="javaScript:;">儿童票3</a>--%>
                                                            <%--<%--<a href="javaScript:;">儿童票4</a>--%>
                                                    <%--</p>--%>
                                                <%--</div>--%>
                                            </div>
                                            <input id="ticket-price-${status.index}" type="hidden"
                                                   value="${ticket.price}"/>

                                            <p class="w7 fl" id="ticket-printPrice-${status.index}" style="margin-left: 196px;"><fmt:formatNumber type="number" pattern="###.#">${ticket.price}</fmt:formatNumber></p>

                                            <div class="w8 fl">
                                                <div class="opera_num">
                                                    <a href="javascript:;" class="minus"
                                                       onclick="PlanOrder.changePrice(-1, 'ticket', ${status.index});PlanOrder.addOne()">-</a>

                                                    <p class="posiR"><input  class="quantity" type="text"
                                                                            onkeyup="value=value.replace(/[^\d]/g,'')"
                                                                            value="${ticket.num}"
                                                                            maxlength="3"
                                                                            id="ticket-passengerNum-${status.index}"
                                                                            onchange="PlanOrder.changePrice(0, 'ticket', ${status.index})" >
                                                    </p>
                                                    <a href="javascript:;" class="plus"
                                                       onclick="PlanOrder.changePrice(1, 'ticket', ${status.index});PlanOrder.addOne()">+</a>
                                                </div>
                                            </div>
                                            <p class="w9 fl b"
                                               id="ticket-sumCost-${status.index}"><fmt:formatNumber type="number" pattern="###.#">${ticket.singleCost}</fmt:formatNumber></p>

                                            <p class="cl"></p>

                                            <div class="tong" id="ticket-copy-${status.index}"><p class="fr">旅客信息同上</p>
                                                <span class="radio fr"
                                                      onclick="PlanOrder.copyTourist('ticket', ${status.index});PlanOrder.addOne()"></span>
                                            </div>
                                        </div>

                                        <div class="fill_div_nr">
                                            <p class="title b fs14">常用出行人:</p>

                                            <div class="fill_name" id="ticket-contacts-${status.index}">
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

                                            <div id="ticket-tourist-${status.index}">
                                                <c:forEach items="${ticket.touristList}" var="tourist"
                                                           varStatus="status">
                                                    <div class="nr cl touristClass">
                                                        <input type="hidden" class="touristId"/>
                                                        <b class="fl num disB fs16">${status.index + 1}</b>

                                                        <div class="fl fill_div_nr_fr">
                                                            <div class="fill_w1 cl">
                                                                <div class="DebitCard_d2 fl oval4">
                                                                    <input type="text" placeholder="姓名"
                                                                           value="${tourist.name}"
                                                                           class="input touristName">
                                                                </div>
                                                                <%--<div class="sfz fl posiR oval4">--%>
                                                                    <%--<c:if test="${tourist.peopleType=='ADULT'}">--%>
                                                                        <%--<p class="name touristPeopleType">成人</p>--%>
                                                                    <%--</c:if>--%>
                                                                    <%--<c:if test="${tourist.peopleType == 'CHILD'}">--%>
                                                                        <%--<p class="name touristPeopleType">儿童</p>--%>
                                                                    <%--</c:if>--%>
                                                                    <%--<i></i>--%>

                                                                    <%--<p class="sfzp disn">--%>
                                                                        <%--<a href="javaScript:;">成人</a>--%>
                                                                        <%--<a href="javaScript:;">儿童</a>--%>
                                                                    <%--</p>--%>
                                                                <%--</div>--%>
                                                            </div>
                                                            <div class="fill_w2 cl oval4">
                                                                <div class="sfz fl posiR">
                                                                    <c:if test="${tourist.idType=='IDCARD'}">
                                                                        <p class="name touristIdType">身份证</p><i></i>
                                                                    </c:if>
                                                                    <c:if test="${tourist.idType=='PASSPORT'}">
                                                                        <p class="name touristIdType">护照</p><i></i>
                                                                    </c:if>


                                                                    <p class="sfzp disn">
                                                                        <a href="javaScript:;">身份证</a>
                                                                        <a href="javaScript:;">护照</a>
                                                                    </p>
                                                                </div>
                                                                <div class="DebitCard_d2 fl">
                                                                    <input type="text" placeholder="请输入您的证件号"
                                                                           value="${tourist.idNumber}"
                                                                           class="input touristIdNum">
                                                                </div>
                                                            </div>
                                                            <div class="fill_w3 cl oval4">
                                                                <div class="DebitCard_d2 ">
                                                                    <input type="text" placeholder="请输入手机号"
                                                                           value="${tourist.tel}"
                                                                           class="input touristTel">
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </div>
                                                </c:forEach>
                                            </div>
                                            <p class="cl"></p>

                                        </div>
                                    </li>
                                </c:forEach>
                            </ul>
                            <p class="cl"></p>
                        </div>
                    </c:if>


                    <p class="cl"></p>
                </div>
            </div>


            <input type="hidden" id="hotelPriceStatus" value="${status}"/>
            <!--酒店担保信用卡-->
            <div class="fill_top_div" style="<c:if test="${status != 'GUARANTEE'}">display: none;</c:if>margin-top: 50px;">
                <div class="name"><b class="fs16">酒店担保信息</b>(<span class="red">*</span>为必填)</div>
                <div class="fill_top_div_js">
                    <p class="top"></p>

                    <div class="nr" style="padding:0px 0px 0px 0px;">
                        <ul style="margin-top: 20px;">
                            <li style="margin-left: 60px;margin-bottom: 10px;">
                                <p class="fl">信用卡卡号</p>
                                <div class="oval4 fl " style="padding-top: 0px;"><input id="cardNum" type="text" style="margin-top:5px;" placeholder="请输入信用卡卡号" value="${creditCardResponse.cardNum}" class="input" />
                                </div>

                                <p class="fl" style="margin-left: 85px;width: 80px;">持卡人姓名</p>
                                <div class="oval4 fl" style="padding-top: 0px;width:257px;"><input id="holderName" type="text" style="margin-top:5px;" placeholder="请输入持卡人姓名" value="${creditCardResponse.holderName}" class="input" />
                                </div>
                            </li>
                            <li style="margin-left: 60px;margin-bottom: 10px;">
                                <p class="fl">信用卡有效期至</p>
                                <%--<div class="oval4 fl" style="padding-top: 0px;"><input type="text" style="margin-top:5px;" placeholder="请输入联系人手机号" value="${order.mobile==null?user.telephone:order.mobile}" class="input" id="contactsTel">--%>
                                <%--</div>--%>
                                <div class="sfz fl posiR" style="width:70px;padding-top: 0px;">
                                    <p class="name " id="expirationYear">${creditCardResponse.expirationYear}年</p>

                                    <i   style="width: 9px;
                                                height: 6px;
                                                background: url(/images/ico.png) 0 -582px no-repeat;
                                                display: block;
                                                position: absolute;
                                                top: 12px;
                                                right: 8px;"></i>

                                    <p class="sfzp disn xinyongka" style="position: absolute;
                                                                background: #fff;
                                                                top: 28px;
                                                                border: 1px solid #ccc;
                                                                border-top: 0px;
                                                                width: 100%;
                                                                left: -1px;
                                                                z-index: 9;">

                                        <c:forEach begin="0" end="9" var="y">
                                            <a href="javaScript:;" style="display: block;line-height: 30px;
                                                                        clear: both;
                                                                        color: #666;
                                                                        padding-left: 10px;">
                                                    ${sessionScope.now.year + 1900 + y}年
                                            </a>
                                        </c:forEach>

                                    </p>
                                </div>

                                <div class="sfz fl posiR" style="width:70px;padding-top: 0px;margin-left: 52px;">
                                    <p class="name " id="expirationMonth">${creditCardResponse.expirationMonth}月</p>

                                    <i   style="width: 9px;
                                                height: 6px;
                                                background: url(/images/ico.png) 0 -582px no-repeat;
                                                display: block;
                                                position: absolute;
                                                top: 12px;
                                                right: 8px;"></i>

                                    <p class="sfzp disn xinyongka" style="position: absolute;
                                                                background: #fff;
                                                                top: 28px;
                                                                border: 1px solid #ccc;
                                                                border-top: 0px;
                                                                width: 100%;
                                                                left: -1px;
                                                                z-index: 9;">
                                        <c:forEach begin="1" end="12" var="yue">
                                            <a href="javaScript:;" style="display: block;line-height: 30px;
                                                                        clear: both;
                                                                        color: #666;
                                                                        padding-left: 10px;">
                                                    ${yue}月</a>
                                        </c:forEach>

                                    </p>
                                </div>
                                <p class="fl" style="margin-left: 85px;width:80px;">证件</p>
                                <div class="sfz fl posiR" style="width:50px;padding-top: 0px;">
                                    <p class="name " id="creditCardIdType">
                                        <c:if test="${creditCardResponse.creditCardIdType == 'IdentityCard'}">身份证</c:if>
                                        <c:if test="${creditCardResponse.creditCardIdType != 'IdentityCard'}">护照</c:if>
                                    </p>

                                    <i   style="width: 9px;
                                                height: 6px;
                                                background: url(/images/ico.png) 0 -582px no-repeat;
                                                display: block;
                                                position: absolute;
                                                top: 12px;
                                                right: 8px;"></i>

                                    <p class="sfzp disn xinyongka" style="position: absolute;
                                                                background: #fff;
                                                                top: 28px;
                                                                border: 1px solid #ccc;
                                                                border-top: 0px;
                                                                width: 100%;
                                                                left: -1px;
                                                                z-index: 9;">
                                        <a href="javaScript:;" style="display: block;
                                                                        clear: both;
                                                                        color: #666;
                                                                        padding-left: 10px;">
                                            身份证</a>
                                        <a href="javaScript:;" style="display: block;
                                                                        clear: both;
                                                                        color: #666;
                                                                        padding-left: 10px;">
                                            护照</a>
                                    </p>
                                </div>
                                <div class="oval4 fl" style="padding-top: 0px;width:181px;"><input id="idNo" type="text" style="margin-top:5px;" placeholder="请输入联系人证件号" value="${creditCardResponse.idNo}" class="input" />
                                </div>
                            </li>
                            <li style="margin-left: 60px;margin-bottom: 10px;">
                                <p class="fl">信用卡验证码</p>
                                <div class="oval4 fl" style="padding-top: 0px;"><input id="cvv" type="text" style="margin-top:5px;" placeholder="卡背后末三位数" value="${creditCardResponse.cvv}" class="input" />
                                </div>

                            </li>
                        </ul>


                    </div>

                </div>
            </div>

            <!--酒店担保结束-->


            <div class="fill_top_div">
                <div class="name"><b class="fs16">联系人信息</b>(<span class="red">*</span>为必填)</div>
                <div class="fill_top_div_js">
                    <p class="top"></p>

                    <div class="nr" style="padding: 30px 60px 0px;">
                        <ul>
                            <li>
                                <p class="fl"><span class="red mr5">*</span>联系人姓名</p>

                                <div class="oval4 fl"><input type="text" placeholder="请输入联系人姓名" value="${order.recName==null?user.userName:order.recName}" class="input" id="contactsName">
                                </div>

                                <p class="fl" style="margin-left: 115px;"><span class="red mr5">*</span>联系人手机号</p>

                                <div class="oval4 fl"><input type="text" placeholder="请输入联系人手机号" value="${order.mobile==null?user.telephone:order.mobile}" class="input" id="contactsTel">
                                </div>
                            </li>
                            <%--<li>--%>
                                <%--<p class="fl"><span class="red mr5">*</span>联系人姓名</p>--%>

                                <%--<div class="oval4 fl"><input type="text" placeholder="请输入联系人姓名" value="${order.recName==null?user.userName:order.recName}"--%>
                                                             <%--class="input" id="contactsName">--%>
                                <%--</div>--%>
                            <%--</li>--%>
                            <%--<li>--%>
                                <%--<p class="fl"><span class="red mr5">*</span>联系人手机号</p>--%>

                                <%--<div class="oval4 fl"><input type="text" placeholder="请输入联系人手机号" value="${order.mobile==null?user.telephone:order.mobile}"--%>
                                                             <%--class="input" id="contactsTel">--%>
                                <%--</div>--%>
                            <%--</li>--%>
                        </ul>
                    </div>
                </div>
            </div>

            <c:if test="${(userCouponsList != null && fn:length(userCouponsList) > 0) || order.userCoupon != null}">
                <p style="font-size: 16px;margin-bottom: 20px;color: #333;font-weight: bold;">可用红包<span style="color: #ff6000;">（${fn:length(userCouponsList) + (order.userCoupon != null?1:0)}）</span></p>
                <div class="" style="background-color: rgb(239,250,254);border: 1px solid rgb(163,208,237);margin-bottom: 47px;width:auto;padding: 20px 50px 20px 50px;">
                    <p style="font-size:14px;margin-bottom: 20px;">以下为可用红包。</p>
                    <div class="nr">
                        <ul>
                            <c:if test="${order.userCoupon != null}">
                                <li class="redPacketLi" couponid="${order.userCoupon.id}" style="height:14px;font-size:12px;margin-bottom: 10px;" useCondition="${order.userCoupon.coupon.useCondition}"
                                    faceValue="${order.userCoupon.coupon.faceValue}">
                                    <span class="checkbox fl checked"><i></i></span>
                                    <div style="width:80px;float:left;">${order.userCoupon.coupon.faceValue}元</div>
                                    <div style="width:150px;float:left;">满<span style="color:red;">${order.userCoupon.coupon.useCondition}</span>元可用 </div>
                                    <div style="width:230px;float:left;">${order.userCoupon.limitProductTypes}红包</div>
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
                                <c:if test="${order.userCoupon != null || status.index > 0}">border-top:1px dashed rgb(163,208,237);</c:if>
                                    " useCondition="${c.coupon.useCondition}"
                                    faceValue="${c.coupon.faceValue}">
                                    <span class="checkbox fl "><i></i></span>
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

            <div class="fill_bottom_div">
                <div class="top fs13">
                    <span class="fl checkbox checked" input="options" id="provisionCheck" data-staute="1"><i></i></span>

                    <a href="javascript:;" class="protocol" style="color:#aaa;" onmouseover="this.style.cssText='color:#01af63'" onmouseout="this.style.cssText='color:#aaa'">
                        <p class="fl">我已阅读并接受协议条款、补充条款及其他所有内容</p>
                    </a>
                </div>

                <div class="bottom">
                    <a href="javaScript:;" class="oval4 b fs14 textC fl" onclick="javascript:history.go(-1);" style="background-color:#f66000;">上一步</a>
                    <input id="submitFlag" type="hidden" value="ok"/>
                    <a href="javascript:;" class="b fs20 ff_yh textC  posiA " onclick="PlanOrder.submitOrder()">去支付</a>

                    <p class="fr b ff_yh fs16">订单金额(不含酒店费用)：<span class="fs20 red" id="sumCost">256元</span></p>
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
                            <li id="right-flight">
                                <b class="name">机票</b>
                                <c:forEach items="${planeDetailList}" var="flight" varStatus="status">
                                    <div class="cl nr" id="right-flight-${status.index}" style="height: 65px;">
                                        <label class="fl" style="line-height: 14px;">${flight.leaveCity}-${flight.arriveCity}</label>
                                        <span class="fl cw">
                                        <%--${flight.type}--%>
                                        </span>
                                        <span class="fl num rightPanelTouristNum" style="margin-left: 50px;">${flight.num}x</span>
                                        <b class="price fr rightPanelCost" style="font-weight: bold;">¥<fmt:formatNumber type="number" pattern="###.#">${flight.singleCost}</fmt:formatNumber></b>
                                        <%--<b class="price fr rightPanelCost">¥<fmt:formatNumber type="number" pattern="###.#">${flight.singleCost - flight.additionalFuelTax * flight.num - flight.airportBuildFee * flight.num}</fmt:formatNumber></b>--%>
                                        <%--<br/><span class="fl" style="margin-top:3px;margin-bottom:6px;color:#999;">燃油+机建</span>--%>
                                        <%--<span class="fr" style="color:#ff6000;margin-top:3px;margin-bottom:6px;">￥<span class="additionalFuelTax"><fmt:formatNumber type="number" pattern="###.#">${flight.additionalFuelTax * flight.num}</fmt:formatNumber></span> + ￥<span class="airportBuildFee"><fmt:formatNumber type="number" pattern="###.#">${flight.airportBuildFee * flight.num}</fmt:formatNumber></span></span>--%>
                                        <br/><span class="fl" style="color:#999;font-size: 12px;">机票价</span>
                                        <span class="fr" style="color:#999;"><span class="jpj"><fmt:formatNumber type="number" pattern="###.#">${flight.singleCost - flight.additionalFuelTax * flight.num - flight.airportBuildFee * flight.num}</fmt:formatNumber></span></span>
                                        <br/><span class="fl" style="color:#999;font-size: 12px;">燃油费</span>
                                        <span class="fr" style="color:#999;font-size: 12px;"><span class="additionalFuelTax"><fmt:formatNumber type="number" pattern="###.#">${flight.additionalFuelTax * flight.num}</fmt:formatNumber></span></span>
                                        <br/><span class="fl" style="margin-bottom:6px;color:#999;font-size: 12px;">机建费</span>
                                        <span class="fr" style="color:#999;margin-bottom:6px;font-size: 12px;"><span class="airportBuildFee"><fmt:formatNumber type="number" pattern="###.#">${flight.airportBuildFee * flight.num}</fmt:formatNumber></span></span>
                                        <input type="hidden" class="additionalFuelTaxPrice" value="${flight.additionalFuelTax}"/>
                                        <input type="hidden" class="airportBuildFeePrice" value="${flight.airportBuildFee}">
                                        <br/>
                                    </div>
                                </c:forEach>
                            </li>
                            <li id="right-train">
                                <b class="name">火车票</b>

                                <c:forEach items="${trainDetailList}" var="train" varStatus="status">
                                    <div class="cl nr" id="right-train-${status.index}">
                                        <label class="fl" style="line-height: 14px;">${train.leaveCity}-${train.arriveCity}</label>
                                        <span class="fl cw">
                                        <%--${train.type}--%>
                                        </span>
                                        <span class="fl num rightPanelTouristNum" style="margin-left: 50px;">${train.num}x</span>
                                        <b class="price fr rightPanelCost" style="font-weight: bold;">¥<fmt:formatNumber type="number" pattern="###.#">${train.singleCost}</fmt:formatNumber></b>
                                    </div>
                                </c:forEach>
                            </li>

                            <li id="right-ticket">
                                <b class="name">景点</b>

                                <c:forEach items="${ticketDetailList}" var="ticket" varStatus="status">
                                    <div class="cl nr" id="right-ticket-${status.index}">
                                        <label class="fl" style="line-height: 14px;width:125px">${ticket.name}</label>
                                        <span class="fl cw">
                                            <%--成人票--%>
                                        </span>
                                        <span class="fl num rightPanelTouristNum" style="margin-left: 2px;">${ticket.num}x</span>
                                        <b class="price fr rightPanelCost"
                                           id="right-ticket-cost-${status.index}" style="font-weight: bold;">¥<fmt:formatNumber type="number" pattern="###.#">${ticket.singleCost}</fmt:formatNumber></b>
                                    </div>
                                </c:forEach>
                            </li>

                            <li id="right-hotel">
                                <b class="name">酒店</b>

                                <c:forEach items="${hotelDetailList}" var="hotel" varStatus="status">
                                    <div class="cl nr" id="right-hotel-${status.index}" days="${hotel.days}">
                                        <label class="fl" style="line-height: 14px;">${hotel.name}</label>
                                        <span class="fl cw" style="width:50px;margin-left: 1px;">${hotel.days}晚1间</span>
                                        <span class="fl num rightPanelTouristNum">${hotel.num}x</span>
                                        <b class="price fr rightPanelCost" style="font-weight: bold;">¥<fmt:formatNumber type="number" pattern="###.#">${hotel.price*hotel.days*hotel.num}</fmt:formatNumber></b>
                                    </div>
                                </c:forEach>
                            </li>
                        </ul>
                        <p class="cl"></p>
                    </div>
                    <div class="free_e_fr_c">
                        <div class="cl free_e_fr_c_p" style="height: 82px;">
                            <div style="height: 41px;border-bottom: 1px dashed #ccc;margin-bottom: 5px;color:#666;font-size: 14px;">
                                <span style="line-height: 18px;font-size: 14px;">订单总价：</span>
                                <span  style="float: right;color:#666;line-height: 18px;" class="ddzj"></span><br/>
                                <span style="line-height: 18px;font-size: 14px;">酒店到付：</span>
                                <span  style="float: right;color:#666;line-height: 18px;" class="jddf"></span><br/>
                            </div>
                            <label class="fl" style="font-size: 19px;margin-top: 5px;color:#666;font-weight: bolder;">应付总额:</label>
                            <b class="fr fs16" id="rightSumCost" style="margin-top: 5px;font-size: 19px;font-weight: bold;">¥2256</b>
                        </div>
                        <%--<div class="cl free_e_fr_c_p free_e_fr_c_p2">--%>
                        <%--<label class="fl">小帮价:</label>--%>
                        <%--<b class="fr fs20 ff_yh">￥1988</b>--%>
                        <%--<span class="fr mr5">7.5折</span>--%>
                        <%--</div>--%>

                        <a href="javascript:;" class="free_e_fr_but ffhover b oval4" onclick="PlanOrder.submitOrder()">下一步去支付</a>
                    </div>


                    <p class="cl"></p>
                </div>

                <div class="fill_fr_div posiR">
                    <div class="name posiR fs16"><i></i>注意事项</div>
                    <p class="nr cl" style="margin-right: 15px;">
                        <%--1> 退款手续费：¥15/张<br/>--%>
                        <%--2> 使用日期截止后当天20:00可申请退款<br/>--%>
                        <%--3> 不支持部分退款<br/>--%>
                        <%--4> 其他规定，请见<span>退款说明</span><br/>--%>
                        1> 付款成功后如需修改、取消、退订，将按您所订资源的退变更条款收取费用。<br/>
                        2> 烦请注意填写预订人与实际出行人的姓名及联系方式保持一致，以免信息错误导致无法正常使用，如因此给您带来的损失我司不给予承担，给您带来不便请谅解。<br/>
                        3> 如需帮助，请致电旅行帮客服，电话：400-0131-770 。<br/>
                    </p>

                    <div class="flot">
                        <b>咨询电话</b>

                        <%--<p>4006587799转<br/>1420#</p>--%>
                        <p>400-0131-770</p>
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
<script src="/js/lvxbang/order/plan.js" type="text/javascript"></script>
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

        //下拉框
        $(".sfz .name,.sfz i").click(function () {
            $(this).siblings(".sfzp").show();
        });

        $(".sfzp a").click(function () {
            var label = $(this).text();
            $(this).parent(".sfzp").hide();
            $(this).parent(".sfzp").siblings(".name").text(label);
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

    $('#hotel_type_show').hover(function(){
        $(this).find('div').show();
    },function(){
                $(this).find('div').hide();
            }
    );
</script>
