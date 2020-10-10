<?php
	sleep(1);
	require 'config.php';
	
	$page = $_GET['page'];
	$pageSize = $_GET['pagesize'];
	$first = $pageSize * ($page - 1);
	
	$query = mysql_query("SELECT * FROM user LIMIT $first,$pageSize") or die('SQL 错误！');
	
	while (!!$row = mysql_fetch_array($query, MYSQL_ASSOC)) {
		echo '<ul>';
		echo '<li>'.$row['user'].'---'.$row['email'].'</li>';
		echo '</ul>';
	}
	
	mysql_close();
?>