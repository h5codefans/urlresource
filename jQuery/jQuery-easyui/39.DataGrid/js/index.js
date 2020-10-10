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
      editRow:undefined,
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
	
		if(this.editRow==undefined){
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
		  this.editRow=0;
	  },
	  save:function(){
	     //这两句不能放在这里，应该是保存成功后，在执行
	     //$('#save,#redo').hide();
	     //this.editRow=false;
		 //将第一行设置为结束编辑状态
		  $('#box').datagrid('endEdit',this.editRow);
	  },
	  redo:function(){
	     $('#save,#redo').hide();
	     this.editRow=undefined;
	     $('#box').datagrid('rejectChanges');
	  },
	  edit:function(){
	    var rows=$('#box').datagrid('getSelections');
		if(rows.length==1){
	    if(this.editRow!=undefined){
			  $('#box').datagrid('endEdit',this.editRow);   //执行完endEdit后保存数据，自动执行onAfterEdit
			}
		 if(this.editRow==undefined){
		      var index=$('#box').datagrid('getRowIndex',rows[0]);
			  $('#save,#redo').show();
		      $('#box').datagrid('beginEdit',index);
			  this.editRow=index; 
			  $('#box').datagrid('unselectRow',index);
			}
		}else{
		    $.messager.alert('警告','修改必须或只能选择一行','warning');
		}
	  },
	  remove:function(){
	     var rows=$('#box').datagrid('getSelections');
		 if(rows.length>0){
		    $.messager.confirm('确定操作','您真的要删除所选的记录吗?',function(flag){
			   if(flag){
			     var ids=[];
				 for(var i=0;i<rows.length;i++){
				    ids.push(rows[i].id);
				 }
				 console.log(ids.join(','));
			   }
			
			});
		 }else{
		    $.messager.alert('提示','请选择删除的记录','info');
		 }
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
		//singleSelect:true,	
		fitColumns:true,
		columns:[[
		   {
		      field:'id',
		      title:'编号',
			  sortable:true,
			  width:100,
			  checkbox:true,
		   },
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
		onDblClickRow:function(rowIndex,rowData){
		    if(obj.editRow!=undefined){
			  $('#box').datagrid('endEdit',obj.editRow);   //执行完endEdit后保存数据，自动执行onAfterEdit
			}
		    if(obj.editRow==undefined){
			$('#save,#redo').show();
		      $('#box').datagrid('beginEdit',rowIndex);
			  obj.editRow=rowIndex; 
			}
		},
        onAfterEdit:function(rowIndex,rowData,changes){
		    $('#save,#redo').hide();
	        obj.editRow=undefined;
		    console.log(rowData);
		},
   });
  
});