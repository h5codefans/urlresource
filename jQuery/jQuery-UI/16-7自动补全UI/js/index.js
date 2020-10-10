$(function(){
     
     $('#search_button').button({
		  icons:{
		     primary:'ui-icon-search',
			 
		  },
		  
	 });
	
	
	 $('#reg').dialog({
	       autoOpen:true,
		   modal:true,
		   resizable:false,
		   width:320,
		   height:340,
	       buttons:{
		       '提交':function(){
			   
			   }
		   }
		    
	 });
	 $('#reg').buttonset();
	 $('#date').datepicker();
	 
	 $('#reg input[title]').tooltip({
	      
		 show:false,
		 hide:false,
		 position:{
		        my:'left center',
			    at:'right+5 center'
		 }, 
	 });
	 
	 var host=['aa','aaaa','aaaaaa','bb'];
	 $('#email').autocomplete({
	       source:host,
		   //disabled:true,
		   minLength:0,
		   //delay:0,
		   //autoFocus:true,
		   //position:{
		    //    my:'left center',
		    //		at:'right center',
		  // }
		   //focus:function(e,ui){
		     //alert('获取焦点！');
			 //alert(ui.item.label);
			  //ui.item.value=123;
		  //},
		  //select:function(){
		   //   alert('选定一个项目！');
		  //},
		  //change:function(){
		    //  alert('改变！');
		  //},
		 // search:function(){
		  //     alert('收索完毕!');
		 // },
		    //response:function(e,ui){
		    //    alert('收索完毕！');
			//	 alert(ui.content[1].label);
			//}
			
	 });
	 $('#email').autocomplete('search','');
	 $('#email').on('autocompleteopen',function(){
	       alert('自动补全打开！');
	 });
  });