package com.kitao.kr.co.coe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitao.kr.co.coe.dao.COEBoardDAO;
import com.kitao.kr.co.coe.memory.test;
import com.kitao.kr.co.coe.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
    @Autowired    
	private COEBoardDAO boardDAO;
    
	@Override
	public List<BoardVO> selectBoardList() throws Exception {
	    // 비즈니스 로직 수행
		return boardDAO.boardSearch();
	} 
}
