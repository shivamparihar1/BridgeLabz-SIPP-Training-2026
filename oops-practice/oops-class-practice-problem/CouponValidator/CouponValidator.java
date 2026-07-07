package oops_practice.oops_class_practice_problem.CouponValidator;

public class CouponValidator {
    public static void main(String[] args) {
        String[] coupons = {
                "Save123",
                "Hii 123",
                "save3454",
                "SaVe345",
                "SAVE23"
        };
        ICouponValidator validator =  new ShopingCart();
        for(String coupon : coupons){
            if(validator.couponValidator(coupon))
                System.out.println("It is a valid coupon");
            else
                System.out.println("It is invalid coupon");
        }
    }
}
