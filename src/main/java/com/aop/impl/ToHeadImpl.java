package com.aop.impl;

import org.springframework.stereotype.Service;

import com.aop.ToHead;

@Service("toHead")
public class ToHeadImpl implements ToHead {


	public String toStart() {
		
			System.out.println("ϴƻ��");
//			System.exit(1);
			throw new RuntimeException("����Ѿ�����");
		
		
	}

}
