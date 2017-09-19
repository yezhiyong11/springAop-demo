package com.aop.impl;

import org.springframework.stereotype.Service;

import com.aop.ToHead;

@Service("toHead")
public class ToHeadImpl implements ToHead {


	public String toStart() {
		
			System.out.println("洗苹果");
//			System.exit(1);
			throw new RuntimeException("编号已经存在");
		
		
	}

}
