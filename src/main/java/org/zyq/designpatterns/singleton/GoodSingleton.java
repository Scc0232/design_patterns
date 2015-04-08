package org.zyq.designpatterns.singleton;

/**
 * 这事一种不错的单例模式实现方式，也是老版的《Effective Java》中推荐的方式
 * 
 * @author Yuqing
 */
public class GoodSingleton {
    private GoodSingleton() {
    }

    public static final GoodSingleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final GoodSingleton instance = new GoodSingleton();
    }
}
