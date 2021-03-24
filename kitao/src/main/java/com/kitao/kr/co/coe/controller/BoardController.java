package com.kitao.kr.co.coe.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.kitao.kr.co.coe.service.*;
import com.kitao.kr.co.coe.vo.BoardVO;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Resource(name="boardService")
	private BoardService boardService;

	@RequestMapping(value = "/board/BoardList.do")
	public String home(Locale locale, Model model) throws Exception {
		ModelAndView mv = new ModelAndView("/co/coe/BoardList");
		
		List<BoardVO> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		
		System.out.println(list.get(0).getContents());
		System.out.println(list.get(0).getId());
		
		return "/co/coe/BoardList";
	}
}