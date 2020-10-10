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
		*/
	    url:'tree.php',
		animate:true,
		checkbox:true,
		cascadeCheck:false,
		onlyLeafCheck:true,
		lines:true,
		dnd:true,
		
		/*
		onClick:function(node){
		   console.log(node);
		},

		onDblClick:function(node){
		   console.log(node);
		},

		onBeforeLoad:function(node,param){
		   console.log(node);
		   console.log(param);
		},

		onLoadError:function(arg){
		    console.log(arg.status);
		},

		onBeforeExpand:function(node){
		   console.log(node);
		},
		onBeforeCollapse:function(node){
		   console.log(node);
		},

		onBeforeCheck:function(node,checked){
		   console.log(node);
		   console.log(checked);
		},

		onBeforeSelect:function(node){
		   console.log(node);
		},

		onContextMenu: function(e, node){
			e.preventDefault();
			// 查找节点
			$('#box').tree('select', node.target);
				// 显示快捷菜单
				$('#menu').menu('show', {
				left: e.pageX,
				top: e.pageY
			});
		},

		onBeforeDrag:function(node){
		    console.log(node);
		},

		onDragEnter:function(target,source){
		    console.log(target);
			console.log(source);
		},
		*/
		onBeforeDrop:function(target,source,point){
		    console.log(target);
			console.log(source);
			console.log(point);
		},
	}); 
	
});
