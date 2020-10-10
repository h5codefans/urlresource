$(function () {

	$('#box').pagination({
		total : 5,
		pageSize : 1,
		pageNumber : 1,
		pageList : [1,2],
		//loading : true,
		buttons : [{
			iconCls : 'icon-add',
		},'-',{
			iconCls : 'icon-edit',
		}],
		//layout : ['first','prev','links','next','last'],
		//showPageList : false,
		//showRefresh : false,
		//beforePageText : '弟弟',
		//afterPageText : '有{pages}个',
		displayMsg : '从{from}到{to}，有{total}人',
		onSelectPage : function (pageNumber, pageSize) {
			$('#box').pagination('loading');
			$('#content').panel('refresh', 'user.php?page='+pageNumber+'&pagesize='+pageSize);
			setTimeout(function () {
				$('#box').pagination('loaded');
			}, 1000);
			
			
		},
		onBeforeRefresh : function (pageNumber, pageSize) {
			alert('刷新之前');
		},
		onRefresh : function (pageNumber, pageSize) {
			alert('刷新之后');
		},
		onChangePageSize : function (pageSize) {
			alert('每页显示的条数被改变！');
		} 
	});
	
	$(document).click(function () {
		/*
		$('#box').pagination('refresh', {
			pageSize : 2,
			pageNumber : 2,
		});
		*/
		$('#box').pagination('select', 2);
	});

});



	









