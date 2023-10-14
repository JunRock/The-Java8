package JAVA_OOP.DI;

import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorDi {

}

class Phone{
    @Autowired
    private Case aCase;
}

class Case{
    //....
}