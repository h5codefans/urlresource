$(function () {

	$('#search_button').button({
		icons : {
			primary : 'ui-icon-search',
		},
	});
	
	$('#member,#logout').hide();
	if($.cookie('user')){
	    $('#member,#logout').show();
		$('#reg_a,#login_a').hide();
		$('#member').html($.cookie('user'));
	}else{
	    $('#member,#logout').hide();
		$('#reg_a,#login_a').show();
	}
	$('#loading').dialog({
		autoOpen : false,
		modal : true,
		closeOnEscape : false,
		resizable : false,
		draggable : false,
		width : 180,
		height : 50,
	}).parent().parent().find('.ui-widget-header').hide();
	
	$('#reg_a').click(function () {
		$('#reg').dialog('open');
	});
    $('#logout').click(function(){
	      $.removeCookie('user');
		  window.location.href='/jq11/';
	});
	$('#reg').dialog({
		autoOpen : false,
		modal : true,
		resizable : false,
		width :320,
		height :340,
		buttons : {
			'提交' : function () {
				$(this).submit();
			}
		}
	}).buttonset().validate({
	
		submitHandler : function (form) {
			$(form).ajaxSubmit({
				url : 'add.php',
				type : 'POST',
				beforeSubmit : function (formData, jqForm, options) {
					$('#loading').dialog('open');
					$('#reg').dialog('widget').find('button').eq(1).button('disable');
				},
				success : function (responseText, statusText) {
					if (responseText) {
						$('#reg').dialog('widget').find('button').eq(1).button('enable');
						$('#loading').css('background', 'url(img/success.gif) no-repeat 20px center').html('数据新增成功...');
						$.cookie('user',$('#user').val());
						setTimeout(function () {
							$('#loading').dialog('close');
							$('#reg').dialog('close');
							$('#reg').resetForm();
							$('#reg span.star').html('*').removeClass('succ');
							$('#loading').css('background', 'url(img/loading.gif) no-repeat 20px center').html('数据交互中...');
						    $('#member,#logout').show();
		                    $('#reg_a,#login_a').hide();
		                    $('#member').html($.cookie('user'));
						}, 1000);
					}
				},
			});
		},
	
		showErrors : function (errorMap, errorList) {
			var errors = this.numberOfInvalids();
			
			if (errors > 0) {
				$('#reg').dialog('option', 'height', errors * 20 + 340);
			} else {
				$('#reg').dialog('option', 'height', 340);
			}
			
			this.defaultShowErrors();
		},
		
		highlight : function (element, errorClass) {
			$(element).css('border', '1px solid #630');
			$(element).parent().find('span').html('*').removeClass('succ');
		},
		
		unhighlight : function (element, errorClass) {
			$(element).css('border', '1px solid #ccc');
			$(element).parent().find('span').html('&nbsp;').addClass('succ');
		},
	
		errorLabelContainer : 'ol.reg_error',
		wrapper : 'li',
	
		rules : {
			user : {
				required : true,
				minlength : 2,
				remote:{
				   url:'is_user.php',
				   type:'POST',
				}
			},
			pass : {
				required : true,
				minlength : 6,
			},
			email : {
				required : true,
				email : true
			},
			date : {
				date : true,
			},
		},
		messages : {
			user : {
				required : '帐号不得为空！',
				minlength : jQuery.format('帐号不得小于{0}位！'),
				remote:'账号被占用!',
			},
			pass : {
				required : '密码不得为空！',
				minlength : jQuery.format('密码不得小于{0}位！'),
			},
			email : {
				required : '邮箱不得为空！',
				minlength : '请输入正确的邮箱地址！',
			},	
		}
	});
	
	$('#date').datepicker({
		changeMonth : true,
		changeYear : true,
		yearSuffix : '',
		maxDate : 0,
		yearRange : '1950:2020',

	});
		
	
	$('#email').autocomplete({
		delay : 0,
		autoFocus : true,
		source : function (request, response) {
			//获取用户输入的内容
			//alert(request.term);
			//绑定数据源的
			//response(['aa', 'aaaa', 'aaaaaa', 'bb']);
			
			var hosts = ['qq.com', '163.com', '263.com', 'sina.com.cn','gmail.com', 'hotmail.com'],
				term = request.term,		//获取用户输入的内容
				name = term,				//邮箱的用户名
				host = '',					//邮箱的域名
				ix = term.indexOf('@'),		//@的位置
				result = [];				//最终呈现的邮箱列表
				
				
			result.push(term);
			
			//当有@的时候，重新分别用户名和域名
			if (ix > -1) {
				name = term.slice(0, ix);
				host = term.slice(ix + 1);
			}
			
			if (name) {
				//如果用户已经输入@和后面的域名，
				//那么就找到相关的域名提示，比如bnbbs@1，就提示bnbbs@163.com
				//如果用户还没有输入@或后面的域名，
				//那么就把所有的域名都提示出来
				
				var findedHosts = (host ? $.grep(hosts, function (value, index) {
						return value.indexOf(host) > -1
					}) : hosts),
					findedResult = $.map(findedHosts, function (value, index) {
					return name + '@' + value;
				});
				
				result = result.concat(findedResult);
			}
			
			response(result);
		},	
	});
	

		$('#login_a').click(function () {
		$('#login').dialog('open');
	});
	$('#login').dialog({
		autoOpen : false,
		modal : true,
		resizable : false,
		width :320,
		height :240,
		buttons : {
			'登录' : function () {
			   
				$(this).submit();
			}
		}
	}).validate({
	
		submitHandler : function (form) {
			$(form).ajaxSubmit({
				url : 'login.php',
				type : 'POST',
				beforeSubmit : function (formData, jqForm, options) {
					$('#loading').dialog('open');
					$('#login').dialog('widget').find('button').eq(1).button('disable');
				},
				success : function (responseText, statusText) {
					if (responseText) {
						$('#login').dialog('widget').find('button').eq(1).button('enable');
						$('#loading').css('background', 'url(img/success.gif) no-repeat 20px center').html('登录成功...');
						if($('#expires').is(':checked')){
						        $.cookie('user',$('#login_user').val(),{
								      expires:7,
								});
							   
							}else{
							   $.cookie('user',$('#login_user').val());
							}
						
						setTimeout(function () {
							$('#loading').dialog('close');
							$('#login').dialog('close');
							$('#login').resetForm();
							$('#login span.star').html('*').removeClass('succ');
							$('#loading').css('background', 'url(img/loading.gif) no-repeat 20px center').html('数据交互中...');
						    $('#member,#logout').show();
		                    $('#reg_a,#login_a').hide();
		                    $('#member').html($.cookie('user'));
						}, 1000);
					}
				},
			});
		},
	
		showErrors : function (errorMap, errorList) {
			var errors = this.numberOfInvalids();
			
			if (errors > 0) {
				$('#login').dialog('option', 'height', errors * 20 + 240);
			} else {
				$('#login').dialog('option', 'height', 240);
			}
			
			this.defaultShowErrors();
		},
		
		highlight : function (element, errorClass) {
			$(element).css('border', '1px solid #630');
			$(element).parent().find('span').html('*').removeClass('succ');
		},
		
		unhighlight : function (element, errorClass) {
			$(element).css('border', '1px solid #ccc');
			$(element).parent().find('span').html('&nbsp;').addClass('succ');
		},
	
		errorLabelContainer : 'ol.login_error',
		wrapper : 'li',
	
		rules : {
			login_user : {
				required : true,
				minlength : 2,
			},
			login_pass : {
				required : true,
				minlength : 6,
				remote:{
				    url:'login.php',
					type:'POST',
					data:{
					    login_user:function(){
						    return $('#login_user').val();
						},
					},
				},
			},
			
		},
		messages : {
			login_user : {
				required : '帐号不得为空！',
				minlength : jQuery.format('帐号不得小于{0}位！'),
				
			},
			login_pass : {
				required : '密码不得为空！',
				minlength : jQuery.format('密码不得小于{0}位！'),
				remote:'账号或密码不正确!',
			},
		}
	});
	
	$('#tabs').tabs({
	
	     //collapsible:true,
		 //disabled:[0,1],
		 //disabled:true,
		 //event:'mouseover',
		 //active:1,         //默认打开第二个tab
  		 //active:false,    //打开collapsible,active为false折叠
		 //heightStyle:'content',
		 //heightStyle:'auto',
		// heightStyle:'fill',
		
		//show:true,
		//hide:true,
		
		create:function(event,ui){
		     //alert('创建tab时触发！');
			// alert($(ui.tab.get()).html());
			 //alert($(ui.panel.get()).html());
		},
		
		activate:function(event,ui){
		    //alert('切换到另一个活动卡后触发');
			//alert($(ui.oldTab.get()).html());
			//alert($(ui.newTab.get()).html());
			//alert($(ui.oldPanel.get()).html());
			//alert($(ui.newPanel.get()).html());
		},
		
		beforeActivate:function(envet,ui){
		   //alert('切换到另一个活动卡之前触发！');
		   //alert($(ui.oldTab.get()).html());
			//alert($(ui.newTab.get()).html());
			//alert($(ui.oldPanel.get()).html());
			//alert($(ui.newPanel.get()).html());
		},
		
		load:function(event,ui){
		   //alert('ajax远程加载文档之后触发!');
		  // alert($(ui.tab.get()).html());
		 //alert($(ui.panel.get()).html());
		},
		
		beforeLoad:function(event,ui){
		   //alert('ajax远程加载文档之前触发!');
		  //alert($(ui.tab.get()).html());
		 // alert($(ui.panel.get()).html());
		 
		 //ui.jqXHR.success(function(response){
		 //     alert(response);
		 //});
		 
		 //ui.ajaxSettings.url='tab3.html';
		},
		
		
	});
	//$('#tabs').tabs('disable');
	//$('#tabs').tabs('disable',0);
	//$('#tabs').tabs('enable',0);
	//$('#tabs').tabs('enable');
	
	$('#button').click(function(){
	     $('#tabs').tabs('load',0);
	});
	
	$('#tabs').on('tabsload',function(event,ui){
	     alert('ajax远程加载文档后触发！');
	});
});


























