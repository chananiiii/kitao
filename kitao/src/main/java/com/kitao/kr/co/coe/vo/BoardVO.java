package com.kitao.kr.co.coe.vo;

import java.util.Date;

public class BoardVO {
	private String boardId;
	private String boardContents;
	private String boardTitle;
	private Date boardRegDtm;
	
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public Date getBoardRegDtm() {
		return boardRegDtm;
	}
	public void setBoardRegDtm(Date boardRegDtm) {
		this.boardRegDtm = boardRegDtm;
	}
	
	
}
