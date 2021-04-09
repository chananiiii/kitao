package com.kitao.kr.co.coe.controller;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kitao.kr.co.coe.service.BoardService;
import com.kitao.kr.co.coe.vo.BoardVO;

@Controller
@RequestMapping(value = "/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Value("#{properties['ACTION_NAME']}")
	private static String ACTION_NAME;

	
	@Resource(name="boardService")
	private BoardService boardService;

	@RequestMapping	
	public ModelAndView board (ModelMap model, HttpServletResponse response, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/co/coe/BoardList");
		
		List<BoardVO> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		
		for(BoardVO temp : list) {
			System.out.println(temp.getBoardContents());
		}
		
		return mv;
	}
	
	/*
	 * 2021.03.29(PCW) 게시판 목록
	 */
	@RequestMapping(value="/boardList.")
	public ModelAndView boardList(ModelMap model, HttpServletResponse response, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/co/coe/BoardList");
		List<BoardVO> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		
		System.out.println(ACTION_NAME);
		System.out.println(ACTION_NAME.getClass().getName());
		
				
		return mv;
	}
	
	@RequestMapping(value="/test/{userId}/test.kitao")
	public ModelAndView test(ModelMap model, HttpServletResponse response, HttpServletRequest request,
			@PathVariable("userId") int user,
			@RequestParam(value = "date", required = false) String date) throws Exception {
		System.out.println(user);
		System.out.println(date);
		
		return new ModelAndView("co/coe/BoardList");
	}
}