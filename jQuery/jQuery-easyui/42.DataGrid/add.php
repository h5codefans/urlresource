<?php
   sleep(3);
   require 'config.php';
   
   $row=$_POST['row'];
   $user=$row['user'];
   $email=$row['email'];
   $date=$row['date'];
   
    mysql_query("INSERT INTO user(user,email,date) VALUES('$user','$email','$date')") or die('SQL 错误！');
	
	echo mysql_affected_rows();
	
	mysql_close();
?>