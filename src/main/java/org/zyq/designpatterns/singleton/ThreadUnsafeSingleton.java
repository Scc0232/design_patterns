package org.zyq.designpatterns.singleton;

/**
 * 线程不安全的单例模式
 * 
 * @author Yuqing
 */
public class ThreadUnsafeSingleton {
    private static ThreadUnsafeSingleton instance;

    private ThreadUnsafeSingleton() {
    }

    public static ThreadUnsafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadUnsafeSingleton();
        }

        return instance;
    }
}
