<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head lang="en">
  <meta http-equiv="content-type" content="text/html;charset=utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="renderer" content="webkit" />
  <title>退款退货-优茶联</title>
  <jsp:include page="/WEB-INF/jsp/www/common/common_css.jsp"></jsp:include>
  <jsp:include page="/WEB-INF/jsp/www/common/common_js.jsp"></jsp:include>
  <link rel="stylesheet" type="text/css" href="/static/js/lib/webuploader/webuploader.css">
  <link rel="stylesheet" href="/static/css/cssresets.css">
  <link rel="stylesheet" href="/static/css/public.css">
  <link rel="stylesheet" href="/static/css/after_sale_status_new.css">
</head>
<body>

<%--头部 starting--%>
<jsp:include page="/WEB-INF/jsp/www/include/header.jsp"></jsp:include>
<%--头部 ending--%>

<%--查询 starting--%>
<jsp:include page="/WEB-INF/jsp/www/include/personal_header.jsp"></jsp:include>
<%--查询 ending--%>

<%--左侧工具栏 starting--%>
<jsp:include page="/WEB-INF/jsp/www/include/nav_left_bar.jsp"></jsp:include>
<%--左侧工具栏 ending--%>
<div class="bread-nav clearfix">
  <span class="pull-left">你的位置：</span>
  <a class="pull-left" href="/">首页</a>
  <i class="pull-left">></i>
  <a class="pull-left" href="/user/userInfo">我的优茶联</a>
  <i class="pull-left">></i>
  <a class="pull-left" href="/order/list">进货单</a>
</div>
<div class="step-nav clearfix">
          <span class="step step-success pull-left">
              <i class="icon-success"></i>买家申请退款退货
          </span>
  <i class="step-break step-break-transition pull-left"></i>
      <span class="step step-success pull-left">
              <i class="icon-success"></i>卖家处理退款退货申请
          </span>
  <i class="step-break step-break-transition pull-left"></i>
      <span class="step step-success  pull-left">
              <i class="icon-success"></i>买家退货给卖家
          </span>
  <%--<i class="step-break pull-left"></i>--%>
      <%--<span class="step pull-left">--%>
              <%--<i>4</i>卖家确认收货，并退款处理--%>
          <%--</span>--%>
  <i class="step-break step-break-success pull-left"></i>
      <span class="step step-active pull-left">
              <i>4</i>退货关闭
          </span>
</div>

<div class="content clearfix">
  <div class="content-left pull-left">
    <!--换货   成功模块-->
    <div class="change-success">
      <div class="step-waiting">

      <c:if test="${orderItemAsFlow.flowStatus != 'refuse_return'}">
        <h5>因你撤销了退款退货申请，退款退货已关闭</h5>
        <div class="waiting-operation clearfix">
            <%--<label class="pull-left">您还可以：</label>--%>
            <%--<a href="javascript:void(0);" class="cancel-server pull-left">查看换货物流信息</a>--%>
        </div>
      </c:if>

        <c:if test="${orderItemAsFlow.flowStatus == 'refuse_return'}">
          <h5>退货关闭</h5>
          <div class="waiting-time">
            因优茶联已拒绝申请，退货已关闭
          </div>
          <div class="waiting-operation clearfix">

            <c:if test="${goodMsgList.status == 2}">
              <c:if test="${goodMsgList.shipReturnTime < 2}">
                <label class="pull-left">您还可以：</label>
                <a href="/afterSale/afterSaleReturn/${orderId}/${skuId}?operType=reject" class="change-server again-apply-after-sale pull-left">再次申请</a>
              </c:if>
            </c:if>
            <c:if test="${goodMsgList.status == 5}">
              <c:if test="${goodMsgList.returnTime < 2}">
                <label class="pull-left">您还可以：</label>
                <a href="/afterSale/afterSaleReturn/${orderId}/${skuId}?operType=reject" class="change-server again-apply-after-sale pull-left">再次申请</a>
              </c:if>
            </c:if>
          </div>
        </c:if>

      </div>
      <div class="success-message hide">
        <h4>留言板</h4>
        <ul class="message-list">
          <c:forEach items="${orderItemAsFlow.orderItemReplyVos}" var="orderItemReply">
            <li class="clearfix">
              <img src="${orderItemReply.headImgUrl}" class="user-icon pull-left">
              <div class="message-txt pull-left">
                <c:if test="${orderItemReply.operManType == 'buyer'}">
                  <p>${orderItemReply.operManName}</p>
                </c:if>
                <c:if test="${orderItemReply.operManType != 'buyer'}">
                  <p>优茶联</p>
                </c:if>
                <p>${orderItemReply.operDesc}</p>
              </div>
              <span class="time"><fmt:formatDate value="${orderItemReply.dateCreated}" pattern="yyyy-MM-dd HH:mm:ss"/> </span>
            </li>
          </c:forEach>
        </ul>
      </div>
    </div>
  </div>
  <div class="content-right pull-left">
    <h4>商品类型</h4>
    <ul class="product-list">
      <li>
        <a href="#" class="right-product clearfix">
          <div class="img-box pull-left">
            <img src="${goodMsgList.purGoodsImgUrl}">
          </div>
          <div class="txt-box pull-left">
            <p class="txt-title">${goodMsgList.purGoodsName}</p>
            <p class="txt-sku">规格：${goodMsgList.skuName}</p>
          </div>
        </a>
      </li>
    </ul>

    <div class="order-content">
      <div class="order-number">
        <label>订单编号：</label>
        <span style="letter-spacing: -0.5px">${goodMsgList.orderNo}</span>
      </div>
      <div class="order-price">
        <label><i>单</i>价：</label>
        <span>${goodMsgList.finalAmount}<mark>元*${goodMsgList.number}（数量）</mark></span>
      </div>
    </div>
  </div>
</div>

<%--尾部 starting--%>
<jsp:include page="/WEB-INF/jsp/www/include/footer.jsp"></jsp:include>
<%--尾部 ending--%>
</body>
<script src="/static/js/lib/webuploader/webuploader.min.js"></script>
<script src="/static/js/lib/webuploader/webuploaderUtil.js"></script>
<script src="/static/js/afterSale/after_sale_status.js"></script>
<script src="/static/js/afterSale/afterSaleReturn.js"></script>
</html>
