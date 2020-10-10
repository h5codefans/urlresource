$(function(){
   
    /*
     var arr=[1,2,3];
	 alert($.isArray(arr));
	 
	  var fn=function(){};
	 alert($.isFunction(fn));
	 
	 var obj={};
	alert($.isEmptyObject(obj));
	
	var obj={};
	obj=new Object();
	alert($.isPlainObject(obj));     //判断是否为纯粹对象
	
	alert($.contains($('#box').get(0),$('#pox').get(0)));    //pox是包含在box的节点
	
	var arr=[1,2,3];
	var obj={};
	alert($.type(obj));
	
	var num=1.23;
	alert($.isNumeric(num));
	
	 var win=window;
	 alert($.isWindow(win));
	 
	 	var obj={
	    name:'Lee',
		age:100,
		
	};
	alert($.param(obj));     //url字符串键值对
	
	/alert($.browser.mozilla+ ':' + $.browser.version);
    
	 if($.support.opacity==true){
	      $('#box').css('opacity',0.5);
	 }else{
	      $('#box').css('filter','alpha(opacity=50)');
	 }
	
	 */
	 var obj={
	     name:'Lee',
		 test:function(){
		    //var _this=obj;
		    //alert(_this.name);
			alert(this.name);
		 }
	 };
	 obj.test();
	 $('#box').click($.proxy(obj,'test'));    //$.proxy()方法解决this指向问题
});