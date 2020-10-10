$(function(){
   
  $('#box').combotree({
      url:'tree.json',
	  required:true,
	  //editable:true,
  });
	   
});

function abc(){
   /*
   var t=$('#box').combotree('tree');
   console.log(t.tree('getSelected'));
   
   $('#box').combotree('loadData',[
      {
	     "text":"加载"
	  }
   ]);
   */
   //$('#box').combotree('reload');
   //$('#box').combotree('clear');
   //$('#box').combotree('setValue',1);
   $('#box').combotree('setValues',[1,2,'aaa']);
}
