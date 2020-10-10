package com.bjsxt.test;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 测试脚本引擎执行javascript代码
 * @author Administrator
 *
 */
public class Demo01 {
   public static void main(String[] args) throws ScriptException, NoSuchMethodException, IOException {
	//获取脚本引擎对象
	   ScriptEngineManager sem=new ScriptEngineManager();
	   ScriptEngine engine=sem.getEngineByName("javascript");
	   
	 //定义变量
	   engine.put("msg","yuchangxin is a good man!");
	   String str="var user={name:'gaoqi',age:18,schools:['清华大学','北京大学']};";
	   str+="println(user.name);";
	   
	   //执行脚本
	   engine.eval(str);
	   engine.eval("msg='sxt is a good school';");
	   System.out.println(engine.get("msg"));
	   System.out.println("########################");
	   
	   //定义函数
	   engine.eval("function add(a,b){var sum=a+b; return sum;}");
	   //取得调用接口
	   Invocable jsInvoke=(Invocable)engine;
	   //执行脚本中定义的方法
	   Object result=jsInvoke.invokeFunction("add", new Object[]{13,20});
	   System.out.println(result);
	   
	   //导入其他的java包，使用其他包中的java类
	   String jsCode="importPackage(java.util); var list=Arrays.asList([\"北京尚学堂\",\"清华大学\",\"北京大学\"]);";
       engine.eval(jsCode);
      
       List<String> list2=(List<String>) engine.get("list");
       for(String temp:list2){
    	   System.out.println(temp);
       }
       
       //执行一个js文件(我们将a.js执行项目的src下即可)
       URL url=Demo01.class.getClassLoader().getResource("a.js");
       FileReader fr=new FileReader(url.getPath());
       engine.eval(fr);
       fr.close();
   }
}
