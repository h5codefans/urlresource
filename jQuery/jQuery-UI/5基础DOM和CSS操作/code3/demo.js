$(function(){
   //alert(typeof $('div').css('width'));  //string 类型
   //alert(typeof $('div').width());   //number类型
   //alert($(window).width());
   
   /*
   $('div').width(function(index,width){
       return width-500 + 'px';   //虽然可以不加，会智能添加，但还是建议加上，单位更加清晰
   });
   */
   
   /*
   //alert($('div').height());
                                //padding,  border   margin
   alert($('div').width());    //200        200      200
   alert($('div').innerWidth());  //400     400      400
   alert($('div').outerWidth());  //400     600      600
   alert($('div').outerWidth(true)); //400  600      800
   */
   
  // alert($('div').offset().top);
   //alert($('strong').offset().top);
   
   //alert($('div').position().top);
   //alert($('strong').offset().top);
   //alert($('strong').position().top);
   
   //alert($(window).scrollTop());
   $(window).scrollTop(300);

});