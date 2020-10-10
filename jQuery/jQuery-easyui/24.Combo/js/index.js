$(function(){
   
    $('#box').combo({
	   required:true,
	   width:300,
	   //height:50,
	   //panelWidth:300,
	   //panelHeight:300,
	   //editable:false,
	   //disabled:true,
	   //readonly:true,
	   //hasDownArrow:false,
	   //value:'123',
	   //delay:1000,
	   /*
	   onShowPanel:function(){
	       alert('显示触发！');
	   },
	   onHidePanel:function(){
	      alert('隐藏触发');
	   },
	   
	   onChange:function(newValue,oldValue){
	      alert(newValue+'|'+oldValue);
	   },
	   */
	});
	$('#food').appendTo($('#box').combo('panel'));
	$('#food input').click(function(){
	    var v=$(this).val();
		var s=$(this).next('span').text();
		$('#box').combo('setValue',v).combo('setText',s).combo('hidePanel');
	});
	
	//console.log($('#box').combo('textbox'));
	$(document).click(function(){
	     //$('#box').combo('resize','width');
		 //('#box').combo('showPanel');
		 //console.log($('#box').combo('isValid'));
		 //console.log($('#box').combo('getText'));
		 //console.log($('#box').combo('getValue'));
		 $('#box').combo('setValues',['1','2','3']);
		 console.log($('#box').combo('getValues'));
	});
});