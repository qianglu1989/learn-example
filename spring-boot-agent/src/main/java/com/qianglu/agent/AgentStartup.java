package com.qianglu.agent;


import com.qianglu.agent.service.DumpClassesService;

import java.lang.instrument.Instrumentation;

/**
 * @author qianglu
 */
public class AgentStartup {

	public static void premain(String arg, Instrumentation instrumentation) {
		System.err.println("agent startup , args is " + arg);
		// 注册我们的文件下载函数
		instrumentation.addTransformer(new DumpClassesService());	}
}
