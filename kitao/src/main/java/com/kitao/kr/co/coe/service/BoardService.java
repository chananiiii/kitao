package com.kitao.kr.co.coe.service;

import java.util.List;
import com.kitao.kr.co.coe.vo.BoardVO;
import java.util.Map;

public interface BoardService {
	List<BoardVO> selectBoardList() throws Exception;
}
