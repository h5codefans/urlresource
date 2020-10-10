$(function(){
   
   $('#box').datagrid({
        width:500,
		//url:'content.json',
		url:'user.php',
		title:'用户列表',
		iconCls:'icon-search',
		striped:true,
		nowrap:true,
		rownumbers:true,
		singleSelect:true,
		showHeader:true,
		showFooter:false,
		//loadMsg:'努力展开中...',
		//fitColumns:true,
		//scrollbarSize:30,
		rowStyler:function(index,row){
		    if(row.user=='dog'){
			     //这里返回的也可以是css的class名称
			     return 'background-color:orange';
			}
		},
		columns:[[
		   {
		      field:'user',    //对应数据库中的字段
		      title:'账号',		
             // width:100,	
              sortable:true,	
              //fixed:true,		
              //align:'center'	
			  //halign:'center',//标题居中，内容不居中
			  //resizeable:false,
			  //hidden:true,
			  formatter:function(value,row,index){
			     return '['+value+']';
			  },
			  styler:function(value,row,index){
			     if(value=='cat'){
				     return 'background-color:orange';
				 }
			  },
		   },
		    {
			  field:'email',
		      title:'邮件',
			  sortable:true,
			  //sorter:function(a,b){
			  //    console.log(a+'|'+b);
			  //},
		   },
		    {
			  field:'date',   
		      title:'注册时间',  
              sortable:true,  			  
		   },
		]],
		data:[
		  {
		       user:'手工用户',
			   email:'手工邮件',
			   date:'2014-10-11',
			   
		  },
		],
		pagination:true,
		pageSize:10,
		pageList:[10,20,30],
		pageNumber:1,
		pagePosition:'bottom',
		sortName:'date',
		sortOrder:'DESC',
		remoteSort:false,
		//multiSort:true,
		//method:'get',
		queryParams:{
		    id:1,
		},
   });
  
});