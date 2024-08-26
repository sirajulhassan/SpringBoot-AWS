package com.learning.springBoot.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("m Up");

	}

	@Override
	public void down() {
		System.out.println("m down");

	}

	@Override
	public void right() {
		System.out.println("m right");

	}

	@Override
	public void left() {
		System.out.println("m left");
	}

}
