package JAVA_OOP.DI;

public class PropertyDi {
    public static void main(String[] args) {
        Case1 case1=new JellyCase1();
        Phone1 phone1=new Phone1();
        phone1.setCase(case1);
    }
}
interface Case1{
    String getCase();
}

class Phone1{
    Case1 c;
    public void setCase(Case1 c) {
        this.c = c;
    }
}

class ClearCase1 implements Case1{
    @Override
    public String getCase() {
        return "투명 케이스";
    }
}

class JellyCase1 implements Case1{
    @Override
    public String getCase() {
        return "젤리 케이스";
    }
}