package JAVA_OOP.DI;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class PropertyDi {
    public static void main(String[] args) {
        //ApplicationContext context=new ClassPathXmlApplicationContext("DI.xml",PropertyDi.class);
        //Phone1 phone1= (Phone1) context.getBean("phone1",Phone1.class);
    }
}
interface Case1{
    String getCase();
}

class Phone1{
  @Autowired
    Case1 case1;
}

@Component
class ClearCase1 implements Case1{
    @Override
    public String getCase() {
        return "투명 케이스";
    }
}

@Component
class JellyCase1 implements Case1{
    @Override
    public String getCase() {
        return "젤리 케이스";
    }
}