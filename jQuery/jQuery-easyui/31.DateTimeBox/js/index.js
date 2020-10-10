$(function(){
   
    $('#box').datetimebox({
	   // value:'2016-3-3 22:23:33',
	   //showSeconds:false,
	   //timeSeparator:'/',
	});
	
	//$('#box').datetimebox('setValue','2015-3-4 23:22:22');
	  console.log($('#box').datetimebox('spinner').spinner('getValue'));
});