package com.kitao.kr.co.coe.memory;

import javax.annotation.Resource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class testimplements1 implements test {	
	@Override
	public void a() {
		System.out.println("testimplements1");
	}
}
