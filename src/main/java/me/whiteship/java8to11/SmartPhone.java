package me.whiteship.java8to11;

public abstract class SmartPhone {
    public String str;
    public void receive(){}; //전화받는 기능의 메소드
    public void send(){}; //전화거는 기능의 메소드
    public void internet(){}; //인터넷 사용 기능 메소드

    public SmartPhone(String str) {
        this.str=str;
        System.out.println(str);
    }
}
