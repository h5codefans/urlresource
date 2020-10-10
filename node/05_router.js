var http=require("http");

var server=http.createServer(function(req,res){

	var userurl=req.url;
	res.writeHead(200,{"content-type":"text/html;charset=UTF8"});

	if(userurl.substr(0,9)=="/student/"){
		var studentid=userurl.substr(9);
		if(/\d{10}/.test(studentid)){
			res.end("您要查询学生信息，id为"+studentid);
		}else{
			res.end("学号信息不对");
		}
	}else if(userurl.substr(0,9)=="/teacher/"){
		var teacherid=userurl.substr(9);
		if(/\d{6}/.test(teacherid)){
			res.end("您要查询教师信息，id为"+teacherid);
		}else{
			res.end("您要查询教师信息不对");
		}
	}else{
		res.end("信息不对");
	}
});
server.listen(3000,"127.0.0.1");