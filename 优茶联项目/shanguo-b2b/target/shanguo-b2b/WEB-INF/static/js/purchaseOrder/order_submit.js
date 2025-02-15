/**
 * Created by Administrator on 2017/5/22.
 */
var orderSubmit = {
    init:function(){
        orderSubmit.spreadBillDetails();
        orderSubmit.selectPayRoute();
        orderSubmit.payOrder();
    },

    payOrder: function() {
        $(".to-pay-order").click(function() {
            var payWay = $("input[name=orderPayRoute]:checked").val();
            var orderId = $("input[name=orderId]").val();
            if (!payWay) {
                layer.msg("请选择支付方式！");
                return;
            }
            var orderId = orderId;
            $.ajax({
                type: "POST",
                data: {orderId: orderId, payWay: payWay},
                url: "/order/toPay",
                success: function(result) {
                    if (result.success) {
                        window.location.href = "/order/wxPay/" + orderId + "/" + payWay;
                    } else {
                        layer.msg(result.msg);
                    }
                }
            });
        });
    },

    /*展开订单详情*/
    spreadBillDetails:function(){
        $(".order-details").hide();
        $(".order-up-btn").hide();
        $(".order-down-btn").click(function(){
            $(this).hide();
            $(this).siblings(".order-up-btn").show();
            $(".order-details").show();
        });
        $(".order-up-btn").click(function(){
            $(this).hide();
            $(this).siblings(".order-down-btn").show();
            $(".order-details").hide();
        });
    },
    /*选择支付方式*/
    selectPayRoute:function(){
        $(".order-pay-group").click(function(){
            if($(this).find("input[type=radio]").checked){
                $(this).find(".order-pay-mask").find("i").removeClass("active");
            }else{
                $(this).find(".order-pay-mask").find("i").addClass("active");
                $(this).siblings(".order-pay-group").find(".order-pay-mask").find("i").removeClass("active");
            }
        });
    }
};
$(function(){
    orderSubmit.init();
});