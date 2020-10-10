package com.bjsxt.test;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Demo02 {
   public static void main(String[] args) throws ScriptException, NoSuchMethodException, IOException{
	   ScriptEngineManager sem=new ScriptEngineManager();
	   ScriptEngine engine=sem.getEngineByName("javascript");
	   
	   engine.put("msg", "yuchangxin is a cool");
	   engine.eval("msg='yuchangxin is a very cool';");
	   System.out.println(engine.get("msg"));
	   
	   String str="var user={name:'yuchangxin'};";
	   str+="println(user.name);";
	   engine.eval(str);
	   
	   engine.eval("function add(a,b){var sum=a+b; return sum;}");
	   Invocable jsInvoke=(Invocable)engine;
	   Object result=jsInvoke.invokeFunction("add", new Object[]{3,4});
	   System.out.println(result);
	   
	   String jsCode="importPackage(java.util);var list=Arrays.asList([\"ds\",\"sd\",\"dsfds\"]);";
	   engine.eval(jsCode);
	   List<String> list2=(List<String>)engine.get("list");
	   for(String temp:list2){
		   System.out.println(temp);
	   }
	   
	   
	   URL url=Demo02.class.getClassLoader().getResource("a.js");
	   FileReader fReader=new FileReader(url.getPath());
	   engine.eval(fReader);
	   fReader.close();
	   
   }
}
