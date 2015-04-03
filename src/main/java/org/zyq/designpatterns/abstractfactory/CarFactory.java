package org.zyq.designpatterns.abstractfactory;

public class CarFactory implements ICarFactory {

	public ICar_A buildCarA() {
		System.out.println("Build Car A...");
		return new Car_A();
	}

	public ICar_B buildCarB() {
		System.out.println("Build Car B...");
		return new Car_B();
	}

}
