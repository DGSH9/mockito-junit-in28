package com.dgsh.data.impl;

import java.util.ArrayList;
import java.util.List;

import com.dgsh.data.api.TodoService;

public class TodoServiceImpl {
	
	private TodoService totService;

	public TodoServiceImpl(TodoService totService) {
		super();
		this.totService = totService;
	}
	
	public List<String> retrieveTodos(String user){
		List<String> list1 = new ArrayList<String>();
		List<String> todos = totService.retrieveTodos(user);
		for(String todo:todos) {
			if(todo.contains("String")) {
				list1.add(todo);
			}
		}
		return list1;
	}
	
	
	
}
