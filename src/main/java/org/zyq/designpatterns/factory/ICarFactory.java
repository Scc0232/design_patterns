package org.zyq.designpatterns.factory;

public interface ICarFactory {
	/**
	 * 工厂方法模式的工厂接口，负责生产ICar的实例
	 * 需要不同ICar实例时，就扩展实现多个ICarFactory接口来生产
	 */
	public ICar buildCar();
}
