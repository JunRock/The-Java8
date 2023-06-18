package JAVA_OOP.DI;
public class ConstructorDi {
    public static void main(String[] args) {
        Case c=new ClearCase();
        Phone phone=new Phone(c);
        System.out.println(phone.getCaseType());
    }
}

interface Case{
    String getCase();
}

class Phone{
    Case c;
    public Phone(Case c) {
        this.c=c;
    }
    public String getCaseType(){
        return c.getCase();
    }
}

class ClearCase implements Case{
    @Override
    public String getCase() {
        return "투명 케이스";
    }
}

class JellyCase implements Case{
    @Override
    public String getCase() {
        return "젤리 케이스";
    }
}