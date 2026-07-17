package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable;

public class ProductInventory {

    String productName;
    double price;

    static int totalProducts = 0;

    ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {

        ProductInventory product1 = new ProductInventory("Laptop", 55000);

        ProductInventory product2 = new ProductInventory("Mouse", 1200);

        product1.displayProductDetails();

        System.out.println();

        product2.displayProductDetails();

        System.out.println();

        ProductInventory.displayTotalProducts();
    }
}