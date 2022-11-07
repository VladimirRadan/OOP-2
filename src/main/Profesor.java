package main;

public class Profesor extends Person{

    int age;


    public Profesor(String name, String lastName, int godine) {
        super(name, lastName);
        age = godine;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
