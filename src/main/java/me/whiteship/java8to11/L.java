package me.whiteship.java8to11;

public class L extends SmartPhone{
    public L(String str) {
        super(str);
    }

    public void receive() {
        System.out.println("L사 전화받기");
    }

    @Override
    public void send() {
        System.out.println("L사 전화걸기");
    }

    @Override
    public void internet() {
        System.out.println("L사 인터넷 사용");
    }
}
