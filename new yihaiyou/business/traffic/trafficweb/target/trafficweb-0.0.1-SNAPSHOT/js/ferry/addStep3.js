var addStep3 = {
	init:function(){
		addStep3.initStatus();
	},	
	// 初始状态
	initStatus : function() {
		var lineInfo = parent.window.getIfrData('step1');
		$('#productId').val(lineInfo.productId);
		$('#productName').html(lineInfo.productName);
	},
	// 返回修改管理
	doBackLineMgr:function(){
		parent.window.closeChildPanel();	
	},	
	// 编辑线路
	doEditLine : function() {
		var productId = $('#productId').val();
		var url = "/traffic/ferry/editWizard.jhtml?productId="+productId;
		parent.window.location.href = url;
	},
	// 添加线路
	doAddLine : function() {
		var url = "/traffic/ferry/addWizard.jhtml";
		parent.window.location.href = url;
	}
};

//返回本页面数据
function getIfrData(){
	var data = {};
	return data;
}	

$(function(){
	addStep3.init();
});