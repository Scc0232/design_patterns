package org.zyq.designpatterns.mediator;

public abstract class AbstractColleague {
    protected Mediator mediator;

    protected double   num;

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void changeNum(double num);
}
