package labs_examples.fundamentals.labs;

public class Person2 {
    String name;
    int age;
    static int personsCreated;

    public Person2(String name, int age){
        this.name = name;
        this.age = age;
        personsCreated++;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personsCreated: " + personsCreated +
                '}' ;
    }
}
