package oops_practice.oops_class_practice_problem.university;

public class Person {
    protected int personId;
    protected String personName;

    public Person(int id, String name){
        this.personId=id;
        this.personName=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                '}';
    }
}
