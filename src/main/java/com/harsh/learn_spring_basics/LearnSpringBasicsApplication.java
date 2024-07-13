package com.harsh.learn_spring_basics;

import com.harsh.learn_spring_basics.Controller.GameRunner;
import com.harsh.learn_spring_basics.game.GamingConsole;
import com.harsh.learn_spring_basics.game.Mario;
import com.harsh.learn_spring_basics.game.Pacman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class LearnSpringBasicsApplication {

	public static void main(String[] args) {

		//SpringApplication.run(LearnSpringBasicsApplication.class, args);

		//Mario game = new Mario();

		GamingConsole game = new Pacman();

		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
