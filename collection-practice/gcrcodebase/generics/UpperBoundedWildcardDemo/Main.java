package Collection_practice.gcrcodebase.generics.UpperBoundedWildcardDemo;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Bruno"));
        dogs.add(new Dog("Tommy"));
        dogs.add(new Dog("Rocky"));

        Utility.displayAnimals(dogs);
    }
}