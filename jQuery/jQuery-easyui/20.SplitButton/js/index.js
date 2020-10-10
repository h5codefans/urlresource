$(function(){
    /*
	$('#edit').menubutton({
	     menu:'#box',
		 iconCls:'icon-edit',
		 plain:false,
		 duration:500,
		 //disabled:true,
	});
	
	//console.log($('#edit').menubutton('options'));
	$('#edit').menubutton('disable');
	$('#edit').menubutton('enable');
	$('#edit').menubutton('destroy');
	*/
	
	
	$('#edit').splitbutton({
	     menu:'#box',
		 iconCls:'icon-edit',
		 plain:false,
		 duration:3000,
		 //disabled:true,
	});
	console.log($('#edit').splitbutton('options'));
	$('#edit').splitbutton('disable');
	$('#edit').splitbutton('enable');
	//$('#edit').splitbutton('destroy');
});