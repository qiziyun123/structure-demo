package com.qizy.dynimaticds.service;

import java.util.List;

import com.qizy.dynimaticds.entity.ReportDataEntity;

public interface IReportDataService {

	public List<ReportDataEntity> queryByUserId(String userId);
}
