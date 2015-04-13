package org.zyq.designpatterns.builder;

public class Director {
    public IBuilder builder;

    public Director() {
    }

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public Product buildProduct() {
        Product product = new Product();
        builder.buildPartA(product);
        builder.buildPartB(product);

        return product;
    }
}
