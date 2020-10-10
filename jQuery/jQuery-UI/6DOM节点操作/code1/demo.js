$(function(){
      //内部插入
	  /*
     var box=$('<div id="box">节点</div>');      //创建节点
	 $('body').append(box);                      //插入节点
	 
	 
	 //$('div').append('<strong>DOM</strong>');
	 $('div').append(function(index,html){
	        return '<strong>DOM</strong>' + index+html;
	 });
	 */
	 //$('strong').appendTo('div');        //html中已有的标签strong,移入操作，不需要创建节点
	 
	 //$('div').prepend('<strong>DOM</strong>');
	 
	 //$('div').prepend(function(index,html){
	 //        return '<strong>DOM</strong>' + index+html;
	// });
	
	//$('strong').prependTo('div');
	
	//外部插入，同级
	//$('div').after('<strong>DOM</strong>');
	
	// $('div').after(function(index,html){
	 //       return '<strong>DOM</strong>' + index+html;
	 //});
	 
	 //$('div').before('<strong>DOM</strong>');
	 
	  //$('div').before(function(index,html){
	   //     return '<strong>DOM</strong>' + index+html;
	 //});
	 
	 //$('strong').insertAfter('div');    //移动操作
	 //$('strong').insertBefore('div');
    $('div').after('<strong>DOM</strong>');
});