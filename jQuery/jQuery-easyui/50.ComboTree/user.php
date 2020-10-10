<?php
	//sleep(3);
	require 'config.php';
	
	//$q=$_POST['q']?$_POST['q']:'';
	
	$query = mysql_query("SELECT id,user,email,date,sex FROM user") or die('SQL 错误！');
	
	
	$json='';
	while (!!$row = mysql_fetch_array($query, MYSQL_ASSOC)) {
	    $row['state']='closed';
		$json.=json_encode($row).',';
	}
	
	
	$json=substr($json,0,-1);
	echo '['.$json.']';
	mysql_close();
?>