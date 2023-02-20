package com.credersi.animals;

public class Cat {
	private boolean alive;
	private int hunger;
	private int lives;
	
	private void dies() {
		this.lives--;
		if (this.lives == 0) {
			this.alive = false;
		} else {
			this.hunger = 50;
		}
	}
	
	public Cat() {
		this.alive = true;
		this.hunger = 50;
		this.lives = 9;
	}
	
	public boolean feeds() {
		if (this.hunger > 20) {
			this.hunger -= 20;
		} else {
			this.hunger = 0;
		}
		
		return this.isAlive();
	}
	
	public boolean runs() {
		this.hunger += 30;
		if (this.hunger >= 100) {
			this.dies();
		}
		
		return this.isAlive();
	}
	
	public int howHungry() {
		return this.hunger;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
}