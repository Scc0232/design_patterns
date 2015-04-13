package org.zyq.designpatterns.prototype;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Prototype prototype = new Prototype(5, "test");
        System.out.println("Begin test simple prototype...");
        for (int i = 0; i < 5; i++) {
            Prototype p = prototype.clone();
            p.show();
        }

        System.out.println();

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("a");
        strList.add("b");

        ComplexPrototype cp = new ComplexPrototype();
        cp.setStrList(strList);
        cp.setIntList(new int[] { 1, 3, 5 });

        System.out.println("Begin test complex prototype...");
        System.out.println("原对象：");
        cp.show();

        System.out.println();

        System.out.println("clone对象：");
        for (int i = 0; i < 5; i++) {
            ComplexPrototype cloneCp = cp.clone();
            cloneCp.show();

            System.out.println("clone对象的strList是否与原对象的strList相等？ "
                               + (cp.getStrList() == cloneCp.getStrList()));

            System.out.println("clone对象的intList是否与原对象的intList相等？ "
                               + (cp.getIntList() == cloneCp.getIntList()));

            System.out.println();
        }
    }
}
