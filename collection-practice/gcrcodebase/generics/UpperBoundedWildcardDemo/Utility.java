package Collection_practice.gcrcodebase.generics.UpperBoundedWildcardDemo;
import java.util.List;

public class Utility {

    public static void displayAnimals(List<? extends Animal> animals) {

        for (Animal animal : animals) {
            animal.show();
        }

        // Cannot add elements because it is read-only
        // animals.add(new Dog("Tommy"));
    }
}