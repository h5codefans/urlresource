<?php
	sleep(1);
	require 'config.php';
	
	$page = $_POST['page'];
	$pageSize = $_POST['rows'];
    $first = $pageSize * ($page - 1);
	
	$query = mysql_query("SELECT user,email,date FROM user LIMIT $first,$pageSize") or die('SQL 错误！');
	
	$json='';
	while (!!$row = mysql_fetch_array($query, MYSQL_ASSOC)) {
		$json.=json_encode($row).',';
	}
	
	$total=mysql_num_rows(mysql_query("SELECT user,email,date FROM user"));
	$json=substr($json,0,-1);
	echo '{"total":'.$total.',"rows":['.$json.']}';
	mysql_close();
?>