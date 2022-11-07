package main;

public class Student extends Person{


    String indexNum;

    public Student(String name, String lastName, String indexNum) {
        super(name, lastName);
        this.indexNum = indexNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "indexNum='" + indexNum + '\'' +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }

    public String getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(String indexNum) {
        this.indexNum = indexNum;
    }

}
