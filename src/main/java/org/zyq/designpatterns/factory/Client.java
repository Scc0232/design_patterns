package org.zyq.designpatterns.factory;

/**
 * 简单工厂模式 与 工厂方法模式 
 * @author Yuqing
 *
 */
public class Client {
	public static void main(String[] args) {
		// 简单工厂模式
		ICar simpleCar = SimpleCarFactory.buildCar();
		simpleCar.run();
		
		// 工厂方法模式
		ICarFactory carFactory = new CarFactory();
		ICar car = carFactory.buildCar();
		car.run();
	}
}
