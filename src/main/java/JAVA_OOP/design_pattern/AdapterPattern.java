package JAVA_OOP.design_pattern;

public class AdapterPattern {
    public static void main(String[] args) {
      AdaperServiceA serviceA=new AdaperServiceA();
      AdaperServiceB serviceB=new AdaperServiceB();
      serviceA.runService();
      serviceB.runService();

            System.out.println("PostsRepositoryTest 생성자 호출");
            System.out.println("생성자 의존성 주입 실패");
            System.out.println("@PostConstruct호출");

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

