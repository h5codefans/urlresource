$(function(){
     
     $('#reg').validate({
	 
	       rules:{
		      user:{
			       required:true,
				   minlength:2,
			  },
			  email:{
			      email:true,
			  },
			  url:{               //url表示name值
			       url:true,      //这的url表示规则
			  },
			  date:{
			        date:true,
			  },
			  dateISO:{
			       dateISO:true,
			  },
			  number:{
			      number:true,
			  },
			  digits:{
			      digits:true,
			  },
			  creditcard:{
			      creditcard:true,
			  },
			  notpass:{
			       equalTo:'#pass',
			  },
			  min:{
			      min:5,
			  },
			  range:{
			      range:[5,10],
			  },
			  rangelength:{
			       rangelength:[5,10],
			  },
		   },
		   messages:{
		       user:{
			       required:'账号不得为空！',
				   minlength:'账号不得小于两位!'
			   },
		   }
	 });
	 
	 
  });