package me.whiteship.java8to11;

public class Sam extends SmartPhone{
    public Sam(String str) {
        super(str);
    }

    @Override
    public void receive() {
        System.out.println("S사 전화받기");
    }

    @Override
    public void send() {
        System.out.println("S사 전화걸기");
    }

    @Override
    public void internet() {
        System.out.println("S사 인터넷 사용");
    }
}
