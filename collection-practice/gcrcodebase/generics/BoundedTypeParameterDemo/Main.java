package Collection_practice.gcrcodebase.generics.BoundedTypeParameterDemo;
public class Main {

    public static void main(String[] args) {

        NumberBox<Integer> intBox = new NumberBox<>(100);
        intBox.display();
        System.out.println("Double Value : " + intBox.getDoubleValue());

        NumberBox<Double> doubleBox = new NumberBox<>(99.5);
        doubleBox.display();
        System.out.println("Double Value : " + doubleBox.getDoubleValue());
    }
}