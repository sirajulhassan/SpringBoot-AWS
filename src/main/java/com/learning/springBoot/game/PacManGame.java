package com.learning.springBoot.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacManGame")
public class PacManGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("p Up");

	}

	@Override
	public void down() {
		System.out.println("p down");

	}

	@Override
	public void right() {
		System.out.println("p right");

	}

	@Override
	public void left() {
		System.out.println("p left");
	}

}
