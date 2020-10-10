$(function(){
    
	$.fn.linkbutton.defaults.iconCls='icon-add';
	$('#box').linkbutton({
	    //id:'pox',
		//disabled:true,
		//toggle:true,
		//selected:true,
		//group:'sex',  //指定相同组名按钮通属于一个组，可实现radio单选效果
		//plain:true,
		text:'文字',
		//iconCls:'icon-add',
		//iconAlign:'right',
	});
	
    $('#pox').linkbutton({
	    //id:'pox',
		//disabled:true,
		//toggle:true,
		//group:'sex',
		//iconCls:'icon-mini-add',
	});
	
	//console.log($('#box').linkbutton('options'));
	//$('#box').linkbutton('disable');
	//$('#box').linkbutton('enable');
	
	//$('#box').linkbutton('select');
	//$('#box').linkbutton('unselect');
});
