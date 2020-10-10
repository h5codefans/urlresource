$(function(){
   //alert($('div').css('color'));  //获取颜色
   //$('div').css('color','red');     //设置颜色
   
   /*
   var box=$('div').css(['color','width','height']);
   
   for(var i in box)     对象数组用遍历for in
   {
      alert(i+':'+box[i]);
   }
   
   $.each(box,function(attr,value){   //jQuery遍历
      alert(attr+':'+value);
   
   });//jQuery遍历
  
   //alert($('div')[0]);
   
   $('div').each(function(index,element){
      alert(index+':'+element);
   });
    
	//$('div').css('color','blue').css('background-color','#eee').css('width','200px');
	$('div').css({
	   'color':'blue',
	   'background-color':'#eee',
	   'width':'200px',
	   'height':'30px'
	});
	
	
	
	$('div').css('width',function(index,value){
	    return parseInt(value)-500+'px';
	})
	
	
	//$('div').addClass('red');
	//$('div').addClass('red bg size');
	//$('div').removeClass('bg');
	
	$('div').click(function(){
	   $(this).toggleClass('green');    //两个样式的切换，默认样式和指定样式的切换
	});
	
	
	var count=0;
	$('div').click(function(){
	   $(this).toggleClass('green size',count++%2==0);    //结果true和false(返回默认样式)
	});
	
	
	var count=0;
	$('div').click(function(){
	//这里只是click的局部，而又是toggle的全局
	   $(this).toggleClass('red'); 
	   if($(this).hasClass('red')){
	      $(this).removeClass('green');
	   }
	   else{
	       $(this).toggleClass('green');
	   }
	});
	
	
	$('div').click(function(){
	    $(this).toggleClass(function(){
		//局部
		   if($(this).hasClass('red')){
		      $(this).removeClass('red');
			  return 'green';
		   }else{
		        $(this).removeClass('green');
			    return 'red';
		   }
		});
	});
	
	
	
	var count=0;
	$(document).click(function(){
	    $('div').toggleClass(function(index,className,switchBool){
		alert(index+':'+className+':'+switchBool);
		//局部
		   if($(this).hasClass('red')){
		      $(this).removeClass('red');
			  return 'green';
		   }else{
		        $(this).removeClass('green');
			    return 'red';
		   }
		},count++%2==0);
	});
      */



});

