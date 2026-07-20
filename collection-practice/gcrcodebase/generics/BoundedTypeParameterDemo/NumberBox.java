package Collection_practice.gcrcodebase.generics.BoundedTypeParameterDemo;

public class NumberBox<T extends Number> {

    T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value : " + value);
    }

    public double getDoubleValue() {
        return value.doubleValue();
    }
}