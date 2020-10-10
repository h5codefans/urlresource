$(function(){
  
  $.fn.draggable.defaults.cursor='text';   //将所有拖动默认设为'text'类型
  $('#box').draggable({
     //revert:true,
	 //cursor:'text',
     //handle:'#pox',  //#pox部分可拖动
	 //disabled:true,
	 edge:50,
	 //axis:'v',//h水平拖动
	  //proxy:'clone',
	 //deltaX:10,
	 //deltaY:10,
	 //proxy:function(source){
	   // var p=$('<div style="width:400px;height:200px;border:1px dashed #ccc">');
	//	p.html($(source).html()).appendTo('body');
		//return p;
	 //},
	 //onBeforeDrag:function(e){
	  //   alert('拖动前触发!');
	 //},  
	 // onBeforeDrag:function(e){
	  //   return false;           //返回false不可拖动
	 //}, 
	 //onStartDrag:function(e){
	  //    alert('拖动开始触发！');
	  //console.log($('#box').draggable('proxy'));
	 //},
	 //onDrag:function(e){
	  //   alert('拖动过程中触发！');
	 //},
	 //onStopDrag:function(e){
	  //    alert('拖动结束触发！');
	 //},
	 
  });
  //$('#box').draggable('disable');
  
  //$('#box').draggable('enable');
  
  //console.log($('#box').draggable('options'));
  
   
});
