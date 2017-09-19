package com.aop.impl;

import org.springframework.stereotype.Service;

import com.aop.ToDo;
@Service("toDo")
public class ToDoImpl implements ToDo{

	public String toEat() {
		System.out.println("³ÔÆ»¹û");
        return "³ÔÆ»¹û";
	}

}
