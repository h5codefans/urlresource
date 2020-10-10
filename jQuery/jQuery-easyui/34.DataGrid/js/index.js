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
		   },
		    {
			  field:'email',
		      title:'邮件',
		   },
		    {
			  field:'date',   
		      title:'注册时间',    			  
		   },
		]],
		pagination:true,
		pageSize:2,
		pageList:[1,2,3,4,5],
		pageNumber:2,
		pagePosition:'bottom',
   });
  
});