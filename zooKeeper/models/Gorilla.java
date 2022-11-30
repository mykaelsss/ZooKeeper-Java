package com.codingdojo.zookeeper.models;

public class Gorilla extends Mammal {
	
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		super.setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("Current energy left: " + getEnergyLevel());
	}
	
	public void eatBananas() {
		super.setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("Current energy left: " + getEnergyLevel());
	}
	
	public void climb() {
		super.setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("Current energy left: " + getEnergyLevel());
	}
}
