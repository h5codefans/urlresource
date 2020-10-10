$(function(){
   
   $('#box').timespinner({
       //editable:false,
	   value:'00:00:00',
	   //min:'00:00',
	   //max:'23:59'
	   //separator:'/',
	   showSeconds:true,
	   highlight:1,  //选择初始字段0,1,2
   });
  
   $('#box').timespinner('setValue','17:11:22');
   console.log($('#box').timespinner('getHours'));
});