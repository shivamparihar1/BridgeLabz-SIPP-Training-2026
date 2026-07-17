package oops_practice.gcrcodebase.oops_fundamental.class_and_object.level_1;
public class MobilePhoneDetails {

    String brand;
    String model;
    double price;

    MobilePhoneDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Mobile Phone Details");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        MobilePhoneDetails phone = new MobilePhoneDetails("Samsung", "Galaxy S24", 79999);

        phone.displayDetails();
    }
}