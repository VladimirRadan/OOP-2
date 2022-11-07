package main;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Pera", "Peric", "23143/22");

        System.out.println(student.getName());

        Person person = new Person();
        person.setName("Zika");
        person.setLastName("Zikic");

        System.out.println(person);




    }
}