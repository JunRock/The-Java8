package JAVA_OOP.design_pattern;

public class TemplateMethodPattern {
    public static void main(String[] args) {

    }
}

abstract class Person{
    public void active(){
        something();
        teach();
        System.out.println("잠을 잠");
    }
    abstract void teach();
    public void something(){
        System.out.println("밥을 먹음");
    }
}
class Student extends Person{
    @Override
    void teach() {
        System.out.println("수업을 받음");
    }
    @Override
    public void something() {
        System.out.println("급식실에서 밥을 먹음");
    }
}
class Teacher extends Person{
    @Override
    void teach() {
        System.out.println("수업을 가르침");
    }
    @Override
    public void something() {
        System.out.println("휴게실에서 밥을 먹음");
    }
}

