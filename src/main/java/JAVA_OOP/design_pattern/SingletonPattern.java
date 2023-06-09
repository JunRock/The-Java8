package JAVA_OOP.design_pattern;

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

class Singleton{
    static Singleton singleton;
    private Singleton(){};

    public static Singleton getInstance(){
        if(singleton==null)
            singleton=new Singleton();
        return singleton;
    }
}
