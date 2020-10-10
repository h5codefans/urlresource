$(function(){
     
   //第一步，引入jQuery文件	 
   //第二步，引入validate.js
   //第三步，加载validate
   $('form').validate();                   
   //第四步，必填选项，给表单class="required"  
   
   var user=['about','family','but','black'];
   $('form input[name=user]').autocomplete(user,{
          minChars:0                   //第二个数据可选，双击显示全部数据
   });
   
});