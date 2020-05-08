package Inheritance;

public class Person {
    private final String name;

    public Person(String aName) {
        name = aName;
    }

    public Person() {
        name = "Elena";
    }

    public String getName() {
        return name;
    }
}
