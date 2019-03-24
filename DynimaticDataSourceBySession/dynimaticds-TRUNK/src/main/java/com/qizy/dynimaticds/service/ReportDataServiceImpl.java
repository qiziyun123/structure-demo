package com.qizy.dynimaticds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qizy.dynimaticds.dao.mapper.ReportDataMapper;
import com.qizy.dynimaticds.entity.ReportDataEntity;

@Service
public class ReportDataServiceImpl implements IReportDataService{
	@Autowired
    private ReportDataMapper reportDataMapper;

	@Override
	public List<ReportDataEntity> queryByUserId(String userID) {
		
		return reportDataMapper.selectByUserId(userID);
	}
	
	
}
