var http=require("http");
var formidable=require("formidable");



var server=http.createServer(function(req,res){

	if(req.url=="/dopost"&&req.method.toLowerCase()=="post"){

		var form=new formidable.IncomingForm();
		form.uploadDir="./uploads";

		form.parse(req,function(err,fields,files){
			if(err){
				throw err;
			}
			console.log(fields);
			console.log(files);

			res.writeHead(200,{"content-type":"text/plain"})
			res.end("success");
		});

	}

});

server.listen(3000,"127.0.0.1");