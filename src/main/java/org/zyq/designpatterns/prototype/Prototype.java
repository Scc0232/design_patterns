package org.zyq.designpatterns.prototype;

/**
 * 原型模式
 * 
 * @author Yuqing
 */
public class Prototype implements Cloneable {
    private int    idx;

    private String name;

    public Prototype() {
    }

    public Prototype(int idx, String name) {
        super();
        this.idx = idx;
        this.name = name;
    }

    public void show() {
        System.out.println(this.toString() + " " + this.idx + " " + this.name);
    }

    @Override
    public Prototype clone() {
        Prototype prototype = null;

        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
