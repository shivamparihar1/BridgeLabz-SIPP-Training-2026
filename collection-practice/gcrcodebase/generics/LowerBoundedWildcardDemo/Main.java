package Collection_practice.gcrcodebase.generics.LowerBoundedWildcardDemo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Utility.addDogs(animals);

        System.out.println("Animal List:");

        for (Animal animal : animals) {
            animal.show();
        }
    }
}