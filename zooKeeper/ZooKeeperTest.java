package com.codingdojo.zookeeper;

import com.codingdojo.zookeeper.models.GiantBat;
import com.codingdojo.zookeeper.models.Gorilla;

public class ZooKeeperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla gorilla1 = new Gorilla();
		GiantBat bat1 = new GiantBat();
		
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		gorilla1.climb();
		
		bat1.displayEnergy();
		bat1.fly();
		bat1.attackTown();
		bat1.eatHumans();
		bat1.displayEnergy();
		bat1.fly();
		bat1.attackTown();
		bat1.eatHumans();
		bat1.displayEnergy();
		bat1.attackTown();

	}

}
