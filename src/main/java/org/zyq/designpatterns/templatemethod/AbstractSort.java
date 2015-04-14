package org.zyq.designpatterns.templatemethod;

/**
 * 模板方法模式
 * 定义一个算法的骨架结构，其中一些步骤交由子类去实现
 * 
 * 例如AbastractSort类定义了一个算法的骨架结构（先排序，后输出结果），
 * 但具体的排序交由子类去实现，所以子类可以自由选择排序算法
 * 
 * @author Yuqing
 */
public abstract class AbstractSort {

    public void sortAndDisplay(int[] arr) {
        this.sort(arr);

        for (int i : arr) {
            System.out.printf("%3d ", i);
        }
    }

    protected abstract void sort(int[] arr);
}
