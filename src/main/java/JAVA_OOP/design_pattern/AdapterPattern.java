package JAVA_OOP.design_pattern;

public class AdapterPattern {
    public static void main(String[] args) {
      AdaperServiceA serviceA=new AdaperServiceA();
      AdaperServiceB serviceB=new AdaperServiceB();
      serviceA.runService();
      serviceB.runService();
    }
}

class AdaperServiceA{
    ServiceA serviceA=new ServiceA();
    void runService(){
        serviceA.runServiceA();
    }
}

class AdaperServiceB{
    ServiceB serviceB=new ServiceB();
    void runService(){
        serviceB.runServiceB();
    }
}
class ServiceA{
    void runServiceA(){
        System.out.println("ServiceA");
    }
}
class ServiceB{
    void runServiceB(){
        System.out.println("ServiceB");
    }
}

