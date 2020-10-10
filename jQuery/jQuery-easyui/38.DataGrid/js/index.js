$(function(){
   
   //扩展 dateTimeBox
	$.extend($.fn.datagrid.defaults.editors, {
		datetimebox : {
		init: function(container, options){
		    var input = $('<input type="text">').appendTo(container);
		    options.editable = false;
		    input.datetimebox(options);
		    return input;
		},
		getValue: function(target){
		    return $(target).datetimebox('getValue');
		},
		setValue: function(target, value){
		    $(target).datetimebox('setValue', value);
		},
		resize: function(target, width){
		    $(target).datetimebox('resize', width);
		},
		destroy : function (target) {
		    $(target).datetimebox('destroy');
		},
		}
	});
   obj={
      editRow:false,
      search:function(){
	     $('#box').datagrid('load',{
		     user:$.trim($('input[name="user"]').val()),
			 date_from:$('input[name="date_from"]').val(),
			 date_to:$('input[name="date_to"]').val(),
		 });
	  },
	  add:function(){
	      $('#save,#redo').show();
	    /*
	      //当前页行结尾添加
	      $('#box').datagrid('appendRow',{
		      user:'bnbbs',
			  email:'bnbbs@163.com',
			  date:'2015-11-11',
		  });
		*/
	
		if(!this.editRow){
		   //添加一行
		   $('#box').datagrid('insertRow',{
		       index:0,
			   row:{
			       /*
			       user:'bnbbs',
			       email:'bnbbs@163.com',
			       date:'2015-11-11',
				   */
				   },
		   });
		   
		}
		  //将第一行设置为可编辑状态
		  $('#box').datagrid('beginEdit',0);
		  this.editRow=true;
	  },
	  save:function(){
	     //这两句不能放在这里，应该是保存成功后，在执行
	     //$('#save,#redo').hide();
	     //this.editRow=false;
		 //将第一行设置为结束编辑状态
		  $('#box').datagrid('endEdit',0);
	  },
	  redo:function(){
	     $('#save,#redo').hide();
	     this.editRow=false;
	     $('#box').datagrid('rejectChanges');
	  },
   };
   $('#box').datagrid({
        width:600,
		//url:'content.json',
		url:'user.php',
		title:'用户列表',
		iconCls:'icon-search',
		striped:true,
		nowrap:true,
		rownumbers:true,
		singleSelect:true,	
		fitColumns:true,
		columns:[[
		   {
		      field:'user',    //对应数据库中的字段
		      title:'账号',		
              sortable:true,	
			  width:100,
			  editor:{
			      type:'validatebox',
				  options:{
				     required:true,
				  },
			  },
		   },
		    {
			  field:'email',
		      title:'邮件',
			  sortable:true,
			  width:100,
			  editor:{
			      type:'validatebox',
				  options:{
				     required:true,
					 validType:'email',
				  },
			  },
		   },
		    {
			  field:'date',   
		      title:'注册时间',  
              sortable:true,  		
              width:100,
              editor:{
			      type:'datetimebox',
				  options:{
				     required:true,
				  },
			  },			  
		   },
		]],
		toolbar:'#tb',
		pagination:true,
		pageSize:10,
		pageList:[10,20,30],
		pageNumber:1,
		sortName:'date',
		sortOrder:'DESC',
        onAfterEdit:function(rowIndex,rowData,changes){
		    $('#save,#redo').hide();
	        obj.editRow=false;
		    console.log(rowData);
		},
   });
  
});