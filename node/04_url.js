var http=require("http");
var url=require("url");


var server=http.createServer(function(req,res){
	res.writeHead(200,{"content-type":"text/html;charset=utf8"});
	if(req.url=="./favicon.icon"){
		return;
	}
	var  pathname=url.parse(req.url).pathname;

	var queryobj = url.parse(req.url,true).query

	
	console.log("姓名:" + queryobj.name);
	console.log("性别:" + queryobj.sex);
	console.log("年龄为:"+queryobj.age);
	res.write("姓名:" + queryobj.name+"性别:" + queryobj.sex+"年龄为:"+queryobj.age);
	res.end();

}).listen(3000,"127.0.0.1");