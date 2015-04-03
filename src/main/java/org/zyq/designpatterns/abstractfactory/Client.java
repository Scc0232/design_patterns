package org.zyq.designpatterns.abstractfactory;

/**
 * 抽象工厂模式
 * @author Yuqing
 *
 */
public class Client {
	public static void main(String[] args) {
		ICarFactory factory = new CarFactory();
		ICar_A car_A = factory.buildCarA();
		ICar_B car_B = factory.buildCarB();
		
		car_A.run();
		car_B.run();
	}
}
