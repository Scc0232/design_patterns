package org.zyq.designpatterns.factory;

public class SimpleCarFactory {
	/**
	 * 简单工厂模式的工厂方法
	 * 不实现接口，并且使用静态方法
	 * 这种做法在工厂的扩展性上较差
	 */
	public static ICar buildCar() {
		Engine engine = new Engine();
		Wheel wheel = new Wheel();
		ICar car = new Car(engine, wheel);
		
		return car;
	}
}
