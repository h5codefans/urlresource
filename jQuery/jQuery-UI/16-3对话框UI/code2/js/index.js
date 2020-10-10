$(function(){
     
     $('#search_button').button();
	 /*
	 $('#reg').dialog({
	      focus:function(e,ui){
		     alert('注册!');
		  }
	 });
	  $('#login').dialog({
	      focus:function(e,ui){
		     alert('登录!');
		  }
	 });
	 */
	  $('#reg').dialog({
	    /*
	      create:function(e,ui){
		     alert('创建!');
		  },
		  autoOpen:false,
		  
		  
		  open:function(e,ui){
		     alert('打开！');
		  },
		  autoOpen:false,
		  
		  close:function(e,ui){
		     alert('关闭！');
		  },
		  
		  beforeClose:function(){               //这个事件可以做一些关闭确认的工作
		       alert('将要关闭!');
			   return false;
		  },
		  
		   drag:function(){
		       alert('每次移动都执行！');
		  },
		  
		   drag:function(e,ui){
		       alert('top:'+ui.position.top+'\n' + 'left:' + ui.position.left);
		  }
		  
		  dragStart:function(e,ui){
		       alert('top:'+ui.position.top+'\n' + 'left:' + ui.position.left);
		  }
		  
		  dragStop:function(e,ui){
		       alert('top:'+ui.position.top+'\n' + 'left:' + ui.position.left);
		  }
		  
		   resize:function(){
		       alert('每次调整到小执行');
		  }
		  
		   resize:function(e,ui){
		       alert('width:'+ ui.size.width + '\n' + 'height:' +ui.size.height);
		  }
		  
		  resizeStop:function(e,ui){
		       alert('width:'+ ui.size.width + '\n' + 'height:' +ui.size.height);
		  },
		  */
		  
		  autoOpen:true
	 });
	 $('#reg_a').click(function(){
	      $('#reg').dialog('open');
	 });
	 
	 $('#reg').click(function(){
	      //$('#reg').dialog('close');
		  //$('#reg').dialog('destroy');
	 });
	 //alert($('#reg').dialog('isOpen'));
	 //$('#reg').dialog('open');
	 //$('#reg').dialog('widget').css('font-size','50px');
	 
	 //alert($('#reg').dialog('option','title'));
	 //alert($('#reg').dialog('option','autoOpen'));
	 //$('#reg').dialog('option','title','111');
	 
	 $('#reg').on('dialogclose',function(){
	        alert('关闭!');
	 });
  });