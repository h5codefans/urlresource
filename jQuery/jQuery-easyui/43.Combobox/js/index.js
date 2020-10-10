$(function(){
   
    $('#box').combobox({
	   valueField:'id',
	   textField:'user',
	   //url:'content.json',
	   url:'user.php',
	   groupField:'sex',
	   groupFormatter:function(group){
	       return '['+group+']';
	   },
	   filter: function(q, row){
			var opts = $(this).combobox('options');
			return row[opts.textField].indexOf(q) >= 0;
		},
		formatter:function(row){
		    var opts = $(this).combobox('options');
			return '['+row[opts.textField]+']';
		},
		/*
		onSelect:function(record){
		   alert('选择一个项目时触发');
		   console.log(record);
		},
		*/
		   onUnselect:function(record){
		   alert('取消一个项目时触发');
		   console.log(record);
		},
	   //'mode':'remote',
	   /*
	   data:[
				{
				   "id":1,
				   "user":"蜡笔小新",
				   "email":"xiaoxi@163.com",
				   "date":"2014-10-1"
				},
				{
				   "id":2,
				   "user":"樱桃小丸子",
				   "email":"xiaowanzi@163.com",
				   "date":"2014-10-2"
				},
				{
				   "id":3,
				   "user":"黑崎一护",
				   "email":"yihu@163.com",
				   "date":"2014-10-3"
				}
	   ],
	   */
	});
});

function abc(){
    //$('#box').combobox('unselect',1);
	//$('#box').combobox('setValue',1);
	//$('#box').combobox('setValues',[23,24]);
	//$('#box').combobox('reload');
	//console.log($('#box').combobox('getData'));
	$('#box').combobox('loadData',[
	            {
				   "id":1,
				   "user":"蜡笔小新",
				   "email":"xiaoxi@163.com",
				   "date":"2014-10-1"
				},
				{
				   "id":2,
				   "user":"樱桃小丸子",
				   "email":"xiaowanzi@163.com",
				   "date":"2014-10-2"
				},
				{
				   "id":3,
				   "user":"黑崎一护",
				   "email":"yihu@163.com",
				   "date":"2014-10-3"
				}
	
	])
}