package com.pratyush.buisness;

import java.util.ArrayList;
import java.util.List;

import com.pratyush.data.api.TodoService;


//SUT -> System Under Test
public class TodoBuisnessImpl {
	
	//Dependency (implementation by another team)
	private TodoService todoService;

	public TodoBuisnessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retriveTodosRelatedToSpring(String user){
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retriveTodos(user);
		for(String todo : todos) {
			if(todo.contains("Spring"))
				filteredTodos.add(todo);
		}
		
		return filteredTodos;
	}

}
