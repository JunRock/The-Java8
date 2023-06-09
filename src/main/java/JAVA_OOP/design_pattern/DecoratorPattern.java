package JAVA_OOP.design_pattern;

public class DecoratorPattern {
    public static void main(String[] args) {
        DService decorator=new Decorator();
        decorator.runSomething();
    }
}

interface DService{
    String runSomething();
}

class ServiceClass implements DService{
    @Override
    public String runSomething() {
        return "직접호출 안함";
    }
}

class Decorator implements DService{
    DService dService;
    @Override
    public String runSomething() {
        dService=new ServiceClass();
        return "데코레이터 패턴 장식 "+dService.runSomething();
    }
}