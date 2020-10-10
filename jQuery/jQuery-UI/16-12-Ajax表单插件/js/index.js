$(function(){
     
	 //ajax的success:function(){}就是这里的function方法
     //$('#reg').ajaxForm(function(){
	  //      alert('提交成功!');
	 //});
	 
	 //js里用了submit()这个方法是，采用ajaxSubmit()方法提交
	 //ajaxForm()自动阻止了默认提交
	 /*
	 $('#reg').submit(function(){
	         $(this).ajaxSubmit({
			      
				  target:'#box',
			      url:'test1.php',
				  type:'GET',
				  datatype:null,
				  //clearForm:true,
				  //resetForm:true,
				  data:{
				      aaa:'bbb',
				  },
				  beforeSubmit:function(formData,jqForm,options){
				         //提交之前执行，一般用于数据验证
						  //alert(options.url);
						  //alert(jqForm.html());
						  //alert(formData[0].name);
						  //alert(formData[0].value);
						 //如果数据验证不合法，就返回false，不让提交，返回true让提交
						 return true;
				  },
			      success:function(responseText,statusText){
				         alert(responseText + statusText);
				   //    alert('成功提交！');
				  },
				  error:function(event,errorText,errorType){
				       alert(errorText+','+errorType);
				  }
			   
			});
	         return false;                 //submit()方法没有阻止默认提交，需要自行阻止
	 });
	  */
        //alert($('#reg').formSerialize());	  
		//alert($('#reg #user').fieldSerialize());	
		//alert($('#reg #user').fieldValue());	
		//alert($('#reg').resetForm());	
		alert($('#reg #user').clearFields());
		
	 
});