//require表示引包，引包就是引用自己的一个特殊功能
var http=require("http");

//创建服务器，参数是一个回调函数，表示如果有请求参数，要做什么
var server=http.createServer(function(req,res){
			res.writeHead(200,{"Content-type":"text/html;charset=UTF-8"});
			res.end("哈哈哈,这是页面");
		});

server.listen(3000,"127.0.0.1");