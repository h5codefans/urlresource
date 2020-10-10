$(function(){

    //$('div').wrap('<strong class="b"></strong>');
	//$('div').wrap('<strong />');
	//$('div').wrap('<strong >123</strong>');
	//$('div').wrap('<strong ><em></em></strong>');
	
	//$('div').wrap($('strong').get(0));  //从body中获取strong标签，包裹div
	//$('div').wrap(document.createElement('strong'));  //创建一个strong标签包裹div
	
	//$('div').wrap(function(index){
	 //   return '<strong>'+index+'</strong>'
	//});  
	
	//$('div').wrap('<strong ></strong>');    //strong包裹div
	 //$('div').unwrap();                     
	 
	 //$('div').wrap('<strong ><em></em></strong>'); //为div添加包裹标签
	 //$('div').unwrap();                     //去除包裹div的最内层标签em
	  //$('div').unwrap(); 
	  
	   //$('div').wrap('<strong ></strong>');   //包裹一层，每个div，用一个strong包裹
	  // $('div').wrapAll('<strong ></strong>');  //把所有div当做整体，只用一个strong包裹
	  
	  
	  //$('div').wrap('<strong ></strong>'); 
	  //$('div').wrapInner('<strong ></strong>'); 
	 // $('div').wrapInner(document.createElement('strong'));
	 
	 //$('div').wrapInner(function(index){
	  // return '<strong>'+index+'</strong>'
	//});  
	
	
	$('div').click(function(){
	     alert('yuku.com');
	});
	
	//$('div').clone(true).appendTo('body');   //clone值为true，复制事件处理方法，为false或空，不复制事件处理方法
	
	//$('div').remove('.box');
	
	//alert($('div').remove().get(0));       //remove(),移除了事件行为
	//$('div').remove().appendTo('body');
	
	//$('div').detach();                        
	//$('div').detach().appendTo('body');     //detach(),保留了事件行为
	
	 
	//$('div').empty();              //清空节点
	
	//$('div').replaceWith('<span>DOM</span>');     //替换节点
	//$('<span>DOM</span>').replaceAll('div');      //替换节点
	
	
	
	
});