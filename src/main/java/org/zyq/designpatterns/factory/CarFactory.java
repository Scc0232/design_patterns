package org.zyq.designpatterns.factory;

public class CarFactory implements ICarFactory {

	public ICar buildCar() {
		Engine engine = new Engine();
		Wheel wheel = new Wheel();
		ICar car = new Car(engine, wheel);
		
		return car; 
	}

}
