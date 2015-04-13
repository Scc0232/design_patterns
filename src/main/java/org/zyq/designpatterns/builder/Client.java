package org.zyq.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        IBuilder builder = new BuilderImpl();
        Director director = new Director(builder);
        Product product = director.buildProduct();

        System.out.println(product.getPartA());
        System.out.println(product.getPartB());
    }
}
