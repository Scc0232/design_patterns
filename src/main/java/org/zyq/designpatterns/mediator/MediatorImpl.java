package org.zyq.designpatterns.mediator;

public class MediatorImpl implements Mediator {
    private AColleague a;

    private BColleague b;

    public MediatorImpl() {
    }

    public MediatorImpl(AColleague a, BColleague b) {
        this.a = a;
        this.b = b;
    }

    public void changeA() {
        double num = b.getNum();
        a.setNum(num * 2);
    }

    public void changeB() {
        double num = a.getNum();
        b.setNum(num / 2);
    }

    public AColleague getA() {
        return a;
    }

    public void setA(AColleague a) {
        this.a = a;
    }

    public BColleague getB() {
        return b;
    }

    public void setB(BColleague b) {
        this.b = b;
    }

}
