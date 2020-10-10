$(function(){
   
   $('#box').propertygrid({
        url:'property.json',
		showGroup:true,
		groupField:'group',
		groupFormatter:function(group,rows){
		   return '['+group+']';
		},
   });
});

function abc(){
   
    //$('#box').propertygrid('collapseGroup');
	$('#box').propertygrid('collapseGroup',0);
}