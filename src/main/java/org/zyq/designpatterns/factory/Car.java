package org.zyq.designpatterns.factory;

public class Car implements ICar {
	
	private Engine engine;
	
	private Wheel wheel;
	
	public Car() {
	}
	
	public Car(Engine engine, Wheel wheel) {
		this.engine = engine;
		this.wheel = wheel;
	}

	public void run() {
		System.out.println("Car running ...");

	}

}
