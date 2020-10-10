$(function(){
    
    $.fn.droppable.defaults.disabled = true;
   
   $('#dd').droppable({
       accept:'#box',
	   disabled:false,
	   onDragEnter:function(e,source){
	      //console.log(source);
		  $(this).css('background','blue');
		  //alert('enter');
	   },
	    onDragOver:function(e,source){
	      //console.log(source);
		 $(this).css('background','orange');
		 //alert('over');
	   },
	   
	   	onDragLeave:function(e,source){
	      //console.log(source);
		 $(this).css('background','green');
		 //alert('leave');
	   },
	   onDrop:function(e,source){
	      
		  $(this).css('background','maroon');
	   },
	   //onDragEnter只触发一次，而over在不停拖动中不停触发
	   //onDrop是放入到放置区，松开鼠标左键，触发事件
   });
   //console.log($('#dd').droppable('options'));
   //$('#dd').droppable('disable');
   //$('#dd').droppable('enable');
  $('#box').draggable();
   
});
