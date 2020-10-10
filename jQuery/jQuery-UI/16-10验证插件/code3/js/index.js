$(function(){
     
	
     $('#reg').validate({
	        //禁止读取title
	       //ignoreTilte:true,
		   submitHandler:function(form){
				alert('验证成功，准备提交！');
		   },
           /*
	       rules:{
		      user:{
			       required:true,
				   minlength:2,
				   //remote:'user.php'
			  },
			  pass:{
			       required:true,
				   minlength:6,
				   remote:{
				        url:'user.php',
						type:'post',
						dataType:'json',
						data:{
						  user:function(){
						        return $('#user').val();
						  }
						},
				   }
			  },
			},
		   messages:{
		       user:{
			       required:'账号不得为空！',
				   inlength:jQuery.format('账号不得小于{0}位!'),
				   //remote:'账号被占用！',
			   },
			   pass:{
			         required:'密码不得为空！',
					 minlength:'密码不得小于6位！',
					 remote:'账号或密码不正确!',
			   }
		   }
		   */
	    });
		//alert($('#reg').valid());
		$('#user').rules('add',{
		    required:true,
			minlength:2,
			messages:{
			       required:'账号不得为空！',
				   minlength:jQuery.format('账号不得小于{0}位!'),
			}
		});
		
		//$('#user').rules('remove');
		$('#user').rules('remove','minlength max  min');
		$('#code').rules('add',{
		    required:true,
			code:true,
			messages:{
			       required:'邮编不得为空！',
				   minlength:jQuery.format('账号不得小于{0}位!'),
			}
		});
		
		//添加自定义验证
		$.validator.addMethod('code',function(value,element){
		    var tel=/^[0-9]{6}$/
			return this.optional(element) || (tel.test(value));
		},'请输入正确的邮政编码');
});