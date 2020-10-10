$(function(){
   //alert($('#box').html());
   //alert($('#box').text());    //text获取的是文本，有html会自动被清理
   //$('#box').html('<em>www.li.cc</em>');  //替换html内容，有html会自动解析
   //$('#box').text('<em>www.li.cc</em>');     //替换文本内容，有html会自动转义
   //alert($('input').val());               //获取input的value值
   //$('input').val('北风网');   
	//alert($('input').val());          //将input中的val值设置为"北风网"
	//$('input').val('女');    
	
	//$('input').val(['男','女','编程']);//选中value值分别为,男,女,编程，复选框标签标签
	
	//alert($('#box').attr('id'));
	
	//$('div').attr('title','我是域名');
	/*
	$('div').attr({
	
	      'title':'我是域名',
		  'class':'red',    //class不建议用attr来设置，后面有功能更强大和更丰富的方法来替代
		  'data':'123'
	})
	*/
	
	//$('div').attr('title',function(){
	//    return '我是域名';
	//});
	
	//$('div').attr('title',function(index,value){
	 //   return '原来的title是:'+value+',现在的title是:我是'+(index+1)+'号域名';
	//});
	
	//$('div').html($('div').html()+'<em>www.li.cc</em>'); 
	
	//$('div').html(function(index,value){
	  //  return value+'<em>www.li.cc</em>'; 
	//});
	
	//$('div').removeAttr('title');
	
	//$('div').removeAttr(function(){   //不可以传递function
	 //    return 'title';
	//});

});