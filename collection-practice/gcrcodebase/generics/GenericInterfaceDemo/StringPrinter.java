package Collection_practice.gcrcodebase.generics.GenericInterfaceDemo;

public class StringPrinter implements Printable<String> {

    @Override
    public void print(String value) {
        System.out.println("String Value : " + value);
    }
}