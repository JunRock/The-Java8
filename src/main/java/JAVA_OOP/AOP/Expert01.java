package JAVA_OOP.AOP;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Expert01 {
    public static void main(String[] args) {

    }
}

class Teacher{
    public void sleep(){};
    public void eat(){};
    public void teach(){};
}

class Student{
    public void sleep(){};
    public void eat(){};
    public void learn(){};
}

@Component

class Aop{

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface auth{

}
