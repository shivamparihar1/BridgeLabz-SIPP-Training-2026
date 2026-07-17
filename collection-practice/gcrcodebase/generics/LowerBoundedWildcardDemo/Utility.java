package Collection_practice.gcrcodebase.generics.LowerBoundedWildcardDemo;

import java.util.List;

public class Utility {

    public static void addDogs(List<? super Dog> animals) {

        animals.add(new Dog("Bruno"));
        animals.add(new Dog("Tommy"));

        System.out.println("Dogs Added Successfully.");
    }
}