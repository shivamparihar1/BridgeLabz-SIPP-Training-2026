package oops_practice.gcrcodebase.oops_fundamental.static_final_instanceOf_keywords;

public class ShoppingCartSystem {

    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    ShoppingCartSystem(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        double totalPrice = price * quantity;
        double finalPrice = totalPrice - (totalPrice * discount / 100);

        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {

        ShoppingCartSystem product1 = new ShoppingCartSystem(
                "Laptop",
                60000,
                1,
                101
        );

        ShoppingCartSystem product2 = new ShoppingCartSystem(
                "Mouse",
                1500,
                2,
                102
        );

        if (product1 instanceof ShoppingCartSystem) {
            product1.displayDetails();
        }

        System.out.println();

        if (product2 instanceof ShoppingCartSystem) {
            product2.displayDetails();
        }

        System.out.println();

        ShoppingCartSystem.updateDiscount(20);

        System.out.println("After Updating Discount");

        System.out.println();

        product1.displayDetails();
    }
}