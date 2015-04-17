package org.zyq.designpatterns.mediator;

public class BColleague extends AbstractColleague {
    public BColleague() {
    }

    public BColleague(double num) {
        this.num = num;
    }

    @Override
    public void changeNum(double num) {
        this.setNum(num);
        this.mediator.changeA();
    }
}
