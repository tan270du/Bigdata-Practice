<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑向导框</title>
<%@ include file="../../common/common141.jsp"%>
</head>
<body style="margin:0;padding:0px 3px 0px 0px;">
<div id="content" title="" class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;"> 
	<div id="ifrSet" title="编辑船票" data-options="region:'center',border:true, tools:'#dsTools'">
		<div id="step1" title="" class="easyui-panel" 
			data-options="fit:true, closed:true, minimizable:false, maximizable:false, collapsible:false,border:false">
			<iframe name="step1Iframe" id="step1Iframe" scrolling="no" frameborder="0"  style="width:100%;height:100%;"></iframe>
		</div>
<!-- 		<div id="step2" title="" class="easyui-panel"  -->
<!-- 			data-options="fit:true, closed:true, minimizable:false, maximizable:false, collapsible:false,border:false"> -->
<!-- 			<iframe name="step2Iframe" id="step2Iframe" scrolling="no" frameborder="0"  style="width:100%;height:880px;"></iframe> -->
<!-- 		</div> -->
		<div id="step2" title="" class="easyui-panel" 
			data-options="fit:true, closed:true, minimizable:false, maximizable:false, collapsible:false,border:false">
			<iframe name="step3Iframe" id="step3Iframe" scrolling="no" frameborder="0"  style="width:100%;height:100%;"></iframe>
		</div>
		<div id="step3" title="" class="easyui-panel" 
			data-options="fit:true, closed:true, minimizable:false, maximizable:false, collapsible:false,border:false">
			<iframe name="step4Iframe" id="step4Iframe" scrolling="no" frameborder="0"  style="width:100%;height:99%;"></iframe>
		</div>
		<div id="dsTools">
			<a href="javascript:void(0)" class="" style="width:28px;" onClick="closeChildPanel()">返回</a>
		</div>
		<input type="hidden" id="hidden_tickeId" value="${ticId}">
	</div>	
</div>
</body>
</html>
<script type="text/javascript">	


	//页面流
	var pages = [{winIndex:1, winId:"step1", title:"船票描述", url:"/ticket/ticket/sailboatTicketEdit.jhtml"},
// 	     {winIndex:2, winId:"step2", title:"第二步：船票报价", url:"/ticket/ticket/ticketEditOffer.jhtml"},
	     {winIndex:2, winId:"step2", title:"船票报价列表", url:"/ticket/ticket/sailboatTicketEditOfferList.jhtml"},
	     {winIndex:3, winId:"step3", title:"船票发布成功", url:"/ticket/ticket/sailboatTicketPublishSuccess.jhtml"}];
	// 获取iframe的数据
	function getIfrData(winId) {	
		var ifr = $("#"+winId).children()[0];
		return ifr.contentWindow.getIfrData();
	}
	
	// 关闭
	function closeChildPanel() {
		//$("#step1").panel("close");
		var url = '/ticket/ticket/sailboatTicketList.jhtml';
		window.location.href = url;
	}
	
	// 显示页面
	function showGuide(winIndex, isRefresh,param) {
		// 显示当前窗口，隐藏其他窗口
		var title = "";
		for (var i = 0; i < pages.length; i++) {
			if (winIndex == pages[i].winIndex) {
				var url = pages[i].url;
// 				console.log(param);
					url = pages[i];
// 				console.info('isRefresh:'+isRefresh);
				
				var ifr = $("#"+pages[i].winId).children()[0];
				
				$("#"+pages[i].winId).panel("open");
				if(i!=2&&$("#hidden_tickeId").val()){	//修改时编辑
// 					alert(i);
					title = title + "<a href='javascript:void(0)' onClick='showGuide("+pages[i].winIndex+", true)'><font color='#FF9900'>" + pages[i].title + "</font></a> | ";
					url = pages[i].url + "?ticketId="+$("#hidden_tickeId").val();
				}else{	//新增
					url = pages[i].url;
					title = title + "<font color='#FF9900'>" + pages[i].title + "</font> | ";
				}
				
				var src = $(ifr).attr("src");	
				if (!src || src.length > 0) {
// 					console.info('src:');
// 					console.log("param="+param);
					
					if(param != undefined){
// 						alert("param1="+param);
						url = pages[i].url + "?ticketId="+param;
						$(ifr).attr("src", url);
					}else{
// 						alert(i);
// 						url = pages[i].url;
// 						alert("param2="+param +"url="+url);
						$(ifr).attr("src", url);
					}
					
				} else {	// 否则调用iframe的初始方法（相关iframe要提供该方法）
					if (isRefresh) {	// 是否刷新页面
						console.info('isRefresh.');
						ifr.contentWindow.location.reload();
					}
				}
				
			} else {
				$("#"+pages[i].winId).panel("close");
				if(i!=2&&$("#hidden_tickeId").val()){
					
					title = title + "<a href='javascript:void(0)' onClick='showGuide("+pages[i].winIndex+", true)'><font color='#CCCCCC'>" + pages[i].title + "</font></a> | ";
				}else{
					title = title +  pages[i].title + " | ";
					
				}
				
// 				
			}
		}
		// 设置标题
		title = title.substring(0, title.length-2);
		title = "<font color='#CCCCCC'>" + title + "</font>";
		$("#ifrSet").panel("setTitle", title);
	}

	// 初始页面设置
	function initPage() {
		showGuide(1,true);
// 		var ticketId = $("#hidden_tickeId").val();
// 		if(ticketId != undefined && ticketId.length>0){
// 			var param = "?ticketId="+ticketId;
// 			showGuide(1,true);
// 		}else{
// 			showGuide(1);
// 		}
		
	}
	
	// 页面加载后相关设置项
	$(function(){
		
// 		alert($("#hidden_tickeId").val());
		
		initPage();
		
	});		
	
</script>	