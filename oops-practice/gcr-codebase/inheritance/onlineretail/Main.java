package oops_practice.gcrcodebase.inheritance.onlineretail;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(101, "17-07-2026");

        ShippedOrder shippedOrder = new ShippedOrder(
                102,
                "18-07-2026",
                "TRK12345"
        );

        DeliveredOrder deliveredOrder = new DeliveredOrder(
                103,
                "19-07-2026",
                "TRK67890",
                "22-07-2026"
        );

        System.out.println("Order Status: " + order.getOrderStatus());

        System.out.println();

        System.out.println("Order Status: " + shippedOrder.getOrderStatus());

        System.out.println();

        deliveredOrder.displayOrderDetails();
    }
}