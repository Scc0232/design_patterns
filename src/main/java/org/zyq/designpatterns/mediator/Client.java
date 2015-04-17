package org.zyq.designpatterns.mediator;

/**
 * 中介者模式
 * 
 * a和b两个同事类对象都持有一个double值num，每当num值发生变化时，都会通过中介者来改变另一个对象的num值，
 * 以始终保持a的num值是b的2倍
 * 
 * @author Yuqing
 */
public class Client {

    public static void main(String[] args) {
        AColleague a = new AColleague(7.0);
        BColleague b = new BColleague(3.5);

        Mediator mediator = new MediatorImpl(a, b);
        a.setMediator(mediator);
        b.setMediator(mediator);

        System.out.println("Before change:");
        System.out.println("Colleague A: " + a.getNum());
        System.out.println("Colleague B: " + b.getNum());

        a.changeNum(12);
        System.out.println();
        System.out.println("After changing A to 12.0");
        System.out.println("Colleague A: " + a.getNum());
        System.out.println("Colleague B: " + b.getNum());

        b.changeNum(2.6);
        System.out.println();
        System.out.println("After changing B to 2.6");
        System.out.println("Colleague A: " + a.getNum());
        System.out.println("Colleague B: " + b.getNum());
    }

}
