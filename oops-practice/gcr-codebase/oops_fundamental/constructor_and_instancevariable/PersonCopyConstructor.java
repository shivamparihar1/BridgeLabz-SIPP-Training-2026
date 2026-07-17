package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable;

public class PersonCopyConstructor {

    String name;
    int age;

    PersonCopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    PersonCopyConstructor(PersonCopyConstructor person) {
        this.name = person.name;
        this.age = person.age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        PersonCopyConstructor person1 = new PersonCopyConstructor("Shivam", 20);

        PersonCopyConstructor person2 = new PersonCopyConstructor(person1);

        System.out.println("Original Person");
        person1.displayDetails();

        System.out.println();

        System.out.println("Copied Person");
        person2.displayDetails();
    }
}