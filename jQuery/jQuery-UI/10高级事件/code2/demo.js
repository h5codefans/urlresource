$(function(){
    
	/*
   //.bind绑定了三个事件
    $('.button').bind('click',function(){
	     alert('事件不委托');
	});
	
	//使用live绑定的是document，而非button，所有只绑定一次事件
	$('.button').live('click',function(){
	     alert('事件不委托');
	});
	
	//bind无法动态绑定事件
	$('.button').bind('click',function(){
	    $(this).clone().appendTo('#box');
	});
	
	//live可以动态绑定事件,因为事件绑定在document上
	//.live绑定在document上，而点击.button冒泡到document上，
	//并且点击document时候，需要验证event.type和event.target才能触发
	$('.button').live('click',function(){
	    $(this).clone().appendTo('#box');
	});
	
	//.live是不支持元素连缀的
	$('#box').live('click',function(){
	    $(this).clone().appendTo('#box');
	});
	
	$('.button').live('click',function(){
	    $(this).clone().appendTo('#box');
	});
	
	//取消live事件
	$('.button').die('click');
	
	$('.button').bind('click',function(){
	    $(this).clone(true).appendTo('#box');
	});
	
	$('.button').bind('click',function(){
	    $('<input type="button" value="按钮" class="button" />').appendTo('#box');
	});
	
	
	//.live的替代方法.delegate
	$('#box').delegate('.button','click',function(){
	       $(this).clone().appendTo('#box');
	});
	
	$('#box').undelegate('.button');
	//live语义不清晰，由于他没有指定绑定了谁，所以不清晰
	//delegate语义清晰，绑定谁，语义清晰
         */

	
});