$(function(){
    
	/*
	$('input').bind('click',function(e){
	     alert(e);
	});
	
	$('input').bind('click',function(e){
	     alert(e.type);
	});
	
	$('input').bind('click',function(e){
	     alert(e.target);
	});
	
	$('input').bind('click',function(e){
	     alert(e.relatedTarget);
	});
	
	$('input').bind('click',function(e){
	     alert(e.currentTarget);
	});
	
	$('div').bind('click',function(e){
	     alert(e.target);
	});
	
	$('div').bind('click',function(e){
	     alert(e.currentTarget);
	});
	
	//target是获取触发元素的DOM，触发元素，就是你点了哪个就是哪个
    //currentTargeet得到的是监听元素的DOM,你绑定的是哪个就是哪个
	
	$('span').bind('mouseover',function(e){  //移入移出是最邻近的DOM节点
	     alert(e.relatedTarget);
	});
	
	$('span').bind('mouseout',function(e){
	     alert(e.relatedTarget);
	});
	
	$('div').bind('click',function(e){
	     alert(this==e.currentTarget);     //true
	});
	
	$('input').bind('click',123,function(e){
	     alert(e.data);
	});
	
	$('input').bind('click','abc',function(e){
	     alert(e.data);
	});
	$('input').bind('click',[1,2,3,'a','b'],function(e){
	     alert(e.data[3]);
	});
	
	$('input').bind('click',{user:'Lee',age:100},function(e){
	     alert(e.data.age);
	});
	
	$(document).bind('click',function(e){
	    alert(e.pageX +','+ e.screenX +','+ e.clientX);
	});
	
	$(document).bind('click',function(e){
	    alert(e.pageY +','+ e.screenY +','+ e.clientY);
	});
	
	$('input').bind('click',function(e){
	    return 123;
	});
	 $('input').bind('click',function(e){
	    alert(e.result);
	});
	
	 $('input').bind('click',function(e){
	    alert(e.timeStamp);         //时间戳
	});
	
	
	$('input').bind('mousedown',function(e){
	    alert(e.which);                         //鼠标左中右键，键盘按键
	});
	
	
	 $('input').bind('click',function(e){
	    alert(e.ctrlKey);         
	});
	
	*/
	$(document).bind('click',function(e){
	    alert(e.pageY +','+ e.screenY +','+ e.clientY);
	});
});