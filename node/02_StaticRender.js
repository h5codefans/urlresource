//require表示引包，引包就是引用自己的一个特殊功能
var http=require("http");
var fs=require("fs");

//创建服务器，参数是一个回调函数，表示如果有请求参数，要做什么
var server=http.createServer(function(req,res){
	if(req.url=="/fang"){
		fs.readFile("./test.html", function(err,data){
			res.writeHead(200,{"Content-type":"text/html;charset=UTF-8"});
			res.end(data);
		});
	}else if(req.url=="/yuan"){
		fs.readFile("./test2.html", function(err,data){
			res.writeHead(200,{"Content-type":"text/html;charset=UTF-8"});
			res.end(data);
		});
	}else if(req.url=="/1.png"){
		fs.readFile("./1.png", function(err,data){
			res.writeHead(200,{"Content-type":"image/jpg"});
			res.end(data);
		});
	}else if(req.url=="/bbbbbb.css"){
		fs.readFile("./aaaaaa.css", function(err,data){
			res.writeHead(200,{"Content-type":"text/css"});
			res.end(data);
		});
	}else{
			res.writeHead(404,{"Content-type":"text/html;charset=UTF-8"});
			res.end("哈哈哈,这是页面不存在");
	}
});

server.listen(3000,"127.0.0.1");