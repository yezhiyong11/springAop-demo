package com.aop.impl;

import org.springframework.stereotype.Service;

import com.aop.ToDo;
@Service("toDo")
public class ToDoImpl implements ToDo{

	public String toEat() {
		System.out.println("��ƻ��");
        return "��ƻ��";
	}

}
