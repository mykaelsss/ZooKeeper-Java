package com.codingdojo.zookeeper.models;

public class Mammal {
	private int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}

	public int displayEnergy() {
		System.out.println(getEnergyLevel());
		return getEnergyLevel();
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
}
