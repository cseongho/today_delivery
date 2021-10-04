package com.today.delivery.dao;

import java.sql.SQLException;

import com.today.delivery.dto.TodayDTO;

public interface TodayDAO {

	TodayDTO getOutput(TodayDTO todayDTO) throws SQLException;

}
