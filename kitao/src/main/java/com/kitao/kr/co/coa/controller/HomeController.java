package com.kitao.kr.co.coa.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kitao.kr.co.coe.service.BoardService;
import com.kitao.kr.co.coe.vo.BoardVO;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	@Value("#{properties['ACTION_NAME']}")
	public String ACTION_NAME;
	
	@Resource(name="boardService")
	private BoardService boardService;
		
	@RequestMapping(value = "/")
	public ModelAndView home(ModelMap model, HttpServletResponse response, HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("UTF-8");
		List <BoardVO> boardVO = boardService.selectBoardList();

		ModelAndView mv = new ModelAndView("co/coa/home");
		mv.addObject("serverTime", "이거 넣을껀데?");
		mv.addObject("boardVO", boardVO);
		
		return mv;
	}
}
