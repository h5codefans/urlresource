$(function () {
	/*
	$('input').click(function () {
		$('#box').load('test.html .url');
	});

	
	$('input').click(function () {
		$('#box').load('test.php');
	});
	
	$('input').click(function () {
		$('#box').load('test.php?url=ycku');
	});
	
	$('input').click(function () {
		$('#box').load('test.php', {
			url : 'ycku'
		});
	});
	
	*/
	
	$('input').click(function () {
		$('#box').load('test.php', {
			url : 'ycku'
		}, function (response, status, xhr) {
			//alert(response);
			//$('#box').html(response +'123');
			//if (status == 'success') {alert('成功后的处理');}
			//alert(xhr.responseText);
			//alert(xhr.responseXML);
			//alert(xhr.status);
			alert(xhr.statusText);
		});
	});
	
	
});