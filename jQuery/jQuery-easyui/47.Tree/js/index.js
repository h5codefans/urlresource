$(function(){
   
    $('#box').tree({
	    /*
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
		*/
		url:'tree.php',
		lines:true,
		onLoadSuccess:function(node,data){
		   if(data){
		      $(data).each(function(index,value){
			      if(this.state=='closed'){
				      $('#box').tree('expandAll');
				  }
			  });
		   }
		},
	}); 
	
});
