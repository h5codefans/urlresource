$(function(){
   
   $('#box').datagrid({
        width:500,
		//url:'content.json',
		url:'user.php',
		title:'用户列表',
		iconCls:'icon-search',
		columns:[[
		   {
		      field:'user',    //对应数据库中的字段
		      title:'账号',		
              width:200,	
              sortable:true,			  
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