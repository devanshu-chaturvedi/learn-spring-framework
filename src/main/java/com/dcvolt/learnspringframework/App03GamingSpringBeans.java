package com.dcvolt.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dcvolt.learnspringframework.game.GameRunner;
import com.dcvolt.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		
		try(var context = new AnnotationConfigApplicationContext(GamingBasicConfiguration.class))
		{
			System.out.println(context.getBean(GamingConsole.class));
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
