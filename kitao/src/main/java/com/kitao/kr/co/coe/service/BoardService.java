package com.kitao.kr.co.coe.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kitao.kr.co.coe.vo.BoardVO;

public interface BoardService {
	List<BoardVO> selectBoardList() throws Exception;
}
