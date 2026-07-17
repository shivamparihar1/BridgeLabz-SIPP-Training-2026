package oops_practice.gcrcodebase.interfaces.OnlineCouponValidator;
public class Main {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "OFF",
                "WELCOME",
                "BIGSALE2025",
                "DISC50"
        };

        ShoppingCart cart = new ShoppingCart(coupons);

        cart.checkCoupons();
    }
}