package me.whiteship.java8to11;

@FunctionalInterface
public interface RunSomething {
    int doIt(int number);

    static void printName(){
        System.out.println("Junseok");
    }

    default void printAge(){
        System.out.println("24");
    }
}

 /*
     추상형 인터페이스가 하나만 있을경우 함수형 인터페이스라고 함
     만약 추상형인터페이스가 2개 이상일경우는 함수형인터페이스가 아님
     printName(), printAge()인터페이스는 추상형인터페이스가 아니기 때문에
     함수형 인터페이스임
     함수형 인터페이스 -> 추상형 인터페이스가 무조건 하나인 경우     */

