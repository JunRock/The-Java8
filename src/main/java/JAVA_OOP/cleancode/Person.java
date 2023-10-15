package JAVA_OOP.cleancode;

public class Person {
    private Name name;
    private School school;

    public Person(Name name,School school) {
        this.name = name;
        this.school = school;
    }
}

class School{
    private String school;

    public School(String school) {
        this.school = school;
    }
}

class Name{
    private String name;

    public Name(String name) {
        this.name = name;
    }
}