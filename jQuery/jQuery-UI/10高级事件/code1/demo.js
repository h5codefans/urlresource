$(function(){
     
	 /*
     $('input').click(function(){
	     alert('我将要使用模拟用户来触发事件');
	 });
	 
	 //模拟用户点击操作
	 $('input').trigger('click');
	 
	 
	   $('input').click(function(){
	     alert('我将要使用模拟用户来触发事件');
	 }).trigger('click');
	 
	 $('input').click(function(e,data1,data2){                            //数据一一对应
	     alert(data1+'|'+data2);
	 }).trigger('click',['123','abc']);
	 
	 $('input').click(function(e,data1,data2){
	     alert(data1+'|'+data2);
	 }).trigger('click',['123','abc']);   
	                                             //trigger额外数据，只有一条的时候，可以省略中括号，多条不能省略，第二条之后就无法识别了
	 
	  $('input').click(function(e,data1,data2,data3,data4){
	     alert(data1+'|'+data2+'|'+data3+'|'+data4.user);
	 }).trigger('click',['123','abc',['a','b','c'],{user:'Lee'}]);   
	 
	  $('input').bind('click',{user:'Lee'},function(e,data1,data2,data3,data4){
	     alert(data1+'|'+data2+'|'+data3+'|'+data4.user+'|'+e.data.user);
	 }).trigger('click',['123','abc',['a','b','c'],{user:'Lee'}]); 
	 
	  //click,mouseover这些系统事件，自定义事件就是自己起名字的事件
	   $('input').bind('myEvent',function(){
	          alert('自定义事件');
	   }).trigger('myEvent');
	   
	   $('input').click(function(){
	   
	         alert('我将要使用模拟用户来触发事件');
	   }).click();
	   
	   $('input').click(function(){
	   
	         alert('我将要使用模拟用户来触发事件');
	   }).triggerHandler('click');
	   
	   //trigger提交后跳转，没有阻止默认行为
	   //$('form').trigger('submit');
	   
	   //triggerHandler提交后没有跳转，默认行为被阻止
	   //$('form').triggerHandler('submit');
	   
	   $('form').submit(function(e){
	       e.preventDefault();
	   }).trigger('submit');
	   
	   
	                                                       //如果有多个对象，trigger执行所有的，而triggerHandler只执行一个
	    $('input').click(function(){
	        alert('我将要使用模拟用户来触发事件');
	   }).trigger('click');
	   
	   $('input').click(function(){
	        alert('我将要使用模拟用户来触发事件');
	   }).triggerHandler('click');
	   
	    $('input').click(function(){
	         alert('我将要使用模拟用户来触发事件');
	   }).trigger('click').css('color','red');                 //trigger返回jQuery对象，可以连缀
	   
	    alert($('input').click(function(){
	         alert('我将要使用模拟用户来触发事件');
			 return 123;
	   }).triggerHandler('click'));                         //triggerHandler返回return值，或undefined
	   
	    $('div').bind('myEvent',function(){
	          alert('自定义事件!');
	  });
	 $('.d3').trigger('myEvent');                     //会冒泡
	 
	  $('div').bind('myEvent',function(){
	          alert('自定义事件!');
	  });
	 $('.d3').triggerHandler('myEvent');                     //不会冒泡
	 
	 
	  $('input').bind('click.abc',function(){             //命名空间，有多个相同事件，方便移除该事件
	        alert('abc');
	   });
	   
	   $('input').bind('click.xyz',function(){              //命名空间
	        alert('xyz');
	   });
	   
	    $('input').bind('mouseover.abc',function(){             //命名空间
	        alert('abc');
	   });
	   //$('input').unbind('click.abc');
	   //$('input').unbind('.abc');
	   //$('input').trigger('click.abc');
       */
 
	   
});