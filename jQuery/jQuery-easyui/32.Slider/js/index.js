$(function(){
    
	$('#box').slider({
	    width:300,
		heigth:300,
		mode:'h',
		rule:[0,'|',25,'|',50,'|',75,'|',100],
		showTip:true,
		reversed:false,
		value:12,
		min:0,
		max:100,
		step:1,
		/*
		tipFormatter:function(value){
		    return value+'%';
		},
		
		onSlideStart:function(value){
		    console.log(value);
		},
		onSlideEnd:function(value){
		    console.log(value);
		},
		*/
		onChange:function(newValue,oldValue){
		   $('#text').css('font-size',newValue);
		},
	});
	
	$('#box').slider('resize',{
	    width:500,
		height:30,
	});
	console.log($('#box').slider('getValue'));
	console.log($('#box').slider('setValue',90));
});