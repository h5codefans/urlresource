
$(function(){
  //$('#box p').css('color','red');
  //$('p','#box').css('color','blue');
  //$('p',$('#box')).css('color','orange');
  //$('a[title]').css('color','red');   //a是指a标签，表示a标签含有title属性的字体为红色
  //$('a[title=num1]').css('color','red');
  //$('a[title^=num]').css('color','red');
  //$('a[title$=num]').css('color','red');
  //$('a[title|=num]').css('color','red');
  //$('a[title~=aaa]').css('color','red');
  $('a[title*=num]').css('color','red');
  
});
