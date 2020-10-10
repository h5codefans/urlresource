var http=require("http");
var formidable=require("formidable");
var util=require("util");
var path=require("path");
var fs=require("fs");




var server=http.createServer(function(req,res){

	if(req.url=="/dopost"&&req.method.toLowerCase()=="post"){

		var form=new formidable.IncomingForm();
		form.uploadDir="./uploads";

		form.parse(req,function(err,fields,files){
			if(err){
				throw err;
			}

			console.log(util.inspect({fields:fields, files:files}));
			 //图片扩展名
			var extname=path.extname(files.pictrue.name);
			var ran=parseInt(Math.random()*89999+10000);
			//执行改名
			var oldpath=__dirname+"/"+files.pictrue.path;
			var newpath=__dirname+"/"+ran+extname;

			fs.rename(oldpath, newpath, function(err){
				if(err){
					throw Error("改名失败");
				}
				res.writeHead(200,{"content-type":"text/plain"})
				res.end("success");
			});
		});

	}

});

server.listen(3000,"127.0.0.1");