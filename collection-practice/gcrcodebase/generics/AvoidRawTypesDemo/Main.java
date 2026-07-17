package Collection_practice.gcrcodebase.generics.AvoidRawTypesDemo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Wrong way: Using Raw Type
        List rawList = new ArrayList();

        rawList.add("Java");
        rawList.add(100);

        System.out.println("Raw List:");

        for (Object item : rawList) {
            System.out.println(item);
        }


        System.out.println();


        // Correct way: Using Parameterized Type
        List<String> names = new ArrayList<>();

        names.add("Shivam");
        names.add("Aman");
        names.add("Rohit");

        System.out.println("String List:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}