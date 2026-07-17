package Collection_practice.gcrcodebase.generics.GenericTypeSafety;
public class Main {

    public static void main(String[] args) {

        Box<String> name = new Box<>("Shivam");
        System.out.println("Name : " + name.getItem());

        Box<Integer> age = new Box<>(20);
        System.out.println("Age : " + age.getItem());

        // The following line will give a compile-time error
        // age.setItem("Twenty");

        age.setItem(21);
        System.out.println("Updated Age : " + age.getItem());
    }
}