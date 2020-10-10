$(function(){
   /*
   $('div').mouseover(function(){    //mouseover,mouseout穿过子元素不会触发
       $(this).css('background','red');
   }).mouseout(function(){
       $(this).css('background','green');
   });
   $('div').mouseenter(function(){    //mouseenter,mouseleave穿过子元素会触发
       $(this).css('background','red');
   }).mouseleave(function(){
       $(this).css('background','green');
   });
   
   $('div').mouseover(function(){                     //over会触发子节点
       $('strong').html(function(index,value){
	         return value + '1';
	   })
   });
   
   $('div').mouseenter(function(){                     //enter不会触发子节点
       $('strong').html(function(index,value){
	         return value + '1';
	   })
   });
   $('div').mouseout(function(){                     
       $('strong').html(function(index,value){
	         return value + '1';
	   })
   });
   
   $('div').mouseleave(function(){                     
       $('strong').html(function(index,value){
	         return value + '1';
	   })
   });
   
   $('input').keydown(function(){
        alert('键盘');
   });
   
    $('input').keyup(function(){
        alert('键盘');
   });
   
    $('input').keyup(function(e){
        alert(e.keyCode+'不包括功能键');
   });
   
    $('input').keypress(function(e){
        alert(e.charCode);
   });
   
    $('input').focus(function(){
        alert('光标激活');
   });
   
   $('input').blur(function(){
        alert('光标丢失');
   });
   
   $('input').focusin(function(){
        alert('光标激活');
   });
   
   $('input').focusout(function(){
        alert('光标丢失');
   });
   
   $('div').focus(function(){     //focus和blur必须是当前元素才能激活
        alert('光标激活');
   });
   
    $('div').focusin(function(){     //focusin和focusout可以是子元素激活
       alert('光标激活');
   });
   
   $('div').blur(function(){     //focus和blur必须是当前元素才能激活
        alert('光标丢掉');
   });
   
    $('div').focusout(function(){     //focusin和focusout可以是子元素激活
       alert('光标丢掉');
   });
   
    $('div').hover(function(){
	    $(this).css('background','red');
	},function(){
	    $(this).css('background','green');
	});
   
  
   //$('div').toggle('slow');
   
   $('div').toggle(function(){
          $(this).css('background','red');
   },function(){
          $(this).css('background','blue')
   },function(){
         $(this).css('background','green')
   });
   */
   
   var flag=1;
   $('div').click(function(){
        if(flag==1){
		   $(this).css('background','red');
		   flag=2;
		}else if(flag==2){
		    $(this).css('background','blue');
			flag=3;
		}else if(flag===3){
		    $(this).css('background','green');
			flag=1;
		}
   });
    
});