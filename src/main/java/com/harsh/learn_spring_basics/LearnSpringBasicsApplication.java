package com.harsh.learn_spring_basics;

import com.harsh.learn_spring_basics.Controller.GameRunner;
import com.harsh.learn_spring_basics.game.GamingConsole;
import com.harsh.learn_spring_basics.game.Mario;
import com.harsh.learn_spring_basics.game.Pacman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringBasicsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context
				= SpringApplication.run(LearnSpringBasicsApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);

		//Mario game = new Mario();
		//GamingConsole game = new Pacman();
		//GameRunner runner = new GameRunner(game);

		runner.run();
	}

}
