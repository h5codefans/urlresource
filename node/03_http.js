//引入一个模块
var http=require("http");

var server=http.createServer(function(req,res){

	console.log("服务器发送请求"+req.url);
	res.writeHead(200,{"Content-Type":"text/html;charset=UTF8"});
	res.write("这是一个主标题");
	res.write((1+2+3).toString());
	res.end("<h1>这是一个标题</h1>");
});

server.listen(3000,"127.0.0.1");