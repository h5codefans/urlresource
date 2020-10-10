$(function(){
   
  $('#box').spinner({
      required:true,
	  //width:300,
	  //height:40,
	  //value:3,
	  //max:1000,
	  //min:20,
	  /*
	  increment:1,   //每次增量为1
	  editable:false,
	  spin:function(down){
	     alert(down);
	  }
	  */
	  onSpinUp:function(){
	      $('#box').spinner('setValue',parseInt($('#box').spinner('getValue'))+1);
	  },
	  onSpinDown:function(){
	     $('#box').spinner('setValue',parseInt($('#box').spinner('getValue'))-1);
	  },
  });
});