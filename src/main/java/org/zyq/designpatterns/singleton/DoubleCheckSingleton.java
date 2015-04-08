/**
 * 
 */
package org.zyq.designpatterns.singleton;

/**
 * Double-Check方式实现的单例模式
 * 这种方法并非完全没有问题，详见http://coolshell.cn/articles/265.html
 * 
 * @author Yuqing
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }

        return instance;
    }
}
