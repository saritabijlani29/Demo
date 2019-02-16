package org.amrendra;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Emp e = ctx.getBean(Emp.class);
		System.out.println(e.getName());
	}
}
