package com.today.delivery.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.today.delivery.dto.TodayDTO;
import com.today.delivery.service.TodayService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TodayController {
	
	@Autowired
	private TodayService todayService;
	
	@RequestMapping(value="index")
	public ModelAndView index() {
		
		TodayDTO todayDTO = new TodayDTO();
		
		ModelAndView mav = new ModelAndView();
		try {
			
			todayDTO = todayService.getOutput(todayDTO);
			
			mav.setViewName("index");
			mav.addObject("output",todayDTO.getOutput());
		
		} catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("result");
			mav.addObject("msg", "");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
		
	}

}
