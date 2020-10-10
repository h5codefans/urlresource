<?php
      //这个文件是远程端:http://wwww.li.cc/jsonp.php
	  $_arr=array('a'=>1,'b'=>2,'c'=>3);
	  $_result=json_encode($_arr);       //转换为json文件
	  echo $_result;
?>