$(function(){
   
   $('#box').numberbox({
       //value:555,
	   min:5,
	   max:500,
	   precision:2,
	   //decimalSeparator:':',
	   //groupSeparator:',',
	   //prefix:'$',
	   //suffix:'￥'  //后置
	   /*
	   filter:function(){
	      return false;
	   },
	  
	   formatter:function(value){
	      return '111,'+value;
	   },
	  
	   parser:function(s){
	      return '111,'+s;
	   },
	 
	   
	   onChange:function(newValue,oldValue){
	        alert(newValue+'|'+oldValue);
	   },
	   */
   });
    $(document).click(function(){
	       //$('#box').numberbox('fix');
		   //console.log($('#box').numberbox('getValue'));
		   //console.log($('#box').numberbox('setValue',22));
	   });
});