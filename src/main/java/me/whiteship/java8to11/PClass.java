package me.whiteship.java8to11;

public class PClass{
    public static void main(String[] args) {
       RunSomething runSomething=a->a*a;
       doIt(runSomething);
    }

    public static void doIt(RunSomething runSomething){
        int b=runSomething.doIt(5);
        System.out.println(b);
    }
}
