package JAVA_OOP.SpringDI;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringDi {
    public static void main(String[] args) {

    }
}

interface Case{
    String getCase();
}

class Phone{
    @Autowired
    Case c;

    Phone(Case c) {
        this.c = c;
    }
}

class ClearCase implements Case {
    @Override
    public String getCase() {
        return "투명 케이스";
    }
}

class JellyCase implements Case {
    @Override
    public String getCase() {
        return "젤리 케이스";
    }
}

