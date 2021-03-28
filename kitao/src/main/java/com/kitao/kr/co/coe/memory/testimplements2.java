package com.kitao.kr.co.coe.memory;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.kitao.kr.co.coe.vo.BoardVO;

@Repository
public class testimplements2 implements test {
	@Override
	public void a() {
		System.out.println("testimplements2");
	}
}
