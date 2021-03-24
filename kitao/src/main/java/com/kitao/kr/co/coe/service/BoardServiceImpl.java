package com.kitao.kr.co.coe.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kitao.kr.co.coe.dao.COEBoardDAO;
import com.kitao.kr.co.coe.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Inject
	private COEBoardDAO boardDAO;
	
	@Override
	public List<BoardVO> selectBoardList() throws Exception {
		return boardDAO.boardSearch();
	}
}
