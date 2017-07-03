package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.sample.SampleService;

@Controller
public class SampleController {
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	@RequestMapping(value="/sample/sampleMain.do")
	public ModelAndView getPage(HttpServletResponse response,HttpServletRequest request) throws Exception{
		ModelAndView mav = new ModelAndView();
		
		List<HashMap<String, Object>> sample = sampleService.selectReturnString();
		
		//디비 데이터 조회 결과
		System.out.println("@@@@@@@@ sample =  "+ sample);
		
		mav.addObject("sample", sample);
		mav.setViewName("/sample/sample_main");
		
		return mav;
	}



}
