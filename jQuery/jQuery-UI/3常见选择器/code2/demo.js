
$(function(){        
  //$('div,p,strong').css('color','red');
  //$('#box,.pox,strong').css('color','blue');
 //$('ul li a').css('color','yellow');
 //$('*').css('color','blue');
 //alert($('*').size());
 //alert($('*')[0].nodeName);
 
 //在全局范围使用*号，会极大的消耗资源，所以不建议在全局使用
 
//$('ul li a,ul li em,ul li strong').css('color','red');
 //$('ul li,ul li a').css('color','green');
 //$('ul li *').css('color','green');
 
 //alert($('ul li *').size());  //通配选择器一般用于局部环境内
 
 //$('div.box').css('color','red');
 $('.box.pox').css('color','green');
 });
