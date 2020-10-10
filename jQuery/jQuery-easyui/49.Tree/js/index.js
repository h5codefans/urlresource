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
	    url:'tree.json',
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
		
		onBeforeDrop:function(target,source,point){
		    console.log(target);
			console.log(source);
			console.log(point);
		},
		*/
		onClick:function(node){
		   //console.log($('#box').tree('getNode',node.target));
		   //console.log($('#box').tree('getData',node.target));
		   //console.log($('#box').tree('getParent',node.target));
		   //console.log($('#box').tree('getChildren',node.target));
		   //console.log($('#box').tree('isLeaf',node.target));
		},
		onDblClick:function(node){
		    $('#box').tree('beginEdit',node.target);
		},
		onAfterEdit:function(node){
		   alert('执行服务器端');
		},
	}); 
	
});

function abc(){
   /*
   $('#box').tree('loadData',[
     {
       "text":"加载"
     }
   ]);
   */
   //$('#box').tree('reload');
   //console.log($('#box').tree('getRoot'));
   //console.log($('#box').tree('getRoots'));
   //console.log($('#box').tree('getChecked'));
   //console.log($('#box').tree('getChecked','unchecked'));
   //console.log($('#box').tree('getSelected'));
   var node=$('#box').tree('find',1);
   //$('#box').tree('select',node.target);
   //$('#box').tree('uncheck',node.target);
   //$('#box').tree('collapse',node.target);
   //$('#box').tree('expand',node.target);
   //$('#box').tree('collapseAll');
   //$('#box').tree('expandTo');
   //$('#box').tree('scrolldTo');
   /*
   $('#box').tree('append',{
      parent:node.target,
	  data:[
	     {
		    "text":"插入"
		 }
	  ]
   });

    $('#box').tree('insert',{
      before:node.target,
	  data:[
	     {
		    "text":"新增"
		 }
	  ]
   });

    //$('#box').tree('toggle',node.target);
	//$('#box').tree('remove',node.target);
	  $('#box').tree('update',{
      target:node.target,
      text:"修改"
   });
   */
}
