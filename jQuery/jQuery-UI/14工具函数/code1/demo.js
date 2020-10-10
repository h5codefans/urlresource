$(function(){

     /*
     var str='                          jQuery         ';
	 alert(str);
	 alert($.trim(str));
	 
	 var arr=['张三','李四','王五','马六'];
	 $.each(arr,function(index,value){
	      $('#box').html($('#box').html() + (index+1) + '.' + value + '<br/>');
	 });
	 
	 $.each($.ajax(),function(name,fn){
	      $('#box').html($('#box').html()+name+'<br/>');
	 });
	 
	 var arr=[4,2,6,9,11,25,38,59];
	 var arrGrep=$.grep(arr,function(element,index){           //$.grep()数据筛选
	      return index<5&&element<6;                           //按道理返回的是布尔值，这里返回的是数组
	 });     
      alert(arrGrep);	 
	  
	   var arr=[4,2,6,9,11,25,38,59];
	   var arrMap=$.map(arr,function(element,index){           //$.map()修改数据
	  //   return index<5&&element<6;             //这里就是按布尔值返回的
	  
            if(index<5&&element<6)
			{
			   return element+1;
			}
      });	  
      alert(arrMap);
	  
	   var arr=[4,2,6,9,11,25,38,59];
	    alert($.inArray(11,arr));             //查找元素下标
	
	
	   var arr=[4,2,6,9,11,25,38,59];
	   var arr2=[200,300];
	   alert($.merge(arr,arr2));                //合并两个数组
	   
	   var divs=$('div').get();
	  divs=divs.concat($('.box').get());
	  alert($(divs).size());
	  $.unique(divs);                            //删除删除重复的DOM元素
	  alert($(divs).size());
		  
	 */
	 
	 alert($('li').toArray().length);             .toArray()合并多个DOM元素组成数组
	 alert($($('li').toArray()).size());
	 
		  
});