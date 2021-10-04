package com.today.delivery.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.today.delivery.dao.TodayDAO;
import com.today.delivery.dto.TodayDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TodayServiceImpl implements TodayService {
	
	@Autowired
	@Resource(name="todayDAO")
	private TodayDAO todayDAO;

	@Override
	public TodayDTO getOutput(TodayDTO todayDTO) throws Exception {
		try {
			return todayDAO.getOutput(todayDTO);
		} catch(Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}
	
}
