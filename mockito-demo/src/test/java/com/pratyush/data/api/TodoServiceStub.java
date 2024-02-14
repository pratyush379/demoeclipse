package com.pratyush.data.api;
import java.util.Arrays;
import java.util.List;


public class TodoServiceStub implements TodoService {

	@Override
	public List<String> retriveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring Core", "Spring MVC","Java");
	}

}
