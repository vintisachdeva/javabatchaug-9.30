package com.bmpl.javabasic;

//interface can use another interface properties--> yes
//type same--> extends

public interface Game extends SuperGame{

	int minLife = 5;
	final int maxLife = 10;
	
	void playerWalk();
	
	void playerJump();
	
	void playerAttack();
	
}
