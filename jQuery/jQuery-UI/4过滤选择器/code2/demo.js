$(function(){
   //$('li:first-child').css('background','#ccc');
   //$('li:last-child').css('background','#ccc');
   //$('li:only-child').css('background','#ccc');
   //$('li:nth-child(even)').css('background','#ccc');
   //$('li:nth-child(odd)').css('background','#ccc');
    //$('li:nth-child(3n)').css('background','#ccc');
	//$('li:nth-child(3n+1)').css('background','#ccc');
	
	//alert($('.red').is('li'));
	//alert($('.red').is('div'));
	//alert($('.red').is($('li')));
	//alert($('.red').is($('div')));
	//alert($('.red').is($('li').get(2)));
	//alert($('.red').is($('li').eq(2)));
	//alert($('.red').is(function(){
	 //    return $(this).attr('title')=='列表3';
	//}));
	//注意，必须使用$(this)来表示要判断的元素，否则，不管function里面是否返回true或false都和调用的元素无关了
	
	//alert($('li').eq(2).hasClass('red'));
	//$('li').slice(2,4).css('background','#ccc');
	//$('li').slice(2).css('background','#ccc');
	//$('li').slice(0,-3).css('background','#ccc');
	//alert($('ul').find('li').end().get(0));
	//alert($('ul').find('li').parent().get(0));
	
	//$('#box').next('ul').end().css('background','#ccc'); //ul标签变为灰色背景
        //$('#box').next('ul').parent().css('background','#ccc');//body标签变为灰色背景
	
	//alert($('div:first').children().size());
	//alert($('div:first').contents().size());
	//$('li').filter('.red,:first,:last,:last-child').css('background','#ccc');
	
	$('li').filter(function(){
	   return $(this).attr('class')=='red'&&$(this).attr('title')=='列表3';
	}).css('background','#ccc');
	
});