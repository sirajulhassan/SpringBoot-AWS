package com.learning.springBoot.game;

public class ContraGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("c Up");

	}

	@Override
	public void down() {
		System.out.println("c down");

	}

	@Override
	public void right() {
		System.out.println("c right");

	}

	@Override
	public void left() {
		System.out.println("c left");
	}

}
