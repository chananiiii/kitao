package com.kitao.kr.co.coe.controller;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	@Resource(name="boardService")
	private BoardService boardService;

	@RequestMapping	
	public ModelAndView home1(Model model) throws Exception {
		ModelAndView mv = new ModelAndView("/co/coe/BoardList");
		
		List<BoardVO> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		
		System.out.println(list.get(0).getContents());
		System.out.println(list.get(0).getId());
		
		return mv;
	}

	@RequestMapping(value="/BoardList.do", method = RequestMethod.POST)
	public String home2(Locale locale, Model model) throws Exception {
		ModelAndView mv = new ModelAndView("/co/coe/BoardList");
		
		List<BoardVO> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		
		System.out.println(list.get(0).getContents());
		System.out.println(list.get(0).getId());
		
		return "/co/coe/BoardList";
	}
	
	@RequestMapping(value="/test/{userId}/test.do", method = RequestMethod.GET)
	public ModelAndView home3(Locale locale, Model model, 
			@PathVariable("userId") int user,
			@RequestParam(value = "date", required = false) String date) throws Exception {
		System.out.println(user);
		System.out.println(date);
		
		return new ModelAndView("co/coe/BoardList");
	}
}