package com.qizy.dynimaticds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QueryDataDemoController {

	@RequestMapping("/querydata")
	@ResponseBody
	public String queryReportData() {
		System.out.println("aaa");
		return "abc";
	}
}
