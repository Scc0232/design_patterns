package org.zyq.designpatterns.singleton;

/**
 * 简单版本的单例模式，通过将instance声明为static final来实现
 * 
 * 这种方法的问题是，在类被加载的时候，无论getInstance方法是否被调用过，
 * instance都会被创建，有时这可能不是我们期望的结果
 * 
 * @author Yuqing
 */
public class StaticFinalSingleton {
    private static final StaticFinalSingleton instance = new StaticFinalSingleton();

    private StaticFinalSingleton() {
    }

    public static StaticFinalSingleton getInstance() {
        return instance;
    }
}
