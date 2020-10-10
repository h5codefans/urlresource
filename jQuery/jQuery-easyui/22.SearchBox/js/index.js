$(function () {

	$('#ss').searchbox({
	    width:300,
		height:22,
	    menu:'#box',
		searcher:function(value,name){
		     alert(value+'-'+name);
		},
	    prompt:'请输入关键字',
		value:'固定的值',
		//disabled:true,
	});
        var m=$('#ss').searchbox('menu');   //返回收索菜单对象
		m.menu('setIcon',{
		     target:m.menu('findItem','体育频道').target,
			 iconCls:'icon-save',
		});
		
		//console.log($('#ss').searchbox('textbox'));
		//console.log($('#ss').searchbox('getValue'));
		//$('#ss').searchbox('setValue','123');
		//console.log($('#ss').searchbox('getName'));   //返回当前搜索类型名
		//$('#ss').searchbox('selectName','sports');//选择当前搜索类型名。
		//$('#ss').searchbox('destroy');
		//$('#ss').searchbox('resize',200);
		//$('#ss').searchbox('disable');
		//$('#ss').searchbox('enable');
		//$('#ss').searchbox('clear');
		$(document).dblclick(function(){
		      $('#ss').searchbox('reset');
		});
});



	









