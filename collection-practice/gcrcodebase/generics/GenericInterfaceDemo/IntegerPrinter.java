package Collection_practice.gcrcodebase.generics.GenericInterfaceDemo;

public class IntegerPrinter implements Printable<Integer> {

    @Override
    public void print(Integer value) {
        System.out.println("Integer Value : " + value);
    }
}