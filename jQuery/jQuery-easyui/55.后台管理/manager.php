<?php

   session_start();
   if(!isset($_SESSION['admin'])){
        header('location:login.php');
   }
?>
<table id="manager"></table>

<div id="manager_tool" style="padding:5px;">
	<div style="margin-bottom:5px;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add-new" plain="true" onclick="manager_tool.add();">添加</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit-new" plain="true" onclick="manager_tool.edit();">修改</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-delete-new" plain="true" onclick="manager_tool.remove();">删除</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true"  onclick="manager_tool.reload();">刷新</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick="manager_tool.redo();">取消选择</a>		
	</div>
	<div style="padding:0 0 0 7px;color:#333;">
		查询帐号：<input type="text" class="textbox" name="user" style="width:110px">
		创建时间从：<input type="text" name="date_from" class="easyui-datebox" editable="false" style="width:110px">
		到：<input type="text" name="date_to" class="easyui-datebox" editable="false" style="width:110px">
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="obj.search();">查询</a>
	</div>
</div>

<script type="text/javascript" src="js/manager.js"></script>