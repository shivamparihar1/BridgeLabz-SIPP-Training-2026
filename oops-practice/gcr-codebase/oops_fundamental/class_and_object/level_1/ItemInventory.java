package oops_practice.gcrcodebase.oops_fundamental.class_and_object.level_1;
public class ItemInventory {

    int itemCode;
    String itemName;
    double price;

    ItemInventory(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Details");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        ItemInventory item = new ItemInventory(101, "Laptop", 50000);

        item.displayDetails();

        int quantity = 2;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));
    }
}