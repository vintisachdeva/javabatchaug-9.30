package com.bmpl.javabasic;

//implements--> use inside class but of type interface
//type same--> extends
//type diff--> implements

public class Mario implements Game {

	boolean attack = true;
	
	@Override
	public void playerWalk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerJump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerAttack() {
		
		if(attack){
			//minLife--;
		}
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doubleJump() {
		// TODO Auto-generated method stub
		
	}


}
