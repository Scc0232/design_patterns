package org.zyq.designpatterns.builder;

public class BuilderImpl implements IBuilder {

    public void buildPartA(Product product) {
        product.setPartA("part A");
        System.out.println("Build part A done...");
    }

    public void buildPartB(Product product) {
        product.setPartB("part B");
        System.out.println("Build part B done...");
    }

}
