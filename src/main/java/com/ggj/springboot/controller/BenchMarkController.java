package com.ggj.springboot.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:gaoguangjin
 * @date 2016/12/9 15:38
 */
@RestController
public class BenchMarkController {
	
	private AtomicInteger atomicInteger = new AtomicInteger();
	
	/** -n 全部请求数 -c 并发数
	 * ab -n 100 -c 10 http://localhost/qps/
	 * @return
	 */
	@RequestMapping("/qps")
	public String testQps() throws InterruptedException {
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		System.out.println(String.format("第%d个 访问时间%s", atomicInteger.incrementAndGet(), time));
		return "";
	}
}
