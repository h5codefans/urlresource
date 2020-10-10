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
	 //$('#reg input[title]').tooltip();
	 $('[title]').tooltip({
	      //disabled:true,
		  //content:'改变title',
		  items:'input' ,           //过滤，只有input可以用title
		 // tooltipClass:'a',
		 show:false,
		 hide:false,
		 //track:true,
		 position:{
		        my:'left center',
			    at:'right+5 center'
		 },
		 //open:function(e,ui){
		 //    alert('打开是触发!' + ui.tooltip);
		 //}
		 
	 });
	// $('#pass').tooltip('open');
	$('#user').on('tooltipopen',function(){
	      alert('打开是触发!');
	});
  });