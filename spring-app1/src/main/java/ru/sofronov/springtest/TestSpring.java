package ru.sofronov.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TestBean testBean = context.getBean("testBean", TestBean.class);
		String name = testBean.getName();
		System.out.println(name);
		
		context.close();
	}

}
