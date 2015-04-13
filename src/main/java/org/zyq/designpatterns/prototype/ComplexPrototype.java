package org.zyq.designpatterns.prototype;

import java.util.ArrayList;

/**
 * 深拷贝
 * 
 * @author Yuqing
 */
public class ComplexPrototype implements Cloneable {
    private ArrayList<String> strList;

    private int[]             intList;

    @SuppressWarnings("unchecked")
    @Override
    public ComplexPrototype clone() {
        ComplexPrototype cp = null;

        try {
            cp = (ComplexPrototype) super.clone();

            // 下面这两行就是深拷贝与浅拷贝的区别
            // 有这两行就是深拷贝，clone对象的strList和intList会是全新创建的对象
            // 没有这两行是浅拷贝，clone对象的strList和intList仍指向原来的对象
            cp.strList = (ArrayList<String>) this.strList.clone();
            cp.intList = this.intList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return cp;
    }

    public void show() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(this.toString());
        sBuilder.append(" ");
        sBuilder.append(this.strList.toString());
        sBuilder.append(" [");
        for (int i : this.intList) {
            sBuilder.append(i + ",");
        }
        sBuilder.append("]");
        sBuilder.append(" ");
        sBuilder.append(this.intList.toString());

        System.out.println(sBuilder.toString());
    }

    public ArrayList<String> getStrList() {
        return strList;
    }

    public void setStrList(ArrayList<String> strList) {
        this.strList = strList;
    }

    public int[] getIntList() {
        return intList;
    }

    public void setIntList(int[] intList) {
        this.intList = intList;
    }

}
