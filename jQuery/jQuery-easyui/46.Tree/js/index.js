$(function(){
   
    $('#box').tree({
	   
	    url:'tree.json',
		animate:true,
		checkbox:true,
		cascadeCheck:false,
		onlyLeafCheck:true,
		lines:true,
		dnd:true,//允许拖拽
		data:[{
		   "text":"本地加载",
		}],
		formatter:function(node){
		    return '['+node.text+']';
		},
	}); 
	
});
