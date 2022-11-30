package com.codingdojo.zookeeper.models;

public class GiantBat extends Mammal{
	
	public GiantBat() {
		super();
		super.setEnergyLevel(300);
	}
	
	public void fly() {
		super.setEnergyLevel(getEnergyLevel() - 50);
		System.out.println("WOOSH! The giant bat has entered the air");
	}
	
	public void eatHumans() {
		super.setEnergyLevel(getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		super.setEnergyLevel(getEnergyLevel() - 100);
		System.out.println("AHHHHHHHH! A giant bat is attacking the town! RUN!");
	}
}
