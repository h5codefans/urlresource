$(function(){
   
    $.extend($.fn.validatebox.defaults.rules,{
	     minLength:{
		     validator:function(value,param){
			      return value.length>=param[0];
			 },
			 message:'请输入不小于{0}的字符',
		 }
	
	});
    $('#eamil').validatebox({
	     required:true,
		 validType:'email',
		 validType:'minLength[5]',
		 //validType:'url',
		 //validType:'length[2,10]',
		 //validType:'remote["content.php","abc"]',
		 //validType:['email','length[5,10]'],
		 //delay:1000,
		 //missingMessage:'请输入内容',
		 //invalidMessage:'您输入的电子邮件不合法',
		 tipPosition:'right',
		 //deltaX:100,
		 //novalidate:true,   //关闭验证
	});
	
	//console.log($('#eamil').validatebox('options'));
	//$('#email').validatebox('destroy');
	
    $(document).click(function(){
	  //console.log($('#eamil').validatebox('validate'));
	  //console.log($('#eamil').validatebox('isValid'));
	});
	
	//$('#eamil').validatebox('disableValidation');
	//$('#eamil').validatebox('enableValidation');
});