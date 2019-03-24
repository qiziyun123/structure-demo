package com.qizy.dynimaticds.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qizy.dynimaticds.entity.ReportDataEntity;
import com.qizy.dynimaticds.service.IReportDataService;

@Controller
public class QueryDataDemoController {
	@Autowired
	IReportDataService reportDataService;
	
	@RequestMapping("/querydata")
	@ResponseBody
	public String queryReportData() {
		// 模拟 从session获取用户id
		String userId = getUserId();
		System.out.println(userId);
		List<ReportDataEntity> list = reportDataService.queryByUserId(userId);

		return list.get(0).getMessage();
	}

	private String getUserId() {
		List<String> list = new ArrayList<String>();
		list.add("64cec2ee-2080-4ec8-ac6a-d7095fbb2ad3");
		return list.get(0);
	}
}
