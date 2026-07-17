package Collection_practice.gcrcodebase.generics.GenericInterfaceDemo;

public class Main {

    public static void main(String[] args) {

        StringPrinter stringPrinter = new StringPrinter();
        stringPrinter.print("Java Generics");

        IntegerPrinter integerPrinter = new IntegerPrinter();
        integerPrinter.print(100);
    }
}