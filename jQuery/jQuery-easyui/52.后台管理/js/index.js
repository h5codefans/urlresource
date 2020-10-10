$(function(){
      //登录界面
      $('#login').dialog({
	      title:'登录后台',
		  width:300,
		  height:180,
		  modal:true,
		  iconCls:'icon-login',
	      buttons:'#btn',
	  });
	  //管理员账号验证
	  $('#manager').validatebox({
	       required:true,
		   missingMessage:'请输入管理账号',
		   invalidMessage:'管理员账号不得为空',
	  });
	  //管理员密码验证
	  $('#password').validatebox({
	       required:true,
		   validType:'length[6,30]',
		   missingMessage:'请输入管理密码',
		   invalidMessage:'管理员密码不得少于6位',
	  });
	   //加载是判断验证
	   
	   	if(!$('#manager').validatebox('isValid')){
			   $('#manager').focus();
			}else if(!$('#password').validatebox('isValid')){
			    $('#password').focus();
			}

	   //点击登录
	   $('#btn a').click(function(){
	      
	        if(!$('#manager').validatebox('isValid')){
			   $('#manager').focus();
			}else if(!$('#password').validatebox('isValid')){
			    $('#password').focus();
			}else{
			    alert('提交中...');
			}
	   });
});
