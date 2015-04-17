package org.zyq.designpatterns.mediator;

public class AColleague extends AbstractColleague {
    public AColleague() {
    }

    public AColleague(double num) {
        this.num = num;
    }

    @Override
    public void changeNum(double num) {
        this.setNum(num);
        this.mediator.changeB();
    }
}
