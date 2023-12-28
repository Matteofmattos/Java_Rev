package Streams;

import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String nacionality;

    public Person(String name, int age, String nacionality) {
        this.name = name;
        this.age = age;
        this.nacionality = nacionality;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    };

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public List<Person> popular(){
        Person p1 = new Person("Matheus Felipe",28,"Brasileiro.");
        Person p2 = new Person("Augusto Braga",40,"Português.");
        Person p3 = new Person("Hanz Merkel",29,"Alemão.");
        Person p4 = new Person("Ibraimovic stuzt",22,"Sueco.");
        Person p5 = new Person("Jéssica Alves",38,"Brasileiro.");
        Person p6 = new Person("Diocesar Sanachez",58,"Argentino.");
        return List.of(p1,p2,p3,p4,p5,p6);
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(nacionality, person.nacionality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, nacionality);
    }

    @Override
    public String toString() {
        return "name: '" + name +
                ", age: " + age;
    }
}
