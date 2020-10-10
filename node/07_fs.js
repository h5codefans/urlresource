var http=require("http");
var fs=require("fs");

var server=http.createServer(function(req,res){

	if(req.url=="./favicon.icon"){
		return;
	}
	
	fs.mkdir("./album/aaa");
	res.end();
});

server.listen(3000,"127.0.0.1");