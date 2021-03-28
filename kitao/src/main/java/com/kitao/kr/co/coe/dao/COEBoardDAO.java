package com.kitao.kr.co.coe.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kitao.kr.co.coe.vo.BoardVO;

@Repository
public class COEBoardDAO {
	@Inject 
	private SqlSession session; 
	private static String namespace = "com.kitao.kr.boardListSearch";

	public List<BoardVO> boardSearch() throws Exception {
		return session.selectList(namespace+".selectBoardSearch");
	}
}
