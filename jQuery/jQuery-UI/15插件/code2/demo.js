$(function(){
     
     $('.list').eq(0).nav('orange');
  
     $('input').click(function(){
	   //普通情况下，this表示原生的DOM
	     alert(this);
		 
		 $(this).val('按钮');
	 });
  });