$(function(){
   
   $('#box').combogrid({
       loadMsg:'数据加载中...',
       panelWidth:600,
	   idField:'id',
	   textField:'user',
	   url:'user.php',
	   fitColumns:true,
	   multiple:true,
	   //mode:'remote',
	   filter: function(q, row){
			var opts = $(this).combogrid('options');
			return row[opts.textField].indexOf(q)>= 0;
		},
	   columns:[[
			 {
				field:'id',
				title:'编号',
				width:100,
				checkbox:true,
			 },
			 {
				field:'user',
				title:'账号',
				width:100,
			 },
			 {
				field:'email',
				title:'邮箱',
				width:100,
			 },
			 {
				field:'date',
				title:'创建时间',
				width:100,
			 }
		]],
   });
});

function abc(){
  //$('#box').combogrid('clear');
  //$('#box').combogrid('setValue',23);
  $('#box').combogrid('setValues',[23,24]);//23,24为id值
  
}