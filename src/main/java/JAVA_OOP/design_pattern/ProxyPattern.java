package JAVA_OOP.design_pattern;

import java.util.Collections;
import java.lang.reflect.*;
public class ProxyPattern {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        IService service=new Proxy();
        System.out.println(service.runSomething());
        String name="junseok";
        Method method=String.class.getMethod("length");
        System.out.println(method.invoke(name));
    }
}

interface IService{
    String runSomething();
}

class Service implements IService{
    @Override
    public String runSomething() {
        return "직접호출 안함";
    }
}

class Proxy implements IService{
    IService iService;
    @Override
    public String runSomething() {
        System.out.println("흐름제어");
        iService=new Service();
        return iService.runSomething();
    }
}
