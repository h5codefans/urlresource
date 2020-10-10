package com.bjsxt.test;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Demo01 {
    public static void main(String[] args) {
    	
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
		int result=compiler.run(null,null,null,"F:/mycode/6/Welcome.java");
		System.out.println(result==0?"编译成功":"编译失败");
	}
}
